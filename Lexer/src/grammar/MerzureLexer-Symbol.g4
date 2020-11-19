grammar MerzureLexer;

@lexer :: members{

	/*
		YOU CAN ADD YOUR MEMBER VARIABLES AND METHODS HERE
	*/

	/**
	* Function to report errors.
	* Use this function whenever your lexer encounters any erroneous input
	* DO NOT EDIT THIS FUNCTION
	*/
	public void reportError(String errorString){
		setText(errorString);
		setType(ERROR);
	}

	public void processString(int i) {
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String text = t.getText();
		String temp = text;
		String result = "";

		//write your code to test strings here
		if( i == 1)
		{
			text = text.substring(1,text.length()-1);
			if(text.length() > 1024)
			{
				reportError("String constant too long");
				return;
			}
			if(text.indexOf('\0') != -1)
			{
				reportError("String contains null character");
				return;
			}
			if(text.indexOf('\n') != -1)
			{
				int idx = text.indexOf('\n');
				if(text.charAt(idx-1) != '\\')
				{
					reportError("Unterminated string constant");
					return;
				}
			}
		}


		switch(i)
		{
			case 1 : int index = 0;
					 while(index < text.length())
					 {
					 	if(text.charAt(index) == '\\')
					 	{
					 		char nextchar = text.charAt(index+1);
					 		switch(nextchar)
					 		{
					 			case '0' : result = result.concat("0");
					 					   break;
					 			case 'n' : result = result = result.concat("\n");
					 					   break;
					 			case 'f' : result = result = result.concat("\f");
					 					   break;
					 			case 'r' : result = result = result.concat("\r");
					 					   break;
					 			case 't' : result = result = result.concat("\t");
					 					   break;
					 			case 'b' : result = result = result.concat("\b");
					 					   break;
					 			case '"' : reportError("Invalid Escape Character");
					 					   break;
					 			default  : result = result = result.concat(String.valueOf(text.charAt(index+1)));
					 					   break;
					 		}
					 		index = index + 2;
					 		continue;
					 	}
					 	else
					 	{
					 			result = result.concat(String.valueOf(text.charAt(index)));
					 			index = index + 1;
					 	}
					 }
				    break;
			case 2: reportError(temp);
					break;
		}

		if ( i == 1)
		{
			setText(result);
			setType(STR_CONST);
		}
		return;
	}
}

@header {
	import java.util.*;
	import javafx.util.Pair;
}

@parser :: members {
	
	TreeMap<Integer, HashMap<String, Pair<String, attribute>>> SYMBOL_TABLE = new TreeMap<Integer, HashMap<String, Pair<String, attribute>>>();

	// For each curr_scope :
	// Symbol table has name of (function or variables) as key
	// The value contains a PAIR of type (return type for functions or var_type for variables) and attribute class
	// The attribute class contains the value and other details of the function or variables (respectively)
	
 	String currFunc = "";
 	Integer curr_scope = 0;

 	// Add global scope
 	public void initialise() {
		System.out.println("Adding global scope");
		curr_scope++;
		SYMBOL_TABLE.put(curr_scope, new HashMap<String, Pair<String, attribute>>());
 	}

 	// Class to store attributes of functions or data in symbol table
	public class attribute {
		// Value of the attribute
		String value;

		// What is the type of the current attribute
		String type;

		// Meant for function parameter lists
		List<String> parTypes;

		public attribute(String input_val, String input_type) {
			this.value = input_val;
			this.type = input_type;
			this.parTypes = new ArrayList<String>();
			setParameters();
		}

		// Set parameters
		private void setParameters() {
			if(this.type == "func") {
				this.parTypes = Arrays.asList(this.value.split(","));
			}
			// Need to write for other types;
		}

		// Check if the given parameter list parList matches with current attribute's parTypes list
		// if the current attribute type is function
		public boolean sameParameterList(String parList) {
			if(this.type == "func") {
				// For storing parameter list after pruning variable names from input parameter list
				List<String> prunedParList = new ArrayList<String>();

				List<String> splitParameterList = Arrays.asList(parList.split(","));

				for (String str : splitParameterList) {
					// System.out.print(str + " ");
					String currentParameter[] = str.split("::");
					prunedParList.add(currentParameter[0]);
				}
				// System.out.print("\n");

				// for (int i = 0; i < prunedParList.size(); i++) {
				//	System.out.print(prunedParList.get(i) + " ");
				// }
				// System.out.print("\n");

				return prunedParList.equals(this.parTypes);
			}

			// Need to do for other types if required
			return false;
		}

		// Display the parameter types (if type of the attribute is function)
		public void display() {
			for (String str : this.parTypes) {
				System.out.print(str + " ");
			}
		}
	}


	void addScope() {
		System.out.println("Adding scope");
		curr_scope++;
		SYMBOL_TABLE.put(curr_scope, new HashMap<String, Pair<String, attribute>>());
	}

	void removeScope() {
		System.out.println("Removing scope");
		SYMBOL_TABLE.remove(curr_scope);
		curr_scope--;
	}

	// Add function details to the symbol table
	void addFunc(String name, String parameterList, String type, String ret_type) {
		HashMap<String, Pair<String, attribute>> symTable = SYMBOL_TABLE.get(curr_scope);

		currFunc = name;
		attribute func_attr = new attribute(parameterList, type);
		System.out.println("Adding function attributes");

		Pair pr = new Pair(ret_type, func_attr);
		symTable.put(name, pr);
		showSymTable();
		System.out.print("\n");
	}

	void showSymTable() {
		HashMap<String, Pair<String, attribute>> symTable = SYMBOL_TABLE.get(curr_scope);
		for (String str : symTable.keySet()) {
			System.out.print(str + ": ");
			System.out.print(symTable.get(str).getKey() + " -> ");
			symTable.get(str).getValue().display();
			System.out.print("\n");			
		}
	}


	// Check if the function (name) exists in symbol table and
	// Also check if the parameter lists and return types match
	boolean checkFunc(String name, String parameterList, String ret_type) {
		// System.out.println("Checking for " + name + " in symbol table");

		HashMap<String, Pair<String, attribute>> symTable = SYMBOL_TABLE.get(curr_scope);
		if(symTable.containsKey(name) && ret_type.equals(symTable.get(name).getKey())
			&& symTable.get(name).getValue().sameParameterList(parameterList) == true) 
		{

			// System.out.println("Matched " + ret_type + " " + symTable.get(name).getKey());
			return true;
		}

		else {
			System.out.println("No corresponding function definition found");
			return false;
		}
	}

	// Check whether the name of the function after end function clause matches the current function name
	boolean checkEndOfFunction(String name) {
		// System.out.println("Checking for " + name + " equal to " + currFunc);	
		if(currFunc.equals(name) || name == "") {
			return true;
		}
		else {
			System.out.println("Function end name does not match with start name");
			return false;
		}
	}
}

