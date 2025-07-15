// Generated from /home/lucas-fedora/Desktop/compiladorMaster/src/main/java/org/example/antlr/ObjectOrientedParser.g4 by ANTLR 4.13.2
package org.example.output.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ObjectOrientedParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, PUBLIC=2, PRIVATE=3, FINAL=4, VOID=5, BOOLEAN=6, CHAR=7, INT=8, 
		LONG=9, FLOAT=10, DOUBLE=11, IF=12, ELSE=13, FOR=14, RETURN=15, BOOLEAN_LITERAL=16, 
		INTEGER_LITERAL=17, FLOAT_LITERAL=18, CHAR_LITERAL=19, STRING_LITERAL=20, 
		IDENTIFIER=21, LPAREN=22, RPAREN=23, LBRACE=24, RBRACE=25, LBRACK=26, 
		RBRACK=27, SEMI=28, COMMA=29, DOT=30, ASSIGN=31, GT=32, LT=33, BANG=34, 
		TILDE=35, QUESTION=36, COLON=37, EQUAL=38, LE=39, GE=40, NOTEQUAL=41, 
		AND=42, OR=43, INC=44, DEC=45, ADD=46, SUB=47, MUL=48, DIV=49, BITAND=50, 
		BITOR=51, CARET=52, MOD=53, ADD_ASSIGN=54, SUB_ASSIGN=55, MUL_ASSIGN=56, 
		DIV_ASSIGN=57, AND_ASSIGN=58, OR_ASSIGN=59, XOR_ASSIGN=60, MOD_ASSIGN=61, 
		LINE_COMMENT=62, BLOCK_COMMENT=63, WS=64, PACKAGE=65, IMPORT=66, EXTENDS=67, 
		IMPLEMENTS=68, INTERFACE=69, ENUM=70, PROTECTED=71, STATIC=72, ABSTRACT=73, 
		NATIVE=74, SYNCHRONIZED=75, TRANSIENT=76, VOLATILE=77, BYTE=78, SHORT=79, 
		SUPER=80, THROWS=81, DEFAULT=82, ELLIPSIS=83, VAR=84, ASSERT=85, WHILE=86, 
		DO=87, TRY=88, SWITCH=89, THROW=90, BREAK=91, CONTINUE=92, CATCH=93, FINALLY=94, 
		CASE=95, THIS=96, NULL_LITERAL=97, NEW=98, ARROW=99, LSHIFT_ASSIGN=100, 
		RSHIFT_ASSIGN=101, URSHIFT_ASSIGN=102, INSTANCEOF=103, LSHIFT=104, RSHIFT=105, 
		URSHIFT=106;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_qualifiedName = 3, RULE_typeDeclaration = 4, RULE_classDeclaration = 5, 
		RULE_interfaceDeclaration = 6, RULE_enumDeclaration = 7, RULE_modifier = 8, 
		RULE_typeParameters = 9, RULE_typeParameter = 10, RULE_typeList = 11, 
		RULE_type = 12, RULE_primitiveType = 13, RULE_classOrInterfaceType = 14, 
		RULE_typeArguments = 15, RULE_typeArgument = 16, RULE_classBody = 17, 
		RULE_classBodyDeclaration = 18, RULE_memberDeclaration = 19, RULE_interfaceBody = 20, 
		RULE_interfaceBodyDeclaration = 21, RULE_interfaceMemberDeclaration = 22, 
		RULE_constantDeclaration = 23, RULE_interfaceMethodDeclaration = 24, RULE_enumBody = 25, 
		RULE_enumConstantList = 26, RULE_enumConstant = 27, RULE_enumBodyDeclarations = 28, 
		RULE_fieldDeclaration = 29, RULE_variableDeclaratorList = 30, RULE_variableDeclarator = 31, 
		RULE_variableInitializer = 32, RULE_arrayInitializer = 33, RULE_methodDeclaration = 34, 
		RULE_constructorDeclaration = 35, RULE_typeOrVoid = 36, RULE_formalParameterList = 37, 
		RULE_formalParameter = 38, RULE_lastFormalParameter = 39, RULE_variableDeclaratorId = 40, 
		RULE_qualifiedNameList = 41, RULE_block = 42, RULE_blockStatement = 43, 
		RULE_localVariableDeclarationStatement = 44, RULE_statement = 45, RULE_expressionStatement = 46, 
		RULE_catchClause = 47, RULE_catchType = 48, RULE_finallyBlock = 49, RULE_forControl = 50, 
		RULE_forInit = 51, RULE_enhancedForControl = 52, RULE_forUpdate = 53, 
		RULE_switchBlockStatementGroup = 54, RULE_switchLabel = 55, RULE_constantExpression = 56, 
		RULE_enumConstantName = 57, RULE_primary = 58, RULE_literal = 59, RULE_newExpression = 60, 
		RULE_arguments = 61, RULE_expressionList = 62, RULE_expression = 63, RULE_lambdaExpression = 64, 
		RULE_lambdaParameters = 65, RULE_lambdaBody = 66, RULE_assignmentExpression = 67, 
		RULE_assignmentOperator = 68, RULE_conditionalExpression = 69, RULE_conditionalOrExpression = 70, 
		RULE_conditionalAndExpression = 71, RULE_inclusiveOrExpression = 72, RULE_exclusiveOrExpression = 73, 
		RULE_andExpression = 74, RULE_equalityExpression = 75, RULE_relationalExpression = 76, 
		RULE_shiftExpression = 77, RULE_additiveExpression = 78, RULE_multiplicativeExpression = 79, 
		RULE_unaryExpression = 80, RULE_preIncrementExpression = 81, RULE_preDecrementExpression = 82, 
		RULE_unaryExpressionNotPlusMinus = 83, RULE_postfixExpression = 84, RULE_methodCall = 85, 
		RULE_methodCallTail = 86, RULE_castExpression = 87, RULE_parExpression = 88;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "qualifiedName", 
			"typeDeclaration", "classDeclaration", "interfaceDeclaration", "enumDeclaration", 
			"modifier", "typeParameters", "typeParameter", "typeList", "type", "primitiveType", 
			"classOrInterfaceType", "typeArguments", "typeArgument", "classBody", 
			"classBodyDeclaration", "memberDeclaration", "interfaceBody", "interfaceBodyDeclaration", 
			"interfaceMemberDeclaration", "constantDeclaration", "interfaceMethodDeclaration", 
			"enumBody", "enumConstantList", "enumConstant", "enumBodyDeclarations", 
			"fieldDeclaration", "variableDeclaratorList", "variableDeclarator", "variableInitializer", 
			"arrayInitializer", "methodDeclaration", "constructorDeclaration", "typeOrVoid", 
			"formalParameterList", "formalParameter", "lastFormalParameter", "variableDeclaratorId", 
			"qualifiedNameList", "block", "blockStatement", "localVariableDeclarationStatement", 
			"statement", "expressionStatement", "catchClause", "catchType", "finallyBlock", 
			"forControl", "forInit", "enhancedForControl", "forUpdate", "switchBlockStatementGroup", 
			"switchLabel", "constantExpression", "enumConstantName", "primary", "literal", 
			"newExpression", "arguments", "expressionList", "expression", "lambdaExpression", 
			"lambdaParameters", "lambdaBody", "assignmentExpression", "assignmentOperator", 
			"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
			"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
			"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "preIncrementExpression", "preDecrementExpression", 
			"unaryExpressionNotPlusMinus", "postfixExpression", "methodCall", "methodCallTail", 
			"castExpression", "parExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'componenteModelo'", "'painelExterno'", "'circuitoInterno'", "'circuitoIntegradoFinal'", 
			"'sinalDeAck'", "'estadoEnergia'", "'codigoPostDisplay'", "'frequenciaMHz'", 
			"'enderecoDeBlocoEmDisco'", "'tensaoVolts'", "'taxaTransferenciaGBpsPrecisa'", 
			"'seSinalAtivo'", "'rotaDeDadosAlternativa'", "'paraCadaPinoNoConector'", 
			"'transmitirDadoPeloBarramento'", null, null, null, null, null, null, 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", 
			"'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", 
			"'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", 
			"'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
			"'%='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "PUBLIC", "PRIVATE", "FINAL", "VOID", "BOOLEAN", "CHAR", 
			"INT", "LONG", "FLOAT", "DOUBLE", "IF", "ELSE", "FOR", "RETURN", "BOOLEAN_LITERAL", 
			"INTEGER_LITERAL", "FLOAT_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"IDENTIFIER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN", "MOD_ASSIGN", "LINE_COMMENT", "BLOCK_COMMENT", "WS", "PACKAGE", 
			"IMPORT", "EXTENDS", "IMPLEMENTS", "INTERFACE", "ENUM", "PROTECTED", 
			"STATIC", "ABSTRACT", "NATIVE", "SYNCHRONIZED", "TRANSIENT", "VOLATILE", 
			"BYTE", "SHORT", "SUPER", "THROWS", "DEFAULT", "ELLIPSIS", "VAR", "ASSERT", 
			"WHILE", "DO", "TRY", "SWITCH", "THROW", "BREAK", "CONTINUE", "CATCH", 
			"FINALLY", "CASE", "THIS", "NULL_LITERAL", "NEW", "ARROW", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "INSTANCEOF", "LSHIFT", "RSHIFT", 
			"URSHIFT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "ObjectOrientedParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ObjectOrientedParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ObjectOrientedParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(178);
				packageDeclaration();
				}
			}

			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(181);
				importDeclaration();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 511L) != 0)) {
				{
				{
				setState(187);
				typeDeclaration();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(ObjectOrientedParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjectOrientedParser.SEMI, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(PACKAGE);
			setState(196);
			qualifiedName();
			setState(197);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ObjectOrientedParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjectOrientedParser.SEMI, 0); }
		public TerminalNode DOT() { return getToken(ObjectOrientedParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(ObjectOrientedParser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(IMPORT);
			setState(200);
			qualifiedName();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(201);
				match(DOT);
				setState(202);
				match(MUL);
				}
			}

			setState(205);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ObjectOrientedParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ObjectOrientedParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ObjectOrientedParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ObjectOrientedParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(IDENTIFIER);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					match(DOT);
					setState(209);
					match(IDENTIFIER);
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeDeclaration);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				enumDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ObjectOrientedParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ObjectOrientedParser.IDENTIFIER, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(ObjectOrientedParser.EXTENDS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(ObjectOrientedParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 127L) != 0)) {
				{
				{
				setState(220);
				modifier();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			match(CLASS);
			setState(227);
			match(IDENTIFIER);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(228);
				typeParameters();
				}
			}

			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(231);
				match(EXTENDS);
				setState(232);
				type(0);
				}
			}

			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(235);
				match(IMPLEMENTS);
				setState(236);
				typeList();
				}
			}

			setState(239);
			classBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(ObjectOrientedParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ObjectOrientedParser.IDENTIFIER, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(ObjectOrientedParser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 127L) != 0)) {
				{
				{
				setState(241);
				modifier();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(INTERFACE);
			setState(248);
			match(IDENTIFIER);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(249);
				typeParameters();
				}
			}

			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(252);
				match(EXTENDS);
				setState(253);
				typeList();
				}
			}

			setState(256);
			interfaceBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(ObjectOrientedParser.ENUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ObjectOrientedParser.IDENTIFIER, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode IMPLEMENTS() { return getToken(ObjectOrientedParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 127L) != 0)) {
				{
				{
				setState(258);
				modifier();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			match(ENUM);
			setState(265);
			match(IDENTIFIER);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(266);
				match(IMPLEMENTS);
				setState(267);
				typeList();
				}
			}

			setState(270);
			enumBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(ObjectOrientedParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(ObjectOrientedParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(ObjectOrientedParser.PROTECTED, 0); }
		public TerminalNode STATIC() { return getToken(ObjectOrientedParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(ObjectOrientedParser.FINAL, 0); }
		public TerminalNode ABSTRACT() { return getToken(ObjectOrientedParser.ABSTRACT, 0); }
		public TerminalNode NATIVE() { return getToken(ObjectOrientedParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(ObjectOrientedParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(ObjectOrientedParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(ObjectOrientedParser.VOLATILE, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 127L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ObjectOrientedParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(ObjectOrientedParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ObjectOrientedParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectOrientedParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(LT);
			setState(275);
			typeParameter();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(276);
				match(COMMA);
				setState(277);
				typeParameter();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjectOrientedParser.IDENTIFIER, 0); }
		public TerminalNode EXTENDS() { return getToken(ObjectOrientedParser.EXTENDS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(IDENTIFIER);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(286);
				match(EXTENDS);
				setState(287);
				type(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectOrientedParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectOrientedParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			type(0);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(291);
				match(COMMA);
				setState(292);
				type(0);
				}
				}
				setState(297);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(ObjectOrientedParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ObjectOrientedParser.RBRACK, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BYTE:
			case SHORT:
				{
				setState(299);
				primitiveType();
				}
				break;
			case IDENTIFIER:
				{
				setState(300);
				classOrInterfaceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(303);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(304);
					match(LBRACK);
					setState(305);
					match(RBRACK);
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(ObjectOrientedParser.BOOLEAN, 0); }
		public TerminalNode BYTE() { return getToken(ObjectOrientedParser.BYTE, 0); }
		public TerminalNode CHAR() { return getToken(ObjectOrientedParser.CHAR, 0); }
		public TerminalNode SHORT() { return getToken(ObjectOrientedParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(ObjectOrientedParser.INT, 0); }
		public TerminalNode LONG() { return getToken(ObjectOrientedParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(ObjectOrientedParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(ObjectOrientedParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4032L) != 0) || _la==BYTE || _la==SHORT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			qualifiedName();
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(314);
				typeArguments();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ObjectOrientedParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(ObjectOrientedParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ObjectOrientedParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectOrientedParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(LT);
			setState(318);
			typeArgument();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(319);
				match(COMMA);
				setState(320);
				typeArgument();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
			match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(ObjectOrientedParser.QUESTION, 0); }
		public TerminalNode EXTENDS() { return getToken(ObjectOrientedParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(ObjectOrientedParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeArgument);
		int _la;
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case IDENTIFIER:
			case BYTE:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				type(0);
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(QUESTION);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(330);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(331);
					type(0);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ObjectOrientedParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ObjectOrientedParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(LBRACE);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 287313918L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 2047L) != 0)) {
				{
				{
				setState(337);
				classBodyDeclaration();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(ObjectOrientedParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(ObjectOrientedParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(346);
					match(STATIC);
					}
				}

				setState(349);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				memberDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_memberDeclaration);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				constructorDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(357);
				classDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(358);
				enumDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ObjectOrientedParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ObjectOrientedParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(LBRACE);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 270536702L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 2047L) != 0)) {
				{
				{
				setState(362);
				interfaceBodyDeclaration();
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(ObjectOrientedParser.SEMI, 0); }
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitInterfaceBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_interfaceBodyDeclaration);
		try {
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(SEMI);
				}
				break;
			case CLASS:
			case PUBLIC:
			case PRIVATE:
			case FINAL:
			case VOID:
			case BOOLEAN:
			case CHAR:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case IDENTIFIER:
			case INTERFACE:
			case ENUM:
			case PROTECTED:
			case STATIC:
			case ABSTRACT:
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case BYTE:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				interfaceMemberDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_interfaceMemberDeclaration);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(377);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(378);
				enumDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjectOrientedParser.SEMI, 0); }
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constantDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			type(0);
			setState(382);
			variableDeclaratorList();
			setState(383);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeOrVoidContext typeOrVoid() {
			return getRuleContext(TypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ObjectOrientedParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ObjectOrientedParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ObjectOrientedParser.RPAREN, 0); }
		public TerminalNode DEFAULT() { return getToken(ObjectOrientedParser.DEFAULT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjectOrientedParser.SEMI, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ObjectOrientedParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ObjectOrientedParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ObjectOrientedParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ObjectOrientedParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(ObjectOrientedParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 127L) != 0)) {
				{
				{
				setState(385);
				modifier();
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
			typeOrVoid();
			setState(392);
			match(IDENTIFIER);
			setState(393);
			match(LPAREN);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2101212L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 511L) != 0)) {
				{
				setState(394);
				formalParameterList();
				}
			}

			setState(397);
			match(RPAREN);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(398);
				match(LBRACK);
				setState(399);
				match(RBRACK);
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(405);
				match(THROWS);
				setState(406);
				qualifiedNameList();
				}
			}

			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(409);
				match(DEFAULT);
				setState(410);
				block();
				}
				break;
			case SEMI:
				{
				setState(411);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ObjectOrientedParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ObjectOrientedParser.RBRACE, 0); }
		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class,0);
		}
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ObjectOrientedParser.COMMA, 0); }
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(LBRACE);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(415);
				enumConstantList();
				}
			}

			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI || _la==COMMA) {
				{
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(418);
					match(COMMA);
					}
				}

				setState(421);
				enumBodyDeclarations();
				}
			}

			setState(424);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectOrientedParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectOrientedParser.COMMA, i);
		}
		public EnumConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterEnumConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitEnumConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitEnumConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantListContext enumConstantList() throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			enumConstant();
			setState(431);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(427);
					match(COMMA);
					setState(428);
					enumConstant();
					}
					} 
				}
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjectOrientedParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(IDENTIFIER);
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(435);
					arguments();
					}
				}

				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(438);
					classBody();
					}
				}

				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(ObjectOrientedParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(SEMI);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 287313918L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 2047L) != 0)) {
				{
				{
				setState(444);
				classBodyDeclaration();
				}
				}
				setState(449);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjectOrientedParser.SEMI, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 127L) != 0)) {
				{
				{
				setState(450);
				modifier();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
			type(0);
			setState(457);
			variableDeclaratorList();
			setState(458);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectOrientedParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectOrientedParser.COMMA, i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitVariableDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitVariableDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			variableDeclarator();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(461);
				match(COMMA);
				setState(462);
				variableDeclarator();
				}
				}
				setState(467);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjectOrientedParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(ObjectOrientedParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ObjectOrientedParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ObjectOrientedParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ObjectOrientedParser.RBRACK, i);
		}
		public TerminalNode ASSIGN() { return getToken(ObjectOrientedParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(IDENTIFIER);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(469);
				match(LBRACK);
				setState(470);
				match(RBRACK);
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(476);
				match(ASSIGN);
				setState(477);
				variableInitializer();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableInitializer);
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case BOOLEAN:
			case CHAR:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOLEAN_LITERAL:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case IDENTIFIER:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case BYTE:
			case SHORT:
			case SUPER:
			case THIS:
			case NULL_LITERAL:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				arrayInitializer();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ObjectOrientedParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ObjectOrientedParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectOrientedParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectOrientedParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(LBRACE);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 263934355378144L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 1835015L) != 0)) {
				{
				setState(485);
				variableInitializer();
				setState(490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(486);
						match(COMMA);
						setState(487);
						variableInitializer();
						}
						} 
					}
					setState(492);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(493);
					match(COMMA);
					}
				}

				}
			}

			setState(498);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeOrVoidContext typeOrVoid() {
			return getRuleContext(TypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ObjectOrientedParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ObjectOrientedParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ObjectOrientedParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjectOrientedParser.SEMI, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ObjectOrientedParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ObjectOrientedParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ObjectOrientedParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ObjectOrientedParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(ObjectOrientedParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 127L) != 0)) {
				{
				{
				setState(500);
				modifier();
				}
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(506);
			typeOrVoid();
			setState(507);
			match(IDENTIFIER);
			setState(508);
			match(LPAREN);
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2101212L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 511L) != 0)) {
				{
				setState(509);
				formalParameterList();
				}
			}

			setState(512);
			match(RPAREN);
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(513);
				match(LBRACK);
				setState(514);
				match(RBRACK);
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(520);
				match(THROWS);
				setState(521);
				qualifiedNameList();
				}
			}

			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(524);
				block();
				}
				break;
			case SEMI:
				{
				setState(525);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjectOrientedParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ObjectOrientedParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ObjectOrientedParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(ObjectOrientedParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 127L) != 0)) {
				{
				{
				setState(528);
				modifier();
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(534);
			match(IDENTIFIER);
			setState(535);
			match(LPAREN);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2101212L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 511L) != 0)) {
				{
				setState(536);
				formalParameterList();
				}
			}

			setState(539);
			match(RPAREN);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(540);
				match(THROWS);
				setState(541);
				qualifiedNameList();
				}
			}

			setState(544);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeOrVoidContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(ObjectOrientedParser.VOID, 0); }
		public TypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeOrVoidContext typeOrVoid() throws RecognitionException {
		TypeOrVoidContext _localctx = new TypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeOrVoid);
		try {
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case IDENTIFIER:
			case BYTE:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				type(0);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectOrientedParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectOrientedParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				formalParameter();
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(551);
						match(COMMA);
						setState(552);
						formalParameter();
						}
						} 
					}
					setState(557);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(558);
					match(COMMA);
					setState(559);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				lastFormalParameter();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 127L) != 0)) {
				{
				{
				setState(565);
				modifier();
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(571);
			type(0);
			setState(572);
			variableDeclaratorId();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(ObjectOrientedParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 127L) != 0)) {
				{
				{
				setState(574);
				modifier();
				}
				}
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(580);
			type(0);
			setState(581);
			match(ELLIPSIS);
			setState(582);
			variableDeclaratorId();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjectOrientedParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(ObjectOrientedParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ObjectOrientedParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ObjectOrientedParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ObjectOrientedParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(IDENTIFIER);
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(585);
				match(LBRACK);
				setState(586);
				match(RBRACK);
				}
				}
				setState(591);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectOrientedParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectOrientedParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			qualifiedName();
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(593);
				match(COMMA);
				setState(594);
				qualifiedName();
				}
				}
				setState(599);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ObjectOrientedParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ObjectOrientedParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(LBRACE);
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 263934623866878L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 956272639L) != 0)) {
				{
				{
				setState(601);
				blockStatement();
				}
				}
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(607);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_blockStatement);
		try {
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				typeDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjectOrientedParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(ObjectOrientedParser.VAR, 0); }
		public TerminalNode FINAL() { return getToken(ObjectOrientedParser.FINAL, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_localVariableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
			case BOOLEAN:
			case CHAR:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case IDENTIFIER:
			case BYTE:
			case SHORT:
				{
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINAL) {
					{
					setState(614);
					match(FINAL);
					}
				}

				setState(617);
				type(0);
				}
				break;
			case VAR:
				{
				setState(618);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(621);
			variableDeclaratorList();
			setState(622);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(ObjectOrientedParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(ObjectOrientedParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(ObjectOrientedParser.COLON, 0); }
		public TerminalNode IF() { return getToken(ObjectOrientedParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ObjectOrientedParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(ObjectOrientedParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ObjectOrientedParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjectOrientedParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(ObjectOrientedParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(ObjectOrientedParser.DO, 0); }
		public TerminalNode TRY() { return getToken(ObjectOrientedParser.TRY, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TerminalNode SWITCH() { return getToken(ObjectOrientedParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(ObjectOrientedParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ObjectOrientedParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode SYNCHRONIZED() { return getToken(ObjectOrientedParser.SYNCHRONIZED, 0); }
		public TerminalNode RETURN() { return getToken(ObjectOrientedParser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(ObjectOrientedParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(ObjectOrientedParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ObjectOrientedParser.IDENTIFIER, 0); }
		public TerminalNode CONTINUE() { return getToken(ObjectOrientedParser.CONTINUE, 0); }
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				match(ASSERT);
				setState(626);
				expression();
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(627);
					match(COLON);
					setState(628);
					expression();
					}
				}

				setState(631);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(633);
				match(IF);
				setState(634);
				parExpression();
				setState(635);
				statement();
				setState(638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(636);
					match(ELSE);
					setState(637);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(640);
				match(FOR);
				setState(641);
				match(LPAREN);
				setState(642);
				forControl();
				setState(643);
				match(RPAREN);
				setState(644);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(646);
				match(WHILE);
				setState(647);
				parExpression();
				setState(648);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(650);
				match(DO);
				setState(651);
				statement();
				setState(652);
				match(WHILE);
				setState(653);
				parExpression();
				setState(654);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(656);
				match(TRY);
				setState(657);
				block();
				setState(667);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(659); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(658);
						catchClause();
						}
						}
						setState(661); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(664);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(663);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(666);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(669);
				match(SWITCH);
				setState(670);
				parExpression();
				setState(671);
				match(LBRACE);
				setState(675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(672);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(677);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DEFAULT || _la==CASE) {
					{
					{
					setState(678);
					switchLabel();
					}
					}
					setState(683);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(684);
				match(RBRACE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(686);
				match(SYNCHRONIZED);
				setState(687);
				parExpression();
				setState(688);
				block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(690);
				match(RETURN);
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 263934338600928L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 1835015L) != 0)) {
					{
					setState(691);
					expression();
					}
				}

				setState(694);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(695);
				match(THROW);
				setState(696);
				expression();
				setState(697);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(699);
				match(BREAK);
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(700);
					match(IDENTIFIER);
					}
				}

				setState(703);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(704);
				match(CONTINUE);
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(705);
					match(IDENTIFIER);
					}
				}

				setState(708);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(709);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(710);
				expressionStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(711);
				match(IDENTIFIER);
				setState(712);
				match(COLON);
				setState(713);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ObjectOrientedParser.SEMI, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			expression();
			setState(717);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(ObjectOrientedParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(ObjectOrientedParser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ObjectOrientedParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(ObjectOrientedParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(CATCH);
			setState(720);
			match(LPAREN);
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 127L) != 0)) {
				{
				{
				setState(721);
				modifier();
				}
				}
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(727);
			catchType();
			setState(728);
			match(IDENTIFIER);
			setState(729);
			match(RPAREN);
			setState(730);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(ObjectOrientedParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(ObjectOrientedParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			qualifiedName();
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(733);
				match(BITOR);
				setState(734);
				qualifiedName();
				}
				}
				setState(739);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(ObjectOrientedParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(FINALLY);
			setState(741);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(ObjectOrientedParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ObjectOrientedParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_forControl);
		int _la;
		try {
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 263934338600944L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 1835079L) != 0)) {
					{
					setState(744);
					forInit();
					}
				}

				setState(747);
				match(SEMI);
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 263934338600928L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 1835015L) != 0)) {
					{
					setState(748);
					expression();
					}
				}

				setState(751);
				match(SEMI);
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 263934338600928L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 1835015L) != 0)) {
					{
					setState(752);
					forUpdate();
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(ObjectOrientedParser.VAR, 0); }
		public TerminalNode FINAL() { return getToken(ObjectOrientedParser.FINAL, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_forInit);
		int _la;
		try {
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
				case BOOLEAN:
				case CHAR:
				case INT:
				case LONG:
				case FLOAT:
				case DOUBLE:
				case IDENTIFIER:
				case BYTE:
				case SHORT:
					{
					setState(758);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINAL) {
						{
						setState(757);
						match(FINAL);
						}
					}

					setState(760);
					type(0);
					}
					break;
				case VAR:
					{
					setState(761);
					match(VAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(764);
				variableDeclaratorList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				expressionList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnhancedForControlContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ObjectOrientedParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(ObjectOrientedParser.VAR, 0); }
		public TerminalNode FINAL() { return getToken(ObjectOrientedParser.FINAL, 0); }
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
			case BOOLEAN:
			case CHAR:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case IDENTIFIER:
			case BYTE:
			case SHORT:
				{
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINAL) {
					{
					setState(768);
					match(FINAL);
					}
				}

				setState(771);
				type(0);
				}
				break;
			case VAR:
				{
				setState(772);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(775);
			variableDeclaratorId();
			setState(776);
			match(COLON);
			setState(777);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			expressionList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(781);
				switchLabel();
				}
				}
				setState(784); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DEFAULT || _la==CASE );
			setState(787); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(786);
				blockStatement();
				}
				}
				setState(789); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 263934623866878L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 956272639L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(ObjectOrientedParser.CASE, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ObjectOrientedParser.COLON, 0); }
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(ObjectOrientedParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_switchLabel);
		try {
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				match(CASE);
				setState(792);
				constantExpression();
				setState(793);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(795);
				match(CASE);
				setState(796);
				enumConstantName();
				setState(797);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(799);
				match(DEFAULT);
				setState(800);
				match(COLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjectOrientedParser.IDENTIFIER, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitEnumConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ObjectOrientedParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjectOrientedParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(ObjectOrientedParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(ObjectOrientedParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ObjectOrientedParser.IDENTIFIER, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeOrVoidContext typeOrVoid() {
			return getRuleContext(TypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ObjectOrientedParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(ObjectOrientedParser.CLASS, 0); }
		public TerminalNode VOID() { return getToken(ObjectOrientedParser.VOID, 0); }
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_primary);
		try {
			setState(825);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				match(LPAREN);
				setState(808);
				expression();
				setState(809);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(812);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(813);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(814);
				match(IDENTIFIER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(815);
				match(IDENTIFIER);
				setState(816);
				typeArguments();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(817);
				typeOrVoid();
				setState(818);
				match(DOT);
				setState(819);
				match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(821);
				match(VOID);
				setState(822);
				match(DOT);
				setState(823);
				match(CLASS);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(824);
				newExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(ObjectOrientedParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(ObjectOrientedParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(ObjectOrientedParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ObjectOrientedParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(ObjectOrientedParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(ObjectOrientedParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2031616L) != 0) || _la==NULL_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NewExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(ObjectOrientedParser.NEW, 0); }
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ObjectOrientedParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ObjectOrientedParser.LBRACK, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ObjectOrientedParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ObjectOrientedParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_newExpression);
		int _la;
		try {
			int _alt;
			setState(865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				match(NEW);
				setState(830);
				classOrInterfaceType();
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(831);
					typeArguments();
					}
				}

				setState(834);
				arguments();
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(835);
					classBody();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(838);
				match(NEW);
				setState(839);
				primitiveType();
				setState(840);
				match(LBRACK);
				setState(841);
				expression();
				setState(842);
				match(RBRACK);
				setState(847);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(843);
						match(LBRACK);
						setState(844);
						match(RBRACK);
						}
						} 
					}
					setState(849);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(850);
				match(NEW);
				setState(851);
				classOrInterfaceType();
				setState(852);
				match(LBRACK);
				setState(853);
				expression();
				setState(854);
				match(RBRACK);
				setState(859);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(855);
						match(LBRACK);
						setState(856);
						match(RBRACK);
						}
						} 
					}
					setState(861);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(862);
					arrayInitializer();
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ObjectOrientedParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ObjectOrientedParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			match(LPAREN);
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 263934338600928L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 1835015L) != 0)) {
				{
				setState(868);
				expressionList();
				}
			}

			setState(871);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectOrientedParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectOrientedParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			expression();
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(874);
				match(COMMA);
				setState(875);
				expression();
				}
				}
				setState(880);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_expression);
		try {
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(881);
				lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(882);
				assignmentExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ObjectOrientedParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			lambdaParameters();
			setState(886);
			match(ARROW);
			setState(887);
			lambdaBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaParametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ObjectOrientedParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ObjectOrientedParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(ObjectOrientedParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ObjectOrientedParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ObjectOrientedParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ObjectOrientedParser.COMMA, i);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_lambdaParameters);
		int _la;
		try {
			setState(905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(889);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				match(LPAREN);
				setState(892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2101212L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 511L) != 0)) {
					{
					setState(891);
					formalParameterList();
					}
				}

				setState(894);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(895);
				match(LPAREN);
				setState(896);
				match(IDENTIFIER);
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(897);
					match(COMMA);
					setState(898);
					match(IDENTIFIER);
					}
					}
					setState(903);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(904);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_lambdaBody);
		try {
			setState(909);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case BOOLEAN:
			case CHAR:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOLEAN_LITERAL:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case IDENTIFIER:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case BYTE:
			case SHORT:
			case SUPER:
			case THIS:
			case NULL_LITERAL:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public List<ConditionalExpressionContext> conditionalExpression() {
			return getRuleContexts(ConditionalExpressionContext.class);
		}
		public ConditionalExpressionContext conditionalExpression(int i) {
			return getRuleContext(ConditionalExpressionContext.class,i);
		}
		public List<AssignmentOperatorContext> assignmentOperator() {
			return getRuleContexts(AssignmentOperatorContext.class);
		}
		public AssignmentOperatorContext assignmentOperator(int i) {
			return getRuleContext(AssignmentOperatorContext.class,i);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			conditionalExpression();
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4593671622065389568L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 7L) != 0)) {
				{
				{
				setState(912);
				assignmentOperator();
				setState(913);
				conditionalExpression();
				}
				}
				setState(919);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(ObjectOrientedParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(ObjectOrientedParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(ObjectOrientedParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(ObjectOrientedParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(ObjectOrientedParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(ObjectOrientedParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(ObjectOrientedParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(ObjectOrientedParser.XOR_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(ObjectOrientedParser.MOD_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(ObjectOrientedParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(ObjectOrientedParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(ObjectOrientedParser.URSHIFT_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4593671622065389568L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(ObjectOrientedParser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ObjectOrientedParser.COLON, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			conditionalOrExpression();
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(923);
				match(QUESTION);
				setState(924);
				expression();
				setState(925);
				match(COLON);
				setState(926);
				conditionalExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ObjectOrientedParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ObjectOrientedParser.OR, i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			conditionalAndExpression();
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(931);
				match(OR);
				setState(932);
				conditionalAndExpression();
				}
				}
				setState(937);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ObjectOrientedParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ObjectOrientedParser.AND, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			inclusiveOrExpression();
			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(939);
				match(AND);
				setState(940);
				inclusiveOrExpression();
				}
				}
				setState(945);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(ObjectOrientedParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(ObjectOrientedParser.BITOR, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			exclusiveOrExpression();
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(947);
				match(BITOR);
				setState(948);
				exclusiveOrExpression();
				}
				}
				setState(953);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(ObjectOrientedParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(ObjectOrientedParser.CARET, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			andExpression();
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(955);
				match(CARET);
				setState(956);
				andExpression();
				}
				}
				setState(961);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(ObjectOrientedParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(ObjectOrientedParser.BITAND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			equalityExpression();
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(963);
				match(BITAND);
				setState(964);
				equalityExpression();
				}
				}
				setState(969);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(ObjectOrientedParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(ObjectOrientedParser.EQUAL, i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(ObjectOrientedParser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(ObjectOrientedParser.NOTEQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			relationalExpression();
			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(971);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(972);
				relationalExpression();
				}
				}
				setState(977);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<TerminalNode> INSTANCEOF() { return getTokens(ObjectOrientedParser.INSTANCEOF); }
		public TerminalNode INSTANCEOF(int i) {
			return getToken(ObjectOrientedParser.INSTANCEOF, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(ObjectOrientedParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ObjectOrientedParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(ObjectOrientedParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ObjectOrientedParser.GT, i);
		}
		public List<TerminalNode> LE() { return getTokens(ObjectOrientedParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(ObjectOrientedParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(ObjectOrientedParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(ObjectOrientedParser.GE, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			shiftExpression();
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1662152343552L) != 0) || _la==INSTANCEOF) {
				{
				setState(983);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GT:
				case LT:
				case LE:
				case GE:
					{
					setState(979);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1662152343552L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(980);
					shiftExpression();
					}
					break;
				case INSTANCEOF:
					{
					setState(981);
					match(INSTANCEOF);
					setState(982);
					type(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(987);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LSHIFT() { return getTokens(ObjectOrientedParser.LSHIFT); }
		public TerminalNode LSHIFT(int i) {
			return getToken(ObjectOrientedParser.LSHIFT, i);
		}
		public List<TerminalNode> RSHIFT() { return getTokens(ObjectOrientedParser.RSHIFT); }
		public TerminalNode RSHIFT(int i) {
			return getToken(ObjectOrientedParser.RSHIFT, i);
		}
		public List<TerminalNode> URSHIFT() { return getTokens(ObjectOrientedParser.URSHIFT); }
		public TerminalNode URSHIFT(int i) {
			return getToken(ObjectOrientedParser.URSHIFT, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_shiftExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			additiveExpression();
			setState(993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 7L) != 0)) {
				{
				{
				setState(989);
				_la = _input.LA(1);
				if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(990);
				additiveExpression();
				}
				}
				setState(995);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(ObjectOrientedParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(ObjectOrientedParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(ObjectOrientedParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(ObjectOrientedParser.SUB, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			multiplicativeExpression();
			setState(1001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(997);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(998);
				multiplicativeExpression();
				}
				}
				setState(1003);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(ObjectOrientedParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ObjectOrientedParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ObjectOrientedParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ObjectOrientedParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(ObjectOrientedParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(ObjectOrientedParser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			unaryExpression();
			setState(1009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9851624184872960L) != 0)) {
				{
				{
				setState(1005);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9851624184872960L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1006);
				unaryExpression();
				}
				}
				setState(1011);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ObjectOrientedParser.ADD, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(ObjectOrientedParser.SUB, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_unaryExpression);
		try {
			setState(1019);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1012);
				preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1013);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(1014);
				match(ADD);
				setState(1015);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(1016);
				match(SUB);
				setState(1017);
				unaryExpression();
				}
				break;
			case VOID:
			case BOOLEAN:
			case CHAR:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOLEAN_LITERAL:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case IDENTIFIER:
			case LPAREN:
			case BANG:
			case TILDE:
			case BYTE:
			case SHORT:
			case SUPER:
			case THIS:
			case NULL_LITERAL:
			case NEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(1018);
				unaryExpressionNotPlusMinus();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(ObjectOrientedParser.INC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitPreIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitPreIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			match(INC);
			setState(1022);
			unaryExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(ObjectOrientedParser.DEC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitPreDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitPreDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			match(DEC);
			setState(1025);
			unaryExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public TerminalNode TILDE() { return getToken(ObjectOrientedParser.TILDE, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(ObjectOrientedParser.BANG, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitUnaryExpressionNotPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(1033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				match(TILDE);
				setState(1028);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				match(BANG);
				setState(1030);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1031);
				castExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1032);
				postfixExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ObjectOrientedParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ObjectOrientedParser.IDENTIFIER, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ObjectOrientedParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ObjectOrientedParser.DOT, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ObjectOrientedParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ObjectOrientedParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ObjectOrientedParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ObjectOrientedParser.RBRACK, i);
		}
		public List<TerminalNode> INC() { return getTokens(ObjectOrientedParser.INC); }
		public TerminalNode INC(int i) {
			return getToken(ObjectOrientedParser.INC, i);
		}
		public List<TerminalNode> DEC() { return getTokens(ObjectOrientedParser.DEC); }
		public TerminalNode DEC(int i) {
			return getToken(ObjectOrientedParser.DEC, i);
		}
		public List<TerminalNode> THIS() { return getTokens(ObjectOrientedParser.THIS); }
		public TerminalNode THIS(int i) {
			return getToken(ObjectOrientedParser.THIS, i);
		}
		public List<TerminalNode> SUPER() { return getTokens(ObjectOrientedParser.SUPER); }
		public TerminalNode SUPER(int i) {
			return getToken(ObjectOrientedParser.SUPER, i);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public List<TerminalNode> NEW() { return getTokens(ObjectOrientedParser.NEW); }
		public TerminalNode NEW(int i) {
			return getToken(ObjectOrientedParser.NEW, i);
		}
		public List<ClassOrInterfaceTypeContext> classOrInterfaceType() {
			return getRuleContexts(ClassOrInterfaceTypeContext.class);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType(int i) {
			return getRuleContext(ClassOrInterfaceTypeContext.class,i);
		}
		public List<ClassBodyContext> classBody() {
			return getRuleContexts(ClassBodyContext.class);
		}
		public ClassBodyContext classBody(int i) {
			return getRuleContext(ClassBodyContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1035);
				primary();
				}
				break;
			case 2:
				{
				setState(1036);
				match(IDENTIFIER);
				setState(1037);
				typeArguments();
				}
				break;
			}
			setState(1067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52777698983936L) != 0)) {
				{
				setState(1065);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(1040);
					match(DOT);
					setState(1057);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(1041);
						match(IDENTIFIER);
						setState(1043);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(1042);
							arguments();
							}
						}

						}
						break;
					case THIS:
						{
						setState(1045);
						match(THIS);
						}
						break;
					case SUPER:
						{
						setState(1046);
						match(SUPER);
						setState(1047);
						arguments();
						}
						break;
					case NEW:
						{
						setState(1048);
						match(NEW);
						setState(1050);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1049);
							typeArguments();
							}
						}

						setState(1052);
						classOrInterfaceType();
						setState(1053);
						arguments();
						setState(1055);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LBRACE) {
							{
							setState(1054);
							classBody();
							}
						}

						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case LBRACK:
					{
					setState(1059);
					match(LBRACK);
					setState(1060);
					expression();
					setState(1061);
					match(RBRACK);
					}
					break;
				case INC:
					{
					setState(1063);
					match(INC);
					}
					break;
				case DEC:
					{
					setState(1064);
					match(DEC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1069);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ObjectOrientedParser.IDENTIFIER, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(ObjectOrientedParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ObjectOrientedParser.DOT, i);
		}
		public List<MethodCallTailContext> methodCallTail() {
			return getRuleContexts(MethodCallTailContext.class);
		}
		public MethodCallTailContext methodCallTail(int i) {
			return getRuleContext(MethodCallTailContext.class,i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1070);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(1071);
				primary();
				}
				break;
			}
			setState(1074);
			arguments();
			setState(1079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1075);
				match(DOT);
				setState(1076);
				methodCallTail();
				}
				}
				setState(1081);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallTailContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjectOrientedParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public MethodCallTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterMethodCallTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitMethodCallTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitMethodCallTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallTailContext methodCallTail() throws RecognitionException {
		MethodCallTailContext _localctx = new MethodCallTailContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_methodCallTail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			match(IDENTIFIER);
			setState(1083);
			arguments();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ObjectOrientedParser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjectOrientedParser.RPAREN, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public List<ClassOrInterfaceTypeContext> classOrInterfaceType() {
			return getRuleContexts(ClassOrInterfaceTypeContext.class);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType(int i) {
			return getRuleContext(ClassOrInterfaceTypeContext.class,i);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public List<TerminalNode> BITAND() { return getTokens(ObjectOrientedParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(ObjectOrientedParser.BITAND, i);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_castExpression);
		int _la;
		try {
			setState(1102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1085);
				match(LPAREN);
				setState(1086);
				primitiveType();
				setState(1087);
				match(RPAREN);
				setState(1088);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1090);
				match(LPAREN);
				setState(1091);
				classOrInterfaceType();
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(1092);
					match(BITAND);
					setState(1093);
					classOrInterfaceType();
					}
					}
					setState(1098);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1099);
				match(RPAREN);
				setState(1100);
				unaryExpressionNotPlusMinus();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ObjectOrientedParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjectOrientedParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			match(LPAREN);
			setState(1105);
			expression();
			setState(1106);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001j\u0455\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0001\u0000\u0003\u0000"+
		"\u00b4\b\u0000\u0001\u0000\u0005\u0000\u00b7\b\u0000\n\u0000\f\u0000\u00ba"+
		"\t\u0000\u0001\u0000\u0005\u0000\u00bd\b\u0000\n\u0000\f\u0000\u00c0\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00cc"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u00d3\b\u0003\n\u0003\f\u0003\u00d6\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00db\b\u0004\u0001\u0005\u0005\u0005\u00de\b"+
		"\u0005\n\u0005\f\u0005\u00e1\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00e6\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ea\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ee\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0005\u0006\u00f3\b\u0006\n\u0006\f\u0006\u00f6\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00fb\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00ff\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0005\u0007\u0104\b\u0007\n\u0007\f\u0007\u0107\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u010d\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0117\b"+
		"\t\n\t\f\t\u011a\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u0121"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0126\b\u000b\n\u000b"+
		"\f\u000b\u0129\t\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u012e\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u0133\b\f\n\f\f\f\u0136\t\f\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u013c\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u0142\b\u000f\n\u000f\f\u000f\u0145"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u014d\b\u0010\u0003\u0010\u014f\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u0153\b\u0011\n\u0011\f\u0011\u0156\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u015c\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0160\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0168\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u016c\b\u0014\n\u0014\f\u0014\u016f\t\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u0175\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u017c\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0005\u0018\u0183\b\u0018\n\u0018\f\u0018\u0186\t\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u018c\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u0191\b\u0018\n\u0018\f\u0018\u0194\t\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u0198\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u019d\b\u0018\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u01a1\b\u0019\u0001\u0019\u0003\u0019\u01a4\b\u0019\u0001\u0019\u0003"+
		"\u0019\u01a7\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u01ae\b\u001a\n\u001a\f\u001a\u01b1\t\u001a\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u01b5\b\u001b\u0001\u001b\u0003\u001b\u01b8\b"+
		"\u001b\u0003\u001b\u01ba\b\u001b\u0001\u001c\u0001\u001c\u0005\u001c\u01be"+
		"\b\u001c\n\u001c\f\u001c\u01c1\t\u001c\u0001\u001d\u0005\u001d\u01c4\b"+
		"\u001d\n\u001d\f\u001d\u01c7\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01d0\b\u001e"+
		"\n\u001e\f\u001e\u01d3\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u01d8\b\u001f\n\u001f\f\u001f\u01db\t\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u01df\b\u001f\u0001 \u0001 \u0003 \u01e3\b \u0001!\u0001"+
		"!\u0001!\u0001!\u0005!\u01e9\b!\n!\f!\u01ec\t!\u0001!\u0003!\u01ef\b!"+
		"\u0003!\u01f1\b!\u0001!\u0001!\u0001\"\u0005\"\u01f6\b\"\n\"\f\"\u01f9"+
		"\t\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01ff\b\"\u0001\"\u0001\""+
		"\u0001\"\u0005\"\u0204\b\"\n\"\f\"\u0207\t\"\u0001\"\u0001\"\u0003\"\u020b"+
		"\b\"\u0001\"\u0001\"\u0003\"\u020f\b\"\u0001#\u0005#\u0212\b#\n#\f#\u0215"+
		"\t#\u0001#\u0001#\u0001#\u0003#\u021a\b#\u0001#\u0001#\u0001#\u0003#\u021f"+
		"\b#\u0001#\u0001#\u0001$\u0001$\u0003$\u0225\b$\u0001%\u0001%\u0001%\u0005"+
		"%\u022a\b%\n%\f%\u022d\t%\u0001%\u0001%\u0003%\u0231\b%\u0001%\u0003%"+
		"\u0234\b%\u0001&\u0005&\u0237\b&\n&\f&\u023a\t&\u0001&\u0001&\u0001&\u0001"+
		"\'\u0005\'\u0240\b\'\n\'\f\'\u0243\t\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001(\u0001(\u0001(\u0005(\u024c\b(\n(\f(\u024f\t(\u0001)\u0001)\u0001"+
		")\u0005)\u0254\b)\n)\f)\u0257\t)\u0001*\u0001*\u0005*\u025b\b*\n*\f*\u025e"+
		"\t*\u0001*\u0001*\u0001+\u0001+\u0001+\u0003+\u0265\b+\u0001,\u0003,\u0268"+
		"\b,\u0001,\u0001,\u0003,\u026c\b,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0003-\u0276\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u027f\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0004-\u0294\b-\u000b-\f-\u0295\u0001-\u0003-\u0299\b"+
		"-\u0001-\u0003-\u029c\b-\u0001-\u0001-\u0001-\u0001-\u0005-\u02a2\b-\n"+
		"-\f-\u02a5\t-\u0001-\u0005-\u02a8\b-\n-\f-\u02ab\t-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u02b5\b-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0003-\u02be\b-\u0001-\u0001-\u0001-\u0003"+
		"-\u02c3\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u02cb\b-\u0001"+
		".\u0001.\u0001.\u0001/\u0001/\u0001/\u0005/\u02d3\b/\n/\f/\u02d6\t/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00050\u02e0\b0\n0"+
		"\f0\u02e3\t0\u00011\u00011\u00011\u00012\u00012\u00032\u02ea\b2\u0001"+
		"2\u00012\u00032\u02ee\b2\u00012\u00012\u00032\u02f2\b2\u00032\u02f4\b"+
		"2\u00013\u00033\u02f7\b3\u00013\u00013\u00033\u02fb\b3\u00013\u00013\u0003"+
		"3\u02ff\b3\u00014\u00034\u0302\b4\u00014\u00014\u00034\u0306\b4\u0001"+
		"4\u00014\u00014\u00014\u00015\u00015\u00016\u00046\u030f\b6\u000b6\f6"+
		"\u0310\u00016\u00046\u0314\b6\u000b6\f6\u0315\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u0322\b7\u00018\u0001"+
		"8\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0003:\u033a\b:\u0001;\u0001;\u0001<\u0001<\u0001<\u0003<\u0341\b<\u0001"+
		"<\u0001<\u0003<\u0345\b<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0005<\u034e\b<\n<\f<\u0351\t<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0005<\u035a\b<\n<\f<\u035d\t<\u0001<\u0003<\u0360\b<\u0003<"+
		"\u0362\b<\u0001=\u0001=\u0003=\u0366\b=\u0001=\u0001=\u0001>\u0001>\u0001"+
		">\u0005>\u036d\b>\n>\f>\u0370\t>\u0001?\u0001?\u0003?\u0374\b?\u0001@"+
		"\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0003A\u037d\bA\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0005A\u0384\bA\nA\fA\u0387\tA\u0001A\u0003A\u038a"+
		"\bA\u0001B\u0001B\u0003B\u038e\bB\u0001C\u0001C\u0001C\u0001C\u0005C\u0394"+
		"\bC\nC\fC\u0397\tC\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0003E\u03a1\bE\u0001F\u0001F\u0001F\u0005F\u03a6\bF\nF\fF\u03a9\tF"+
		"\u0001G\u0001G\u0001G\u0005G\u03ae\bG\nG\fG\u03b1\tG\u0001H\u0001H\u0001"+
		"H\u0005H\u03b6\bH\nH\fH\u03b9\tH\u0001I\u0001I\u0001I\u0005I\u03be\bI"+
		"\nI\fI\u03c1\tI\u0001J\u0001J\u0001J\u0005J\u03c6\bJ\nJ\fJ\u03c9\tJ\u0001"+
		"K\u0001K\u0001K\u0005K\u03ce\bK\nK\fK\u03d1\tK\u0001L\u0001L\u0001L\u0001"+
		"L\u0001L\u0005L\u03d8\bL\nL\fL\u03db\tL\u0001M\u0001M\u0001M\u0005M\u03e0"+
		"\bM\nM\fM\u03e3\tM\u0001N\u0001N\u0001N\u0005N\u03e8\bN\nN\fN\u03eb\t"+
		"N\u0001O\u0001O\u0001O\u0005O\u03f0\bO\nO\fO\u03f3\tO\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0003P\u03fc\bP\u0001Q\u0001Q\u0001Q\u0001"+
		"R\u0001R\u0001R\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0003S\u040a"+
		"\bS\u0001T\u0001T\u0001T\u0003T\u040f\bT\u0001T\u0001T\u0001T\u0003T\u0414"+
		"\bT\u0001T\u0001T\u0001T\u0001T\u0001T\u0003T\u041b\bT\u0001T\u0001T\u0001"+
		"T\u0003T\u0420\bT\u0003T\u0422\bT\u0001T\u0001T\u0001T\u0001T\u0001T\u0001"+
		"T\u0005T\u042a\bT\nT\fT\u042d\tT\u0001U\u0001U\u0003U\u0431\bU\u0001U"+
		"\u0001U\u0001U\u0005U\u0436\bU\nU\fU\u0439\tU\u0001V\u0001V\u0001V\u0001"+
		"W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001W\u0005W\u0447"+
		"\bW\nW\fW\u044a\tW\u0001W\u0001W\u0001W\u0003W\u044f\bW\u0001X\u0001X"+
		"\u0001X\u0001X\u0001X\u0000\u0001\u0018Y\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u0000\n\u0002\u0000\u0002\u0004"+
		"GM\u0002\u0000\u0006\u000bNO\u0002\u0000CCPP\u0002\u0000\u0010\u0014a"+
		"a\u0003\u0000\u001f\u001f6=df\u0002\u0000&&))\u0002\u0000 !\'(\u0001\u0000"+
		"hj\u0001\u0000./\u0002\u00000155\u04af\u0000\u00b3\u0001\u0000\u0000\u0000"+
		"\u0002\u00c3\u0001\u0000\u0000\u0000\u0004\u00c7\u0001\u0000\u0000\u0000"+
		"\u0006\u00cf\u0001\u0000\u0000\u0000\b\u00da\u0001\u0000\u0000\u0000\n"+
		"\u00df\u0001\u0000\u0000\u0000\f\u00f4\u0001\u0000\u0000\u0000\u000e\u0105"+
		"\u0001\u0000\u0000\u0000\u0010\u0110\u0001\u0000\u0000\u0000\u0012\u0112"+
		"\u0001\u0000\u0000\u0000\u0014\u011d\u0001\u0000\u0000\u0000\u0016\u0122"+
		"\u0001\u0000\u0000\u0000\u0018\u012d\u0001\u0000\u0000\u0000\u001a\u0137"+
		"\u0001\u0000\u0000\u0000\u001c\u0139\u0001\u0000\u0000\u0000\u001e\u013d"+
		"\u0001\u0000\u0000\u0000 \u014e\u0001\u0000\u0000\u0000\"\u0150\u0001"+
		"\u0000\u0000\u0000$\u015f\u0001\u0000\u0000\u0000&\u0167\u0001\u0000\u0000"+
		"\u0000(\u0169\u0001\u0000\u0000\u0000*\u0174\u0001\u0000\u0000\u0000,"+
		"\u017b\u0001\u0000\u0000\u0000.\u017d\u0001\u0000\u0000\u00000\u0184\u0001"+
		"\u0000\u0000\u00002\u019e\u0001\u0000\u0000\u00004\u01aa\u0001\u0000\u0000"+
		"\u00006\u01b2\u0001\u0000\u0000\u00008\u01bb\u0001\u0000\u0000\u0000:"+
		"\u01c5\u0001\u0000\u0000\u0000<\u01cc\u0001\u0000\u0000\u0000>\u01d4\u0001"+
		"\u0000\u0000\u0000@\u01e2\u0001\u0000\u0000\u0000B\u01e4\u0001\u0000\u0000"+
		"\u0000D\u01f7\u0001\u0000\u0000\u0000F\u0213\u0001\u0000\u0000\u0000H"+
		"\u0224\u0001\u0000\u0000\u0000J\u0233\u0001\u0000\u0000\u0000L\u0238\u0001"+
		"\u0000\u0000\u0000N\u0241\u0001\u0000\u0000\u0000P\u0248\u0001\u0000\u0000"+
		"\u0000R\u0250\u0001\u0000\u0000\u0000T\u0258\u0001\u0000\u0000\u0000V"+
		"\u0264\u0001\u0000\u0000\u0000X\u026b\u0001\u0000\u0000\u0000Z\u02ca\u0001"+
		"\u0000\u0000\u0000\\\u02cc\u0001\u0000\u0000\u0000^\u02cf\u0001\u0000"+
		"\u0000\u0000`\u02dc\u0001\u0000\u0000\u0000b\u02e4\u0001\u0000\u0000\u0000"+
		"d\u02f3\u0001\u0000\u0000\u0000f\u02fe\u0001\u0000\u0000\u0000h\u0305"+
		"\u0001\u0000\u0000\u0000j\u030b\u0001\u0000\u0000\u0000l\u030e\u0001\u0000"+
		"\u0000\u0000n\u0321\u0001\u0000\u0000\u0000p\u0323\u0001\u0000\u0000\u0000"+
		"r\u0325\u0001\u0000\u0000\u0000t\u0339\u0001\u0000\u0000\u0000v\u033b"+
		"\u0001\u0000\u0000\u0000x\u0361\u0001\u0000\u0000\u0000z\u0363\u0001\u0000"+
		"\u0000\u0000|\u0369\u0001\u0000\u0000\u0000~\u0373\u0001\u0000\u0000\u0000"+
		"\u0080\u0375\u0001\u0000\u0000\u0000\u0082\u0389\u0001\u0000\u0000\u0000"+
		"\u0084\u038d\u0001\u0000\u0000\u0000\u0086\u038f\u0001\u0000\u0000\u0000"+
		"\u0088\u0398\u0001\u0000\u0000\u0000\u008a\u039a\u0001\u0000\u0000\u0000"+
		"\u008c\u03a2\u0001\u0000\u0000\u0000\u008e\u03aa\u0001\u0000\u0000\u0000"+
		"\u0090\u03b2\u0001\u0000\u0000\u0000\u0092\u03ba\u0001\u0000\u0000\u0000"+
		"\u0094\u03c2\u0001\u0000\u0000\u0000\u0096\u03ca\u0001\u0000\u0000\u0000"+
		"\u0098\u03d2\u0001\u0000\u0000\u0000\u009a\u03dc\u0001\u0000\u0000\u0000"+
		"\u009c\u03e4\u0001\u0000\u0000\u0000\u009e\u03ec\u0001\u0000\u0000\u0000"+
		"\u00a0\u03fb\u0001\u0000\u0000\u0000\u00a2\u03fd\u0001\u0000\u0000\u0000"+
		"\u00a4\u0400\u0001\u0000\u0000\u0000\u00a6\u0409\u0001\u0000\u0000\u0000"+
		"\u00a8\u040e\u0001\u0000\u0000\u0000\u00aa\u0430\u0001\u0000\u0000\u0000"+
		"\u00ac\u043a\u0001\u0000\u0000\u0000\u00ae\u044e\u0001\u0000\u0000\u0000"+
		"\u00b0\u0450\u0001\u0000\u0000\u0000\u00b2\u00b4\u0003\u0002\u0001\u0000"+
		"\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b8\u0001\u0000\u0000\u0000\u00b5\u00b7\u0003\u0004\u0002\u0000"+
		"\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9\u00be\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bd\u0003\b\u0004\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u0000\u0000\u0001\u00c2"+
		"\u0001\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005A\u0000\u0000\u00c4\u00c5"+
		"\u0003\u0006\u0003\u0000\u00c5\u00c6\u0005\u001c\u0000\u0000\u00c6\u0003"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005B\u0000\u0000\u00c8\u00cb\u0003"+
		"\u0006\u0003\u0000\u00c9\u00ca\u0005\u001e\u0000\u0000\u00ca\u00cc\u0005"+
		"0\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u001c"+
		"\u0000\u0000\u00ce\u0005\u0001\u0000\u0000\u0000\u00cf\u00d4\u0005\u0015"+
		"\u0000\u0000\u00d0\u00d1\u0005\u001e\u0000\u0000\u00d1\u00d3\u0005\u0015"+
		"\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d5\u0007\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d7\u00db\u0003\n\u0005\u0000\u00d8\u00db\u0003\f\u0006"+
		"\u0000\u00d9\u00db\u0003\u000e\u0007\u0000\u00da\u00d7\u0001\u0000\u0000"+
		"\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00d9\u0001\u0000\u0000"+
		"\u0000\u00db\t\u0001\u0000\u0000\u0000\u00dc\u00de\u0003\u0010\b\u0000"+
		"\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0005\u0001\u0000\u0000\u00e3\u00e5\u0005\u0015\u0000\u0000"+
		"\u00e4\u00e6\u0003\u0012\t\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0005C\u0000\u0000\u00e8\u00ea\u0003\u0018\f\u0000\u00e9\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ed"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005D\u0000\u0000\u00ec\u00ee\u0003"+
		"\u0016\u000b\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0003"+
		"\"\u0011\u0000\u00f0\u000b\u0001\u0000\u0000\u0000\u00f1\u00f3\u0003\u0010"+
		"\b\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0005E\u0000\u0000\u00f8\u00fa\u0005\u0015\u0000\u0000"+
		"\u00f9\u00fb\u0003\u0012\t\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0005C\u0000\u0000\u00fd\u00ff\u0003\u0016\u000b\u0000\u00fe\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0003(\u0014\u0000\u0101\r\u0001"+
		"\u0000\u0000\u0000\u0102\u0104\u0003\u0010\b\u0000\u0103\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0108\u0001\u0000"+
		"\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0109\u0005F\u0000"+
		"\u0000\u0109\u010c\u0005\u0015\u0000\u0000\u010a\u010b\u0005D\u0000\u0000"+
		"\u010b\u010d\u0003\u0016\u000b\u0000\u010c\u010a\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u00032\u0019\u0000\u010f\u000f\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0007\u0000\u0000\u0000\u0111\u0011\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0005!\u0000\u0000\u0113\u0118\u0003\u0014\n\u0000\u0114\u0115"+
		"\u0005\u001d\u0000\u0000\u0115\u0117\u0003\u0014\n\u0000\u0116\u0114\u0001"+
		"\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011b\u0001"+
		"\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011c\u0005"+
		" \u0000\u0000\u011c\u0013\u0001\u0000\u0000\u0000\u011d\u0120\u0005\u0015"+
		"\u0000\u0000\u011e\u011f\u0005C\u0000\u0000\u011f\u0121\u0003\u0018\f"+
		"\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000"+
		"\u0000\u0121\u0015\u0001\u0000\u0000\u0000\u0122\u0127\u0003\u0018\f\u0000"+
		"\u0123\u0124\u0005\u001d\u0000\u0000\u0124\u0126\u0003\u0018\f\u0000\u0125"+
		"\u0123\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127"+
		"\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128"+
		"\u0017\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0006\f\uffff\uffff\u0000\u012b\u012e\u0003\u001a\r\u0000\u012c"+
		"\u012e\u0003\u001c\u000e\u0000\u012d\u012a\u0001\u0000\u0000\u0000\u012d"+
		"\u012c\u0001\u0000\u0000\u0000\u012e\u0134\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\n\u0001\u0000\u0000\u0130\u0131\u0005\u001a\u0000\u0000\u0131\u0133"+
		"\u0005\u001b\u0000\u0000\u0132\u012f\u0001\u0000\u0000\u0000\u0133\u0136"+
		"\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0001\u0000\u0000\u0000\u0135\u0019\u0001\u0000\u0000\u0000\u0136\u0134"+
		"\u0001\u0000\u0000\u0000\u0137\u0138\u0007\u0001\u0000\u0000\u0138\u001b"+
		"\u0001\u0000\u0000\u0000\u0139\u013b\u0003\u0006\u0003\u0000\u013a\u013c"+
		"\u0003\u001e\u000f\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0001\u0000\u0000\u0000\u013c\u001d\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0005!\u0000\u0000\u013e\u0143\u0003 \u0010\u0000\u013f\u0140\u0005\u001d"+
		"\u0000\u0000\u0140\u0142\u0003 \u0010\u0000\u0141\u013f\u0001\u0000\u0000"+
		"\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0146\u0001\u0000\u0000"+
		"\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0147\u0005 \u0000\u0000"+
		"\u0147\u001f\u0001\u0000\u0000\u0000\u0148\u014f\u0003\u0018\f\u0000\u0149"+
		"\u014c\u0005$\u0000\u0000\u014a\u014b\u0007\u0002\u0000\u0000\u014b\u014d"+
		"\u0003\u0018\f\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001"+
		"\u0000\u0000\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u0148\u0001"+
		"\u0000\u0000\u0000\u014e\u0149\u0001\u0000\u0000\u0000\u014f!\u0001\u0000"+
		"\u0000\u0000\u0150\u0154\u0005\u0018\u0000\u0000\u0151\u0153\u0003$\u0012"+
		"\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153\u0156\u0001\u0000\u0000"+
		"\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000"+
		"\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0005\u0019\u0000\u0000\u0158#\u0001\u0000\u0000\u0000"+
		"\u0159\u0160\u0005\u001c\u0000\u0000\u015a\u015c\u0005H\u0000\u0000\u015b"+
		"\u015a\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c"+
		"\u015d\u0001\u0000\u0000\u0000\u015d\u0160\u0003T*\u0000\u015e\u0160\u0003"+
		"&\u0013\u0000\u015f\u0159\u0001\u0000\u0000\u0000\u015f\u015b\u0001\u0000"+
		"\u0000\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u0160%\u0001\u0000\u0000"+
		"\u0000\u0161\u0168\u0003:\u001d\u0000\u0162\u0168\u0003D\"\u0000\u0163"+
		"\u0168\u0003F#\u0000\u0164\u0168\u0003\f\u0006\u0000\u0165\u0168\u0003"+
		"\n\u0005\u0000\u0166\u0168\u0003\u000e\u0007\u0000\u0167\u0161\u0001\u0000"+
		"\u0000\u0000\u0167\u0162\u0001\u0000\u0000\u0000\u0167\u0163\u0001\u0000"+
		"\u0000\u0000\u0167\u0164\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000"+
		"\u0000\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168\'\u0001\u0000\u0000"+
		"\u0000\u0169\u016d\u0005\u0018\u0000\u0000\u016a\u016c\u0003*\u0015\u0000"+
		"\u016b\u016a\u0001\u0000\u0000\u0000\u016c\u016f\u0001\u0000\u0000\u0000"+
		"\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000"+
		"\u016e\u0170\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0005\u0019\u0000\u0000\u0171)\u0001\u0000\u0000\u0000\u0172"+
		"\u0175\u0005\u001c\u0000\u0000\u0173\u0175\u0003,\u0016\u0000\u0174\u0172"+
		"\u0001\u0000\u0000\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0175+\u0001"+
		"\u0000\u0000\u0000\u0176\u017c\u0003.\u0017\u0000\u0177\u017c\u00030\u0018"+
		"\u0000\u0178\u017c\u0003\f\u0006\u0000\u0179\u017c\u0003\n\u0005\u0000"+
		"\u017a\u017c\u0003\u000e\u0007\u0000\u017b\u0176\u0001\u0000\u0000\u0000"+
		"\u017b\u0177\u0001\u0000\u0000\u0000\u017b\u0178\u0001\u0000\u0000\u0000"+
		"\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017a\u0001\u0000\u0000\u0000"+
		"\u017c-\u0001\u0000\u0000\u0000\u017d\u017e\u0003\u0018\f\u0000\u017e"+
		"\u017f\u0003<\u001e\u0000\u017f\u0180\u0005\u001c\u0000\u0000\u0180/\u0001"+
		"\u0000\u0000\u0000\u0181\u0183\u0003\u0010\b\u0000\u0182\u0181\u0001\u0000"+
		"\u0000\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0187\u0001\u0000"+
		"\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u0188\u0003H$\u0000"+
		"\u0188\u0189\u0005\u0015\u0000\u0000\u0189\u018b\u0005\u0016\u0000\u0000"+
		"\u018a\u018c\u0003J%\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u0192"+
		"\u0005\u0017\u0000\u0000\u018e\u018f\u0005\u001a\u0000\u0000\u018f\u0191"+
		"\u0005\u001b\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0194"+
		"\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0193"+
		"\u0001\u0000\u0000\u0000\u0193\u0197\u0001\u0000\u0000\u0000\u0194\u0192"+
		"\u0001\u0000\u0000\u0000\u0195\u0196\u0005Q\u0000\u0000\u0196\u0198\u0003"+
		"R)\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000"+
		"\u0000\u0198\u019c\u0001\u0000\u0000\u0000\u0199\u019a\u0005R\u0000\u0000"+
		"\u019a\u019d\u0003T*\u0000\u019b\u019d\u0005\u001c\u0000\u0000\u019c\u0199"+
		"\u0001\u0000\u0000\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019d1\u0001"+
		"\u0000\u0000\u0000\u019e\u01a0\u0005\u0018\u0000\u0000\u019f\u01a1\u0003"+
		"4\u001a\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a6\u0001\u0000\u0000\u0000\u01a2\u01a4\u0005\u001d"+
		"\u0000\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a7\u00038\u001c"+
		"\u0000\u01a6\u01a3\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005\u0019\u0000"+
		"\u0000\u01a93\u0001\u0000\u0000\u0000\u01aa\u01af\u00036\u001b\u0000\u01ab"+
		"\u01ac\u0005\u001d\u0000\u0000\u01ac\u01ae\u00036\u001b\u0000\u01ad\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000\u01af\u01ad"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b05\u0001"+
		"\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2\u01b9\u0005"+
		"\u0015\u0000\u0000\u01b3\u01b5\u0003z=\u0000\u01b4\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b8\u0003\"\u0011\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000"+
		"\u01b9\u01b4\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000"+
		"\u01ba7\u0001\u0000\u0000\u0000\u01bb\u01bf\u0005\u001c\u0000\u0000\u01bc"+
		"\u01be\u0003$\u0012\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01be\u01c1"+
		"\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0"+
		"\u0001\u0000\u0000\u0000\u01c09\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c4\u0003\u0010\b\u0000\u01c3\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c7\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c8\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c8\u01c9\u0003\u0018"+
		"\f\u0000\u01c9\u01ca\u0003<\u001e\u0000\u01ca\u01cb\u0005\u001c\u0000"+
		"\u0000\u01cb;\u0001\u0000\u0000\u0000\u01cc\u01d1\u0003>\u001f\u0000\u01cd"+
		"\u01ce\u0005\u001d\u0000\u0000\u01ce\u01d0\u0003>\u001f\u0000\u01cf\u01cd"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d3\u0001\u0000\u0000\u0000\u01d1\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2=\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d4\u01d9\u0005"+
		"\u0015\u0000\u0000\u01d5\u01d6\u0005\u001a\u0000\u0000\u01d6\u01d8\u0005"+
		"\u001b\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d8\u01db\u0001"+
		"\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01d9\u01da\u0001"+
		"\u0000\u0000\u0000\u01da\u01de\u0001\u0000\u0000\u0000\u01db\u01d9\u0001"+
		"\u0000\u0000\u0000\u01dc\u01dd\u0005\u001f\u0000\u0000\u01dd\u01df\u0003"+
		"@ \u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000"+
		"\u0000\u01df?\u0001\u0000\u0000\u0000\u01e0\u01e3\u0003~?\u0000\u01e1"+
		"\u01e3\u0003B!\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e3A\u0001\u0000\u0000\u0000\u01e4\u01f0\u0005\u0018"+
		"\u0000\u0000\u01e5\u01ea\u0003@ \u0000\u01e6\u01e7\u0005\u001d\u0000\u0000"+
		"\u01e7\u01e9\u0003@ \u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e9\u01ec"+
		"\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb"+
		"\u0001\u0000\u0000\u0000\u01eb\u01ee\u0001\u0000\u0000\u0000\u01ec\u01ea"+
		"\u0001\u0000\u0000\u0000\u01ed\u01ef\u0005\u001d\u0000\u0000\u01ee\u01ed"+
		"\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f0\u01e5\u0001\u0000\u0000\u0000\u01f0\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f3"+
		"\u0005\u0019\u0000\u0000\u01f3C\u0001\u0000\u0000\u0000\u01f4\u01f6\u0003"+
		"\u0010\b\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f9\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000"+
		"\u0000\u0000\u01f8\u01fa\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fb\u0003H$\u0000\u01fb\u01fc\u0005\u0015\u0000\u0000"+
		"\u01fc\u01fe\u0005\u0016\u0000\u0000\u01fd\u01ff\u0003J%\u0000\u01fe\u01fd"+
		"\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0200"+
		"\u0001\u0000\u0000\u0000\u0200\u0205\u0005\u0017\u0000\u0000\u0201\u0202"+
		"\u0005\u001a\u0000\u0000\u0202\u0204\u0005\u001b\u0000\u0000\u0203\u0201"+
		"\u0001\u0000\u0000\u0000\u0204\u0207\u0001\u0000\u0000\u0000\u0205\u0203"+
		"\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u020a"+
		"\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0005Q\u0000\u0000\u0209\u020b\u0003R)\u0000\u020a\u0208\u0001\u0000"+
		"\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020e\u0001\u0000"+
		"\u0000\u0000\u020c\u020f\u0003T*\u0000\u020d\u020f\u0005\u001c\u0000\u0000"+
		"\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020d\u0001\u0000\u0000\u0000"+
		"\u020fE\u0001\u0000\u0000\u0000\u0210\u0212\u0003\u0010\b\u0000\u0211"+
		"\u0210\u0001\u0000\u0000\u0000\u0212\u0215\u0001\u0000\u0000\u0000\u0213"+
		"\u0211\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214"+
		"\u0216\u0001\u0000\u0000\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0216"+
		"\u0217\u0005\u0015\u0000\u0000\u0217\u0219\u0005\u0016\u0000\u0000\u0218"+
		"\u021a\u0003J%\u0000\u0219\u0218\u0001\u0000\u0000\u0000\u0219\u021a\u0001"+
		"\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021e\u0005"+
		"\u0017\u0000\u0000\u021c\u021d\u0005Q\u0000\u0000\u021d\u021f\u0003R)"+
		"\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000"+
		"\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0003T*\u0000\u0221"+
		"G\u0001\u0000\u0000\u0000\u0222\u0225\u0003\u0018\f\u0000\u0223\u0225"+
		"\u0005\u0005\u0000\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0224\u0223"+
		"\u0001\u0000\u0000\u0000\u0225I\u0001\u0000\u0000\u0000\u0226\u022b\u0003"+
		"L&\u0000\u0227\u0228\u0005\u001d\u0000\u0000\u0228\u022a\u0003L&\u0000"+
		"\u0229\u0227\u0001\u0000\u0000\u0000\u022a\u022d\u0001\u0000\u0000\u0000"+
		"\u022b\u0229\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000"+
		"\u022c\u0230\u0001\u0000\u0000\u0000\u022d\u022b\u0001\u0000\u0000\u0000"+
		"\u022e\u022f\u0005\u001d\u0000\u0000\u022f\u0231\u0003N\'\u0000\u0230"+
		"\u022e\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231"+
		"\u0234\u0001\u0000\u0000\u0000\u0232\u0234\u0003N\'\u0000\u0233\u0226"+
		"\u0001\u0000\u0000\u0000\u0233\u0232\u0001\u0000\u0000\u0000\u0234K\u0001"+
		"\u0000\u0000\u0000\u0235\u0237\u0003\u0010\b\u0000\u0236\u0235\u0001\u0000"+
		"\u0000\u0000\u0237\u023a\u0001\u0000\u0000\u0000\u0238\u0236\u0001\u0000"+
		"\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023b\u0001\u0000"+
		"\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023b\u023c\u0003\u0018"+
		"\f\u0000\u023c\u023d\u0003P(\u0000\u023dM\u0001\u0000\u0000\u0000\u023e"+
		"\u0240\u0003\u0010\b\u0000\u023f\u023e\u0001\u0000\u0000\u0000\u0240\u0243"+
		"\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0242"+
		"\u0001\u0000\u0000\u0000\u0242\u0244\u0001\u0000\u0000\u0000\u0243\u0241"+
		"\u0001\u0000\u0000\u0000\u0244\u0245\u0003\u0018\f\u0000\u0245\u0246\u0005"+
		"S\u0000\u0000\u0246\u0247\u0003P(\u0000\u0247O\u0001\u0000\u0000\u0000"+
		"\u0248\u024d\u0005\u0015\u0000\u0000\u0249\u024a\u0005\u001a\u0000\u0000"+
		"\u024a\u024c\u0005\u001b\u0000\u0000\u024b\u0249\u0001\u0000\u0000\u0000"+
		"\u024c\u024f\u0001\u0000\u0000\u0000\u024d\u024b\u0001\u0000\u0000\u0000"+
		"\u024d\u024e\u0001\u0000\u0000\u0000\u024eQ\u0001\u0000\u0000\u0000\u024f"+
		"\u024d\u0001\u0000\u0000\u0000\u0250\u0255\u0003\u0006\u0003\u0000\u0251"+
		"\u0252\u0005\u001d\u0000\u0000\u0252\u0254\u0003\u0006\u0003\u0000\u0253"+
		"\u0251\u0001\u0000\u0000\u0000\u0254\u0257\u0001\u0000\u0000\u0000\u0255"+
		"\u0253\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256"+
		"S\u0001\u0000\u0000\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0258\u025c"+
		"\u0005\u0018\u0000\u0000\u0259\u025b\u0003V+\u0000\u025a\u0259\u0001\u0000"+
		"\u0000\u0000\u025b\u025e\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000"+
		"\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u025f\u0001\u0000"+
		"\u0000\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025f\u0260\u0005\u0019"+
		"\u0000\u0000\u0260U\u0001\u0000\u0000\u0000\u0261\u0265\u0003X,\u0000"+
		"\u0262\u0265\u0003Z-\u0000\u0263\u0265\u0003\b\u0004\u0000\u0264\u0261"+
		"\u0001\u0000\u0000\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0264\u0263"+
		"\u0001\u0000\u0000\u0000\u0265W\u0001\u0000\u0000\u0000\u0266\u0268\u0005"+
		"\u0004\u0000\u0000\u0267\u0266\u0001\u0000\u0000\u0000\u0267\u0268\u0001"+
		"\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269\u026c\u0003"+
		"\u0018\f\u0000\u026a\u026c\u0005T\u0000\u0000\u026b\u0267\u0001\u0000"+
		"\u0000\u0000\u026b\u026a\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000"+
		"\u0000\u0000\u026d\u026e\u0003<\u001e\u0000\u026e\u026f\u0005\u001c\u0000"+
		"\u0000\u026fY\u0001\u0000\u0000\u0000\u0270\u02cb\u0003T*\u0000\u0271"+
		"\u0272\u0005U\u0000\u0000\u0272\u0275\u0003~?\u0000\u0273\u0274\u0005"+
		"%\u0000\u0000\u0274\u0276\u0003~?\u0000\u0275\u0273\u0001\u0000\u0000"+
		"\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000"+
		"\u0000\u0277\u0278\u0005\u001c\u0000\u0000\u0278\u02cb\u0001\u0000\u0000"+
		"\u0000\u0279\u027a\u0005\f\u0000\u0000\u027a\u027b\u0003\u00b0X\u0000"+
		"\u027b\u027e\u0003Z-\u0000\u027c\u027d\u0005\r\u0000\u0000\u027d\u027f"+
		"\u0003Z-\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000"+
		"\u0000\u0000\u027f\u02cb\u0001\u0000\u0000\u0000\u0280\u0281\u0005\u000e"+
		"\u0000\u0000\u0281\u0282\u0005\u0016\u0000\u0000\u0282\u0283\u0003d2\u0000"+
		"\u0283\u0284\u0005\u0017\u0000\u0000\u0284\u0285\u0003Z-\u0000\u0285\u02cb"+
		"\u0001\u0000\u0000\u0000\u0286\u0287\u0005V\u0000\u0000\u0287\u0288\u0003"+
		"\u00b0X\u0000\u0288\u0289\u0003Z-\u0000\u0289\u02cb\u0001\u0000\u0000"+
		"\u0000\u028a\u028b\u0005W\u0000\u0000\u028b\u028c\u0003Z-\u0000\u028c"+
		"\u028d\u0005V\u0000\u0000\u028d\u028e\u0003\u00b0X\u0000\u028e\u028f\u0005"+
		"\u001c\u0000\u0000\u028f\u02cb\u0001\u0000\u0000\u0000\u0290\u0291\u0005"+
		"X\u0000\u0000\u0291\u029b\u0003T*\u0000\u0292\u0294\u0003^/\u0000\u0293"+
		"\u0292\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295"+
		"\u0293\u0001\u0000\u0000\u0000\u0295\u0296\u0001\u0000\u0000\u0000\u0296"+
		"\u0298\u0001\u0000\u0000\u0000\u0297\u0299\u0003b1\u0000\u0298\u0297\u0001"+
		"\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029c\u0001"+
		"\u0000\u0000\u0000\u029a\u029c\u0003b1\u0000\u029b\u0293\u0001\u0000\u0000"+
		"\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029c\u02cb\u0001\u0000\u0000"+
		"\u0000\u029d\u029e\u0005Y\u0000\u0000\u029e\u029f\u0003\u00b0X\u0000\u029f"+
		"\u02a3\u0005\u0018\u0000\u0000\u02a0\u02a2\u0003l6\u0000\u02a1\u02a0\u0001"+
		"\u0000\u0000\u0000\u02a2\u02a5\u0001\u0000\u0000\u0000\u02a3\u02a1\u0001"+
		"\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a9\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a6\u02a8\u0003"+
		"n7\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000\u02a8\u02ab\u0001\u0000\u0000"+
		"\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000"+
		"\u0000\u02aa\u02ac\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000"+
		"\u0000\u02ac\u02ad\u0005\u0019\u0000\u0000\u02ad\u02cb\u0001\u0000\u0000"+
		"\u0000\u02ae\u02af\u0005K\u0000\u0000\u02af\u02b0\u0003\u00b0X\u0000\u02b0"+
		"\u02b1\u0003T*\u0000\u02b1\u02cb\u0001\u0000\u0000\u0000\u02b2\u02b4\u0005"+
		"\u000f\u0000\u0000\u02b3\u02b5\u0003~?\u0000\u02b4\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000"+
		"\u0000\u02b6\u02cb\u0005\u001c\u0000\u0000\u02b7\u02b8\u0005Z\u0000\u0000"+
		"\u02b8\u02b9\u0003~?\u0000\u02b9\u02ba\u0005\u001c\u0000\u0000\u02ba\u02cb"+
		"\u0001\u0000\u0000\u0000\u02bb\u02bd\u0005[\u0000\u0000\u02bc\u02be\u0005"+
		"\u0015\u0000\u0000\u02bd\u02bc\u0001\u0000\u0000\u0000\u02bd\u02be\u0001"+
		"\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000\u0000\u02bf\u02cb\u0005"+
		"\u001c\u0000\u0000\u02c0\u02c2\u0005\\\u0000\u0000\u02c1\u02c3\u0005\u0015"+
		"\u0000\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000"+
		"\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02cb\u0005\u001c"+
		"\u0000\u0000\u02c5\u02cb\u0005\u001c\u0000\u0000\u02c6\u02cb\u0003\\."+
		"\u0000\u02c7\u02c8\u0005\u0015\u0000\u0000\u02c8\u02c9\u0005%\u0000\u0000"+
		"\u02c9\u02cb\u0003Z-\u0000\u02ca\u0270\u0001\u0000\u0000\u0000\u02ca\u0271"+
		"\u0001\u0000\u0000\u0000\u02ca\u0279\u0001\u0000\u0000\u0000\u02ca\u0280"+
		"\u0001\u0000\u0000\u0000\u02ca\u0286\u0001\u0000\u0000\u0000\u02ca\u028a"+
		"\u0001\u0000\u0000\u0000\u02ca\u0290\u0001\u0000\u0000\u0000\u02ca\u029d"+
		"\u0001\u0000\u0000\u0000\u02ca\u02ae\u0001\u0000\u0000\u0000\u02ca\u02b2"+
		"\u0001\u0000\u0000\u0000\u02ca\u02b7\u0001\u0000\u0000\u0000\u02ca\u02bb"+
		"\u0001\u0000\u0000\u0000\u02ca\u02c0\u0001\u0000\u0000\u0000\u02ca\u02c5"+
		"\u0001\u0000\u0000\u0000\u02ca\u02c6\u0001\u0000\u0000\u0000\u02ca\u02c7"+
		"\u0001\u0000\u0000\u0000\u02cb[\u0001\u0000\u0000\u0000\u02cc\u02cd\u0003"+
		"~?\u0000\u02cd\u02ce\u0005\u001c\u0000\u0000\u02ce]\u0001\u0000\u0000"+
		"\u0000\u02cf\u02d0\u0005]\u0000\u0000\u02d0\u02d4\u0005\u0016\u0000\u0000"+
		"\u02d1\u02d3\u0003\u0010\b\u0000\u02d2\u02d1\u0001\u0000\u0000\u0000\u02d3"+
		"\u02d6\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d4"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d7\u0001\u0000\u0000\u0000\u02d6"+
		"\u02d4\u0001\u0000\u0000\u0000\u02d7\u02d8\u0003`0\u0000\u02d8\u02d9\u0005"+
		"\u0015\u0000\u0000\u02d9\u02da\u0005\u0017\u0000\u0000\u02da\u02db\u0003"+
		"T*\u0000\u02db_\u0001\u0000\u0000\u0000\u02dc\u02e1\u0003\u0006\u0003"+
		"\u0000\u02dd\u02de\u00053\u0000\u0000\u02de\u02e0\u0003\u0006\u0003\u0000"+
		"\u02df\u02dd\u0001\u0000\u0000\u0000\u02e0\u02e3\u0001\u0000\u0000\u0000"+
		"\u02e1\u02df\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000"+
		"\u02e2a\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e4"+
		"\u02e5\u0005^\u0000\u0000\u02e5\u02e6\u0003T*\u0000\u02e6c\u0001\u0000"+
		"\u0000\u0000\u02e7\u02f4\u0003h4\u0000\u02e8\u02ea\u0003f3\u0000\u02e9"+
		"\u02e8\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea"+
		"\u02eb\u0001\u0000\u0000\u0000\u02eb\u02ed\u0005\u001c\u0000\u0000\u02ec"+
		"\u02ee\u0003~?\u0000\u02ed\u02ec\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001"+
		"\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef\u02f1\u0005"+
		"\u001c\u0000\u0000\u02f0\u02f2\u0003j5\u0000\u02f1\u02f0\u0001\u0000\u0000"+
		"\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f4\u0001\u0000\u0000"+
		"\u0000\u02f3\u02e7\u0001\u0000\u0000\u0000\u02f3\u02e9\u0001\u0000\u0000"+
		"\u0000\u02f4e\u0001\u0000\u0000\u0000\u02f5\u02f7\u0005\u0004\u0000\u0000"+
		"\u02f6\u02f5\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000"+
		"\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02fb\u0003\u0018\f\u0000\u02f9"+
		"\u02fb\u0005T\u0000\u0000\u02fa\u02f6\u0001\u0000\u0000\u0000\u02fa\u02f9"+
		"\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02ff"+
		"\u0003<\u001e\u0000\u02fd\u02ff\u0003|>\u0000\u02fe\u02fa\u0001\u0000"+
		"\u0000\u0000\u02fe\u02fd\u0001\u0000\u0000\u0000\u02ffg\u0001\u0000\u0000"+
		"\u0000\u0300\u0302\u0005\u0004\u0000\u0000\u0301\u0300\u0001\u0000\u0000"+
		"\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000"+
		"\u0000\u0303\u0306\u0003\u0018\f\u0000\u0304\u0306\u0005T\u0000\u0000"+
		"\u0305\u0301\u0001\u0000\u0000\u0000\u0305\u0304\u0001\u0000\u0000\u0000"+
		"\u0306\u0307\u0001\u0000\u0000\u0000\u0307\u0308\u0003P(\u0000\u0308\u0309"+
		"\u0005%\u0000\u0000\u0309\u030a\u0003~?\u0000\u030ai\u0001\u0000\u0000"+
		"\u0000\u030b\u030c\u0003|>\u0000\u030ck\u0001\u0000\u0000\u0000\u030d"+
		"\u030f\u0003n7\u0000\u030e\u030d\u0001\u0000\u0000\u0000\u030f\u0310\u0001"+
		"\u0000\u0000\u0000\u0310\u030e\u0001\u0000\u0000\u0000\u0310\u0311\u0001"+
		"\u0000\u0000\u0000\u0311\u0313\u0001\u0000\u0000\u0000\u0312\u0314\u0003"+
		"V+\u0000\u0313\u0312\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000"+
		"\u0000\u0315\u0313\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000"+
		"\u0000\u0316m\u0001\u0000\u0000\u0000\u0317\u0318\u0005_\u0000\u0000\u0318"+
		"\u0319\u0003p8\u0000\u0319\u031a\u0005%\u0000\u0000\u031a\u0322\u0001"+
		"\u0000\u0000\u0000\u031b\u031c\u0005_\u0000\u0000\u031c\u031d\u0003r9"+
		"\u0000\u031d\u031e\u0005%\u0000\u0000\u031e\u0322\u0001\u0000\u0000\u0000"+
		"\u031f\u0320\u0005R\u0000\u0000\u0320\u0322\u0005%\u0000\u0000\u0321\u0317"+
		"\u0001\u0000\u0000\u0000\u0321\u031b\u0001\u0000\u0000\u0000\u0321\u031f"+
		"\u0001\u0000\u0000\u0000\u0322o\u0001\u0000\u0000\u0000\u0323\u0324\u0003"+
		"~?\u0000\u0324q\u0001\u0000\u0000\u0000\u0325\u0326\u0005\u0015\u0000"+
		"\u0000\u0326s\u0001\u0000\u0000\u0000\u0327\u0328\u0005\u0016\u0000\u0000"+
		"\u0328\u0329\u0003~?\u0000\u0329\u032a\u0005\u0017\u0000\u0000\u032a\u033a"+
		"\u0001\u0000\u0000\u0000\u032b\u033a\u0005`\u0000\u0000\u032c\u033a\u0005"+
		"P\u0000\u0000\u032d\u033a\u0003v;\u0000\u032e\u033a\u0005\u0015\u0000"+
		"\u0000\u032f\u0330\u0005\u0015\u0000\u0000\u0330\u033a\u0003\u001e\u000f"+
		"\u0000\u0331\u0332\u0003H$\u0000\u0332\u0333\u0005\u001e\u0000\u0000\u0333"+
		"\u0334\u0005\u0001\u0000\u0000\u0334\u033a\u0001\u0000\u0000\u0000\u0335"+
		"\u0336\u0005\u0005\u0000\u0000\u0336\u0337\u0005\u001e\u0000\u0000\u0337"+
		"\u033a\u0005\u0001\u0000\u0000\u0338\u033a\u0003x<\u0000\u0339\u0327\u0001"+
		"\u0000\u0000\u0000\u0339\u032b\u0001\u0000\u0000\u0000\u0339\u032c\u0001"+
		"\u0000\u0000\u0000\u0339\u032d\u0001\u0000\u0000\u0000\u0339\u032e\u0001"+
		"\u0000\u0000\u0000\u0339\u032f\u0001\u0000\u0000\u0000\u0339\u0331\u0001"+
		"\u0000\u0000\u0000\u0339\u0335\u0001\u0000\u0000\u0000\u0339\u0338\u0001"+
		"\u0000\u0000\u0000\u033au\u0001\u0000\u0000\u0000\u033b\u033c\u0007\u0003"+
		"\u0000\u0000\u033cw\u0001\u0000\u0000\u0000\u033d\u033e\u0005b\u0000\u0000"+
		"\u033e\u0340\u0003\u001c\u000e\u0000\u033f\u0341\u0003\u001e\u000f\u0000"+
		"\u0340\u033f\u0001\u0000\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000"+
		"\u0341\u0342\u0001\u0000\u0000\u0000\u0342\u0344\u0003z=\u0000\u0343\u0345"+
		"\u0003\"\u0011\u0000\u0344\u0343\u0001\u0000\u0000\u0000\u0344\u0345\u0001"+
		"\u0000\u0000\u0000\u0345\u0362\u0001\u0000\u0000\u0000\u0346\u0347\u0005"+
		"b\u0000\u0000\u0347\u0348\u0003\u001a\r\u0000\u0348\u0349\u0005\u001a"+
		"\u0000\u0000\u0349\u034a\u0003~?\u0000\u034a\u034f\u0005\u001b\u0000\u0000"+
		"\u034b\u034c\u0005\u001a\u0000\u0000\u034c\u034e\u0005\u001b\u0000\u0000"+
		"\u034d\u034b\u0001\u0000\u0000\u0000\u034e\u0351\u0001\u0000\u0000\u0000"+
		"\u034f\u034d\u0001\u0000\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000"+
		"\u0350\u0362\u0001\u0000\u0000\u0000\u0351\u034f\u0001\u0000\u0000\u0000"+
		"\u0352\u0353\u0005b\u0000\u0000\u0353\u0354\u0003\u001c\u000e\u0000\u0354"+
		"\u0355\u0005\u001a\u0000\u0000\u0355\u0356\u0003~?\u0000\u0356\u035b\u0005"+
		"\u001b\u0000\u0000\u0357\u0358\u0005\u001a\u0000\u0000\u0358\u035a\u0005"+
		"\u001b\u0000\u0000\u0359\u0357\u0001\u0000\u0000\u0000\u035a\u035d\u0001"+
		"\u0000\u0000\u0000\u035b\u0359\u0001\u0000\u0000\u0000\u035b\u035c\u0001"+
		"\u0000\u0000\u0000\u035c\u035f\u0001\u0000\u0000\u0000\u035d\u035b\u0001"+
		"\u0000\u0000\u0000\u035e\u0360\u0003B!\u0000\u035f\u035e\u0001\u0000\u0000"+
		"\u0000\u035f\u0360\u0001\u0000\u0000\u0000\u0360\u0362\u0001\u0000\u0000"+
		"\u0000\u0361\u033d\u0001\u0000\u0000\u0000\u0361\u0346\u0001\u0000\u0000"+
		"\u0000\u0361\u0352\u0001\u0000\u0000\u0000\u0362y\u0001\u0000\u0000\u0000"+
		"\u0363\u0365\u0005\u0016\u0000\u0000\u0364\u0366\u0003|>\u0000\u0365\u0364"+
		"\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000\u0000\u0000\u0366\u0367"+
		"\u0001\u0000\u0000\u0000\u0367\u0368\u0005\u0017\u0000\u0000\u0368{\u0001"+
		"\u0000\u0000\u0000\u0369\u036e\u0003~?\u0000\u036a\u036b\u0005\u001d\u0000"+
		"\u0000\u036b\u036d\u0003~?\u0000\u036c\u036a\u0001\u0000\u0000\u0000\u036d"+
		"\u0370\u0001\u0000\u0000\u0000\u036e\u036c\u0001\u0000\u0000\u0000\u036e"+
		"\u036f\u0001\u0000\u0000\u0000\u036f}\u0001\u0000\u0000\u0000\u0370\u036e"+
		"\u0001\u0000\u0000\u0000\u0371\u0374\u0003\u0080@\u0000\u0372\u0374\u0003"+
		"\u0086C\u0000\u0373\u0371\u0001\u0000\u0000\u0000\u0373\u0372\u0001\u0000"+
		"\u0000\u0000\u0374\u007f\u0001\u0000\u0000\u0000\u0375\u0376\u0003\u0082"+
		"A\u0000\u0376\u0377\u0005c\u0000\u0000\u0377\u0378\u0003\u0084B\u0000"+
		"\u0378\u0081\u0001\u0000\u0000\u0000\u0379\u038a\u0005\u0015\u0000\u0000"+
		"\u037a\u037c\u0005\u0016\u0000\u0000\u037b\u037d\u0003J%\u0000\u037c\u037b"+
		"\u0001\u0000\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000\u037d\u037e"+
		"\u0001\u0000\u0000\u0000\u037e\u038a\u0005\u0017\u0000\u0000\u037f\u0380"+
		"\u0005\u0016\u0000\u0000\u0380\u0385\u0005\u0015\u0000\u0000\u0381\u0382"+
		"\u0005\u001d\u0000\u0000\u0382\u0384\u0005\u0015\u0000\u0000\u0383\u0381"+
		"\u0001\u0000\u0000\u0000\u0384\u0387\u0001\u0000\u0000\u0000\u0385\u0383"+
		"\u0001\u0000\u0000\u0000\u0385\u0386\u0001\u0000\u0000\u0000\u0386\u0388"+
		"\u0001\u0000\u0000\u0000\u0387\u0385\u0001\u0000\u0000\u0000\u0388\u038a"+
		"\u0005\u0017\u0000\u0000\u0389\u0379\u0001\u0000\u0000\u0000\u0389\u037a"+
		"\u0001\u0000\u0000\u0000\u0389\u037f\u0001\u0000\u0000\u0000\u038a\u0083"+
		"\u0001\u0000\u0000\u0000\u038b\u038e\u0003~?\u0000\u038c\u038e\u0003T"+
		"*\u0000\u038d\u038b\u0001\u0000\u0000\u0000\u038d\u038c\u0001\u0000\u0000"+
		"\u0000\u038e\u0085\u0001\u0000\u0000\u0000\u038f\u0395\u0003\u008aE\u0000"+
		"\u0390\u0391\u0003\u0088D\u0000\u0391\u0392\u0003\u008aE\u0000\u0392\u0394"+
		"\u0001\u0000\u0000\u0000\u0393\u0390\u0001\u0000\u0000\u0000\u0394\u0397"+
		"\u0001\u0000\u0000\u0000\u0395\u0393\u0001\u0000\u0000\u0000\u0395\u0396"+
		"\u0001\u0000\u0000\u0000\u0396\u0087\u0001\u0000\u0000\u0000\u0397\u0395"+
		"\u0001\u0000\u0000\u0000\u0398\u0399\u0007\u0004\u0000\u0000\u0399\u0089"+
		"\u0001\u0000\u0000\u0000\u039a\u03a0\u0003\u008cF\u0000\u039b\u039c\u0005"+
		"$\u0000\u0000\u039c\u039d\u0003~?\u0000\u039d\u039e\u0005%\u0000\u0000"+
		"\u039e\u039f\u0003\u008aE\u0000\u039f\u03a1\u0001\u0000\u0000\u0000\u03a0"+
		"\u039b\u0001\u0000\u0000\u0000\u03a0\u03a1\u0001\u0000\u0000\u0000\u03a1"+
		"\u008b\u0001\u0000\u0000\u0000\u03a2\u03a7\u0003\u008eG\u0000\u03a3\u03a4"+
		"\u0005+\u0000\u0000\u03a4\u03a6\u0003\u008eG\u0000\u03a5\u03a3\u0001\u0000"+
		"\u0000\u0000\u03a6\u03a9\u0001\u0000\u0000\u0000\u03a7\u03a5\u0001\u0000"+
		"\u0000\u0000\u03a7\u03a8\u0001\u0000\u0000\u0000\u03a8\u008d\u0001\u0000"+
		"\u0000\u0000\u03a9\u03a7\u0001\u0000\u0000\u0000\u03aa\u03af\u0003\u0090"+
		"H\u0000\u03ab\u03ac\u0005*\u0000\u0000\u03ac\u03ae\u0003\u0090H\u0000"+
		"\u03ad\u03ab\u0001\u0000\u0000\u0000\u03ae\u03b1\u0001\u0000\u0000\u0000"+
		"\u03af\u03ad\u0001\u0000\u0000\u0000\u03af\u03b0\u0001\u0000\u0000\u0000"+
		"\u03b0\u008f\u0001\u0000\u0000\u0000\u03b1\u03af\u0001\u0000\u0000\u0000"+
		"\u03b2\u03b7\u0003\u0092I\u0000\u03b3\u03b4\u00053\u0000\u0000\u03b4\u03b6"+
		"\u0003\u0092I\u0000\u03b5\u03b3\u0001\u0000\u0000\u0000\u03b6\u03b9\u0001"+
		"\u0000\u0000\u0000\u03b7\u03b5\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001"+
		"\u0000\u0000\u0000\u03b8\u0091\u0001\u0000\u0000\u0000\u03b9\u03b7\u0001"+
		"\u0000\u0000\u0000\u03ba\u03bf\u0003\u0094J\u0000\u03bb\u03bc\u00054\u0000"+
		"\u0000\u03bc\u03be\u0003\u0094J\u0000\u03bd\u03bb\u0001\u0000\u0000\u0000"+
		"\u03be\u03c1\u0001\u0000\u0000\u0000\u03bf\u03bd\u0001\u0000\u0000\u0000"+
		"\u03bf\u03c0\u0001\u0000\u0000\u0000\u03c0\u0093\u0001\u0000\u0000\u0000"+
		"\u03c1\u03bf\u0001\u0000\u0000\u0000\u03c2\u03c7\u0003\u0096K\u0000\u03c3"+
		"\u03c4\u00052\u0000\u0000\u03c4\u03c6\u0003\u0096K\u0000\u03c5\u03c3\u0001"+
		"\u0000\u0000\u0000\u03c6\u03c9\u0001\u0000\u0000\u0000\u03c7\u03c5\u0001"+
		"\u0000\u0000\u0000\u03c7\u03c8\u0001\u0000\u0000\u0000\u03c8\u0095\u0001"+
		"\u0000\u0000\u0000\u03c9\u03c7\u0001\u0000\u0000\u0000\u03ca\u03cf\u0003"+
		"\u0098L\u0000\u03cb\u03cc\u0007\u0005\u0000\u0000\u03cc\u03ce\u0003\u0098"+
		"L\u0000\u03cd\u03cb\u0001\u0000\u0000\u0000\u03ce\u03d1\u0001\u0000\u0000"+
		"\u0000\u03cf\u03cd\u0001\u0000\u0000\u0000\u03cf\u03d0\u0001\u0000\u0000"+
		"\u0000\u03d0\u0097\u0001\u0000\u0000\u0000\u03d1\u03cf\u0001\u0000\u0000"+
		"\u0000\u03d2\u03d9\u0003\u009aM\u0000\u03d3\u03d4\u0007\u0006\u0000\u0000"+
		"\u03d4\u03d8\u0003\u009aM\u0000\u03d5\u03d6\u0005g\u0000\u0000\u03d6\u03d8"+
		"\u0003\u0018\f\u0000\u03d7\u03d3\u0001\u0000\u0000\u0000\u03d7\u03d5\u0001"+
		"\u0000\u0000\u0000\u03d8\u03db\u0001\u0000\u0000\u0000\u03d9\u03d7\u0001"+
		"\u0000\u0000\u0000\u03d9\u03da\u0001\u0000\u0000\u0000\u03da\u0099\u0001"+
		"\u0000\u0000\u0000\u03db\u03d9\u0001\u0000\u0000\u0000\u03dc\u03e1\u0003"+
		"\u009cN\u0000\u03dd\u03de\u0007\u0007\u0000\u0000\u03de\u03e0\u0003\u009c"+
		"N\u0000\u03df\u03dd\u0001\u0000\u0000\u0000\u03e0\u03e3\u0001\u0000\u0000"+
		"\u0000\u03e1\u03df\u0001\u0000\u0000\u0000\u03e1\u03e2\u0001\u0000\u0000"+
		"\u0000\u03e2\u009b\u0001\u0000\u0000\u0000\u03e3\u03e1\u0001\u0000\u0000"+
		"\u0000\u03e4\u03e9\u0003\u009eO\u0000\u03e5\u03e6\u0007\b\u0000\u0000"+
		"\u03e6\u03e8\u0003\u009eO\u0000\u03e7\u03e5\u0001\u0000\u0000\u0000\u03e8"+
		"\u03eb\u0001\u0000\u0000\u0000\u03e9\u03e7\u0001\u0000\u0000\u0000\u03e9"+
		"\u03ea\u0001\u0000\u0000\u0000\u03ea\u009d\u0001\u0000\u0000\u0000\u03eb"+
		"\u03e9\u0001\u0000\u0000\u0000\u03ec\u03f1\u0003\u00a0P\u0000\u03ed\u03ee"+
		"\u0007\t\u0000\u0000\u03ee\u03f0\u0003\u00a0P\u0000\u03ef\u03ed\u0001"+
		"\u0000\u0000\u0000\u03f0\u03f3\u0001\u0000\u0000\u0000\u03f1\u03ef\u0001"+
		"\u0000\u0000\u0000\u03f1\u03f2\u0001\u0000\u0000\u0000\u03f2\u009f\u0001"+
		"\u0000\u0000\u0000\u03f3\u03f1\u0001\u0000\u0000\u0000\u03f4\u03fc\u0003"+
		"\u00a2Q\u0000\u03f5\u03fc\u0003\u00a4R\u0000\u03f6\u03f7\u0005.\u0000"+
		"\u0000\u03f7\u03fc\u0003\u00a0P\u0000\u03f8\u03f9\u0005/\u0000\u0000\u03f9"+
		"\u03fc\u0003\u00a0P\u0000\u03fa\u03fc\u0003\u00a6S\u0000\u03fb\u03f4\u0001"+
		"\u0000\u0000\u0000\u03fb\u03f5\u0001\u0000\u0000\u0000\u03fb\u03f6\u0001"+
		"\u0000\u0000\u0000\u03fb\u03f8\u0001\u0000\u0000\u0000\u03fb\u03fa\u0001"+
		"\u0000\u0000\u0000\u03fc\u00a1\u0001\u0000\u0000\u0000\u03fd\u03fe\u0005"+
		",\u0000\u0000\u03fe\u03ff\u0003\u00a0P\u0000\u03ff\u00a3\u0001\u0000\u0000"+
		"\u0000\u0400\u0401\u0005-\u0000\u0000\u0401\u0402\u0003\u00a0P\u0000\u0402"+
		"\u00a5\u0001\u0000\u0000\u0000\u0403\u0404\u0005#\u0000\u0000\u0404\u040a"+
		"\u0003\u00a0P\u0000\u0405\u0406\u0005\"\u0000\u0000\u0406\u040a\u0003"+
		"\u00a0P\u0000\u0407\u040a\u0003\u00aeW\u0000\u0408\u040a\u0003\u00a8T"+
		"\u0000\u0409\u0403\u0001\u0000\u0000\u0000\u0409\u0405\u0001\u0000\u0000"+
		"\u0000\u0409\u0407\u0001\u0000\u0000\u0000\u0409\u0408\u0001\u0000\u0000"+
		"\u0000\u040a\u00a7\u0001\u0000\u0000\u0000\u040b\u040f\u0003t:\u0000\u040c"+
		"\u040d\u0005\u0015\u0000\u0000\u040d\u040f\u0003\u001e\u000f\u0000\u040e"+
		"\u040b\u0001\u0000\u0000\u0000\u040e\u040c\u0001\u0000\u0000\u0000\u040f"+
		"\u042b\u0001\u0000\u0000\u0000\u0410\u0421\u0005\u001e\u0000\u0000\u0411"+
		"\u0413\u0005\u0015\u0000\u0000\u0412\u0414\u0003z=\u0000\u0413\u0412\u0001"+
		"\u0000\u0000\u0000\u0413\u0414\u0001\u0000\u0000\u0000\u0414\u0422\u0001"+
		"\u0000\u0000\u0000\u0415\u0422\u0005`\u0000\u0000\u0416\u0417\u0005P\u0000"+
		"\u0000\u0417\u0422\u0003z=\u0000\u0418\u041a\u0005b\u0000\u0000\u0419"+
		"\u041b\u0003\u001e\u000f\u0000\u041a\u0419\u0001\u0000\u0000\u0000\u041a"+
		"\u041b\u0001\u0000\u0000\u0000\u041b\u041c\u0001\u0000\u0000\u0000\u041c"+
		"\u041d\u0003\u001c\u000e\u0000\u041d\u041f\u0003z=\u0000\u041e\u0420\u0003"+
		"\"\u0011\u0000\u041f\u041e\u0001\u0000\u0000\u0000\u041f\u0420\u0001\u0000"+
		"\u0000\u0000\u0420\u0422\u0001\u0000\u0000\u0000\u0421\u0411\u0001\u0000"+
		"\u0000\u0000\u0421\u0415\u0001\u0000\u0000\u0000\u0421\u0416\u0001\u0000"+
		"\u0000\u0000\u0421\u0418\u0001\u0000\u0000\u0000\u0422\u042a\u0001\u0000"+
		"\u0000\u0000\u0423\u0424\u0005\u001a\u0000\u0000\u0424\u0425\u0003~?\u0000"+
		"\u0425\u0426\u0005\u001b\u0000\u0000\u0426\u042a\u0001\u0000\u0000\u0000"+
		"\u0427\u042a\u0005,\u0000\u0000\u0428\u042a\u0005-\u0000\u0000\u0429\u0410"+
		"\u0001\u0000\u0000\u0000\u0429\u0423\u0001\u0000\u0000\u0000\u0429\u0427"+
		"\u0001\u0000\u0000\u0000\u0429\u0428\u0001\u0000\u0000\u0000\u042a\u042d"+
		"\u0001\u0000\u0000\u0000\u042b\u0429\u0001\u0000\u0000\u0000\u042b\u042c"+
		"\u0001\u0000\u0000\u0000\u042c\u00a9\u0001\u0000\u0000\u0000\u042d\u042b"+
		"\u0001\u0000\u0000\u0000\u042e\u0431\u0005\u0015\u0000\u0000\u042f\u0431"+
		"\u0003t:\u0000\u0430\u042e\u0001\u0000\u0000\u0000\u0430\u042f\u0001\u0000"+
		"\u0000\u0000\u0431\u0432\u0001\u0000\u0000\u0000\u0432\u0437\u0003z=\u0000"+
		"\u0433\u0434\u0005\u001e\u0000\u0000\u0434\u0436\u0003\u00acV\u0000\u0435"+
		"\u0433\u0001\u0000\u0000\u0000\u0436\u0439\u0001\u0000\u0000\u0000\u0437"+
		"\u0435\u0001\u0000\u0000\u0000\u0437\u0438\u0001\u0000\u0000\u0000\u0438"+
		"\u00ab\u0001\u0000\u0000\u0000\u0439\u0437\u0001\u0000\u0000\u0000\u043a"+
		"\u043b\u0005\u0015\u0000\u0000\u043b\u043c\u0003z=\u0000\u043c\u00ad\u0001"+
		"\u0000\u0000\u0000\u043d\u043e\u0005\u0016\u0000\u0000\u043e\u043f\u0003"+
		"\u001a\r\u0000\u043f\u0440\u0005\u0017\u0000\u0000\u0440\u0441\u0003\u00a0"+
		"P\u0000\u0441\u044f\u0001\u0000\u0000\u0000\u0442\u0443\u0005\u0016\u0000"+
		"\u0000\u0443\u0448\u0003\u001c\u000e\u0000\u0444\u0445\u00052\u0000\u0000"+
		"\u0445\u0447\u0003\u001c\u000e\u0000\u0446\u0444\u0001\u0000\u0000\u0000"+
		"\u0447\u044a\u0001\u0000\u0000\u0000\u0448\u0446\u0001\u0000\u0000\u0000"+
		"\u0448\u0449\u0001\u0000\u0000\u0000\u0449\u044b\u0001\u0000\u0000\u0000"+
		"\u044a\u0448\u0001\u0000\u0000\u0000\u044b\u044c\u0005\u0017\u0000\u0000"+
		"\u044c\u044d\u0003\u00a6S\u0000\u044d\u044f\u0001\u0000\u0000\u0000\u044e"+
		"\u043d\u0001\u0000\u0000\u0000\u044e\u0442\u0001\u0000\u0000\u0000\u044f"+
		"\u00af\u0001\u0000\u0000\u0000\u0450\u0451\u0005\u0016\u0000\u0000\u0451"+
		"\u0452\u0003~?\u0000\u0452\u0453\u0005\u0017\u0000\u0000\u0453\u00b1\u0001"+
		"\u0000\u0000\u0000\u0089\u00b3\u00b8\u00be\u00cb\u00d4\u00da\u00df\u00e5"+
		"\u00e9\u00ed\u00f4\u00fa\u00fe\u0105\u010c\u0118\u0120\u0127\u012d\u0134"+
		"\u013b\u0143\u014c\u014e\u0154\u015b\u015f\u0167\u016d\u0174\u017b\u0184"+
		"\u018b\u0192\u0197\u019c\u01a0\u01a3\u01a6\u01af\u01b4\u01b7\u01b9\u01bf"+
		"\u01c5\u01d1\u01d9\u01de\u01e2\u01ea\u01ee\u01f0\u01f7\u01fe\u0205\u020a"+
		"\u020e\u0213\u0219\u021e\u0224\u022b\u0230\u0233\u0238\u0241\u024d\u0255"+
		"\u025c\u0264\u0267\u026b\u0275\u027e\u0295\u0298\u029b\u02a3\u02a9\u02b4"+
		"\u02bd\u02c2\u02ca\u02d4\u02e1\u02e9\u02ed\u02f1\u02f3\u02f6\u02fa\u02fe"+
		"\u0301\u0305\u0310\u0315\u0321\u0339\u0340\u0344\u034f\u035b\u035f\u0361"+
		"\u0365\u036e\u0373\u037c\u0385\u0389\u038d\u0395\u03a0\u03a7\u03af\u03b7"+
		"\u03bf\u03c7\u03cf\u03d7\u03d9\u03e1\u03e9\u03f1\u03fb\u0409\u040e\u0413"+
		"\u041a\u041f\u0421\u0429\u042b\u0430\u0437\u0448\u044e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}