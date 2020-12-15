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

public class RefPhase extends MerzureBaseListener {
	/*
	 * DATA MEMBERS
	 */
	private ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
	private ParseTreeProperty<Type> types = new ParseTreeProperty<Type>();
	private GlobalScope globals;
	private Scope currentScope;
	private static final int OBJID = MerzureParser.OBJECTID;

	/*
	 * GETTERS
	 */
	public ParseTreeProperty<Scope> getScopes() { return this.scopes; }
	public ParseTreeProperty<Type> getTypes() { return this.types; }
	public GlobalScope getGlobalScope() { return this.globals; }

	/*
	 * CONSTRUCTOR
	 */
	public RefPhase(GlobalScope globals, ParseTreeProperty<Scope> scopes) {
		this.scopes = scopes;
		this.globals = globals;
	}

	/*
	 * UTILITY FUNCTIONS
	 */
 
	public static void saveType(ParserRuleContext ctx, Type t, ParseTreeProperty<Type> types) { types.put(ctx, t); }
	public static Type fetchType(ParserRuleContext ctx, ParseTreeProperty<Type> types) { return types.get(ctx); }

	/*
	 * Checks integrity of assignment statement
	 */
	private void checkAssignmentIntegrity(MerzureParser.VarValAsgnContext ctx, Symbol variable) {
		Type leftType = variable.getType();
		Type rightType = RefPhase.fetchType(ctx.expression(), this.types);

		if(rightType == null) {
			String msg = "Invalid Expression";
			MyCompiler.error(ctx.expression().start, msg);
			return;
		}

		boolean case1 = (leftType instanceof Array) && (!(rightType instanceof Array));
		boolean case2 = (!(leftType instanceof Array) && (rightType instanceof Array));
		boolean case3 = (leftType instanceof Array) && (rightType instanceof Array);
		
		if(case1 || case2) {
			String msg = "Incompatible Assignment : Both sides of the assignment must be an array";
			MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), msg);
		}

		else if(case3 == true){
			boolean check = leftType.equals(rightType) && leftType.getSize() == rightType.getSize();
			if(check == false) {
				String msg = "Incompatible Array assignment";
				MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), msg);
			}
		}

		else {
			int check = leftType.isCompatible(rightType);
			String name = ctx.var().getText();
			if(check == Type.INCOMPATIBLE) {
				String msg = name + " cannot be assigned an expression of " + rightType + " type";
				MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), msg);
			}
			else if(check == Type.WARNING) {
				String msg = "Warning : " + name + " is assigned an expression of " + rightType + " type";
				MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), msg);	
			}
		}
	}

	/*
	 * Checks if actual parameter in a function call has same type as 
	 * corresponding functionParameter's type as defined in the function definition
	 * in current scope
	 */
	private void checkType(MerzureParser.ActualParameterContext actCtx, Type funType, Symbol function) {
		String name = actCtx.var().getText();
		Symbol variable = this.currentScope.resolve(name);

		boolean check = true;

		if(variable == null) {
			MyCompiler.error(actCtx.var().getToken(RefPhase.OBJID, 0).getSymbol(), "No such variable: " + name);
			check = false;
		}
		else {
			check = variable.getType().equals(funType);
			if(check == false) {
				String currentParName = variable.getName();
				String funcPar = funType.getName();
				String msg = currentParName + " cannot be converted to " + funcPar + " type";
				MyCompiler.error(actCtx.var().getToken(RefPhase.OBJID, 0).getSymbol(), msg);
			}
		}
		return;
	}

	/*
	 * Matches parameters in a function call with the parameters
	 * as defined in the function definition
	 */
	private void matchParameters(MerzureParser.FunCallContext ctx, Symbol function) {
		boolean parMatch = true;
		String name = ctx.var().getText();

		List<MerzureParser.ActualParameterContext> parameters = new ArrayList<>();
		if(ctx.actualParList() != null) {
			parameters = ctx.actualParList().actualParameter();
		}

		if(function.parTypes.size() > parameters.size()) {
			MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), "Call to " + name + " has too few arguments");
			parMatch = false;
		}
		else if(function.parTypes.size() < parameters.size()) {
			MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), "Call to " + name + " has too many arguments");
			parMatch = false;
		}

		// Check for parameter matching only if list size is same
		if(parMatch == false) { return; }

		for(int i = 0; i < parameters.size(); i++) {
			MerzureParser.ActualParameterContext current = parameters.get(i);
			checkType(current, function.parTypes.get(i), function);
		}
	}

	/*
	 * Is "name" a function ?
	 */
	public boolean isFunction(String name) {
		if(name == "global" || name == "IF" || name == "FOR") {
			return false;
		}
		return true;
	}

	/*
	 * Gets the closest function enclosing the given scope
	 */
	public Symbol getEnclosingFunction(Scope current) {
		Scope temp;
		for(temp = current; temp != null && isFunction(temp.getScopeName()) == false; temp = temp.getEnclosingScope()) { ; }
		if(temp == null) { return null; }
		// System.out.println("ret: " + temp);
		Symbol ans = temp.resolve(temp.getScopeName());
		return ans;
	}

	/*
	 * OVERRIDED FUNCTIONS
	 */
	@Override public void enterProgram(MerzureParser.ProgramContext ctx) { this.currentScope = globals; }
	
	@Override public void exitProgram(MerzureParser.ProgramContext ctx) {
		if(debugging.status == true) {
			System.out.println(globals);
		}
	}

	@Override public void enterFunction(MerzureParser.FunctionContext ctx) {
		this.currentScope = scopes.get(ctx);
		if(debugging.status == true) {
			System.out.println("Push " + this.currentScope);
		}
	}

	@Override public void exitFunction(MerzureParser.FunctionContext ctx) {
		String endName = (ctx.functionBody().var() != null) ? ctx.functionBody().var().getText() : "";
		String funcName = this.currentScope.getScopeName();
		Symbol func = this.currentScope.resolve(funcName);

		boolean returnStatus = false;
		if(func != null) {
			returnStatus = func.getReturned();
		}

		// endName does not match with function name
		if(!(endName.isEmpty() || endName.equals(funcName))) {
			String msg = endName + " does not match with function name " + funcName;
			MyCompiler.error(ctx.functionBody().var().getToken(RefPhase.OBJID, 0).getSymbol(), msg);
		}

		// No return statement in the given function
		if(returnStatus == false) {
			String msg = "No return statement in function " + funcName;
			MyCompiler.error(ctx.functionBody().stop, msg);	
		}

		if(debugging.status == true) {
			System.out.println("Pop " + this.currentScope);
		}
		this.currentScope = this.currentScope.getEnclosingScope();
	}

	@Override public void enterSelectionStatement(MerzureParser.SelectionStatementContext ctx) {
		this.currentScope = scopes.get(ctx);
		if(debugging.status == true) {
			System.out.println("Push " + this.currentScope);
		}
	}

	@Override public void exitSelectionStatement(MerzureParser.SelectionStatementContext ctx) {
		if(debugging.status == true) {
			System.out.println("Pop " + this.currentScope);
		}
		this.currentScope = this.currentScope.getEnclosingScope();
	}

	@Override public void enterLoopStatement(MerzureParser.LoopStatementContext ctx) {
		this.currentScope = scopes.get(ctx);
		if(debugging.status == true) {
			System.out.println("Push " + this.currentScope);
		}		
	}

	@Override public void exitLoopStatement(MerzureParser.LoopStatementContext ctx) {
		if(debugging.status == true) {
			System.out.println("Pop " + this.currentScope);
		}
		this.currentScope = this.currentScope.getEnclosingScope();
	}

	@Override public void exitContinue(MerzureParser.ContinueContext ctx) {
		if(!currentScope.getScopeName().equals("FOR")) {
			String msg = "continue statement must be inside a loop";
			MyCompiler.error(ctx.getToken(MerzureParser.CONTINUE, 0).getSymbol(), msg);
		}
	}
	
	@Override public void exitBreak(MerzureParser.BreakContext ctx) {
		if(!currentScope.getScopeName().equals("FOR")) {
			String msg = "break statement must be inside a loop";
			MyCompiler.error(ctx.getToken(MerzureParser.BREAK, 0).getSymbol(), msg);
		}
	}

	@Override public void exitReturn(MerzureParser.ReturnContext ctx) {
		Symbol enclosingFunction = getEnclosingFunction(currentScope);

		if(enclosingFunction == null) {
			String msg = "return statement not in a function";
			MyCompiler.error(ctx.getToken(MerzureParser.RETURN, 0).getSymbol(), msg);
			return;
		}
		
		enclosingFunction.setReturned(true);

		if((ctx.expressionStatement().expression() == null) && (!enclosingFunction.getType().equals(Type.VOID))) {
			String msg = "return type of " + enclosingFunction.getName() + " is not VOID";
			MyCompiler.error(ctx.getToken(MerzureParser.RETURN, 0).getSymbol(), msg);
		}
		else {
			Type exprType = RefPhase.fetchType(ctx.expressionStatement().expression(), this.types);
			// System.out.println("exprType : " + exprType);
			boolean check = enclosingFunction.getType().equals(exprType);
			if(check == false) {
				String msg = "return type does not match";
				MyCompiler.error(ctx.getToken(MerzureParser.RETURN, 0).getSymbol(), msg);		
			}
		}
	}

	@Override public void exitVarValAsgn(MerzureParser.VarValAsgnContext ctx) {
		// System.out.println("currentScope : " + this.currentScope);
		// System.out.println("enclosingScope : " + this.currentScope.getEnclosingScope());
		String name = ctx.var().OBJECTID().getText();
		Symbol variable = this.currentScope.resolve(name);

		if (variable == null) {
			MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), "No such variable: " + name);
		}
		else if (!(variable instanceof VariableSymbol)) {
			MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), name + " is not a variable");
		}

		else {
			if(variable.getType().getIsStatic() == true && variable.getWrittenTo() == true) {
				String msg = "Cannot reassign static variable";
				MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), msg);
			}
			
			else if(variable.getType().getIsConst() == true && variable.getWrittenTo() == true) {
				String msg = "Cannot reassign constant variable";
				MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), msg);
			}
			else {
				checkAssignmentIntegrity(ctx, variable);
			}	
			variable.setWrittenTo(true);
		}
	}

	@Override public void exitArrValAsgnOne(MerzureParser.ArrValAsgnOneContext ctx) {
		String name = ctx.var().OBJECTID().getText();
		Symbol variable = this.currentScope.resolve(name);

		if (variable == null) {
			MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), "No such variable: " + name);
		}
		else if (!(variable instanceof VariableSymbol)) {
			MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), name + " is not a variable");
		}
		else if (!(variable.getType() instanceof Array)) {
			MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), name + " is not an array");
		}

		else {
			if(variable.getType().getIsConst() == true && variable.getWrittenTo() == true) {
				String msg = "Cannot reassign constant variable";
				MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), msg);
			}
			else {
				Type rightType = RefPhase.fetchType(ctx.expression(), this.types);
				if(rightType == null) {
					String msg = "Invalid Expression";
					MyCompiler.error(ctx.expression().start, msg);
					return;
				}

				int index = Integer.valueOf(ctx.INT_CONST().getText());
				
				if(ctx.MINUS() != null) {
					index = index * -1;
				}

				boolean test1 = index >= 0 && index < variable.getType().getSize();
				int test2 = variable.getType().isCompatible(rightType);

				if(test1 == false) {
					String msg = "Indexing out of bounds";
					MyCompiler.error(ctx.getToken(MerzureParser.INT_CONST, 0).getSymbol(), msg);
				}

				if(test2 == Type.WARNING) {
					String msg = "Warning : " + rightType.toString() + " assigned to " + variable.getType().toString();
					MyCompiler.error(ctx.expression().start, msg);
				}
				else if(test2 == Type.INCOMPATIBLE) {
					String msg = "Incompatible assignment";
					MyCompiler.error(ctx.expression().start, msg);
				}
			}
		}
	}

	@Override public void exitArrValAsgnAll(MerzureParser.ArrValAsgnAllContext ctx) {
		String name = ctx.var().OBJECTID().getText();
		Symbol variable = this.currentScope.resolve(name);

		if (variable == null) {
			MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), "No such variable: " + name);
		}
		else if (!(variable instanceof VariableSymbol)) {
			MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), name + " is not a variable");
		}
		else if (!(variable.getType() instanceof Array)) {
			MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), name + " is not an array");
		}
		else {
			if(variable.getType().getIsConst() == true && variable.getWrittenTo() == true) {
				String msg = "Cannot reassign constant variable";
				MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), msg);
			}
			else {
				List<MerzureParser.ExpressionContext> values = ctx.expression();
				if(values.size() < variable.getType().getSize()) {
					String msg = "INVALID INITIALIZATION : Too many intialisers";
					MyCompiler.error(values.get(0).start, msg);
				}

				else if(values.size() > variable.getType().getSize()) {
					String msg = "INVALID INITIALIZATION : Too few intialisers";
					MyCompiler.error(values.get(0).start, msg);
				}

				for(int i = 0; i < values.size(); i++) {
					Type current = RefPhase.fetchType(values.get(i), this.types);
					if(current == null) {
						String msg = "Invalid Expression";
						MyCompiler.error(values.get(i).start, msg);
						continue;
					}
					int test2 = variable.getType().isCompatible(current);

					if(test2 == Type.WARNING) {
						String msg = "Warning : " + current.toString() + " assigned to " + variable.getType().toString();
						MyCompiler.error(values.get(i).start, msg);
					}
					else if(test2 == Type.INCOMPATIBLE) {
						String msg = "Incompatible assignment";
						MyCompiler.error(values.get(i).start, msg);
					}
				}
			}
		}
	}

	@Override public void exitExpression(MerzureParser.ExpressionContext ctx) {
		if(ctx.booleanExpression() != null) {
			Type type = RefPhase.fetchType(ctx.booleanExpression(), this.types);
			RefPhase.saveType(ctx, type, this.types);
		}
		else if(ctx.arithmeticExpression() != null) {
			Type type = RefPhase.fetchType(ctx.arithmeticExpression(), this.types);
			RefPhase.saveType(ctx, type, this.types);
			//System.out.print("expr ");
			//System.out.println(type);
		}
	}

	@Override public void exitBooleanExpression(MerzureParser.BooleanExpressionContext ctx) {
		if(ctx.getChildCount() == 3) {
			TerminalNode operator;
			if(ctx.AND() != null) {
				operator = ctx.getToken(MerzureParser.AND, 0);
			}
			else {
				operator = ctx.getToken(MerzureParser.OR, 0);
			}

			Type leftType = RefPhase.fetchType(ctx.booleanExpression(),this.types);
			Type rightType = RefPhase.fetchType(ctx.relationalExpression(), this.types);

			if(leftType.equals(Type.BOOL) && rightType.equals(Type.BOOL)) {
				RefPhase.saveType(ctx, Type.BOOL, this.types);
			}
			else if(leftType.equals(Type.BOOL) && !rightType.equals(Type.BOOL)) {
				String msg = "Right operand of " + operator.getText().toUpperCase() + " is not boolean";
				MyCompiler.error(operator.getSymbol(), msg);
				RefPhase.saveType(ctx, Type.INVALID, this.types);
			}
			else if(!leftType.equals(Type.BOOL) && rightType.equals(Type.BOOL)) {
				String msg = "Left operand of " + operator.getText().toUpperCase() + " is not boolean";
				MyCompiler.error(operator.getSymbol(), msg);
				RefPhase.saveType(ctx, Type.INVALID, this.types);
			}
			else {
				String msg = "Both operands of " + operator.getText().toUpperCase() + " are not boolean";
				MyCompiler.error(operator.getSymbol(), msg);
				RefPhase.saveType(ctx, Type.INVALID, this.types);	
			}
		}
		else {
			Type type = RefPhase.fetchType(ctx.relationalExpression(), this.types);
			RefPhase.saveType(ctx, type, this.types);
			//System.out.print("bool ");
			//System.out.print(type + " ");
		}
	}

	@Override public void exitRelationalExpression(MerzureParser.RelationalExpressionContext ctx) {
		if(ctx.getChildCount() == 3) {
			Type leftType = RefPhase.fetchType(ctx.relationalExpression(),this.types);
			Type rightType = RefPhase.fetchType(ctx.arithmeticExpression(), this.types);

			if(ctx.relOp() != null) {
				boolean test1 = leftType.isInteger(leftType) && rightType.isInteger(rightType);
				if(test1 == false) {
					String msg = "Both operands of a relational expression must be of INT type";
					MyCompiler.error(ctx.relationalExpression().start, msg);
					RefPhase.saveType(ctx, Type.INVALID, this.types);
				}
				else {
					RefPhase.saveType(ctx, Type.BOOL, this.types);
				}
			}
			else {
				boolean case1 = (leftType.isInteger(leftType) && rightType.isInteger(rightType));
				boolean case2 = (leftType == Type.BOOL && rightType == Type.BOOL);
				if(case1 == false && case2 == false) {
					String msg = "Both operands of an equality expression must be either of INT type or BOOL type";
					MyCompiler.error(ctx.relationalExpression().start, msg);
					RefPhase.saveType(ctx, Type.INVALID, this.types);
				}
				else {
					RefPhase.saveType(ctx, Type.BOOL, this.types);
				}
			}
		}
		else {
			Type type = RefPhase.fetchType(ctx.arithmeticExpression(), this.types);
			RefPhase.saveType(ctx, type, this.types);
			//System.out.print("rel ");
			//System.out.print(type + " ");
		}
	}

	@Override public void exitArithmeticExpression(MerzureParser.ArithmeticExpressionContext ctx) {
		if(ctx.getChildCount() == 3) {
			Type leftType = RefPhase.fetchType(ctx.arithmeticExpression(),this.types);
			Type rightType = RefPhase.fetchType(ctx.unaryExpression(), this.types);

			Type resultantType = leftType.result(rightType);
			RefPhase.saveType(ctx, resultantType, this.types);
		}
		else {
			Type type = RefPhase.fetchType(ctx.unaryExpression(), this.types);
			RefPhase.saveType(ctx, type, this.types);
			//System.out.print("arith ");
			//System.out.print(type + " ");
		}
	}

	@Override public void exitUnaryExpr(MerzureParser.UnaryExprContext ctx) {
		Type type = RefPhase.fetchType(ctx.primaryExpression(), this.types);
		if(ctx.unaryOperator() != null && ctx.unaryOperator().NOT() != null) {
			if(type.equals(Type.BOOL) == false) {
				String msg = "Operand of NOT operator must be boolean";
				MyCompiler.error(ctx.unaryOperator().getToken(MerzureParser.NOT, 0).getSymbol(), msg);
				RefPhase.saveType(ctx, Type.INVALID, this.types);
			}
			else {
				RefPhase.saveType(ctx, Type.BOOL, this.types);
			}
		}
		else {
			RefPhase.saveType(ctx, type, this.types);
		}
		//System.out.print("unary ");
		//System.out.print(type + " ");
	}

	@Override public void exitFunCall(MerzureParser.FunCallContext ctx) {
		String name = ctx.var().getText();
		Symbol function = this.currentScope.resolve(name);

		if(debugging.status == true) {
			System.out.println("Function call : " + name);
		}

		if (function == null) {
			MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), "No such function: "+name);
			//this.saveType(ctx, Type.INVALID, this.types);
			return;
		}
		if (!(function instanceof MethodSymbol)) {
			MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), name + " is not a function");
			//this.saveType(ctx, Type.INVALID, this.types);
			return;
		}

		matchParameters(ctx, function);
		this.saveType(ctx, function.getType(), this.types);
		//System.out.print("funCall ");
	}

	@Override public void exitUsedVar(MerzureParser.UsedVarContext ctx) {
		String name = ctx.var().OBJECTID().getText();
		Symbol variable = this.currentScope.resolve(name);

		if (variable == null) {
			MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), "No such variable: " + name);
		}
		else if (!(variable instanceof VariableSymbol)) {
			MyCompiler.error(ctx.var().getToken(RefPhase.OBJID, 0).getSymbol(), name + " is not a variable");
		}
		else {
			RefPhase.saveType(ctx, variable.getType(), this.types);
			variable.setReadFrom(true);
		}
		//System.out.print("var ");
	}
	
	@Override public void exitMyConstant(MerzureParser.MyConstantContext ctx) {
		Type type = RefPhase.fetchType(ctx.constant(), this.types);
		RefPhase.saveType(ctx, type, this.types);
	}

	@Override public void exitParenExpr(MerzureParser.ParenExprContext ctx) {
		Type type = RefPhase.fetchType(ctx.expression(), this.types);
		RefPhase.saveType(ctx, type, this.types);
	}

	@Override public void exitConstant(MerzureParser.ConstantContext ctx) {
		int ttype = ctx.start.getType();
		Type type = MyCompiler.getType(ttype);
		RefPhase.saveType(ctx, type, this.types);
		//System.out.print("const ");
		//System.out.print(type + " ");
	}
}