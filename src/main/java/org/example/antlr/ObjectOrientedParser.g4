parser grammar ObjectOrientedParser;

options { tokenVocab = ObjectOrientedLexer; }

compilationUnit
    : packageDeclaration? importDeclaration* typeDeclaration* EOF;

packageDeclaration
    : PACKAGE qualifiedName SEMI;

importDeclaration
    : IMPORT qualifiedName (DOT MUL)? SEMI;

qualifiedName
    : IDENTIFIER (DOT IDENTIFIER)*;

typeDeclaration
    : classDeclaration
    | interfaceDeclaration
    | enumDeclaration
    ;

classDeclaration
    : modifier* CLASS IDENTIFIER typeParameters? (EXTENDS type)? (IMPLEMENTS typeList)? classBody;

interfaceDeclaration
    : modifier* INTERFACE IDENTIFIER typeParameters? (EXTENDS typeList)? interfaceBody;

enumDeclaration
    : modifier* ENUM IDENTIFIER (IMPLEMENTS typeList)? enumBody;


modifier
    : PUBLIC | PRIVATE | PROTECTED | STATIC | FINAL | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE;

typeParameters
    : LT typeParameter (COMMA typeParameter)* GT;

typeParameter
    : IDENTIFIER (EXTENDS type)?;

typeList
    : type (COMMA type)*;

type
    : primitiveType
    | classOrInterfaceType
    | type LBRACK RBRACK
    ;

primitiveType
    : BOOLEAN | BYTE | CHAR | SHORT | INT | LONG | FLOAT | DOUBLE;

classOrInterfaceType
    : qualifiedName typeArguments?;

typeArguments
    : LT typeArgument (COMMA typeArgument)* GT;

typeArgument
    : type
    | QUESTION ((EXTENDS | SUPER) type)?
    ;

classBody
    : LBRACE classBodyDeclaration* RBRACE;

classBodyDeclaration
    : SEMI
    | STATIC? block
    | memberDeclaration;

memberDeclaration
    : fieldDeclaration
    | methodDeclaration
    | constructorDeclaration
    | interfaceDeclaration
    | classDeclaration
    | enumDeclaration
    ;

interfaceBody
    : LBRACE interfaceBodyDeclaration* RBRACE;

interfaceBodyDeclaration
    : SEMI
    | interfaceMemberDeclaration
    ;

interfaceMemberDeclaration
    : constantDeclaration
    | interfaceMethodDeclaration
    | interfaceDeclaration
    | classDeclaration
    | enumDeclaration
    ;

constantDeclaration
    : type variableDeclaratorList SEMI;

interfaceMethodDeclaration
    : modifier* typeOrVoid IDENTIFIER LPAREN formalParameterList? RPAREN (LBRACK RBRACK)* (THROWS qualifiedNameList)? (DEFAULT block | SEMI) ;


enumBody
    : LBRACE enumConstantList? (COMMA? enumBodyDeclarations)? RBRACE;

enumConstantList
    : enumConstant (COMMA enumConstant)*;

enumConstant
    : IDENTIFIER (arguments? classBody?)?;

enumBodyDeclarations
    : SEMI classBodyDeclaration*;


fieldDeclaration
    : modifier* type variableDeclaratorList SEMI;

variableDeclaratorList
    : variableDeclarator (COMMA variableDeclarator)*;

variableDeclarator
    : IDENTIFIER (LBRACK RBRACK)* (ASSIGN variableInitializer)?;

variableInitializer
    : expression
    | arrayInitializer
    ;

arrayInitializer
    : LBRACE (variableInitializer (COMMA variableInitializer)* COMMA?)? RBRACE;

methodDeclaration
    : modifier* typeOrVoid IDENTIFIER LPAREN formalParameterList? RPAREN (LBRACK RBRACK)* (THROWS qualifiedNameList)? (block | SEMI);

constructorDeclaration
    : modifier* IDENTIFIER LPAREN formalParameterList? RPAREN (THROWS qualifiedNameList)? block;

typeOrVoid
    : type | VOID;

formalParameterList
    : formalParameter (COMMA formalParameter)* (COMMA lastFormalParameter)?
    | lastFormalParameter
    ;

formalParameter
    : modifier* type variableDeclaratorId;

lastFormalParameter
    : modifier* type ELLIPSIS variableDeclaratorId;

variableDeclaratorId
    : IDENTIFIER (LBRACK RBRACK)*;

qualifiedNameList
    : qualifiedName (COMMA qualifiedName)*;

block
    : LBRACE blockStatement* RBRACE;

blockStatement
    : localVariableDeclarationStatement
    | statement
    | typeDeclaration
    ;

localVariableDeclarationStatement
    : (FINAL? type | VAR) variableDeclaratorList SEMI;

statement
    : block
    | ASSERT expression (COLON expression)? SEMI
    | IF parExpression statement (ELSE statement)?
    | FOR LPAREN forControl RPAREN statement
    | WHILE parExpression statement
    | DO statement WHILE parExpression SEMI
    | TRY block (catchClause+ finallyBlock? | finallyBlock)
    | SWITCH parExpression LBRACE switchBlockStatementGroup* switchLabel* RBRACE
    | SYNCHRONIZED parExpression block
    | RETURN expression? SEMI
    | THROW expression SEMI
    | BREAK IDENTIFIER? SEMI
    | CONTINUE IDENTIFIER? SEMI
    | SEMI
    | ioStatement
    | expressionStatement
    | IDENTIFIER COLON statement
    ;

