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


// --- Modifiers ---
modifier
    : PUBLIC | PRIVATE | PROTECTED | STATIC | FINAL | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE;

// --- Type Parameters (Generics) ---
typeParameters
    : LT typeParameter (COMMA typeParameter)* GT;

typeParameter
    : IDENTIFIER (EXTENDS type)?;

// --- Type Lists and Types ---
typeList
    : type (COMMA type)*;

type
    : primitiveType
    | classOrInterfaceType
    | type LBRACK RBRACK // Array type
    ;

primitiveType
    : BOOLEAN | BYTE | CHAR | SHORT | INT | LONG | FLOAT | DOUBLE;

classOrInterfaceType
    : qualifiedName typeArguments?;

typeArguments
    : LT typeArgument (COMMA typeArgument)* GT;

typeArgument
    : type
    | QUESTION ((EXTENDS | SUPER) type)? // Wildcard
    ;

// --- Class Body ---
classBody
    : LBRACE classBodyDeclaration* RBRACE;

classBodyDeclaration
    : SEMI // Empty declaration
    | STATIC? block // Static initializer or instance initializer
    | memberDeclaration;

memberDeclaration
    : fieldDeclaration
    | methodDeclaration
    | constructorDeclaration
    | interfaceDeclaration // Nested interface
    | classDeclaration     // Nested class
    | enumDeclaration      // Nested enum
    ;

// --- Interface Body ---
interfaceBody
    : LBRACE interfaceBodyDeclaration* RBRACE;

interfaceBodyDeclaration
    : SEMI
    | interfaceMemberDeclaration
    ;

interfaceMemberDeclaration
    : constantDeclaration
    | interfaceMethodDeclaration
    | interfaceDeclaration // Nested interface
    | classDeclaration     // Nested class
    | enumDeclaration      // Nested enum
    ;

constantDeclaration // Fields in interfaces are implicitly public, static, final
    : type variableDeclaratorList SEMI;

interfaceMethodDeclaration
    : modifier* typeOrVoid IDENTIFIER LPAREN formalParameterList? RPAREN (LBRACK RBRACK)* (THROWS qualifiedNameList)? (DEFAULT block | SEMI) ;


// --- Enum Body ---
enumBody
    : LBRACE enumConstantList? (COMMA? enumBodyDeclarations)? RBRACE;

enumConstantList
    : enumConstant (COMMA enumConstant)*;

enumConstant
    : IDENTIFIER (arguments? classBody?)?;

enumBodyDeclarations
    : SEMI classBodyDeclaration*;


// --- Field, Method, Constructor Declarations ---
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

lastFormalParameter // For varargs
    : modifier* type ELLIPSIS variableDeclaratorId;

variableDeclaratorId
    : IDENTIFIER (LBRACK RBRACK)*;

qualifiedNameList
    : qualifiedName (COMMA qualifiedName)*;

// --- Block and Statements ---
block
    : LBRACE blockStatement* RBRACE;

blockStatement
    : localVariableDeclarationStatement
    | statement
    | typeDeclaration // Local class/interface/enum
    ;

localVariableDeclarationStatement
    : (FINAL? type | VAR) variableDeclaratorList SEMI; // Added VAR for type inference

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
    | SEMI // Empty statement
    | expressionStatement // Must be an expression that can stand alone
    | IDENTIFIER COLON statement // Labeled statement
    ;

expressionStatement
    : expression SEMI;

//statementExpression // Expressions that can be statements
//    : assignment // <<<< THIS IS THE LIKELY CULPRIT
//    | preIncrementExpression
//    | preDecrementExpression
//    | postIncrementExpression
//    | postDecrementExpression
//    | methodCall
//    | newExpression
//    ;


catchClause
    : CATCH LPAREN modifier* catchType IDENTIFIER RPAREN block;

catchType
    : qualifiedName (BITOR qualifiedName)*; // For multi-catch

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

enhancedForControl // For-each loop
    : (FINAL? type | VAR) variableDeclaratorId COLON expression;

forUpdate
    : expressionList;

switchBlockStatementGroup
    : switchLabel+ blockStatement+;

switchLabel
    : CASE constantExpression COLON
    | CASE enumConstantName COLON // Allow enum constants in case
    | DEFAULT COLON
    ;

constantExpression // Simplified for this example
    : expression;

enumConstantName
    : IDENTIFIER;


