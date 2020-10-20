// Generated from MerzureLexer.g4 by ANTLR 4.5
package Merzure;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MerzureLexerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EOL=1, CHAR=2, CONST=3, AUTO=4, UNSIGNED=5, BREAK=6, CONTINUE=7, COMPLEX=8, 
		ELSE=9, BOOL=10, FOR=11, IF=12, ELIF=13, REAL=14, INT=15, LONG=16, RETURN=17, 
		FALSE=18, INCLUDE=19, END=20, VOID=21, FUNCTION=22, STATIC=23, TRUE=24, 
		AND=25, OR=26, NOT=27, CHAR_CONST=28, INT_CONST=29, REAL_CONST=30, COMPLEX_CONST=31, 
		BOOL_CONST=32, STR_CONST=33, OBJECTID=34, LPAREN=35, RPAREN=36, COLON=37, 
		ATSYM=38, SEMICOLON=39, COMMA=40, PLUS=41, MINUS=42, STAR=43, SLASH=44, 
		TILDE=45, LT=46, GT=47, EQUALS=48, LEQ=49, GEQ=50, NEQ=51, LBRACE=52, 
		RBRACE=53, DOT=54, ASSIGN=55, POW=56, MOD=57, WHITESPACE=58, SPACES=59, 
		SIMPLE_COMMENT=60, ERROR=61, EOF_STRING=62, INVALID_ESCAPE=63, INVALID_CHARS=64;
	public static final int
		RULE_statement = 0, RULE_compound_statement = 1, RULE_expression_statement = 2, 
		RULE_selection_statement = 3, RULE_loop_statement = 4, RULE_jump_statement = 5, 
		RULE_var_declaration = 6, RULE_var_val_asgn = 7, RULE_var_type = 8, RULE_type = 9, 
		RULE_math_type = 10, RULE_non_math_type = 11, RULE_storage_class = 12, 
		RULE_arr_data_type = 13, RULE_arr_declarations = 14, RULE_arr_val_asgn_one = 15, 
		RULE_arr_val_asgn_all = 16, RULE_expression = 17, RULE_boolean_expression = 18, 
		RULE_logical_or_expression = 19, RULE_logical_and_expression = 20, RULE_relational_expression = 21, 
		RULE_relop = 22, RULE_eq_op = 23, RULE_arithmetic_expression = 24, RULE_unary_expression = 25, 
		RULE_unary_operator = 26, RULE_primary_expression = 27, RULE_var = 28, 
		RULE_constant = 29, RULE_function = 30, RULE_functionStatement = 31, RULE_parlist = 32, 
		RULE_functionBody = 33, RULE_functionPrototype = 34, RULE_protParlist = 35, 
		RULE_return_type = 36;
	public static final String[] ruleNames = {
		"statement", "compound_statement", "expression_statement", "selection_statement", 
		"loop_statement", "jump_statement", "var_declaration", "var_val_asgn", 
		"var_type", "type", "math_type", "non_math_type", "storage_class", "arr_data_type", 
		"arr_declarations", "arr_val_asgn_one", "arr_val_asgn_all", "expression", 
		"boolean_expression", "logical_or_expression", "logical_and_expression", 
		"relational_expression", "relop", "eq_op", "arithmetic_expression", "unary_expression", 
		"unary_operator", "primary_expression", "var", "constant", "function", 
		"functionStatement", "parlist", "functionBody", "functionPrototype", "protParlist", 
		"return_type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'char'", "'const'", "'auto'", "'unsigned'", "'break'", "'continue'", 
		"'complex'", "'else'", "'bool'", "'for'", "'if'", "'elif'", "'real'", 
		"'int'", "'long'", "'return'", "'false'", "'include'", "'end'", "'void'", 
		"'function'", "'static'", "'true'", "'and'", "'or'", "'not'", null, null, 
		null, null, null, null, null, "'('", "')'", "':'", "'@'", "';'", "','", 
		"'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'>'", "'=='", "'<='", "'>='", 
		"'!='", "'{'", "'}'", "'.'", "'='", "'^'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EOL", "CHAR", "CONST", "AUTO", "UNSIGNED", "BREAK", "CONTINUE", 
		"COMPLEX", "ELSE", "BOOL", "FOR", "IF", "ELIF", "REAL", "INT", "LONG", 
		"RETURN", "FALSE", "INCLUDE", "END", "VOID", "FUNCTION", "STATIC", "TRUE", 
		"AND", "OR", "NOT", "CHAR_CONST", "INT_CONST", "REAL_CONST", "COMPLEX_CONST", 
		"BOOL_CONST", "STR_CONST", "OBJECTID", "LPAREN", "RPAREN", "COLON", "ATSYM", 
		"SEMICOLON", "COMMA", "PLUS", "MINUS", "STAR", "SLASH", "TILDE", "LT", 
		"GT", "EQUALS", "LEQ", "GEQ", "NEQ", "LBRACE", "RBRACE", "DOT", "ASSIGN", 
		"POW", "MOD", "WHITESPACE", "SPACES", "SIMPLE_COMMENT", "ERROR", "EOF_STRING", 
		"INVALID_ESCAPE", "INVALID_CHARS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MerzureLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MerzureLexerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementContext extends ParserRuleContext {
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			setState(78);
			switch (_input.LA(1)) {
			case NOT:
			case INT_CONST:
			case REAL_CONST:
			case BOOL_CONST:
			case OBJECTID:
			case LPAREN:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				expression_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				selection_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				loop_statement();
				}
				break;
			case BREAK:
			case CONTINUE:
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				jump_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_statementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitCompound_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				statement();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << NOT) | (1L << INT_CONST) | (1L << REAL_CONST) | (1L << BOOL_CONST) | (1L << OBJECTID) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitExpression_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selection_statementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(MerzureLexerParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(MerzureLexerParser.IF, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(MerzureLexerParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(MerzureLexerParser.LPAREN, i);
		}
		public List<Boolean_expressionContext> boolean_expression() {
			return getRuleContexts(Boolean_expressionContext.class);
		}
		public Boolean_expressionContext boolean_expression(int i) {
			return getRuleContext(Boolean_expressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(MerzureLexerParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(MerzureLexerParser.RPAREN, i);
		}
		public List<Compound_statementContext> compound_statement() {
			return getRuleContexts(Compound_statementContext.class);
		}
		public Compound_statementContext compound_statement(int i) {
			return getRuleContext(Compound_statementContext.class,i);
		}
		public TerminalNode END() { return getToken(MerzureLexerParser.END, 0); }
		public List<TerminalNode> ELIF() { return getTokens(MerzureLexerParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(MerzureLexerParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(MerzureLexerParser.ELSE, 0); }
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitSelection_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selection_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(IF);
			setState(88);
			match(LPAREN);
			setState(89);
			boolean_expression();
			setState(90);
			match(RPAREN);
			setState(91);
			compound_statement();
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(92);
					match(ELIF);
					setState(93);
					match(LPAREN);
					setState(94);
					boolean_expression();
					setState(95);
					match(RPAREN);
					setState(96);
					compound_statement();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(105);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(103);
				match(ELSE);
				setState(104);
				compound_statement();
				}
			}

			setState(107);
			match(END);
			setState(108);
			match(IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_statementContext extends ParserRuleContext {
		public List<TerminalNode> FOR() { return getTokens(MerzureLexerParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(MerzureLexerParser.FOR, i);
		}
		public TerminalNode LPAREN() { return getToken(MerzureLexerParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(MerzureLexerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MerzureLexerParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(MerzureLexerParser.RPAREN, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public TerminalNode END() { return getToken(MerzureLexerParser.END, 0); }
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(FOR);
			setState(111);
			match(LPAREN);
			setState(113);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << INT_CONST) | (1L << REAL_CONST) | (1L << BOOL_CONST) | (1L << OBJECTID) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(112);
				arithmetic_expression(0);
				}
			}

			setState(115);
			match(SEMICOLON);
			setState(117);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << INT_CONST) | (1L << REAL_CONST) | (1L << BOOL_CONST) | (1L << OBJECTID) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(116);
				boolean_expression();
				}
			}

			setState(119);
			match(SEMICOLON);
			setState(121);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << INT_CONST) | (1L << REAL_CONST) | (1L << BOOL_CONST) | (1L << OBJECTID) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(120);
				arithmetic_expression(0);
				}
			}

			setState(123);
			match(RPAREN);
			setState(124);
			compound_statement();
			setState(125);
			match(END);
			setState(126);
			match(FOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jump_statementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(MerzureLexerParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(MerzureLexerParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(MerzureLexerParser.RETURN, 0); }
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitJump_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_jump_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONTINUE) | (1L << RETURN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declarationContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(MerzureLexerParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MerzureLexerParser.COLON, i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(MerzureLexerParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MerzureLexerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MerzureLexerParser.COMMA, i);
		}
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitVar_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			var_type();
			setState(131);
			match(COLON);
			setState(132);
			match(COLON);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133);
					var();
					setState(134);
					match(COMMA);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(141);
			var();
			setState(142);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_val_asgnContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MerzureLexerParser.ASSIGN, 0); }
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MerzureLexerParser.SEMICOLON, 0); }
		public Var_val_asgnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_val_asgn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitVar_val_asgn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_val_asgnContext var_val_asgn() throws RecognitionException {
		Var_val_asgnContext _localctx = new Var_val_asgnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_val_asgn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			var();
			setState(145);
			match(ASSIGN);
			setState(146);
			primary_expression();
			setState(147);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Storage_classContext storage_class() {
			return getRuleContext(Storage_classContext.class,0);
		}
		public TerminalNode CONST() { return getToken(MerzureLexerParser.CONST, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitVar_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(150);
				_la = _input.LA(1);
				if (_la==AUTO || _la==STATIC) {
					{
					setState(149);
					storage_class();
					}
				}

				setState(153);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(152);
					match(CONST);
					}
				}

				}
				break;
			case 2:
				{
				setState(156);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(155);
					match(CONST);
					}
				}

				setState(159);
				_la = _input.LA(1);
				if (_la==AUTO || _la==STATIC) {
					{
					setState(158);
					storage_class();
					}
				}

				}
				break;
			}
			{
			setState(163);
			type();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Math_typeContext math_type() {
			return getRuleContext(Math_typeContext.class,0);
		}
		public Non_math_typeContext non_math_type() {
			return getRuleContext(Non_math_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(167);
			switch (_input.LA(1)) {
			case UNSIGNED:
			case REAL:
			case INT:
			case LONG:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				math_type();
				}
				break;
			case CHAR:
			case COMPLEX:
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				non_math_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MerzureLexerParser.INT, 0); }
		public TerminalNode REAL() { return getToken(MerzureLexerParser.REAL, 0); }
		public TerminalNode UNSIGNED() { return getToken(MerzureLexerParser.UNSIGNED, 0); }
		public TerminalNode LONG() { return getToken(MerzureLexerParser.LONG, 0); }
		public Math_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitMath_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_typeContext math_type() throws RecognitionException {
		Math_typeContext _localctx = new Math_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_math_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if (_la==UNSIGNED) {
				{
				setState(169);
				match(UNSIGNED);
				}
			}

			setState(177);
			switch (_input.LA(1)) {
			case INT:
			case LONG:
				{
				setState(173);
				_la = _input.LA(1);
				if (_la==LONG) {
					{
					setState(172);
					match(LONG);
					}
				}

				setState(175);
				match(INT);
				}
				break;
			case REAL:
				{
				setState(176);
				match(REAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_math_typeContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(MerzureLexerParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(MerzureLexerParser.BOOL, 0); }
		public TerminalNode COMPLEX() { return getToken(MerzureLexerParser.COMPLEX, 0); }
		public Non_math_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_math_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitNon_math_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_math_typeContext non_math_type() throws RecognitionException {
		Non_math_typeContext _localctx = new Non_math_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_non_math_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << COMPLEX) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Storage_classContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(MerzureLexerParser.STATIC, 0); }
		public TerminalNode AUTO() { return getToken(MerzureLexerParser.AUTO, 0); }
		public Storage_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_class; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitStorage_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Storage_classContext storage_class() throws RecognitionException {
		Storage_classContext _localctx = new Storage_classContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_storage_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !(_la==AUTO || _la==STATIC) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arr_data_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MerzureLexerParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(MerzureLexerParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(MerzureLexerParser.CHAR, 0); }
		public TerminalNode REAL() { return getToken(MerzureLexerParser.REAL, 0); }
		public TerminalNode COMPLEX() { return getToken(MerzureLexerParser.COMPLEX, 0); }
		public TerminalNode STATIC() { return getToken(MerzureLexerParser.STATIC, 0); }
		public TerminalNode UNSIGNED() { return getToken(MerzureLexerParser.UNSIGNED, 0); }
		public TerminalNode LONG() { return getToken(MerzureLexerParser.LONG, 0); }
		public Arr_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_data_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitArr_data_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr_data_typeContext arr_data_type() throws RecognitionException {
		Arr_data_typeContext _localctx = new Arr_data_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arr_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(183);
				match(STATIC);
				}
			}

			setState(197);
			switch (_input.LA(1)) {
			case UNSIGNED:
			case INT:
			case LONG:
				{
				setState(187);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(186);
					match(UNSIGNED);
					}
				}

				setState(190);
				_la = _input.LA(1);
				if (_la==LONG) {
					{
					setState(189);
					match(LONG);
					}
				}

				setState(192);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(193);
				match(BOOL);
				}
				break;
			case CHAR:
				{
				setState(194);
				match(CHAR);
				}
				break;
			case REAL:
				{
				setState(195);
				match(REAL);
				}
				break;
			case COMPLEX:
				{
				setState(196);
				match(COMPLEX);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arr_declarationsContext extends ParserRuleContext {
		public Arr_data_typeContext arr_data_type() {
			return getRuleContext(Arr_data_typeContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(MerzureLexerParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MerzureLexerParser.COLON, i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MerzureLexerParser.LPAREN, 0); }
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MerzureLexerParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MerzureLexerParser.SEMICOLON, 0); }
		public Arr_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_declarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitArr_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr_declarationsContext arr_declarations() throws RecognitionException {
		Arr_declarationsContext _localctx = new Arr_declarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arr_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			arr_data_type();
			setState(200);
			match(COLON);
			setState(201);
			match(COLON);
			setState(202);
			var();
			setState(203);
			match(LPAREN);
			setState(204);
			arithmetic_expression(0);
			setState(205);
			match(RPAREN);
			setState(206);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arr_val_asgn_oneContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MerzureLexerParser.LPAREN, 0); }
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MerzureLexerParser.RPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(MerzureLexerParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MerzureLexerParser.SEMICOLON, 0); }
		public Arr_val_asgn_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_val_asgn_one; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitArr_val_asgn_one(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr_val_asgn_oneContext arr_val_asgn_one() throws RecognitionException {
		Arr_val_asgn_oneContext _localctx = new Arr_val_asgn_oneContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arr_val_asgn_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			var();
			setState(209);
			match(LPAREN);
			setState(210);
			arithmetic_expression(0);
			setState(211);
			match(RPAREN);
			setState(212);
			match(ASSIGN);
			setState(213);
			arithmetic_expression(0);
			setState(214);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arr_val_asgn_allContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MerzureLexerParser.ASSIGN, 0); }
		public TerminalNode LPAREN() { return getToken(MerzureLexerParser.LPAREN, 0); }
		public List<TerminalNode> SLASH() { return getTokens(MerzureLexerParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(MerzureLexerParser.SLASH, i);
		}
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MerzureLexerParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MerzureLexerParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MerzureLexerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MerzureLexerParser.COMMA, i);
		}
		public Arr_val_asgn_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_val_asgn_all; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitArr_val_asgn_all(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr_val_asgn_allContext arr_val_asgn_all() throws RecognitionException {
		Arr_val_asgn_allContext _localctx = new Arr_val_asgn_allContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arr_val_asgn_all);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			var();
			setState(217);
			match(ASSIGN);
			setState(218);
			match(LPAREN);
			setState(219);
			match(SLASH);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(220);
					arithmetic_expression(0);
					setState(221);
					match(COMMA);
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(228);
			arithmetic_expression(0);
			setState(229);
			match(SLASH);
			setState(230);
			match(RPAREN);
			setState(231);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(235);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				boolean_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				arithmetic_expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_expressionContext extends ParserRuleContext {
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitBoolean_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolean_expression);
		try {
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				logical_or_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				logical_and_expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_or_expressionContext extends ParserRuleContext {
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(MerzureLexerParser.OR, 0); }
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitLogical_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		return logical_or_expression(0);
	}

	private Logical_or_expressionContext logical_or_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, _parentState);
		Logical_or_expressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_logical_or_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(242);
			logical_and_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_or_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_or_expression);
					setState(244);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(245);
					match(OR);
					setState(246);
					logical_and_expression(0);
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Logical_and_expressionContext extends ParserRuleContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(MerzureLexerParser.AND, 0); }
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitLogical_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		return logical_and_expression(0);
	}

	private Logical_and_expressionContext logical_and_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, _parentState);
		Logical_and_expressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_logical_and_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(253);
			relational_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_and_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_and_expression);
					setState(255);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(256);
					match(AND);
					setState(257);
					relational_expression(0);
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Relational_expressionContext extends ParserRuleContext {
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		return relational_expression(0);
	}

	private Relational_expressionContext relational_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, _parentState);
		Relational_expressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_relational_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(264);
			arithmetic_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(274);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(266);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(267);
						relop();
						setState(268);
						arithmetic_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(270);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(271);
						eq_op();
						setState(272);
						arithmetic_expression(0);
						}
						break;
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(MerzureLexerParser.LT, 0); }
		public TerminalNode GT() { return getToken(MerzureLexerParser.GT, 0); }
		public TerminalNode LEQ() { return getToken(MerzureLexerParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(MerzureLexerParser.GEQ, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LEQ) | (1L << GEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eq_opContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(MerzureLexerParser.EQUALS, 0); }
		public TerminalNode NEQ() { return getToken(MerzureLexerParser.NEQ, 0); }
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitEq_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==NEQ) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arithmetic_expressionContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(MerzureLexerParser.POW, 0); }
		public TerminalNode SLASH() { return getToken(MerzureLexerParser.SLASH, 0); }
		public TerminalNode STAR() { return getToken(MerzureLexerParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(MerzureLexerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MerzureLexerParser.MINUS, 0); }
		public Arithmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitArithmetic_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_expressionContext arithmetic_expression() throws RecognitionException {
		return arithmetic_expression(0);
	}

	private Arithmetic_expressionContext arithmetic_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_expressionContext _localctx = new Arithmetic_expressionContext(_ctx, _parentState);
		Arithmetic_expressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_arithmetic_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(284);
			unary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(301);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(286);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(287);
						match(POW);
						setState(288);
						arithmetic_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(289);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(290);
						match(SLASH);
						setState(291);
						arithmetic_expression(5);
						}
						break;
					case 3:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(292);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(293);
						match(STAR);
						setState(294);
						arithmetic_expression(4);
						}
						break;
					case 4:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(295);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(296);
						match(PLUS);
						setState(297);
						arithmetic_expression(3);
						}
						break;
					case 5:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(298);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(299);
						match(MINUS);
						setState(300);
						arithmetic_expression(2);
						}
						break;
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unary_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(306);
				unary_operator();
				}
			}

			setState(309);
			primary_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MerzureLexerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MerzureLexerParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(MerzureLexerParser.NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MerzureLexerParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MerzureLexerParser.RPAREN, 0); }
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primary_expression);
		try {
			setState(319);
			switch (_input.LA(1)) {
			case OBJECTID:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				var();
				}
				break;
			case INT_CONST:
			case REAL_CONST:
			case BOOL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				constant();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(LPAREN);
				setState(316);
				expression();
				setState(317);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode OBJECTID() { return getToken(MerzureLexerParser.OBJECTID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(OBJECTID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode BOOL_CONST() { return getToken(MerzureLexerParser.BOOL_CONST, 0); }
		public TerminalNode REAL_CONST() { return getToken(MerzureLexerParser.REAL_CONST, 0); }
		public TerminalNode INT_CONST() { return getToken(MerzureLexerParser.INT_CONST, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_CONST) | (1L << REAL_CONST) | (1L << BOOL_CONST))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionStatementContext functionStatement() {
			return getRuleContext(FunctionStatementContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			functionStatement();
			setState(326);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionStatementContext extends ParserRuleContext {
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(MerzureLexerParser.FUNCTION, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MerzureLexerParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MerzureLexerParser.RPAREN, 0); }
		public ParlistContext parlist() {
			return getRuleContext(ParlistContext.class,0);
		}
		public TerminalNode EOL() { return getToken(MerzureLexerParser.EOL, 0); }
		public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			return_type();
			setState(329);
			match(FUNCTION);
			setState(330);
			var();
			setState(331);
			match(LPAREN);
			setState(333);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << CONST) | (1L << AUTO) | (1L << UNSIGNED) | (1L << COMPLEX) | (1L << BOOL) | (1L << REAL) | (1L << INT) | (1L << LONG) | (1L << STATIC))) != 0)) {
				{
				setState(332);
				parlist();
				}
			}

			setState(335);
			match(RPAREN);
			setState(337);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(336);
				match(EOL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParlistContext extends ParserRuleContext {
		public List<Var_typeContext> var_type() {
			return getRuleContexts(Var_typeContext.class);
		}
		public Var_typeContext var_type(int i) {
			return getRuleContext(Var_typeContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MerzureLexerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MerzureLexerParser.COMMA, i);
		}
		public ParlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitParlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParlistContext parlist() throws RecognitionException {
		ParlistContext _localctx = new ParlistContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			var_type();
			setState(340);
			var();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(341);
				match(COMMA);
				setState(342);
				var_type();
				setState(343);
				var();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public TerminalNode END() { return getToken(MerzureLexerParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(MerzureLexerParser.FUNCTION, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			compound_statement();
			setState(351);
			match(END);
			setState(352);
			match(FUNCTION);
			setState(353);
			var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionPrototypeContext extends ParserRuleContext {
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(MerzureLexerParser.FUNCTION, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MerzureLexerParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MerzureLexerParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MerzureLexerParser.SEMICOLON, 0); }
		public ProtParlistContext protParlist() {
			return getRuleContext(ProtParlistContext.class,0);
		}
		public FunctionPrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPrototype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitFunctionPrototype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionPrototypeContext functionPrototype() throws RecognitionException {
		FunctionPrototypeContext _localctx = new FunctionPrototypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionPrototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			return_type();
			setState(356);
			match(FUNCTION);
			setState(357);
			var();
			setState(358);
			match(LPAREN);
			setState(360);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << CONST) | (1L << AUTO) | (1L << UNSIGNED) | (1L << COMPLEX) | (1L << BOOL) | (1L << REAL) | (1L << INT) | (1L << LONG) | (1L << STATIC))) != 0)) {
				{
				setState(359);
				protParlist();
				}
			}

			setState(362);
			match(RPAREN);
			setState(363);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtParlistContext extends ParserRuleContext {
		public List<Var_typeContext> var_type() {
			return getRuleContexts(Var_typeContext.class);
		}
		public Var_typeContext var_type(int i) {
			return getRuleContext(Var_typeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MerzureLexerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MerzureLexerParser.COMMA, i);
		}
		public ProtParlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protParlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitProtParlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtParlistContext protParlist() throws RecognitionException {
		ProtParlistContext _localctx = new ProtParlistContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_protParlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			var_type();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(366);
				match(COMMA);
				setState(367);
				var_type();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_typeContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(MerzureLexerParser.CHAR, 0); }
		public TerminalNode COMPLEX() { return getToken(MerzureLexerParser.COMPLEX, 0); }
		public TerminalNode BOOL() { return getToken(MerzureLexerParser.BOOL, 0); }
		public TerminalNode REAL() { return getToken(MerzureLexerParser.REAL, 0); }
		public TerminalNode INT() { return getToken(MerzureLexerParser.INT, 0); }
		public TerminalNode UNSIGNED() { return getToken(MerzureLexerParser.UNSIGNED, 0); }
		public TerminalNode LONG() { return getToken(MerzureLexerParser.LONG, 0); }
		public TerminalNode VOID() { return getToken(MerzureLexerParser.VOID, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MerzureLexerVisitor ) return ((MerzureLexerVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_return_type);
		int _la;
		try {
			setState(385);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(CHAR);
				}
				break;
			case COMPLEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(COMPLEX);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				match(BOOL);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(376);
				match(REAL);
				}
				break;
			case UNSIGNED:
			case INT:
			case LONG:
				enterOuterAlt(_localctx, 5);
				{
				setState(378);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(377);
					match(UNSIGNED);
					}
				}

				setState(381);
				_la = _input.LA(1);
				if (_la==LONG) {
					{
					setState(380);
					match(LONG);
					}
				}

				setState(383);
				match(INT);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 6);
				{
				setState(384);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return logical_or_expression_sempred((Logical_or_expressionContext)_localctx, predIndex);
		case 20:
			return logical_and_expression_sempred((Logical_and_expressionContext)_localctx, predIndex);
		case 21:
			return relational_expression_sempred((Relational_expressionContext)_localctx, predIndex);
		case 24:
			return arithmetic_expression_sempred((Arithmetic_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_or_expression_sempred(Logical_or_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_and_expression_sempred(Logical_and_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean relational_expression_sempred(Relational_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean arithmetic_expression_sempred(Arithmetic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3B\u0186\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\5\2Q\n\2\3\3\6\3T"+
		"\n\3\r\3\16\3U\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"e\n\5\f\5\16\5h\13\5\3\5\3\5\5\5l\n\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6t\n\6"+
		"\3\6\3\6\5\6x\n\6\3\6\3\6\5\6|\n\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\b\u008b\n\b\f\b\16\b\u008e\13\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\5\n\u0099\n\n\3\n\5\n\u009c\n\n\3\n\5\n\u009f\n\n\3\n"+
		"\5\n\u00a2\n\n\5\n\u00a4\n\n\3\n\3\n\3\13\3\13\5\13\u00aa\n\13\3\f\5\f"+
		"\u00ad\n\f\3\f\5\f\u00b0\n\f\3\f\3\f\5\f\u00b4\n\f\3\r\3\r\3\16\3\16\3"+
		"\17\5\17\u00bb\n\17\3\17\5\17\u00be\n\17\3\17\5\17\u00c1\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00c8\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00e2\n\22\f\22\16\22\u00e5\13\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\5\23\u00ee\n\23\3\24\3\24\5\24\u00f2\n\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\7\25\u00fa\n\25\f\25\16\25\u00fd\13\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\7\26\u0105\n\26\f\26\16\26\u0108\13\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0115\n\27\f\27\16\27"+
		"\u0118\13\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0130\n\32"+
		"\f\32\16\32\u0133\13\32\3\33\5\33\u0136\n\33\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u0142\n\35\3\36\3\36\3\37\3\37\3 \3 \3"+
		" \3!\3!\3!\3!\3!\5!\u0150\n!\3!\3!\5!\u0154\n!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\7\"\u015c\n\"\f\"\16\"\u015f\13\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\5$\u016b"+
		"\n$\3$\3$\3$\3%\3%\3%\7%\u0173\n%\f%\16%\u0176\13%\3&\3&\3&\3&\3&\5&\u017d"+
		"\n&\3&\5&\u0180\n&\3&\3&\5&\u0184\n&\3&\3f\6(*,\62\'\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\t\4\2\b\t\23\23"+
		"\5\2\4\4\n\n\f\f\4\2\6\6\31\31\4\2\60\61\63\64\4\2\62\62\65\65\4\2\35"+
		"\35+,\4\2\37 \"\"\u0195\2P\3\2\2\2\4S\3\2\2\2\6W\3\2\2\2\bY\3\2\2\2\n"+
		"p\3\2\2\2\f\u0082\3\2\2\2\16\u0084\3\2\2\2\20\u0092\3\2\2\2\22\u00a3\3"+
		"\2\2\2\24\u00a9\3\2\2\2\26\u00ac\3\2\2\2\30\u00b5\3\2\2\2\32\u00b7\3\2"+
		"\2\2\34\u00ba\3\2\2\2\36\u00c9\3\2\2\2 \u00d2\3\2\2\2\"\u00da\3\2\2\2"+
		"$\u00ed\3\2\2\2&\u00f1\3\2\2\2(\u00f3\3\2\2\2*\u00fe\3\2\2\2,\u0109\3"+
		"\2\2\2.\u0119\3\2\2\2\60\u011b\3\2\2\2\62\u011d\3\2\2\2\64\u0135\3\2\2"+
		"\2\66\u0139\3\2\2\28\u0141\3\2\2\2:\u0143\3\2\2\2<\u0145\3\2\2\2>\u0147"+
		"\3\2\2\2@\u014a\3\2\2\2B\u0155\3\2\2\2D\u0160\3\2\2\2F\u0165\3\2\2\2H"+
		"\u016f\3\2\2\2J\u0183\3\2\2\2LQ\5\6\4\2MQ\5\b\5\2NQ\5\n\6\2OQ\5\f\7\2"+
		"PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\3\3\2\2\2RT\5\2\2\2SR\3\2\2"+
		"\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\5\3\2\2\2WX\5$\23\2X\7\3\2\2\2YZ\7\16"+
		"\2\2Z[\7%\2\2[\\\5&\24\2\\]\7&\2\2]f\5\4\3\2^_\7\17\2\2_`\7%\2\2`a\5&"+
		"\24\2ab\7&\2\2bc\5\4\3\2ce\3\2\2\2d^\3\2\2\2eh\3\2\2\2fg\3\2\2\2fd\3\2"+
		"\2\2gk\3\2\2\2hf\3\2\2\2ij\7\13\2\2jl\5\4\3\2ki\3\2\2\2kl\3\2\2\2lm\3"+
		"\2\2\2mn\7\26\2\2no\7\16\2\2o\t\3\2\2\2pq\7\r\2\2qs\7%\2\2rt\5\62\32\2"+
		"sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uw\7)\2\2vx\5&\24\2wv\3\2\2\2wx\3\2\2\2"+
		"xy\3\2\2\2y{\7)\2\2z|\5\62\32\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7&\2\2"+
		"~\177\5\4\3\2\177\u0080\7\26\2\2\u0080\u0081\7\r\2\2\u0081\13\3\2\2\2"+
		"\u0082\u0083\t\2\2\2\u0083\r\3\2\2\2\u0084\u0085\5\22\n\2\u0085\u0086"+
		"\7\'\2\2\u0086\u008c\7\'\2\2\u0087\u0088\5:\36\2\u0088\u0089\7*\2\2\u0089"+
		"\u008b\3\2\2\2\u008a\u0087\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0090\5:\36\2\u0090\u0091\7)\2\2\u0091\17\3\2\2\2\u0092\u0093\5:\36\2"+
		"\u0093\u0094\79\2\2\u0094\u0095\58\35\2\u0095\u0096\7)\2\2\u0096\21\3"+
		"\2\2\2\u0097\u0099\5\32\16\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u009c\7\5\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u00a4\3\2\2\2\u009d\u009f\7\5\2\2\u009e\u009d\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u00a2\5\32\16\2\u00a1\u00a0\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u0098\3\2\2\2\u00a3"+
		"\u009e\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\5\24\13\2\u00a6\23\3\2"+
		"\2\2\u00a7\u00aa\5\26\f\2\u00a8\u00aa\5\30\r\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\25\3\2\2\2\u00ab\u00ad\7\7\2\2\u00ac\u00ab\3\2\2"+
		"\2\u00ac\u00ad\3\2\2\2\u00ad\u00b3\3\2\2\2\u00ae\u00b0\7\22\2\2\u00af"+
		"\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b4\7\21"+
		"\2\2\u00b2\u00b4\7\20\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\27\3\2\2\2\u00b5\u00b6\t\3\2\2\u00b6\31\3\2\2\2\u00b7\u00b8\t\4\2\2\u00b8"+
		"\33\3\2\2\2\u00b9\u00bb\7\31\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2"+
		"\2\u00bb\u00c7\3\2\2\2\u00bc\u00be\7\7\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00c1\7\22\2\2\u00c0\u00bf\3\2\2\2"+
		"\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c8\7\21\2\2\u00c3\u00c8"+
		"\7\f\2\2\u00c4\u00c8\7\4\2\2\u00c5\u00c8\7\20\2\2\u00c6\u00c8\7\n\2\2"+
		"\u00c7\u00bd\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\35\3\2\2\2\u00c9\u00ca\5\34\17\2\u00ca"+
		"\u00cb\7\'\2\2\u00cb\u00cc\7\'\2\2\u00cc\u00cd\5:\36\2\u00cd\u00ce\7%"+
		"\2\2\u00ce\u00cf\5\62\32\2\u00cf\u00d0\7&\2\2\u00d0\u00d1\7)\2\2\u00d1"+
		"\37\3\2\2\2\u00d2\u00d3\5:\36\2\u00d3\u00d4\7%\2\2\u00d4\u00d5\5\62\32"+
		"\2\u00d5\u00d6\7&\2\2\u00d6\u00d7\79\2\2\u00d7\u00d8\5\62\32\2\u00d8\u00d9"+
		"\7)\2\2\u00d9!\3\2\2\2\u00da\u00db\5:\36\2\u00db\u00dc\79\2\2\u00dc\u00dd"+
		"\7%\2\2\u00dd\u00e3\7.\2\2\u00de\u00df\5\62\32\2\u00df\u00e0\7*\2\2\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\5\62\32\2\u00e7\u00e8\7.\2\2\u00e8\u00e9\7&\2\2\u00e9\u00ea\7)"+
		"\2\2\u00ea#\3\2\2\2\u00eb\u00ee\5&\24\2\u00ec\u00ee\5\62\32\2\u00ed\u00eb"+
		"\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee%\3\2\2\2\u00ef\u00f2\5(\25\2\u00f0"+
		"\u00f2\5*\26\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\'\3\2\2\2"+
		"\u00f3\u00f4\b\25\1\2\u00f4\u00f5\5*\26\2\u00f5\u00fb\3\2\2\2\u00f6\u00f7"+
		"\f\3\2\2\u00f7\u00f8\7\34\2\2\u00f8\u00fa\5*\26\2\u00f9\u00f6\3\2\2\2"+
		"\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc)\3"+
		"\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\b\26\1\2\u00ff\u0100\5,\27\2\u0100"+
		"\u0106\3\2\2\2\u0101\u0102\f\4\2\2\u0102\u0103\7\33\2\2\u0103\u0105\5"+
		",\27\2\u0104\u0101\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107+\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\b\27\1\2"+
		"\u010a\u010b\5\62\32\2\u010b\u0116\3\2\2\2\u010c\u010d\f\4\2\2\u010d\u010e"+
		"\5.\30\2\u010e\u010f\5\62\32\2\u010f\u0115\3\2\2\2\u0110\u0111\f\3\2\2"+
		"\u0111\u0112\5\60\31\2\u0112\u0113\5\62\32\2\u0113\u0115\3\2\2\2\u0114"+
		"\u010c\3\2\2\2\u0114\u0110\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117-\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a"+
		"\t\5\2\2\u011a/\3\2\2\2\u011b\u011c\t\6\2\2\u011c\61\3\2\2\2\u011d\u011e"+
		"\b\32\1\2\u011e\u011f\5\64\33\2\u011f\u0131\3\2\2\2\u0120\u0121\f\7\2"+
		"\2\u0121\u0122\7:\2\2\u0122\u0130\5\62\32\b\u0123\u0124\f\6\2\2\u0124"+
		"\u0125\7.\2\2\u0125\u0130\5\62\32\7\u0126\u0127\f\5\2\2\u0127\u0128\7"+
		"-\2\2\u0128\u0130\5\62\32\6\u0129\u012a\f\4\2\2\u012a\u012b\7+\2\2\u012b"+
		"\u0130\5\62\32\5\u012c\u012d\f\3\2\2\u012d\u012e\7,\2\2\u012e\u0130\5"+
		"\62\32\4\u012f\u0120\3\2\2\2\u012f\u0123\3\2\2\2\u012f\u0126\3\2\2\2\u012f"+
		"\u0129\3\2\2\2\u012f\u012c\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\63\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0136"+
		"\5\66\34\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2"+
		"\u0137\u0138\58\35\2\u0138\65\3\2\2\2\u0139\u013a\t\7\2\2\u013a\67\3\2"+
		"\2\2\u013b\u0142\5:\36\2\u013c\u0142\5<\37\2\u013d\u013e\7%\2\2\u013e"+
		"\u013f\5$\23\2\u013f\u0140\7&\2\2\u0140\u0142\3\2\2\2\u0141\u013b\3\2"+
		"\2\2\u0141\u013c\3\2\2\2\u0141\u013d\3\2\2\2\u01429\3\2\2\2\u0143\u0144"+
		"\7$\2\2\u0144;\3\2\2\2\u0145\u0146\t\b\2\2\u0146=\3\2\2\2\u0147\u0148"+
		"\5@!\2\u0148\u0149\5D#\2\u0149?\3\2\2\2\u014a\u014b\5J&\2\u014b\u014c"+
		"\7\30\2\2\u014c\u014d\5:\36\2\u014d\u014f\7%\2\2\u014e\u0150\5B\"\2\u014f"+
		"\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\7&"+
		"\2\2\u0152\u0154\7\3\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"A\3\2\2\2\u0155\u0156\5\22\n\2\u0156\u015d\5:\36\2\u0157\u0158\7*\2\2"+
		"\u0158\u0159\5\22\n\2\u0159\u015a\5:\36\2\u015a\u015c\3\2\2\2\u015b\u0157"+
		"\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"C\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\5\4\3\2\u0161\u0162\7\26\2\2"+
		"\u0162\u0163\7\30\2\2\u0163\u0164\5:\36\2\u0164E\3\2\2\2\u0165\u0166\5"+
		"J&\2\u0166\u0167\7\30\2\2\u0167\u0168\5:\36\2\u0168\u016a\7%\2\2\u0169"+
		"\u016b\5H%\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2"+
		"\2\u016c\u016d\7&\2\2\u016d\u016e\7)\2\2\u016eG\3\2\2\2\u016f\u0174\5"+
		"\22\n\2\u0170\u0171\7*\2\2\u0171\u0173\5\22\n\2\u0172\u0170\3\2\2\2\u0173"+
		"\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175I\3\2\2\2"+
		"\u0176\u0174\3\2\2\2\u0177\u0184\7\4\2\2\u0178\u0184\7\n\2\2\u0179\u0184"+
		"\7\f\2\2\u017a\u0184\7\20\2\2\u017b\u017d\7\7\2\2\u017c\u017b\3\2\2\2"+
		"\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u0180\7\22\2\2\u017f\u017e"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0184\7\21\2\2"+
		"\u0182\u0184\7\27\2\2\u0183\u0177\3\2\2\2\u0183\u0178\3\2\2\2\u0183\u0179"+
		"\3\2\2\2\u0183\u017a\3\2\2\2\u0183\u017c\3\2\2\2\u0183\u0182\3\2\2\2\u0184"+
		"K\3\2\2\2*PUfksw{\u008c\u0098\u009b\u009e\u00a1\u00a3\u00a9\u00ac\u00af"+
		"\u00b3\u00ba\u00bd\u00c0\u00c7\u00e3\u00ed\u00f1\u00fb\u0106\u0114\u0116"+
		"\u012f\u0131\u0135\u0141\u014f\u0153\u015d\u016a\u0174\u017c\u017f\u0183";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}