import java.util.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTree;

/*
 * My packages
 */
import Parser.*;
import symbolTable.*;

public class DefPhase extends MerzureBaseListener {
	/*
	 * DATA MEMBERS
	 */
	private ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
	private GlobalScope globals;
	private Scope currentScope;
	public static final int OBJID = MerzureParser.OBJECTID;

	/*
	 * GETTERS
	 */
	public ParseTreeProperty<Scope> getScopes() { return this.scopes; }
	public GlobalScope getGlobalScope() { return this.globals; }

	/*
	 * UTILITY FUNCTIONS
	 */

	/*
	 * Saves scope in the annotated parse tree "scopes"
	 */
	private void saveScope(ParserRuleContext ctx, Scope s) { this.scopes.put(ctx, s); }

	/*
	 * Defines a variable in the current scope
	 */
	private void defineVar(MerzureParser.VarTypeContext varTypeCtx, MerzureParser.VarContext varCtx) {
		String varName = varCtx.OBJECTID().getText();
		Symbol verifyVariable = currentScope.exists(varName);

		if(verifyVariable != null) {
			MyCompiler.error(varCtx.getToken(DefPhase.OBJID, 0).getSymbol(), varName + " is already declared");
			return;
		}

		Type type = this.getType(varTypeCtx);
		VariableSymbol variable = new VariableSymbol(varName, type);
		currentScope.define(variable);
	}

	/*
	 * Gets the list of types of the formal parameters in a formal parameter list
	 */
	private List<Type> getParTypes(MerzureParser.FormalParListContext ctx) {
		List<Type> parList = new ArrayList<>();

		if(ctx == null) {
			return parList;
		}

		List<MerzureParser.FormalParameterContext> parameters = ctx.formalParameter();
		for(int i = 0; i < parameters.size(); i++) {
			Type current = this.getType(parameters.get(i).varType());
			parList.add(current);
		}

		return parList;
	}

	/*
	 * Returns a Type object with appropriate parameters set
	 * according to the input VarTypeContext
	 */
	private Type getType(MerzureParser.VarTypeContext ctx) {
		boolean isStatic = false;
		boolean isConst = false;
		boolean isUnsigned = false;
		boolean isLong = false;
		
		TerminalNode staticNode = ctx.getToken(MerzureParser.STATIC, 0);
		if(staticNode != null) {
			//System.out.println(staticNode.getText());
			isStatic = true;
		}

		TerminalNode constNode = ctx.getToken(MerzureParser.CONST, 0);
		if(constNode != null) {
			// System.out.println(constNode.getText());
			isConst = true;
		}

		TerminalNode unsignedNode = ctx.getToken(MerzureParser.UNSIGNED, 0);
		if(unsignedNode != null) {
			// System.out.println(unsignedNode.getText());
			isUnsigned = true;
		}

		TerminalNode longNode = ctx.getToken(MerzureParser.LONG, 0);
		if(longNode != null) {
			//System.out.println(longNode.getText());
			isLong = true;
		}

		int tokenType = ctx.stop.getType();
		Type ret = MyCompiler.getType(tokenType);
		ret.setIsStatic(isStatic);
		ret.setIsConst(isConst);
		ret.setIsUnsigned(isUnsigned);
		ret.setIsLong(isLong);

		return ret;
	}

	/*
	 * Adds function entry to the current scope
	 */
	private void addFunction(MerzureParser.FunctionContext ctx) {
		String name = ctx.functionStatement().funcName().getText();
		Type type = this.getType(ctx.functionStatement().returnType().varType());
		List<Type> parTypes = this.getParTypes(ctx.functionStatement().formalParList());

		if(debugging.status == true) {
			System.out.println("Name : " + name + " type : " + type);
		}

		Symbol funExists = currentScope.exists(name);
		if(funExists != null) {
			Token tkn = ctx.functionStatement().getToken(DefPhase.OBJID, 0).getSymbol();
			MyCompiler.error(tkn, name + " is already defined");
			return;
		}

		MethodSymbol function = new MethodSymbol(name, type, currentScope, parTypes);
		currentScope.define(function);
		this.saveScope(ctx, function);
		currentScope = function;
	}

	/*
	 * Overrided functions
	 */
	@Override public void enterProgram(MerzureParser.ProgramContext ctx) {
		globals = new GlobalScope("global", null);
		currentScope = globals;
		if(debugging.status == true) {
			System.out.println("Push " + currentScope);
		}	
	}

	@Override public void exitProgram(MerzureParser.ProgramContext ctx) {
		if(debugging.status == true) {
			System.out.println(globals);
		}
	}

	@Override public void enterFunction(MerzureParser.FunctionContext ctx) {
		addFunction(ctx);
		if(debugging.status == true) {
			System.out.println("Push " + currentScope);
		}
	}

	@Override public void exitFunction(MerzureParser.FunctionContext ctx) {
		if(debugging.status == true) {
			System.out.println("Pop " + currentScope);
		}
		currentScope = currentScope.getEnclosingScope();
	}

	@Override public void enterSelectionStatement(MerzureParser.SelectionStatementContext ctx) {
		currentScope = new LocalScope("IF", currentScope);
		this.saveScope(ctx, currentScope);
		if(debugging.status == true) {
			System.out.println("Push " + currentScope);
		}
	}

	@Override public void exitSelectionStatement(MerzureParser.SelectionStatementContext ctx) {
		if(debugging.status == true) {
			System.out.println("Pop " + currentScope);
		}
		currentScope = currentScope.getEnclosingScope();	
	}

	@Override public void enterLoopStatement(MerzureParser.LoopStatementContext ctx) {
		currentScope = new LocalScope("FOR", currentScope);
		this.saveScope(ctx, currentScope);
		if(debugging.status == true) {
			System.out.println("Push " + currentScope);
		}		
	}

	@Override public void exitLoopStatement(MerzureParser.LoopStatementContext ctx) {
		if(debugging.status == true) {
			System.out.println("Pop " + currentScope);
		}
		currentScope = currentScope.getEnclosingScope();
	}

	@Override public void exitFormalParameter(MerzureParser.FormalParameterContext ctx) { this.defineVar(ctx.varType(), ctx.var()); }

	@Override public void exitArrDeclaration(MerzureParser.ArrDeclarationContext ctx) {
		String name = ctx.var().getText();

		Symbol verifyVariable = currentScope.exists(name);
		if(verifyVariable != null) {
			MyCompiler.error(ctx.var().getToken(DefPhase.OBJID, 0).getSymbol(), name + " is already declared");
			return;
		}

		Type type = this.getType(ctx.varType());
		if(type.getIsStatic() == true) {
			String msg = "Arrays cannot be declared STATIC";
			MyCompiler.error(ctx.varType().getToken(MerzureParser.STATIC, 0).getSymbol(), msg);			
		}

		int size = Integer.valueOf(ctx.INT_CONST().getText());
		if(ctx.MINUS() != null) {
			size = size * (-1);
		}
		
		if(size <= 0) {
			String msg = "Array size must be positive";
			MyCompiler.error(ctx.getToken(MerzureParser.INT_CONST, 0).getSymbol(), msg);	
			return;
		}

		Type arrType = new Array(size, type);
		VariableSymbol arr = new VariableSymbol(name, arrType);
		currentScope.define(arr);
	}

	@Override public void exitVarDeclaration(MerzureParser.VarDeclarationContext ctx) {
		List <MerzureParser.VarContext> variables = ctx.var();
		for(int i = 0; i < variables.size(); i++) {
			this.defineVar(ctx.varType(), variables.get(i));
		}
	}
}