// Parser Rules
// Done by Alekhya Madanu
program						
@init
{
	initialise();
}
: 
(function_definition EOL?)+;


function_definition		 : functionPrototype | function;
functionPrototype
@init 
{
	String funcName = "";
	String parList = "";
	String ret_type = "";
}
:
(
	return_type {ret_type = $return_type.text;}
) 
FUNCTION 
(
	var {funcName = $var.text;}
) 
LPAREN 
(
	protParlist {parList = $protParlist.text;}
)? 
RPAREN EOL? {addFunc(funcName, parList, "func", ret_type);};


protParlist              : var_type (COMMA var_type)* ;

function                 : functionStatement functionBody;
functionStatement        
@init 
{
	String funcName = "";
	String parList = "";
	String ret_type = "";	
}
: 
(
	return_type {ret_type = $return_type.text;}
)
FUNCTION 
(
	var {funcName = $var.text;}
) 
LPAREN 
(
	parlist {parList = $parlist.text;}
)? 
RPAREN EOL? 
{ 
	if(checkFunc(funcName, parList, ret_type) == true) {
		addScope();
	}
};

functionBody             
@init
{
	String name = "";
}
: 
compound_statement END FUNCTION 
(
	var {name = $var.text;}
)? 
{
	checkEndOfFunction(name);
	removeScope();
}
;

EOL                      : [\r\n]+;
return_type              : type | VOID;


// Done by Adil Tanveer	 and Akashdeep Singh
compound_statement			: (statement SEMICOLON EOL?)+ ;

statement 					: expression_statement |
							  selection_statement |
							  loop_statement |
							  jump_statement |
							  assignment_statement |
							  declaration_statement
							  ;



expression_statement		: expression;
selection_statement		    : IF LPAREN boolean_expression RPAREN EOL?
        					  compound_statement
        					  (ELIF LPAREN boolean_expression RPAREN EOL?
        					  compound_statement)*?
        					  (ELSE EOL? compound_statement)?
        					  END IF EOL?
    						  ;

loop_statement				: FOR LPAREN (var_val_asgn)? SEMICOLON (boolean_expression)? SEMICOLON (var_val_asgn)? RPAREN EOL?
							  compound_statement
							  END FOR EOL?
							  ;

jump_statement				: (CONTINUE | BREAK | RETURN expression?) EOL?;

assignment_statement		: var_val_asgn | arr_val_asgn;
var_val_asgn				: var ASSIGN expression;
arr_val_asgn				: arr_val_asgn_one | arr_val_asgn_all;

// Done by Adarsh Patel
// Rules for assigning values to array variables
arr_val_asgn_one            : var LPAREN arithmetic_expression RPAREN ASSIGN expression ;
arr_val_asgn_all            : var ASSIGN LPAREN SLASH (expression COMMA)* expression SLASH RPAREN ;

declaration_statement		: var_declaration | arr_declaration;
var_declaration				: var_type COLON COLON (var COMMA)* var ;

// Done by Adarsh Patel
// Rules for array declarations
arr_declaration             : var_type COLON COLON var LPAREN arithmetic_expression RPAREN ;


// Done by Praneeth
expression 					: boolean_expression | arithmetic_expression;

