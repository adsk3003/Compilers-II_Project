import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * My packages
 */
import Parser.*;
import symbolTable.*;

public class MyCompiler {
	/*
	 * Return appropriate type based on token type
	 */
	public static Type getType(int tokenType) {
		switch ( tokenType ) {
			case MerzureParser.VOID :  return Type.VOID;
			case MerzureParser.COMPLEX :  return Type.COMPLEX;
			case MerzureParser.INT :  return Type.INT;
			case MerzureParser.CHAR :  return Type.CHAR;
			case MerzureParser.REAL :   return Type.REAL;
			case MerzureParser.BOOL : return Type.BOOL;
			case MerzureParser.REAL_CONST :  return Type.REAL;
			case MerzureParser.INT_CONST :  return Type.INT;
			case MerzureParser.CHAR_CONST :  return Type.CHAR;
			case MerzureParser.BOOL_CONST : return Type.BOOL;
		}
		return Type.INVALID;
    }

    /*
     * Print error msg at the given token
     */
	public static void error(Token t, String msg) {
		System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(), msg);
	}

	// Read all contents of a file into a String
	private static String readAllBytes(String filePath) throws Exception {
		String content = "";

		try {
			content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
		} 
		catch (IOException e) {
			System.out.println("Input file does not exist !!!!");
		}

		return content;
	}

	// Utility print function
	public static void print(int n) {
		System.out.println("\n");
		for(int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.print("\n");
	}

	// Core Compiler Logic
	public static void process(String[] args) throws Exception {
		String filePath = args[args.length - 1];
		String content = readAllBytes(filePath);

		// Debug
		if(debugging.status == true) {
			print(100);
			System.out.println("COMPILER OUTPUT : \n");
		}

		CharStream codePointCharStream = CharStreams.fromString(content);
		MerzureLexer lexer = new MerzureLexer(codePointCharStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens

		MerzureParser parser = new MerzureParser(tokens);  //parse the tokens

		ParseTree tree = parser.program(); // parse the content and get the tree

		/*
		 ***************************************************************************
		 * Semantic Analysis
		 */

		// First Walk of the parse tree -- Defining Phase
		ParseTreeWalker walker = new ParseTreeWalker();
		DefPhase def = new DefPhase();
		walker.walk(def, tree);

		// Second walk of the parse tre -- Referencing Phase
		RefPhase ref = new RefPhase(def.getGlobalScope(), def.getScopes());
		walker.walk(ref, tree);

		/*
		 * End of Semantic Analysis
		 *
		 *****************************************************************************
		 */

		// Debug
		if(debugging.status == true) {
			print(100);			
		}
    }

    // Driver function
    public static void main(String[] args) throws Exception {
        new MyCompiler().process(args);
    }
}