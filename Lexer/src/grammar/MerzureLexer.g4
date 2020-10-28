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


// Parser Rules


// Done by Alekhya Madanu
program						: (function_definition EOL?)+;

function_definition		 : functionPrototype | function;

functionPrototype        : return_type FUNCTION var LPAREN protParlist? RPAREN EOL?;
protParlist              : var_type (COMMA var_type)* ;


function                 : functionStatement functionBody;
functionStatement        : return_type FUNCTION var LPAREN parlist? RPAREN EOL? ;

functionBody             : compound_statement END FUNCTION var?;

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

parlist                  	: var_type var (COMMA var_type var)* ;
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