boolean_expression			: logical_or_expression | logical_and_expression;

logical_or_expression		: logical_and_expression | logical_or_expression OR logical_and_expression;

logical_and_expression		: logical_and_expression AND relational_expression | relational_expression;


// Done by Souradeep Chatterjee
relational_expression		: arithmetic_expression | 
							  relational_expression relop arithmetic_expression |
							  relational_expression eq_op arithmetic_expression
							  ;

relop						: LT | GT | LEQ | GEQ;
eq_op						: EQUALS | NEQ;

arithmetic_expression		: unary_expression |
							  arithmetic_expression POW unary_expression |
							  arithmetic_expression SLASH unary_expression |
							  arithmetic_expression STAR unary_expression |
							  arithmetic_expression MOD unary_expression |							  
						      arithmetic_expression PLUS unary_expression |
						      arithmetic_expression MINUS unary_expression
						  	  ;

unary_expression			: unary_operator ? primary_expression EOL? |
							  unary_expression LPAREN (parlist)? RPAREN EOL?
							  ;

parlist                  	: var_type COLON COLON var (COMMA var_type COLON COLON var)* ;
unary_operator				: PLUS | MINUS | NOT;

primary_expression			: var |
							  constant |
							  LPAREN expression RPAREN
							  ;

var 						: OBJECTID;

constant					: BOOL_CONST |
						  	  REAL_CONST |
						  	  INT_CONST |
							  CHAR_CONST
						  	  ;

var_type					: ((storage_class)? (CONST)? | (CONST)? (storage_class)?) (type);
type 						: math_type | non_math_type;
math_type 					: (UNSIGNED)? (LONG? INT | REAL);
non_math_type 				: (CHAR | BOOL | COMPLEX);
storage_class				: STATIC | AUTO;




// Done By Adil Tanveer and Souradeep Chatterjee
// rules for keywords
CHAR			:'char';
CONST			:'const';
AUTO			:'auto';
UNSIGNED		:'unsigned';
BREAK			:'break';
CONTINUE		:'continue';
COMPLEX			:'complex';
ELSE			:'else';
BOOL			:'bool';
FOR				:'for';
IF				:'if';
ELIF			: 'elif';
REAL			:'real';
INT				:'int';
LONG			:'long';
RETURN			:'return';
// FALSE			:'false';
INCLUDE			:'include';
END				:'end';
VOID			:'void';
FUNCTION		:'function';
STATIC			: 'static';
// TRUE			:'true';
AND 			: 'and';
OR 			: 'or';
NOT 			: 'not';

//rules for identifiers and different constants.
CHAR_CONST		:['] (LETTER | ESCAPE_CHAR) ['];
INT_CONST		:[0][xX](HEX)+ | [0](DIGIT)+ | (DIGIT)+;
REAL_CONST		:(DIGIT)*[.](DIGIT)+(EXP)? | (DIGIT)+[.](DIGIT)*(EXP)? | (DIGIT)+(EXP);
COMPLEX_CONST	:'(' (REAL_CONST) (',') (REAL_CONST)? ')' | '(' (REAL_CONST)? (',') (REAL_CONST) ')';
BOOL_CONST		:(TRUE | FALSE);
STR_CONST		:'"'((~('"'|'\\'))|ESCAPE_CHAR)*'"'{processString(1);};
OBJECTID		:LETTER(LETTER | DIGIT)*;


//symbols
LPAREN						:'(';
RPAREN						:')';
COLON						:':';
ATSYM						:'@';
SEMICOLON					:';';
COMMA						:',';
PLUS						:'+';
MINUS						:'-';
STAR						:'*';
SLASH						:'/';
TILDE						:'~';
LT							:'<';
GT							:'>';
EQUALS						:'==';
LEQ							:'<=';
GEQ							:'>=';
NEQ							:'!=';
LBRACE						:'{';
RBRACE						:'}';
DOT							:'.';
ASSIGN						:'=';
POW							:'^';
MOD 						:'%';

// whitespaces
WHITESPACE 					:[\n\t\b\r]+ -> skip;
SPACES						:(' ')+ -> skip;


//comments
SIMPLE_COMMENT				:'##' (.)*? (WHITESPACE) -> skip;

// invalid tokens and errors
ERROR 						: EOF_STRING | INVALID_ESCAPE | INVALID_CHARS;
EOF_STRING					:'"'(~('"'))*('<<EOF>>') {reportError("EOF in String");};
INVALID_ESCAPE				:'"'('\\')'"' {reportError("Invalid Escape Character");};
INVALID_CHARS				:.{processString(2);};

// fragments defined for better readability
fragment DIGIT				:[0-9];
fragment HEX				:[a-fA-F0-9];
fragment EXP				:[Ee][+-]?(DIGIT)+;
fragment LOWERCASE			:[a-z];
fragment UPPERCASE			:[A-Z];
fragment LETTER				:[a-zA-Z_];
fragment ESCAPE_CHAR		:'\\' . ;
fragment LABEL				: OBJECTID COLON;
fragment TRUE				:'true';
fragment FALSE				:'false';
