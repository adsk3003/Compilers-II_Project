// Generated from MerzureLexer.g4 by ANTLR 4.5
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
		INCLUDE=18, END=19, VOID=20, FUNCTION=21, STATIC=22, AND=23, OR=24, NOT=25, 
		CHAR_CONST=26, INT_CONST=27, REAL_CONST=28, COMPLEX_CONST=29, BOOL_CONST=30, 
		STR_CONST=31, OBJECTID=32, LPAREN=33, RPAREN=34, COLON=35, ATSYM=36, SEMICOLON=37, 
		COMMA=38, PLUS=39, MINUS=40, STAR=41, SLASH=42, TILDE=43, LT=44, GT=45, 
		EQUALS=46, LEQ=47, GEQ=48, NEQ=49, LBRACE=50, RBRACE=51, DOT=52, ASSIGN=53, 
		POW=54, MOD=55, WHITESPACE=56, SPACES=57, SIMPLE_COMMENT=58, ERROR=59, 
		EOF_STRING=60, INVALID_ESCAPE=61, INVALID_CHARS=62;
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
		RULE_var_asgn_function_call = 36, RULE_no_asgn_function_call = 37, RULE_return_type = 38;
	public static final String[] ruleNames = {
		"statement", "compound_statement", "expression_statement", "selection_statement", 
		"loop_statement", "jump_statement", "var_declaration", "var_val_asgn", 
		"var_type", "type", "math_type", "non_math_type", "storage_class", "arr_data_type", 
		"arr_declarations", "arr_val_asgn_one", "arr_val_asgn_all", "expression", 
		"boolean_expression", "logical_or_expression", "logical_and_expression", 
		"relational_expression", "relop", "eq_op", "arithmetic_expression", "unary_expression", 
		"unary_operator", "primary_expression", "var", "constant", "function", 
		"functionStatement", "parlist", "functionBody", "functionPrototype", "protParlist", 
		"var_asgn_function_call", "no_asgn_function_call", "return_type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'char'", "'const'", "'auto'", "'unsigned'", "'break'", "'continue'", 
		"'complex'", "'else'", "'bool'", "'for'", "'if'", "'elif'", "'real'", 
		"'int'", "'long'", "'return'", "'include'", "'end'", "'void'", "'function'", 
		"'static'", "'and'", "'or'", "'not'", null, null, null, null, null, null, 
		null, "'('", "')'", "':'", "'@'", "';'", "','", "'+'", "'-'", "'*'", "'/'", 
		"'~'", "'<'", "'>'", "'=='", "'<='", "'>='", "'!='", "'{'", "'}'", "'.'", 
		"'='", "'^'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EOL", "CHAR", "CONST", "AUTO", "UNSIGNED", "BREAK", "CONTINUE", 
		"COMPLEX", "ELSE", "BOOL", "FOR", "IF", "ELIF", "REAL", "INT", "LONG", 
		"RETURN", "INCLUDE", "END", "VOID", "FUNCTION", "STATIC", "AND", "OR", 
		"NOT", "CHAR_CONST", "INT_CONST", "REAL_CONST", "COMPLEX_CONST", "BOOL_CONST", 
		"STR_CONST", "OBJECTID", "LPAREN", "RPAREN", "COLON", "ATSYM", "SEMICOLON", 
		"COMMA", "PLUS", "MINUS", "STAR", "SLASH", "TILDE", "LT", "GT", "EQUALS", 
		"LEQ", "GEQ", "NEQ", "LBRACE", "RBRACE", "DOT", "ASSIGN", "POW", "MOD", 
		"WHITESPACE", "SPACES", "SIMPLE_COMMENT", "ERROR", "EOF_STRING", "INVALID_ESCAPE", 
		"INVALID_CHARS"
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
		public Var_val_asgnContext var_val_asgn() {
			return getRuleContext(Var_val_asgnContext.class,0);
		}
		public Arr_val_asgn_allContext arr_val_asgn_all() {
			return getRuleContext(Arr_val_asgn_allContext.class,0);
		}
		public Arr_val_asgn_oneContext arr_val_asgn_one() {
			return getRuleContext(Arr_val_asgn_oneContext.class,0);
		}
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public Arr_declarationsContext arr_declarations() {
			return getRuleContext(Arr_declarationsContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionPrototypeContext functionPrototype() {
			return getRuleContext(FunctionPrototypeContext.class,0);
		}
		public Var_asgn_function_callContext var_asgn_function_call() {
			return getRuleContext(Var_asgn_function_callContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				expression_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				selection_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				loop_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				jump_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				var_val_asgn();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				arr_val_asgn_all();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				arr_val_asgn_one();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				var_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(86);
				arr_declarations();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(87);
				function();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(88);
				functionPrototype();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(89);
				var_asgn_function_call();
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

	public static class Compound_statementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MerzureLexerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MerzureLexerParser.SEMICOLON, i);
		}
		public List<TerminalNode> EOL() { return getTokens(MerzureLexerParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(MerzureLexerParser.EOL, i);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitCompound_statement(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				statement();
				setState(93);
				match(SEMICOLON);
				setState(95);
				_la = _input.LA(1);
				if (_la==EOL) {
					{
					setState(94);
					match(EOL);
					}
				}

				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << CONST) | (1L << AUTO) | (1L << UNSIGNED) | (1L << BREAK) | (1L << CONTINUE) | (1L << COMPLEX) | (1L << BOOL) | (1L << FOR) | (1L << IF) | (1L << REAL) | (1L << INT) | (1L << LONG) | (1L << RETURN) | (1L << VOID) | (1L << STATIC) | (1L << NOT) | (1L << CHAR_CONST) | (1L << INT_CONST) | (1L << REAL_CONST) | (1L << BOOL_CONST) | (1L << OBJECTID) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0) );
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitExpression_statement(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
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
		public List<TerminalNode> EOL() { return getTokens(MerzureLexerParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(MerzureLexerParser.EOL, i);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterSelection_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitSelection_statement(this);
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
			setState(103);
			match(IF);
			setState(104);
			match(LPAREN);
			setState(105);
			boolean_expression();
			setState(106);
			match(RPAREN);
			setState(108);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(107);
				match(EOL);
				}
			}

			setState(110);
			compound_statement();
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(111);
					match(ELIF);
					setState(112);
					match(LPAREN);
					setState(113);
					boolean_expression();
					setState(114);
					match(RPAREN);
					setState(116);
					_la = _input.LA(1);
					if (_la==EOL) {
						{
						setState(115);
						match(EOL);
						}
					}

					setState(118);
					compound_statement();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(130);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(125);
				match(ELSE);
				setState(127);
				_la = _input.LA(1);
				if (_la==EOL) {
					{
					setState(126);
					match(EOL);
					}
				}

				setState(129);
				compound_statement();
				}
			}

			setState(132);
			match(END);
			setState(133);
			match(IF);
			setState(135);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(134);
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
		public List<Var_val_asgnContext> var_val_asgn() {
			return getRuleContexts(Var_val_asgnContext.class);
		}
		public Var_val_asgnContext var_val_asgn(int i) {
			return getRuleContext(Var_val_asgnContext.class,i);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(MerzureLexerParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(MerzureLexerParser.EOL, i);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitLoop_statement(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(FOR);
			setState(138);
			match(LPAREN);
			setState(140);
			_la = _input.LA(1);
			if (_la==OBJECTID) {
				{
				setState(139);
				var_val_asgn();
				}
			}

			setState(142);
			match(SEMICOLON);
			setState(144);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << CHAR_CONST) | (1L << INT_CONST) | (1L << REAL_CONST) | (1L << BOOL_CONST) | (1L << OBJECTID) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(143);
				boolean_expression();
				}
			}

			setState(146);
			match(SEMICOLON);
			setState(148);
			_la = _input.LA(1);
			if (_la==OBJECTID) {
				{
				setState(147);
				var_val_asgn();
				}
			}

			setState(150);
			match(RPAREN);
			setState(152);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(151);
				match(EOL);
				}
			}

			setState(154);
			compound_statement();
			setState(155);
			match(END);
			setState(156);
			match(FOR);
			setState(158);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(157);
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

	public static class Jump_statementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(MerzureLexerParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(MerzureLexerParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(MerzureLexerParser.RETURN, 0); }
		public TerminalNode EOL() { return getToken(MerzureLexerParser.EOL, 0); }
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitJump_statement(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_jump_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONTINUE) | (1L << RETURN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(162);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(161);
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
		public List<TerminalNode> COMMA() { return getTokens(MerzureLexerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MerzureLexerParser.COMMA, i);
		}
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterVar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitVar_declaration(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			var_type();
			setState(165);
			match(COLON);
			setState(166);
			match(COLON);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					var();
					setState(168);
					match(COMMA);
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(175);
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

	public static class Var_val_asgnContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MerzureLexerParser.ASSIGN, 0); }
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public Var_val_asgnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_val_asgn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterVar_val_asgn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitVar_val_asgn(this);
		}
	}

	public final Var_val_asgnContext var_val_asgn() throws RecognitionException {
		Var_val_asgnContext _localctx = new Var_val_asgnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_val_asgn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			var();
			setState(178);
			match(ASSIGN);
			setState(179);
			arithmetic_expression(0);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitVar_type(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(182);
				_la = _input.LA(1);
				if (_la==AUTO || _la==STATIC) {
					{
					setState(181);
					storage_class();
					}
				}

				setState(185);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(184);
					match(CONST);
					}
				}

				}
				break;
			case 2:
				{
				setState(188);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(187);
					match(CONST);
					}
				}

				setState(191);
				_la = _input.LA(1);
				if (_la==AUTO || _la==STATIC) {
					{
					setState(190);
					storage_class();
					}
				}

				}
				break;
			}
			{
			setState(195);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(199);
			switch (_input.LA(1)) {
			case UNSIGNED:
			case REAL:
			case INT:
			case LONG:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				math_type();
				}
				break;
			case CHAR:
			case COMPLEX:
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterMath_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitMath_type(this);
		}
	}

	public final Math_typeContext math_type() throws RecognitionException {
		Math_typeContext _localctx = new Math_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_math_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if (_la==UNSIGNED) {
				{
				setState(201);
				match(UNSIGNED);
				}
			}

			setState(209);
			switch (_input.LA(1)) {
			case INT:
			case LONG:
				{
				setState(205);
				_la = _input.LA(1);
				if (_la==LONG) {
					{
					setState(204);
					match(LONG);
					}
				}

				setState(207);
				match(INT);
				}
				break;
			case REAL:
				{
				setState(208);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterNon_math_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitNon_math_type(this);
		}
	}

	public final Non_math_typeContext non_math_type() throws RecognitionException {
		Non_math_typeContext _localctx = new Non_math_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_non_math_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterStorage_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitStorage_class(this);
		}
	}

	public final Storage_classContext storage_class() throws RecognitionException {
		Storage_classContext _localctx = new Storage_classContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_storage_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterArr_data_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitArr_data_type(this);
		}
	}

	public final Arr_data_typeContext arr_data_type() throws RecognitionException {
		Arr_data_typeContext _localctx = new Arr_data_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arr_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(215);
				match(STATIC);
				}
			}

			setState(229);
			switch (_input.LA(1)) {
			case UNSIGNED:
			case INT:
			case LONG:
				{
				setState(219);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(218);
					match(UNSIGNED);
					}
				}

				setState(222);
				_la = _input.LA(1);
				if (_la==LONG) {
					{
					setState(221);
					match(LONG);
					}
				}

				setState(224);
				match(INT);
				}
				break;
			case BOOL:
				{
				setState(225);
				match(BOOL);
				}
				break;
			case CHAR:
				{
				setState(226);
				match(CHAR);
				}
				break;
			case REAL:
				{
				setState(227);
				match(REAL);
				}
				break;
			case COMPLEX:
				{
				setState(228);
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
		public Arr_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterArr_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitArr_declarations(this);
		}
	}

	public final Arr_declarationsContext arr_declarations() throws RecognitionException {
		Arr_declarationsContext _localctx = new Arr_declarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arr_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			arr_data_type();
			setState(232);
			match(COLON);
			setState(233);
			match(COLON);
			setState(234);
			var();
			setState(235);
			match(LPAREN);
			setState(236);
			arithmetic_expression(0);
			setState(237);
			match(RPAREN);
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
		public Arr_val_asgn_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_val_asgn_one; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterArr_val_asgn_one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitArr_val_asgn_one(this);
		}
	}

	public final Arr_val_asgn_oneContext arr_val_asgn_one() throws RecognitionException {
		Arr_val_asgn_oneContext _localctx = new Arr_val_asgn_oneContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arr_val_asgn_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			var();
			setState(240);
			match(LPAREN);
			setState(241);
			arithmetic_expression(0);
			setState(242);
			match(RPAREN);
			setState(243);
			match(ASSIGN);
			setState(244);
			arithmetic_expression(0);
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
		public List<TerminalNode> COMMA() { return getTokens(MerzureLexerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MerzureLexerParser.COMMA, i);
		}
		public Arr_val_asgn_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_val_asgn_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterArr_val_asgn_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitArr_val_asgn_all(this);
		}
	}

	public final Arr_val_asgn_allContext arr_val_asgn_all() throws RecognitionException {
		Arr_val_asgn_allContext _localctx = new Arr_val_asgn_allContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arr_val_asgn_all);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			var();
			setState(247);
			match(ASSIGN);
			setState(248);
			match(LPAREN);
			setState(249);
			match(SLASH);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(250);
					arithmetic_expression(0);
					setState(251);
					match(COMMA);
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(258);
			arithmetic_expression(0);
			setState(259);
			match(SLASH);
			setState(260);
			match(RPAREN);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(264);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				boolean_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterBoolean_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitBoolean_expression(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolean_expression);
		try {
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				logical_or_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterLogical_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitLogical_or_expression(this);
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
			setState(271);
			logical_and_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_or_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_or_expression);
					setState(273);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(274);
					match(OR);
					setState(275);
					logical_and_expression(0);
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterLogical_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitLogical_and_expression(this);
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
			setState(282);
			relational_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_and_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_and_expression);
					setState(284);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(285);
					match(AND);
					setState(286);
					relational_expression(0);
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitRelational_expression(this);
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
			setState(293);
			arithmetic_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(303);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(295);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(296);
						relop();
						setState(297);
						arithmetic_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new Relational_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(299);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(300);
						eq_op();
						setState(301);
						arithmetic_expression(0);
						}
						break;
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitEq_op(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterArithmetic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitArithmetic_expression(this);
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
			setState(313);
			unary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(330);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(315);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(316);
						match(POW);
						setState(317);
						arithmetic_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(318);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(319);
						match(SLASH);
						setState(320);
						arithmetic_expression(5);
						}
						break;
					case 3:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(321);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(322);
						match(STAR);
						setState(323);
						arithmetic_expression(4);
						}
						break;
					case 4:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(324);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(325);
						match(PLUS);
						setState(326);
						arithmetic_expression(3);
						}
						break;
					case 5:
						{
						_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(327);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(328);
						match(MINUS);
						setState(329);
						arithmetic_expression(2);
						}
						break;
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unary_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(335);
				unary_operator();
				}
			}

			setState(338);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primary_expression);
		try {
			setState(348);
			switch (_input.LA(1)) {
			case OBJECTID:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				var();
				}
				break;
			case CHAR_CONST:
			case INT_CONST:
			case REAL_CONST:
			case BOOL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				constant();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(LPAREN);
				setState(345);
				expression();
				setState(346);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
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
		public TerminalNode CHAR_CONST() { return getToken(MerzureLexerParser.CHAR_CONST, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR_CONST) | (1L << INT_CONST) | (1L << REAL_CONST) | (1L << BOOL_CONST))) != 0)) ) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			functionStatement();
			setState(355);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitFunctionStatement(this);
		}
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			return_type();
			setState(358);
			match(FUNCTION);
			setState(359);
			var();
			setState(360);
			match(LPAREN);
			setState(362);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << CONST) | (1L << AUTO) | (1L << UNSIGNED) | (1L << COMPLEX) | (1L << BOOL) | (1L << REAL) | (1L << INT) | (1L << LONG) | (1L << STATIC))) != 0)) {
				{
				setState(361);
				parlist();
				}
			}

			setState(364);
			match(RPAREN);
			setState(366);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(365);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterParlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitParlist(this);
		}
	}

	public final ParlistContext parlist() throws RecognitionException {
		ParlistContext _localctx = new ParlistContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			var_type();
			setState(369);
			var();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(370);
				match(COMMA);
				setState(371);
				var_type();
				setState(372);
				var();
				}
				}
				setState(378);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			compound_statement();
			setState(380);
			match(END);
			setState(381);
			match(FUNCTION);
			setState(383);
			_la = _input.LA(1);
			if (_la==OBJECTID) {
				{
				setState(382);
				var();
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
		public ProtParlistContext protParlist() {
			return getRuleContext(ProtParlistContext.class,0);
		}
		public FunctionPrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPrototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterFunctionPrototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitFunctionPrototype(this);
		}
	}

	public final FunctionPrototypeContext functionPrototype() throws RecognitionException {
		FunctionPrototypeContext _localctx = new FunctionPrototypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionPrototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			return_type();
			setState(386);
			match(FUNCTION);
			setState(387);
			var();
			setState(388);
			match(LPAREN);
			setState(390);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << CONST) | (1L << AUTO) | (1L << UNSIGNED) | (1L << COMPLEX) | (1L << BOOL) | (1L << REAL) | (1L << INT) | (1L << LONG) | (1L << STATIC))) != 0)) {
				{
				setState(389);
				protParlist();
				}
			}

			setState(392);
			match(RPAREN);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterProtParlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitProtParlist(this);
		}
	}

	public final ProtParlistContext protParlist() throws RecognitionException {
		ProtParlistContext _localctx = new ProtParlistContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_protParlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			var_type();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(395);
				match(COMMA);
				setState(396);
				var_type();
				}
				}
				setState(401);
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

	public static class Var_asgn_function_callContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(MerzureLexerParser.ASSIGN, 0); }
		public TerminalNode LPAREN() { return getToken(MerzureLexerParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MerzureLexerParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MerzureLexerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MerzureLexerParser.COMMA, i);
		}
		public Var_asgn_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_asgn_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterVar_asgn_function_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitVar_asgn_function_call(this);
		}
	}

	public final Var_asgn_function_callContext var_asgn_function_call() throws RecognitionException {
		Var_asgn_function_callContext _localctx = new Var_asgn_function_callContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_var_asgn_function_call);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			var();
			setState(403);
			match(ASSIGN);
			setState(404);
			var();
			setState(405);
			match(LPAREN);
			setState(415);
			_la = _input.LA(1);
			if (_la==OBJECTID) {
				{
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(406);
						var();
						setState(407);
						match(COMMA);
						}
						} 
					}
					setState(413);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(414);
				var();
				}
			}

			setState(417);
			match(RPAREN);
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

	public static class No_asgn_function_callContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(MerzureLexerParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MerzureLexerParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MerzureLexerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MerzureLexerParser.COMMA, i);
		}
		public No_asgn_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_asgn_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterNo_asgn_function_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitNo_asgn_function_call(this);
		}
	}

	public final No_asgn_function_callContext no_asgn_function_call() throws RecognitionException {
		No_asgn_function_callContext _localctx = new No_asgn_function_callContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_no_asgn_function_call);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			var();
			setState(420);
			match(LPAREN);
			setState(430);
			_la = _input.LA(1);
			if (_la==OBJECTID) {
				{
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(421);
						var();
						setState(422);
						match(COMMA);
						}
						} 
					}
					setState(428);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(429);
				var();
				}
			}

			setState(432);
			match(RPAREN);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MerzureLexerListener ) ((MerzureLexerListener)listener).exitReturn_type(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_return_type);
		int _la;
		try {
			setState(446);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				match(CHAR);
				}
				break;
			case COMPLEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				match(COMPLEX);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				match(BOOL);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				match(REAL);
				}
				break;
			case UNSIGNED:
			case INT:
			case LONG:
				enterOuterAlt(_localctx, 5);
				{
				setState(439);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(438);
					match(UNSIGNED);
					}
				}

				setState(442);
				_la = _input.LA(1);
				if (_la==LONG) {
					{
					setState(441);
					match(LONG);
					}
				}

				setState(444);
				match(INT);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 6);
				{
				setState(445);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3@\u01c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2]\n\2\3\3\3\3\3\3\5\3b\n\3\6\3d\n\3\r"+
		"\3\16\3e\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5o\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5w\n\5\3\5\3\5\7\5{\n\5\f\5\16\5~\13\5\3\5\3\5\5\5\u0082\n\5\3\5\5"+
		"\5\u0085\n\5\3\5\3\5\3\5\5\5\u008a\n\5\3\6\3\6\3\6\5\6\u008f\n\6\3\6\3"+
		"\6\5\6\u0093\n\6\3\6\3\6\5\6\u0097\n\6\3\6\3\6\5\6\u009b\n\6\3\6\3\6\3"+
		"\6\3\6\5\6\u00a1\n\6\3\7\3\7\5\7\u00a5\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"\u00ad\n\b\f\b\16\b\u00b0\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\5\n\u00b9\n"+
		"\n\3\n\5\n\u00bc\n\n\3\n\5\n\u00bf\n\n\3\n\5\n\u00c2\n\n\5\n\u00c4\n\n"+
		"\3\n\3\n\3\13\3\13\5\13\u00ca\n\13\3\f\5\f\u00cd\n\f\3\f\5\f\u00d0\n\f"+
		"\3\f\3\f\5\f\u00d4\n\f\3\r\3\r\3\16\3\16\3\17\5\17\u00db\n\17\3\17\5\17"+
		"\u00de\n\17\3\17\5\17\u00e1\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e8\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0100\n\22\f\22\16\22"+
		"\u0103\13\22\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u010b\n\23\3\24\3\24\5"+
		"\24\u010f\n\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0117\n\25\f\25\16\25"+
		"\u011a\13\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0122\n\26\f\26\16\26"+
		"\u0125\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7"+
		"\27\u0132\n\27\f\27\16\27\u0135\13\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\7\32\u014d\n\32\f\32\16\32\u0150\13\32\3\33\5\33\u0153\n\33\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u015f\n\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\5!\u016d\n!\3!\3!\5!\u0171\n!"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0179\n\"\f\"\16\"\u017c\13\"\3#\3#\3#\3"+
		"#\5#\u0182\n#\3$\3$\3$\3$\3$\5$\u0189\n$\3$\3$\3%\3%\3%\7%\u0190\n%\f"+
		"%\16%\u0193\13%\3&\3&\3&\3&\3&\3&\3&\7&\u019c\n&\f&\16&\u019f\13&\3&\5"+
		"&\u01a2\n&\3&\3&\3\'\3\'\3\'\3\'\3\'\7\'\u01ab\n\'\f\'\16\'\u01ae\13\'"+
		"\3\'\5\'\u01b1\n\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u01ba\n(\3(\5(\u01bd\n(\3"+
		"(\3(\5(\u01c1\n(\3(\3|\6(*,\62)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\t\4\2\b\t\23\23\5\2\4\4\n\n\f\f\4"+
		"\2\6\6\30\30\4\2./\61\62\4\2\60\60\63\63\4\2\33\33)*\4\2\34\36  \u01e5"+
		"\2\\\3\2\2\2\4c\3\2\2\2\6g\3\2\2\2\bi\3\2\2\2\n\u008b\3\2\2\2\f\u00a2"+
		"\3\2\2\2\16\u00a6\3\2\2\2\20\u00b3\3\2\2\2\22\u00c3\3\2\2\2\24\u00c9\3"+
		"\2\2\2\26\u00cc\3\2\2\2\30\u00d5\3\2\2\2\32\u00d7\3\2\2\2\34\u00da\3\2"+
		"\2\2\36\u00e9\3\2\2\2 \u00f1\3\2\2\2\"\u00f8\3\2\2\2$\u010a\3\2\2\2&\u010e"+
		"\3\2\2\2(\u0110\3\2\2\2*\u011b\3\2\2\2,\u0126\3\2\2\2.\u0136\3\2\2\2\60"+
		"\u0138\3\2\2\2\62\u013a\3\2\2\2\64\u0152\3\2\2\2\66\u0156\3\2\2\28\u015e"+
		"\3\2\2\2:\u0160\3\2\2\2<\u0162\3\2\2\2>\u0164\3\2\2\2@\u0167\3\2\2\2B"+
		"\u0172\3\2\2\2D\u017d\3\2\2\2F\u0183\3\2\2\2H\u018c\3\2\2\2J\u0194\3\2"+
		"\2\2L\u01a5\3\2\2\2N\u01c0\3\2\2\2P]\5\6\4\2Q]\5\b\5\2R]\5\n\6\2S]\5\f"+
		"\7\2T]\5\20\t\2U]\5\"\22\2V]\5 \21\2W]\5\16\b\2X]\5\36\20\2Y]\5> \2Z]"+
		"\5F$\2[]\5J&\2\\P\3\2\2\2\\Q\3\2\2\2\\R\3\2\2\2\\S\3\2\2\2\\T\3\2\2\2"+
		"\\U\3\2\2\2\\V\3\2\2\2\\W\3\2\2\2\\X\3\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2\\["+
		"\3\2\2\2]\3\3\2\2\2^_\5\2\2\2_a\7\'\2\2`b\7\3\2\2a`\3\2\2\2ab\3\2\2\2"+
		"bd\3\2\2\2c^\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\5\3\2\2\2gh\5$\23"+
		"\2h\7\3\2\2\2ij\7\16\2\2jk\7#\2\2kl\5&\24\2ln\7$\2\2mo\7\3\2\2nm\3\2\2"+
		"\2no\3\2\2\2op\3\2\2\2p|\5\4\3\2qr\7\17\2\2rs\7#\2\2st\5&\24\2tv\7$\2"+
		"\2uw\7\3\2\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\5\4\3\2y{\3\2\2\2zq\3\2\2"+
		"\2{~\3\2\2\2|}\3\2\2\2|z\3\2\2\2}\u0084\3\2\2\2~|\3\2\2\2\177\u0081\7"+
		"\13\2\2\u0080\u0082\7\3\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\5\4\3\2\u0084\177\3\2\2\2\u0084\u0085\3\2\2"+
		"\2\u0085\u0086\3\2\2\2\u0086\u0087\7\25\2\2\u0087\u0089\7\16\2\2\u0088"+
		"\u008a\7\3\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\t\3\2\2\2"+
		"\u008b\u008c\7\r\2\2\u008c\u008e\7#\2\2\u008d\u008f\5\20\t\2\u008e\u008d"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\7\'\2\2\u0091"+
		"\u0093\5&\24\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\7\'\2\2\u0095\u0097\5\20\t\2\u0096\u0095\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\7$\2\2\u0099\u009b\7\3"+
		"\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\5\4\3\2\u009d\u009e\7\25\2\2\u009e\u00a0\7\r\2\2\u009f\u00a1\7"+
		"\3\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\13\3\2\2\2\u00a2"+
		"\u00a4\t\2\2\2\u00a3\u00a5\7\3\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\r\3\2\2\2\u00a6\u00a7\5\22\n\2\u00a7\u00a8\7%\2\2\u00a8\u00ae"+
		"\7%\2\2\u00a9\u00aa\5:\36\2\u00aa\u00ab\7(\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00a9\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\5:\36\2\u00b2"+
		"\17\3\2\2\2\u00b3\u00b4\5:\36\2\u00b4\u00b5\7\67\2\2\u00b5\u00b6\5\62"+
		"\32\2\u00b6\21\3\2\2\2\u00b7\u00b9\5\32\16\2\u00b8\u00b7\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00bc\7\5\2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c4\3\2\2\2\u00bd\u00bf\7\5\2\2\u00be"+
		"\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00c2\5\32"+
		"\16\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00b8\3\2\2\2\u00c3\u00be\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\5\24"+
		"\13\2\u00c6\23\3\2\2\2\u00c7\u00ca\5\26\f\2\u00c8\u00ca\5\30\r\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\25\3\2\2\2\u00cb\u00cd\7\7\2"+
		"\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d3\3\2\2\2\u00ce\u00d0"+
		"\7\22\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2"+
		"\u00d1\u00d4\7\21\2\2\u00d2\u00d4\7\20\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4\27\3\2\2\2\u00d5\u00d6\t\3\2\2\u00d6\31\3\2\2\2\u00d7\u00d8"+
		"\t\4\2\2\u00d8\33\3\2\2\2\u00d9\u00db\7\30\2\2\u00da\u00d9\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00e7\3\2\2\2\u00dc\u00de\7\7\2\2\u00dd\u00dc\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00e1\7\22\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e8\7\21"+
		"\2\2\u00e3\u00e8\7\f\2\2\u00e4\u00e8\7\4\2\2\u00e5\u00e8\7\20\2\2\u00e6"+
		"\u00e8\7\n\2\2\u00e7\u00dd\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e7\u00e4\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\35\3\2\2\2\u00e9\u00ea"+
		"\5\34\17\2\u00ea\u00eb\7%\2\2\u00eb\u00ec\7%\2\2\u00ec\u00ed\5:\36\2\u00ed"+
		"\u00ee\7#\2\2\u00ee\u00ef\5\62\32\2\u00ef\u00f0\7$\2\2\u00f0\37\3\2\2"+
		"\2\u00f1\u00f2\5:\36\2\u00f2\u00f3\7#\2\2\u00f3\u00f4\5\62\32\2\u00f4"+
		"\u00f5\7$\2\2\u00f5\u00f6\7\67\2\2\u00f6\u00f7\5\62\32\2\u00f7!\3\2\2"+
		"\2\u00f8\u00f9\5:\36\2\u00f9\u00fa\7\67\2\2\u00fa\u00fb\7#\2\2\u00fb\u0101"+
		"\7,\2\2\u00fc\u00fd\5\62\32\2\u00fd\u00fe\7(\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00fc\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\5\62\32\2\u0105"+
		"\u0106\7,\2\2\u0106\u0107\7$\2\2\u0107#\3\2\2\2\u0108\u010b\5&\24\2\u0109"+
		"\u010b\5\62\32\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b%\3\2\2"+
		"\2\u010c\u010f\5(\25\2\u010d\u010f\5*\26\2\u010e\u010c\3\2\2\2\u010e\u010d"+
		"\3\2\2\2\u010f\'\3\2\2\2\u0110\u0111\b\25\1\2\u0111\u0112\5*\26\2\u0112"+
		"\u0118\3\2\2\2\u0113\u0114\f\3\2\2\u0114\u0115\7\32\2\2\u0115\u0117\5"+
		"*\26\2\u0116\u0113\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119)\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\b\26\1\2"+
		"\u011c\u011d\5,\27\2\u011d\u0123\3\2\2\2\u011e\u011f\f\4\2\2\u011f\u0120"+
		"\7\31\2\2\u0120\u0122\5,\27\2\u0121\u011e\3\2\2\2\u0122\u0125\3\2\2\2"+
		"\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124+\3\2\2\2\u0125\u0123\3"+
		"\2\2\2\u0126\u0127\b\27\1\2\u0127\u0128\5\62\32\2\u0128\u0133\3\2\2\2"+
		"\u0129\u012a\f\4\2\2\u012a\u012b\5.\30\2\u012b\u012c\5\62\32\2\u012c\u0132"+
		"\3\2\2\2\u012d\u012e\f\3\2\2\u012e\u012f\5\60\31\2\u012f\u0130\5\62\32"+
		"\2\u0130\u0132\3\2\2\2\u0131\u0129\3\2\2\2\u0131\u012d\3\2\2\2\u0132\u0135"+
		"\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134-\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u0137\t\5\2\2\u0137/\3\2\2\2\u0138\u0139\t\6\2\2"+
		"\u0139\61\3\2\2\2\u013a\u013b\b\32\1\2\u013b\u013c\5\64\33\2\u013c\u014e"+
		"\3\2\2\2\u013d\u013e\f\7\2\2\u013e\u013f\78\2\2\u013f\u014d\5\62\32\b"+
		"\u0140\u0141\f\6\2\2\u0141\u0142\7,\2\2\u0142\u014d\5\62\32\7\u0143\u0144"+
		"\f\5\2\2\u0144\u0145\7+\2\2\u0145\u014d\5\62\32\6\u0146\u0147\f\4\2\2"+
		"\u0147\u0148\7)\2\2\u0148\u014d\5\62\32\5\u0149\u014a\f\3\2\2\u014a\u014b"+
		"\7*\2\2\u014b\u014d\5\62\32\4\u014c\u013d\3\2\2\2\u014c\u0140\3\2\2\2"+
		"\u014c\u0143\3\2\2\2\u014c\u0146\3\2\2\2\u014c\u0149\3\2\2\2\u014d\u0150"+
		"\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\63\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0151\u0153\5\66\34\2\u0152\u0151\3\2\2\2\u0152\u0153\3"+
		"\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\58\35\2\u0155\65\3\2\2\2\u0156"+
		"\u0157\t\7\2\2\u0157\67\3\2\2\2\u0158\u015f\5:\36\2\u0159\u015f\5<\37"+
		"\2\u015a\u015b\7#\2\2\u015b\u015c\5$\23\2\u015c\u015d\7$\2\2\u015d\u015f"+
		"\3\2\2\2\u015e\u0158\3\2\2\2\u015e\u0159\3\2\2\2\u015e\u015a\3\2\2\2\u015f"+
		"9\3\2\2\2\u0160\u0161\7\"\2\2\u0161;\3\2\2\2\u0162\u0163\t\b\2\2\u0163"+
		"=\3\2\2\2\u0164\u0165\5@!\2\u0165\u0166\5D#\2\u0166?\3\2\2\2\u0167\u0168"+
		"\5N(\2\u0168\u0169\7\27\2\2\u0169\u016a\5:\36\2\u016a\u016c\7#\2\2\u016b"+
		"\u016d\5B\"\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u0170\7$\2\2\u016f\u0171\7\3\2\2\u0170\u016f\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171A\3\2\2\2\u0172\u0173\5\22\n\2\u0173\u017a\5:\36\2"+
		"\u0174\u0175\7(\2\2\u0175\u0176\5\22\n\2\u0176\u0177\5:\36\2\u0177\u0179"+
		"\3\2\2\2\u0178\u0174\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017bC\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\5\4\3\2"+
		"\u017e\u017f\7\25\2\2\u017f\u0181\7\27\2\2\u0180\u0182\5:\36\2\u0181\u0180"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182E\3\2\2\2\u0183\u0184\5N(\2\u0184\u0185"+
		"\7\27\2\2\u0185\u0186\5:\36\2\u0186\u0188\7#\2\2\u0187\u0189\5H%\2\u0188"+
		"\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\7$"+
		"\2\2\u018bG\3\2\2\2\u018c\u0191\5\22\n\2\u018d\u018e\7(\2\2\u018e\u0190"+
		"\5\22\n\2\u018f\u018d\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2"+
		"\u0191\u0192\3\2\2\2\u0192I\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\5"+
		":\36\2\u0195\u0196\7\67\2\2\u0196\u0197\5:\36\2\u0197\u01a1\7#\2\2\u0198"+
		"\u0199\5:\36\2\u0199\u019a\7(\2\2\u019a\u019c\3\2\2\2\u019b\u0198\3\2"+
		"\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a2\5:\36\2\u01a1\u019d\3\2"+
		"\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\7$\2\2\u01a4"+
		"K\3\2\2\2\u01a5\u01a6\5:\36\2\u01a6\u01b0\7#\2\2\u01a7\u01a8\5:\36\2\u01a8"+
		"\u01a9\7(\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a7\3\2\2\2\u01ab\u01ae\3\2"+
		"\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01af\u01b1\5:\36\2\u01b0\u01ac\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\7$\2\2\u01b3M\3\2\2\2\u01b4\u01c1"+
		"\7\4\2\2\u01b5\u01c1\7\n\2\2\u01b6\u01c1\7\f\2\2\u01b7\u01c1\7\20\2\2"+
		"\u01b8\u01ba\7\7\2\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc"+
		"\3\2\2\2\u01bb\u01bd\7\22\2\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2"+
		"\u01bd\u01be\3\2\2\2\u01be\u01c1\7\21\2\2\u01bf\u01c1\7\26\2\2\u01c0\u01b4"+
		"\3\2\2\2\u01c0\u01b5\3\2\2\2\u01c0\u01b6\3\2\2\2\u01c0\u01b7\3\2\2\2\u01c0"+
		"\u01b9\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1O\3\2\2\2\67\\aenv|\u0081\u0084"+
		"\u0089\u008e\u0092\u0096\u009a\u00a0\u00a4\u00ae\u00b8\u00bb\u00be\u00c1"+
		"\u00c3\u00c9\u00cc\u00cf\u00d3\u00da\u00dd\u00e0\u00e7\u0101\u010a\u010e"+
		"\u0118\u0123\u0131\u0133\u014c\u014e\u0152\u015e\u016c\u0170\u017a\u0181"+
		"\u0188\u0191\u019d\u01a1\u01ac\u01b0\u01b9\u01bc\u01c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}