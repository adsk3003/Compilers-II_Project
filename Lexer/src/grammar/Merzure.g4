grammar Merzure;
import CommonLexerRules;

// Parser Rules
// Done by Alekhya Madanu
// program				 : (declarationStatement)*? (assignmentStatement)*? (functionDefinition EOL?)*? (mainFunction);
program					 : (declarationStatement)*? (assignmentStatement)*? (functionDefinition EOL?)+;

functionDefinition		 : functionPrototype | function;

functionPrototype 		 : returnType FUNCTION var LPAREN protParList? RPAREN EOL?;
protParList 			 : varType (COMMA varType)* ;

function 				 : functionStatement functionBody;

functionStatement 		 : returnType FUNCTION funcName LPAREN formalParList? RPAREN EOL? ;
formalParList 			 : formalParameter (COMMA formalParameter)* ;
formalParameter			 : varType var;
funcName 				 : var;

functionBody 			 : compoundStatement END FUNCTION var?;

returnType 				 : varType;

// Done by Adil Tanveer	 and Akashdeep Singh
compoundStatement		: (statement EOL?)+ ;

statement 				: expressionStatement
						| selectionStatement
						| loopStatement
						| jumpStatement
						| assignmentStatement
						| declarationStatement
						;

expressionStatement		: expression SEMICOLON
						| SEMICOLON
						;

selectionStatement		: IF LPAREN booleanExpression RPAREN EOL?
						  compoundStatement
						  (ELIF LPAREN booleanExpression RPAREN EOL?
						  compoundStatement)*?
						  (ELSE EOL? compoundStatement)?
						  END IF EOL?
						  ;

loopStatement			: FOR LPAREN (varValAsgn)? SEMICOLON (booleanExpression)? SEMICOLON (varValAsgn)? RPAREN EOL?
						  compoundStatement
						  END FOR EOL?
						  ;

jumpStatement			: CONTINUE 	SEMICOLON EOL?					#continue
						| BREAK SEMICOLON EOL?						#break
						| RETURN expressionStatement? EOL? 			#return 
						;

assignmentStatement		: (varValAsgn | arrValAsgn) SEMICOLON;
varValAsgn				: var ASSIGN expression EOL?;
arrValAsgn				: arrValAsgnOne | arrValAsgnAll;

// Done by Adarsh Patel
// Rules for assigning values to array variables
arrValAsgnOne			: var LPAREN ((PLUS | MINUS)? INT_CONST) RPAREN ASSIGN expression ;
arrValAsgnAll 			: var ASSIGN LPAREN SLASH (expression COMMA)* expression SLASH RPAREN ;

declarationStatement	: (varDeclaration | arrDeclaration) SEMICOLON;
varDeclaration			: varType COLON COLON (var COMMA)* var ;

// Done by Adarsh Patel
// Rules for array declarations
arrDeclaration			: varType COLON COLON var LPAREN ((PLUS | MINUS)? INT_CONST) RPAREN ;


// Done by Praneeth
expression 					: booleanExpression
							| arithmeticExpression
							;

booleanExpression			: relationalExpression 
							| booleanExpression AND relationalExpression
							| booleanExpression OR relationalExpression
							;

// Done by Souradeep Chatterjee
relationalExpression		: arithmeticExpression | 
							  relationalExpression relOp arithmeticExpression |
							  relationalExpression eqOp arithmeticExpression
							  ;

relOp						: LT | GT | LEQ | GEQ;
eqOp						: EQUALS | NEQ;

arithmeticExpression		: unaryExpression
							| <assoc=right> arithmeticExpression POW unaryExpression
							| arithmeticExpression (SLASH | STAR) unaryExpression
							| arithmeticExpression MOD unaryExpression	  
							| arithmeticExpression (PLUS | MINUS) unaryExpression
							;

unaryExpression				: unaryOperator ? primaryExpression EOL? 			#unaryExpr
							| var LPAREN (actualParList)? RPAREN EOL?			#funCall
							;

actualParList 			 	: actualParameter (COMMA actualParameter)* ;
actualParameter			 	: var;

unaryOperator				: PLUS | MINUS | NOT;

primaryExpression			: var						#usedVar
							| constant 					#myConstant
							| LPAREN expression RPAREN	#parenExpr
							;

var 						: OBJECTID;

constant					: BOOL_CONST 
							| REAL_CONST
							| INT_CONST
							| CHAR_CONST
							;

varType						: ((STATIC | AUTO)? (CONST)?) ((UNSIGNED)? (LONG)? INT | REAL | CHAR | BOOL | COMPLEX | VOID);