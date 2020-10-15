grammar MerzureLexer;

@members{

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


// Parser Rules

// Done by Adil Tanveer	 and Akashdeep Singh
statement 					: expression_statement |
							  selection_statement |
							  loop_statement |
							  jump_statement
							  ;

compound_statement			: (statement)+;

expression_statement		: expression;
selection_statement		    : IF LPAREN expression RPAREN
        					  compound_statement
        					  (ELIF LPAREN expression RPAREN
        					  compound_statement)*?
        					  (ELSE compound_statement)?
        					  END IF
    						  ;

loop_statement				: FOR LPAREN (expression)? SEMICOLON (expression)? SEMICOLON (expression)? RPAREN
							  compound_statement
							  END FOR
							  ;

jump_statement				: CONTINUE | BREAK | RETURN ;

var_type					: (STATIC? CONST? | CONST? STATIC?) (UNSIGNED? LONG? INT | CHAR | REAL | BOOL | COMPLEX | AUTO);

var_decleration				: var_type COLON COLON (var COMMA)* var SEMICOLON;

var_val_asgn				: var ASSIGN constant SEMICOLON;

//Done by Adarsh Patel
// Rules for array declerations
arr_data_type                : STATIC? (UNSIGNED? LONG? INT | BOOL | CHAR | REAL | COMPLEX);
arr_declerations            : arr_data_type COLON COLON var LPAREN INT_CONST RPAREN SEMICOLON;

// Rules for assigning values to array variables
arr_val_asgn_one            : var LPAREN INT_CONST RPAREN ASSIGN constant SEMICOLON;
arr_val_asgn_all            : var ASSIGN LPAREN SLASH (constant COMMA)* constant SLASH RPAREN SEMICOLON;


// Done by Souradeep Chatterjee
expression 					: arithmetic_expression |
						  boolean_expression
						  ;
equation					: arithmetic_expression relop arithmetic_expression;

arithmetic_expression				: arithmetic_expression POW arithmetic_expression |
						  arithmetic_expression SLASH arithmetic_expression |
						  arithmetic_expression STAR arithmetic_expression |
					          arithmetic_expression PLUS arithmetic_expression |
					          arithmetic_expression MINUS arithmetic_expression |
						  LPAREN expression RPAREN |
						  (PLUS | MINUS)? constant |
						  (PLUS | MINUS)? var
						  ;

relop						: LT | EQUALS | GT | LEQ | GEQ | NEQ | ASSIGN;

constant					: BOOL_CONST |
							  REAL_CONST |
							  INT_CONST |
							  CHAR_CONST |
							  COMPLEX_CONST |
							  STR_CONST
							  ;

var 						: OBJECTID;

//Done by Praneeth
boolean_expression 			: sub_exp1 (OR sub_exp1)? ;

sub_exp1				: sub_exp2 (AND sub_exp2)? ;

sub_exp2 				: TRUE | 
					  FALSE |
					  equation |
		 			  NOT sub_exp2 |
					  LPAREN boolean_expression RPAREN 
					  ;


// Done by Alekhya Madanu
function                 : functionStatement functionBody;

functionStatement        : type FUNCTION var LPAREN parlist? RPAREN EOL? ;
parlist                  : type var (COMMA type var)* ;

functionBody             : compound_statement END FUNCTION var;

functionPrototype        : type FUNCTION var LPAREN protParlist? RPAREN SEMICOLON;
protParlist              : type (COMMA type)* ;

EOL                      : [\r\n]+;
type                     : CHAR | COMPLEX | BOOL | REAL | UNSIGNED? LONG? INT | VOID;


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
FALSE			:'false';
INCLUDE			:'include';
END				:'end';
VOID			:'void';
FUNCTION		:'function';
STATIC			: 'static';
TRUE			:'true';
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
SPACES						:(' ')* -> skip;


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
