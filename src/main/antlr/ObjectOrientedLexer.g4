lexer grammar ObjectOrientedLexer;

CLASS:                      'componenteModelo';
PUBLIC:                     'painelExterno';
PRIVATE:                    'circuitoInterno';
FINAL:                      'circuitoIntegradoFinal';

VOID:                       'sinalDeAck';
BOOLEAN:                    'estadoEnergia';
CHAR:                       'codigoPostDisplay';
INT:                        'frequenciaMHz';
LONG:                       'enderecoDeBlocoEmDisco';
FLOAT:                      'tensaoVolts';
DOUBLE:                     'taxaTransferenciaGBpsPrecisa';

IF:                         'seSinalAtivo';
ELSE:                       'rotaDeDadosAlternativa';
FOR:                        'paraCadaPinoNoConector';
RETURN:                     'transmitirDadoPeloBarramento';

BOOLEAN_LITERAL:            'sinalAlto' | 'sinalBaixo';

INTEGER_LITERAL:            DEC_LITERAL | BIN_LITERAL;

FLOAT_LITERAL
    :   [0-9]+ '.' [0-9]* EXPONENT?
    |   '.' [0-9]+ EXPONENT?
    |   [0-9]+ EXPONENT
    ;

fragment DEC_LITERAL:       '0' | [1-9] [0-9]*;
fragment BIN_LITERAL:       '0' [bB] [01]+;
fragment EXPONENT: [eE] [+\-]? [0-9]+;

CHAR_LITERAL:               '\'' ( EscapeSequence | ~['\\] ) '\'';
STRING_LITERAL:             '"' ( EscapeSequence | ~["\\] )*? '"';

fragment EscapeSequence
    :   '\\' [btnfr"'\\]
    |   '\\' 'u' HexDigit HexDigit HexDigit HexDigit // Unicode escape
    ;
fragment HexDigit:          [0-9a-fA-F];


IDENTIFIER:                 JavaLetter (JavaLetterOrDigit)*;
fragment JavaLetter:        [a-zA-Z];
fragment JavaLetterOrDigit: [a-zA-Z0-9];

LPAREN:                     '(';
RPAREN:                     ')';
LBRACE:                     '{';
RBRACE:                     '}';
LBRACK:                     '[';
RBRACK:                     ']';
SEMI:                       ';';
COMMA:                      ',';
DOT:                        '.';

ASSIGN:                     '=';
GT:                         '>';
LT:                         '<';
BANG:                       '!';
TILDE:                      '~';
QUESTION:                   '?';
COLON:                      ':';
EQUAL:                      '==';
LE:                         '<=';
GE:                         '>=';
NOTEQUAL:                   '!=';
AND:                        '&&';
OR:                         '||';
INC:                        '++';
DEC:                        '--';
ADD:                        '+';
SUB:                        '-';
MUL:                        '*';
DIV:                        '/';
BITAND:                     '&';
BITOR:                      '|';
CARET:                      '^';
MOD:                        '%';

ADD_ASSIGN:                 '+=';
SUB_ASSIGN:                 '-=';
MUL_ASSIGN:                 '*=';
DIV_ASSIGN:                 '/=';
AND_ASSIGN:                 '&=';
OR_ASSIGN:                  '|=';
XOR_ASSIGN:                 '^=';
MOD_ASSIGN:                 '%=';

LINE_COMMENT:               '//' ~[\r\n]* -> skip;
BLOCK_COMMENT:              '/*' .*? '*/' -> skip;

WS:                         [ \t\r\n\u000C]+ -> skip;