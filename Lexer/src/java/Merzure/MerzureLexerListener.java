// Generated from MerzureLexer.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MerzureLexerParser}.
 */
public interface MerzureLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MerzureLexerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MerzureLexerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(MerzureLexerParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(MerzureLexerParser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(MerzureLexerParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(MerzureLexerParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(MerzureLexerParser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(MerzureLexerParser.Selection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(MerzureLexerParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(MerzureLexerParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(MerzureLexerParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(MerzureLexerParser.Jump_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(MerzureLexerParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(MerzureLexerParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#var_val_asgn}.
	 * @param ctx the parse tree
	 */
	void enterVar_val_asgn(MerzureLexerParser.Var_val_asgnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#var_val_asgn}.
	 * @param ctx the parse tree
	 */
	void exitVar_val_asgn(MerzureLexerParser.Var_val_asgnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(MerzureLexerParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(MerzureLexerParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MerzureLexerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MerzureLexerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#math_type}.
	 * @param ctx the parse tree
	 */
	void enterMath_type(MerzureLexerParser.Math_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#math_type}.
	 * @param ctx the parse tree
	 */
	void exitMath_type(MerzureLexerParser.Math_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#non_math_type}.
	 * @param ctx the parse tree
	 */
	void enterNon_math_type(MerzureLexerParser.Non_math_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#non_math_type}.
	 * @param ctx the parse tree
	 */
	void exitNon_math_type(MerzureLexerParser.Non_math_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#storage_class}.
	 * @param ctx the parse tree
	 */
	void enterStorage_class(MerzureLexerParser.Storage_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#storage_class}.
	 * @param ctx the parse tree
	 */
	void exitStorage_class(MerzureLexerParser.Storage_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#arr_data_type}.
	 * @param ctx the parse tree
	 */
	void enterArr_data_type(MerzureLexerParser.Arr_data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#arr_data_type}.
	 * @param ctx the parse tree
	 */
	void exitArr_data_type(MerzureLexerParser.Arr_data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#arr_declarations}.
	 * @param ctx the parse tree
	 */
	void enterArr_declarations(MerzureLexerParser.Arr_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#arr_declarations}.
	 * @param ctx the parse tree
	 */
	void exitArr_declarations(MerzureLexerParser.Arr_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#arr_val_asgn_one}.
	 * @param ctx the parse tree
	 */
	void enterArr_val_asgn_one(MerzureLexerParser.Arr_val_asgn_oneContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#arr_val_asgn_one}.
	 * @param ctx the parse tree
	 */
	void exitArr_val_asgn_one(MerzureLexerParser.Arr_val_asgn_oneContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#arr_val_asgn_all}.
	 * @param ctx the parse tree
	 */
	void enterArr_val_asgn_all(MerzureLexerParser.Arr_val_asgn_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#arr_val_asgn_all}.
	 * @param ctx the parse tree
	 */
	void exitArr_val_asgn_all(MerzureLexerParser.Arr_val_asgn_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MerzureLexerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MerzureLexerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(MerzureLexerParser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(MerzureLexerParser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(MerzureLexerParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(MerzureLexerParser.Logical_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(MerzureLexerParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(MerzureLexerParser.Logical_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(MerzureLexerParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(MerzureLexerParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(MerzureLexerParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(MerzureLexerParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(MerzureLexerParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(MerzureLexerParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expression(MerzureLexerParser.Arithmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expression(MerzureLexerParser.Arithmetic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(MerzureLexerParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(MerzureLexerParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(MerzureLexerParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(MerzureLexerParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(MerzureLexerParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(MerzureLexerParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(MerzureLexerParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(MerzureLexerParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(MerzureLexerParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(MerzureLexerParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MerzureLexerParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MerzureLexerParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(MerzureLexerParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(MerzureLexerParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#parlist}.
	 * @param ctx the parse tree
	 */
	void enterParlist(MerzureLexerParser.ParlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#parlist}.
	 * @param ctx the parse tree
	 */
	void exitParlist(MerzureLexerParser.ParlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(MerzureLexerParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(MerzureLexerParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#functionPrototype}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPrototype(MerzureLexerParser.FunctionPrototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#functionPrototype}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPrototype(MerzureLexerParser.FunctionPrototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#protParlist}.
	 * @param ctx the parse tree
	 */
	void enterProtParlist(MerzureLexerParser.ProtParlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#protParlist}.
	 * @param ctx the parse tree
	 */
	void exitProtParlist(MerzureLexerParser.ProtParlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#var_asgn_function_call}.
	 * @param ctx the parse tree
	 */
	void enterVar_asgn_function_call(MerzureLexerParser.Var_asgn_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#var_asgn_function_call}.
	 * @param ctx the parse tree
	 */
	void exitVar_asgn_function_call(MerzureLexerParser.Var_asgn_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#no_asgn_function_call}.
	 * @param ctx the parse tree
	 */
	void enterNo_asgn_function_call(MerzureLexerParser.No_asgn_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#no_asgn_function_call}.
	 * @param ctx the parse tree
	 */
	void exitNo_asgn_function_call(MerzureLexerParser.No_asgn_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MerzureLexerParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(MerzureLexerParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MerzureLexerParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(MerzureLexerParser.Return_typeContext ctx);
}