// --- Expressions (Order of precedence) ---
// Precedence:
// 1. Primary, new, method calls, field access, array access
// 2. Postfix ++, --
// 3. Prefix ++, --, +, -, ~, !
// 4. Cast, new (for arrays specifically could be here too)
// 5. Multiplicative *, /, %
// 6. Additive +, -
// 7. Shift <<, >>, >>>
// 8. Relational <, >, <=, >=, instanceof
// 9. Equality ==, !=
// 10. Bitwise AND &
// 11. Bitwise XOR ^
// 12. Bitwise OR |
// 13. Logical AND &&
// 14. Logical OR ||
// 15. Ternary ? :
// 16. Lambda ->
// 17. Assignment =, +=, -=, etc.

primary
    : LPAREN expression RPAREN
    | THIS
    | SUPER
    | literal
    | IDENTIFIER
    | IDENTIFIER typeArguments // Generic method call on implicit this
    | typeOrVoid DOT CLASS // e.g., String.class, int.class
    | VOID DOT CLASS // void.class
    | newExpression
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
    : NEW classOrInterfaceType (typeArguments)? arguments (classBody)? // new MyClass<>() / new MyClass() / new MyClass() { ... }
    | NEW primitiveType LBRACK expression RBRACK (LBRACK RBRACK)* // new int[size]
    | NEW classOrInterfaceType LBRACK expression RBRACK (LBRACK RBRACK)* (arrayInitializer)? // new String[size][]
    ;

arguments
    : LPAREN expressionList? RPAREN;

expressionList
    : expression (COMMA expression)*;

// Start with assignment as the lowest precedence for the 'expression' rule
expression
    : lambdaExpression
    | assignmentExpression
    ;

lambdaExpression
    : lambdaParameters ARROW lambdaBody;

lambdaParameters
    : IDENTIFIER
    | LPAREN formalParameterList? RPAREN
    | LPAREN IDENTIFIER (COMMA IDENTIFIER)* RPAREN // Inferred types
    ;

lambdaBody
    : expression
    | block
    ;

assignmentExpression
    : conditionalExpression (assignmentOperator conditionalExpression)*; // Right-associative

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
    : conditionalOrExpression (QUESTION expression COLON conditionalExpression)? ; // Ternary

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
    : additiveExpression ((LSHIFT | RSHIFT | URSHIFT) additiveExpression)*; // LSHIFT, RSHIFT, URSHIFT are placeholders for <<, >>, >>> if not defined in lexer

additiveExpression
    : multiplicativeExpression ((ADD | SUB) multiplicativeExpression)*;

multiplicativeExpression
    : unaryExpression ((MUL | DIV | MOD) unaryExpression)*;

unaryExpression
    : preIncrementExpression
    | preDecrementExpression
    | ADD unaryExpression // Unary plus
    | SUB unaryExpression // Unary minus
    | unaryExpressionNotPlusMinus
    ;

preIncrementExpression: INC unaryExpression;
preDecrementExpression: DEC unaryExpression;

unaryExpressionNotPlusMinus
    : TILDE unaryExpression // Bitwise complement
    | BANG unaryExpression  // Logical NOT
    | castExpression
    | postfixExpression
    ;

postfixExpression // Handles postfix inc/dec, method calls, field access, array indexing
    :   (primary | IDENTIFIER typeArguments) // IDENTIFIER typeArguments for generic method on implicit 'this'
        ( DOT (IDENTIFIER arguments? | THIS | SUPER arguments | NEW typeArguments? classOrInterfaceType arguments (classBody)?) // field access, method call, inner class creation
        | LBRACK expression RBRACK // array access
        | INC // Postfix increment
        | DEC // Postfix decrement
        )*
    ;

methodCall // Explicit rule for clarity, though covered by postfixExpression
    : (IDENTIFIER | primary) arguments (DOT methodCallTail)*
    ;

methodCallTail
    : IDENTIFIER arguments
    ;


castExpression
    : LPAREN primitiveType RPAREN unaryExpression
    | LPAREN classOrInterfaceType (BITAND classOrInterfaceType)* RPAREN unaryExpressionNotPlusMinus // Intersection types for cast
    ;

parExpression // Used for if, while, etc.
    : LPAREN expression RPAREN;

//VAR: 'var'; // If you want to support 'var' for local variable type inference
//LSHIFT: '<<'; // Placeholder if not in lexer
//RSHIFT: '>>'; // Placeholder if not in lexer
//URSHIFT: '>>>';// Placeholder if not in lexer
