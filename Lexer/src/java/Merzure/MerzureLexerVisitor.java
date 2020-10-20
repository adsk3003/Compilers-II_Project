// Generated from MerzureLexer.g4 by ANTLR 4.5
package Merzure;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MerzureLexerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MerzureLexerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MerzureLexerParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(MerzureLexerParser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(MerzureLexerParser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#selection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_statement(MerzureLexerParser.Selection_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(MerzureLexerParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_statement(MerzureLexerParser.Jump_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaration(MerzureLexerParser.Var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#var_val_asgn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_val_asgn(MerzureLexerParser.Var_val_asgnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_type(MerzureLexerParser.Var_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MerzureLexerParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#math_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_type(MerzureLexerParser.Math_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#non_math_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_math_type(MerzureLexerParser.Non_math_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#storage_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_class(MerzureLexerParser.Storage_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#arr_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_data_type(MerzureLexerParser.Arr_data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#arr_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_declarations(MerzureLexerParser.Arr_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#arr_val_asgn_one}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_val_asgn_one(MerzureLexerParser.Arr_val_asgn_oneContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#arr_val_asgn_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_val_asgn_all(MerzureLexerParser.Arr_val_asgn_allContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MerzureLexerParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expression(MerzureLexerParser.Boolean_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#logical_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_or_expression(MerzureLexerParser.Logical_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#logical_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_and_expression(MerzureLexerParser.Logical_and_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(MerzureLexerParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(MerzureLexerParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_op(MerzureLexerParser.Eq_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_expression(MerzureLexerParser.Arithmetic_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(MerzureLexerParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(MerzureLexerParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(MerzureLexerParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(MerzureLexerParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(MerzureLexerParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MerzureLexerParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(MerzureLexerParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#parlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParlist(MerzureLexerParser.ParlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(MerzureLexerParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#functionPrototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPrototype(MerzureLexerParser.FunctionPrototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#protParlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtParlist(MerzureLexerParser.ProtParlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MerzureLexerParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(MerzureLexerParser.Return_typeContext ctx);
}