ioStatement
    : PRINTF LPAREN expression RPAREN SEMI
    | SCANF LPAREN RPAREN
    ;

expressionStatement
    : expression SEMI;

catchClause
    : CATCH LPAREN modifier* catchType IDENTIFIER RPAREN block;

catchType
    : qualifiedName (BITOR qualifiedName)*;

finallyBlock
    : FINALLY block;

forControl
    : enhancedForControl
    | forInit? SEMI expression? SEMI forUpdate?
    ;

forInit
    : (FINAL? type | VAR) variableDeclaratorList
    | expressionList
    ;

enhancedForControl
    : (FINAL? type | VAR) variableDeclaratorId COLON expression;

forUpdate
    : expressionList;

switchBlockStatementGroup
    : switchLabel+ blockStatement+;

switchLabel
    : CASE constantExpression COLON
    | CASE enumConstantName COLON
    | DEFAULT COLON
    ;

constantExpression
    : expression;

enumConstantName
    : IDENTIFIER;

primary
    : LPAREN expression RPAREN
    | THIS
    | SUPER
    | literal
    | IDENTIFIER
    | IDENTIFIER typeArguments
    | typeOrVoid DOT CLASS
    | VOID DOT CLASS
    | newExpression
    | ioExpression
    ;

ioExpression
    : SCANF LPAREN RPAREN
    | PRINTF LPAREN expression RPAREN
    ;

literal
    : INTEGER_LITERAL
    | FLOAT_LITERAL
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOLEAN_LITERAL
    | NULL_LITERAL
    ;

newExpression
    : NEW classOrInterfaceType (typeArguments)? arguments (classBody)?
    | NEW primitiveType LBRACK expression RBRACK (LBRACK RBRACK)*
    | NEW classOrInterfaceType LBRACK expression RBRACK (LBRACK RBRACK)* (arrayInitializer)?
    ;

arguments
    : LPAREN expressionList? RPAREN;

expressionList
    : expression (COMMA expression)*;

expression
    : lambdaExpression
    | assignmentExpression
    ;

lambdaExpression
    : lambdaParameters ARROW lambdaBody;

lambdaParameters
    : IDENTIFIER
    | LPAREN formalParameterList? RPAREN
    | LPAREN IDENTIFIER (COMMA IDENTIFIER)* RPAREN
    ;

lambdaBody
    : expression
    | block
    ;

assignmentExpression
    : conditionalExpression (assignmentOperator conditionalExpression)*;

assignmentOperator
    : ASSIGN
    | ADD_ASSIGN
    | SUB_ASSIGN
    | MUL_ASSIGN
    | DIV_ASSIGN
    | AND_ASSIGN
    | OR_ASSIGN
    | XOR_ASSIGN
    | MOD_ASSIGN
    | LSHIFT_ASSIGN
    | RSHIFT_ASSIGN
    | URSHIFT_ASSIGN
    ;

conditionalExpression
    : conditionalOrExpression (QUESTION expression COLON conditionalExpression)? ;

conditionalOrExpression
    : conditionalAndExpression (OR conditionalAndExpression)*;

conditionalAndExpression
    : inclusiveOrExpression (AND inclusiveOrExpression)*;

inclusiveOrExpression
    : exclusiveOrExpression (BITOR exclusiveOrExpression)*;

exclusiveOrExpression
    : andExpression (CARET andExpression)*;

andExpression
    : equalityExpression (BITAND equalityExpression)*;

equalityExpression
    : relationalExpression ((EQUAL | NOTEQUAL) relationalExpression)*;

relationalExpression
    : shiftExpression ((LT | GT | LE | GE) shiftExpression | INSTANCEOF type)*;

shiftExpression
    : additiveExpression ((LSHIFT | RSHIFT | URSHIFT) additiveExpression)*;

additiveExpression
    : multiplicativeExpression ((ADD | SUB) multiplicativeExpression)*;

multiplicativeExpression
    : unaryExpression ((MUL | DIV | MOD) unaryExpression)*;

unaryExpression
    : preIncrementExpression
    | preDecrementExpression
    | ADD unaryExpression
    | SUB unaryExpression
    | unaryExpressionNotPlusMinus
    ;

preIncrementExpression: INC unaryExpression;
preDecrementExpression: DEC unaryExpression;

unaryExpressionNotPlusMinus
    : TILDE unaryExpression
    | BANG unaryExpression
    | castExpression
    | postfixExpression
    ;

postfixExpression
    :   (primary | IDENTIFIER typeArguments)
        ( DOT (IDENTIFIER arguments? | THIS | SUPER arguments | NEW typeArguments? classOrInterfaceType arguments (classBody)?)
        | LBRACK expression RBRACK
        | INC
        | DEC
        )*
    ;

methodCall
    : (IDENTIFIER | primary) arguments (DOT methodCallTail)*
    ;

methodCallTail
    : IDENTIFIER arguments
    ;


castExpression
    : LPAREN primitiveType RPAREN unaryExpression
    | LPAREN classOrInterfaceType (BITAND classOrInterfaceType)* RPAREN unaryExpressionNotPlusMinus
    ;

parExpression
    : LPAREN expression RPAREN;
