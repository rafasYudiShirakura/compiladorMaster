// Generated from ObjectOrientedParser.g4 by ANTLR 4.13.1
package org.example.output.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ObjectOrientedParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, PUBLIC=2, PRIVATE=3, FINAL=4, VOID=5, BOOLEAN=6, CHAR=7, INT=8, 
		LONG=9, FLOAT=10, DOUBLE=11, IF=12, ELSE=13, FOR=14, WHILE=15, DO=16, 
		RETURN=17, PRINTF=18, SCANF=19, BOOLEAN_LITERAL=20, INTEGER_LITERAL=21, 
		FLOAT_LITERAL=22, CHAR_LITERAL=23, STRING_LITERAL=24, IDENTIFIER=25, LPAREN=26, 
		RPAREN=27, LBRACE=28, RBRACE=29, LBRACK=30, RBRACK=31, SEMI=32, COMMA=33, 
		DOT=34, ASSIGN=35, GT=36, LT=37, BANG=38, TILDE=39, QUESTION=40, COLON=41, 
		EQUAL=42, LE=43, GE=44, NOTEQUAL=45, AND=46, OR=47, INC=48, DEC=49, ADD=50, 
		SUB=51, MUL=52, DIV=53, BITAND=54, BITOR=55, CARET=56, MOD=57, ADD_ASSIGN=58, 
		SUB_ASSIGN=59, MUL_ASSIGN=60, DIV_ASSIGN=61, AND_ASSIGN=62, OR_ASSIGN=63, 
		XOR_ASSIGN=64, MOD_ASSIGN=65, LINE_COMMENT=66, BLOCK_COMMENT=67, WS=68, 
		NEW=69, THIS=70, NULL_LITERAL=71, BREAK=72, CONTINUE=73, PACKAGE=74, IMPORT=75, 
		EXTENDS=76, IMPLEMENTS=77, INTERFACE=78, ENUM=79, PROTECTED=80, STATIC=81, 
		ABSTRACT=82, NATIVE=83, SYNCHRONIZED=84, TRANSIENT=85, VOLATILE=86, BYTE=87, 
		SHORT=88, SUPER=89, THROWS=90, DEFAULT=91, ELLIPSIS=92, VAR=93, ASSERT=94, 
		TRY=95, SWITCH=96, THROW=97, CATCH=98, FINALLY=99, CASE=100, ARROW=101, 
		LSHIFT_ASSIGN=102, RSHIFT_ASSIGN=103, URSHIFT_ASSIGN=104, INSTANCEOF=105, 
		LSHIFT=106, RSHIFT=107, URSHIFT=108;
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
		RULE_localVariableDeclarationStatement = 44, RULE_statement = 45, RULE_ioStatement = 46, 
		RULE_expressionStatement = 47, RULE_catchClause = 48, RULE_catchType = 49, 
		RULE_finallyBlock = 50, RULE_forControl = 51, RULE_forInit = 52, RULE_enhancedForControl = 53, 
		RULE_forUpdate = 54, RULE_switchBlockStatementGroup = 55, RULE_switchLabel = 56, 
		RULE_constantExpression = 57, RULE_enumConstantName = 58, RULE_primary = 59, 
		RULE_ioExpression = 60, RULE_literal = 61, RULE_newExpression = 62, RULE_arguments = 63, 
		RULE_expressionList = 64, RULE_expression = 65, RULE_lambdaExpression = 66, 
		RULE_lambdaParameters = 67, RULE_lambdaBody = 68, RULE_assignmentExpression = 69, 
		RULE_assignmentOperator = 70, RULE_conditionalExpression = 71, RULE_conditionalOrExpression = 72, 
		RULE_conditionalAndExpression = 73, RULE_inclusiveOrExpression = 74, RULE_exclusiveOrExpression = 75, 
		RULE_andExpression = 76, RULE_equalityExpression = 77, RULE_relationalExpression = 78, 
		RULE_shiftExpression = 79, RULE_additiveExpression = 80, RULE_multiplicativeExpression = 81, 
		RULE_unaryExpression = 82, RULE_preIncrementExpression = 83, RULE_preDecrementExpression = 84, 
		RULE_unaryExpressionNotPlusMinus = 85, RULE_postfixExpression = 86, RULE_methodCall = 87, 
		RULE_methodCallTail = 88, RULE_castExpression = 89, RULE_parExpression = 90;
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
			"statement", "ioStatement", "expressionStatement", "catchClause", "catchType", 
			"finallyBlock", "forControl", "forInit", "enhancedForControl", "forUpdate", 
			"switchBlockStatementGroup", "switchLabel", "constantExpression", "enumConstantName", 
			"primary", "ioExpression", "literal", "newExpression", "arguments", "expressionList", 
			"expression", "lambdaExpression", "lambdaParameters", "lambdaBody", "assignmentExpression", 
			"assignmentOperator", "conditionalExpression", "conditionalOrExpression", 
			"conditionalAndExpression", "inclusiveOrExpression", "exclusiveOrExpression", 
			"andExpression", "equalityExpression", "relationalExpression", "shiftExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"preIncrementExpression", "preDecrementExpression", "unaryExpressionNotPlusMinus", 
			"postfixExpression", "methodCall", "methodCallTail", "castExpression", 
			"parExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'componenteModelo'", "'painelExterno'", "'circuitoInterno'", "'circuitoIntegradoFinal'", 
			"'sinalDeAck'", "'estadoEnergia'", "'codigoPostDisplay'", "'frequenciaMHz'", 
			"'enderecoDeBlocoEmDisco'", "'tensaoVolts'", "'taxaTransferenciaGBpsPrecisa'", 
			"'seSinalAtivo'", "'rotaDeDadosAlternativa'", "'paraCadaPinoNoConector'", 
			"'enquantoConexaoAtiva'", "'executarOperacao'", "'transmitirDadoPeloBarramento'", 
			"'mostrarDisplay'", "'lerEntradaSensor'", null, null, null, null, null, 
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
			"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
			"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
			"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
			"'^='", "'%='", null, null, null, "'new'", "'this'", "'null'", "'interromperProcesso'", 
			"'continuarFluxo'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "PUBLIC", "PRIVATE", "FINAL", "VOID", "BOOLEAN", "CHAR", 
			"INT", "LONG", "FLOAT", "DOUBLE", "IF", "ELSE", "FOR", "WHILE", "DO", 
			"RETURN", "PRINTF", "SCANF", "BOOLEAN_LITERAL", "INTEGER_LITERAL", "FLOAT_LITERAL", 
			"CHAR_LITERAL", "STRING_LITERAL", "IDENTIFIER", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", 
			"LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", 
			"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", 
			"CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LINE_COMMENT", 
			"BLOCK_COMMENT", "WS", "NEW", "THIS", "NULL_LITERAL", "BREAK", "CONTINUE", 
			"PACKAGE", "IMPORT", "EXTENDS", "IMPLEMENTS", "INTERFACE", "ENUM", "PROTECTED", 
			"STATIC", "ABSTRACT", "NATIVE", "SYNCHRONIZED", "TRANSIENT", "VOLATILE", 
			"BYTE", "SHORT", "SUPER", "THROWS", "DEFAULT", "ELLIPSIS", "VAR", "ASSERT", 
			"TRY", "SWITCH", "THROW", "CATCH", "FINALLY", "CASE", "ARROW", "LSHIFT_ASSIGN", 
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
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(182);
				packageDeclaration();
				}
			}

			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(185);
				importDeclaration();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 511L) != 0)) {
				{
				{
				setState(191);
				typeDeclaration();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
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
			setState(199);
			match(PACKAGE);
			setState(200);
			qualifiedName();
			setState(201);
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
			setState(203);
			match(IMPORT);
			setState(204);
			qualifiedName();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(205);
				match(DOT);
				setState(206);
				match(MUL);
				}
			}

			setState(209);
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
			setState(211);
			match(IDENTIFIER);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					match(DOT);
					setState(213);
					match(IDENTIFIER);
					}
					} 
				}
				setState(218);
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
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
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
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 127L) != 0)) {
				{
				{
				setState(224);
				modifier();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(CLASS);
			setState(231);
			match(IDENTIFIER);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(232);
				typeParameters();
				}
			}

			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(235);
				match(EXTENDS);
				setState(236);
				type(0);
				}
			}

			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(239);
				match(IMPLEMENTS);
				setState(240);
				typeList();
				}
			}

			setState(243);
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
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 127L) != 0)) {
				{
				{
				setState(245);
				modifier();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			match(INTERFACE);
			setState(252);
			match(IDENTIFIER);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(253);
				typeParameters();
				}
			}

			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(256);
				match(EXTENDS);
				setState(257);
				typeList();
				}
			}

			setState(260);
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
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 127L) != 0)) {
				{
				{
				setState(262);
				modifier();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			match(ENUM);
			setState(269);
			match(IDENTIFIER);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(270);
				match(IMPLEMENTS);
				setState(271);
				typeList();
				}
			}

			setState(274);
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
			setState(276);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 127L) != 0)) ) {
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
			setState(278);
			match(LT);
			setState(279);
			typeParameter();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(280);
				match(COMMA);
				setState(281);
				typeParameter();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
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
			setState(289);
			match(IDENTIFIER);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(290);
				match(EXTENDS);
				setState(291);
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
			setState(294);
			type(0);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(295);
				match(COMMA);
				setState(296);
				type(0);
				}
				}
				setState(301);
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
			setState(305);
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
				setState(303);
				primitiveType();
				}
				break;
			case IDENTIFIER:
				{
				setState(304);
				classOrInterfaceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(312);
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
					setState(307);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(308);
					match(LBRACK);
					setState(309);
					match(RBRACK);
					}
					} 
				}
				setState(314);
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
			setState(315);
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
			setState(317);
			qualifiedName();
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(318);
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
			setState(321);
			match(LT);
			setState(322);
			typeArgument();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(323);
				match(COMMA);
				setState(324);
				typeArgument();
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330);
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
			setState(338);
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
				setState(332);
				type(0);
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(QUESTION);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(334);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(335);
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
			setState(340);
			match(LBRACE);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4596961278L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 2047L) != 0)) {
				{
				{
				setState(341);
				classBodyDeclaration();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
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
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(350);
					match(STATIC);
					}
				}

				setState(353);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
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
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				constructorDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(361);
				classDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(362);
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
			setState(365);
			match(LBRACE);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4328525822L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 2047L) != 0)) {
				{
				{
				setState(366);
				interfaceBodyDeclaration();
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
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
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
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
				setState(375);
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
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(381);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(382);
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
			setState(385);
			type(0);
			setState(386);
			variableDeclaratorList();
			setState(387);
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
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 127L) != 0)) {
				{
				{
				setState(389);
				modifier();
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(395);
			typeOrVoid();
			setState(396);
			match(IDENTIFIER);
			setState(397);
			match(LPAREN);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33558492L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 511L) != 0)) {
				{
				setState(398);
				formalParameterList();
				}
			}

			setState(401);
			match(RPAREN);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(402);
				match(LBRACK);
				setState(403);
				match(RBRACK);
				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(409);
				match(THROWS);
				setState(410);
				qualifiedNameList();
				}
			}

			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(413);
				match(DEFAULT);
				setState(414);
				block();
				}
				break;
			case SEMI:
				{
				setState(415);
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
			setState(418);
			match(LBRACE);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(419);
				enumConstantList();
				}
			}

			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI || _la==COMMA) {
				{
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(422);
					match(COMMA);
					}
				}

				setState(425);
				enumBodyDeclarations();
				}
			}

			setState(428);
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
			setState(430);
			enumConstant();
			setState(435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(431);
					match(COMMA);
					setState(432);
					enumConstant();
					}
					} 
				}
				setState(437);
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
			setState(438);
			match(IDENTIFIER);
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(439);
					arguments();
					}
				}

				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(442);
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
			setState(447);
			match(SEMI);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4596961278L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 2047L) != 0)) {
				{
				{
				setState(448);
				classBodyDeclaration();
				}
				}
				setState(453);
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
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 127L) != 0)) {
				{
				{
				setState(454);
				modifier();
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(460);
			type(0);
			setState(461);
			variableDeclaratorList();
			setState(462);
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
			setState(464);
			variableDeclarator();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(465);
				match(COMMA);
				setState(466);
				variableDeclarator();
				}
				}
				setState(471);
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
			setState(472);
			match(IDENTIFIER);
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(473);
				match(LBRACK);
				setState(474);
				match(RBRACK);
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(480);
				match(ASSIGN);
				setState(481);
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
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case BOOLEAN:
			case CHAR:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case PRINTF:
			case SCANF:
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
			case NEW:
			case THIS:
			case NULL_LITERAL:
			case BYTE:
			case SHORT:
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
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
			setState(488);
			match(LBRACE);
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4222949686775776L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 1835015L) != 0)) {
				{
				setState(489);
				variableInitializer();
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(490);
						match(COMMA);
						setState(491);
						variableInitializer();
						}
						} 
					}
					setState(496);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(497);
					match(COMMA);
					}
				}

				}
			}

			setState(502);
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
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 127L) != 0)) {
				{
				{
				setState(504);
				modifier();
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(510);
			typeOrVoid();
			setState(511);
			match(IDENTIFIER);
			setState(512);
			match(LPAREN);
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33558492L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 511L) != 0)) {
				{
				setState(513);
				formalParameterList();
				}
			}

			setState(516);
			match(RPAREN);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(517);
				match(LBRACK);
				setState(518);
				match(RBRACK);
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(524);
				match(THROWS);
				setState(525);
				qualifiedNameList();
				}
			}

			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(528);
				block();
				}
				break;
			case SEMI:
				{
				setState(529);
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
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 127L) != 0)) {
				{
				{
				setState(532);
				modifier();
				}
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(538);
			match(IDENTIFIER);
			setState(539);
			match(LPAREN);
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33558492L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 511L) != 0)) {
				{
				setState(540);
				formalParameterList();
				}
			}

			setState(543);
			match(RPAREN);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(544);
				match(THROWS);
				setState(545);
				qualifiedNameList();
				}
			}

			setState(548);
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
			setState(552);
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
				setState(550);
				type(0);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
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
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				formalParameter();
				setState(559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(555);
						match(COMMA);
						setState(556);
						formalParameter();
						}
						} 
					}
					setState(561);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(562);
					match(COMMA);
					setState(563);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
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
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 127L) != 0)) {
				{
				{
				setState(569);
				modifier();
				}
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(575);
			type(0);
			setState(576);
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
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 127L) != 0)) {
				{
				{
				setState(578);
				modifier();
				}
				}
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(584);
			type(0);
			setState(585);
			match(ELLIPSIS);
			setState(586);
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
			setState(588);
			match(IDENTIFIER);
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(589);
				match(LBRACK);
				setState(590);
				match(RBRACK);
				}
				}
				setState(595);
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
			setState(596);
			qualifiedName();
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(597);
				match(COMMA);
				setState(598);
				qualifiedName();
				}
				}
				setState(603);
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
			setState(604);
			match(LBRACE);
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4222953981992958L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 522190367L) != 0)) {
				{
				{
				setState(605);
				blockStatement();
				}
				}
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(611);
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
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(615);
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
			setState(623);
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
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINAL) {
					{
					setState(618);
					match(FINAL);
					}
				}

				setState(621);
				type(0);
				}
				break;
			case VAR:
				{
				setState(622);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(625);
			variableDeclaratorList();
			setState(626);
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
		public IoStatementContext ioStatement() {
			return getRuleContext(IoStatementContext.class,0);
		}
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
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				match(ASSERT);
				setState(630);
				expression();
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(631);
					match(COLON);
					setState(632);
					expression();
					}
				}

				setState(635);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				match(IF);
				setState(638);
				parExpression();
				setState(639);
				statement();
				setState(642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(640);
					match(ELSE);
					setState(641);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(644);
				match(FOR);
				setState(645);
				match(LPAREN);
				setState(646);
				forControl();
				setState(647);
				match(RPAREN);
				setState(648);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(650);
				match(WHILE);
				setState(651);
				parExpression();
				setState(652);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(654);
				match(DO);
				setState(655);
				statement();
				setState(656);
				match(WHILE);
				setState(657);
				parExpression();
				setState(658);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(660);
				match(TRY);
				setState(661);
				block();
				setState(671);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(663); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(662);
						catchClause();
						}
						}
						setState(665); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(668);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(667);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(670);
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
				setState(673);
				match(SWITCH);
				setState(674);
				parExpression();
				setState(675);
				match(LBRACE);
				setState(679);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(676);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(681);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DEFAULT || _la==CASE) {
					{
					{
					setState(682);
					switchLabel();
					}
					}
					setState(687);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(688);
				match(RBRACE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(690);
				match(SYNCHRONIZED);
				setState(691);
				parExpression();
				setState(692);
				block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(694);
				match(RETURN);
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4222949418340320L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 1835015L) != 0)) {
					{
					setState(695);
					expression();
					}
				}

				setState(698);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(699);
				match(THROW);
				setState(700);
				expression();
				setState(701);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(703);
				match(BREAK);
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(704);
					match(IDENTIFIER);
					}
				}

				setState(707);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(708);
				match(CONTINUE);
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(709);
					match(IDENTIFIER);
					}
				}

				setState(712);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(713);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(714);
				ioStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(715);
				expressionStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(716);
				match(IDENTIFIER);
				setState(717);
				match(COLON);
				setState(718);
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
	public static class IoStatementContext extends ParserRuleContext {
		public TerminalNode PRINTF() { return getToken(ObjectOrientedParser.PRINTF, 0); }
		public TerminalNode LPAREN() { return getToken(ObjectOrientedParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjectOrientedParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ObjectOrientedParser.SEMI, 0); }
		public TerminalNode SCANF() { return getToken(ObjectOrientedParser.SCANF, 0); }
		public IoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterIoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitIoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitIoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IoStatementContext ioStatement() throws RecognitionException {
		IoStatementContext _localctx = new IoStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ioStatement);
		try {
			setState(730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTF:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				match(PRINTF);
				setState(722);
				match(LPAREN);
				setState(723);
				expression();
				setState(724);
				match(RPAREN);
				setState(725);
				match(SEMI);
				}
				break;
			case SCANF:
				enterOuterAlt(_localctx, 2);
				{
				setState(727);
				match(SCANF);
				setState(728);
				match(LPAREN);
				setState(729);
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
		enterRule(_localctx, 94, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			expression();
			setState(733);
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
		enterRule(_localctx, 96, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(CATCH);
			setState(736);
			match(LPAREN);
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 127L) != 0)) {
				{
				{
				setState(737);
				modifier();
				}
				}
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(743);
			catchType();
			setState(744);
			match(IDENTIFIER);
			setState(745);
			match(RPAREN);
			setState(746);
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
		enterRule(_localctx, 98, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			qualifiedName();
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(749);
				match(BITOR);
				setState(750);
				qualifiedName();
				}
				}
				setState(755);
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
		enterRule(_localctx, 100, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(FINALLY);
			setState(757);
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
		enterRule(_localctx, 102, RULE_forControl);
		int _la;
		try {
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4222949418340336L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 18612231L) != 0)) {
					{
					setState(760);
					forInit();
					}
				}

				setState(763);
				match(SEMI);
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4222949418340320L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 1835015L) != 0)) {
					{
					setState(764);
					expression();
					}
				}

				setState(767);
				match(SEMI);
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4222949418340320L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 1835015L) != 0)) {
					{
					setState(768);
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
		enterRule(_localctx, 104, RULE_forInit);
		int _la;
		try {
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
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
					setState(774);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINAL) {
						{
						setState(773);
						match(FINAL);
						}
					}

					setState(776);
					type(0);
					}
					break;
				case VAR:
					{
					setState(777);
					match(VAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(780);
				variableDeclaratorList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
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
		enterRule(_localctx, 106, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
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
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINAL) {
					{
					setState(784);
					match(FINAL);
					}
				}

				setState(787);
				type(0);
				}
				break;
			case VAR:
				{
				setState(788);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(791);
			variableDeclaratorId();
			setState(792);
			match(COLON);
			setState(793);
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
		enterRule(_localctx, 108, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
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
		enterRule(_localctx, 110, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(797);
				switchLabel();
				}
				}
				setState(800); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DEFAULT || _la==CASE );
			setState(803); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(802);
				blockStatement();
				}
				}
				setState(805); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4222953981992958L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 522190367L) != 0) );
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
		enterRule(_localctx, 112, RULE_switchLabel);
		try {
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				match(CASE);
				setState(808);
				constantExpression();
				setState(809);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				match(CASE);
				setState(812);
				enumConstantName();
				setState(813);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(815);
				match(DEFAULT);
				setState(816);
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
		enterRule(_localctx, 114, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
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
		enterRule(_localctx, 116, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
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
		public IoExpressionContext ioExpression() {
			return getRuleContext(IoExpressionContext.class,0);
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
		enterRule(_localctx, 118, RULE_primary);
		try {
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				match(LPAREN);
				setState(824);
				expression();
				setState(825);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(828);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(829);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(830);
				match(IDENTIFIER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(831);
				match(IDENTIFIER);
				setState(832);
				typeArguments();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(833);
				typeOrVoid();
				setState(834);
				match(DOT);
				setState(835);
				match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(837);
				match(VOID);
				setState(838);
				match(DOT);
				setState(839);
				match(CLASS);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(840);
				newExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(841);
				ioExpression();
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
	public static class IoExpressionContext extends ParserRuleContext {
		public TerminalNode SCANF() { return getToken(ObjectOrientedParser.SCANF, 0); }
		public TerminalNode LPAREN() { return getToken(ObjectOrientedParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ObjectOrientedParser.RPAREN, 0); }
		public TerminalNode PRINTF() { return getToken(ObjectOrientedParser.PRINTF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IoExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).enterIoExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectOrientedParserListener ) ((ObjectOrientedParserListener)listener).exitIoExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectOrientedParserVisitor ) return ((ObjectOrientedParserVisitor<? extends T>)visitor).visitIoExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IoExpressionContext ioExpression() throws RecognitionException {
		IoExpressionContext _localctx = new IoExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ioExpression);
		try {
			setState(852);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCANF:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				match(SCANF);
				setState(845);
				match(LPAREN);
				setState(846);
				match(RPAREN);
				}
				break;
			case PRINTF:
				enterOuterAlt(_localctx, 2);
				{
				setState(847);
				match(PRINTF);
				setState(848);
				match(LPAREN);
				setState(849);
				expression();
				setState(850);
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
		enterRule(_localctx, 122, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			_la = _input.LA(1);
			if ( !(((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & 2251799813685279L) != 0)) ) {
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
		enterRule(_localctx, 124, RULE_newExpression);
		int _la;
		try {
			int _alt;
			setState(892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				match(NEW);
				setState(857);
				classOrInterfaceType();
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(858);
					typeArguments();
					}
				}

				setState(861);
				arguments();
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(862);
					classBody();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				match(NEW);
				setState(866);
				primitiveType();
				setState(867);
				match(LBRACK);
				setState(868);
				expression();
				setState(869);
				match(RBRACK);
				setState(874);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(870);
						match(LBRACK);
						setState(871);
						match(RBRACK);
						}
						} 
					}
					setState(876);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(877);
				match(NEW);
				setState(878);
				classOrInterfaceType();
				setState(879);
				match(LBRACK);
				setState(880);
				expression();
				setState(881);
				match(RBRACK);
				setState(886);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(882);
						match(LBRACK);
						setState(883);
						match(RBRACK);
						}
						} 
					}
					setState(888);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(889);
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
		enterRule(_localctx, 126, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			match(LPAREN);
			setState(896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4222949418340320L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 1835015L) != 0)) {
				{
				setState(895);
				expressionList();
				}
			}

			setState(898);
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
		enterRule(_localctx, 128, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			expression();
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(901);
				match(COMMA);
				setState(902);
				expression();
				}
				}
				setState(907);
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
		enterRule(_localctx, 130, RULE_expression);
		try {
			setState(910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				lambdaExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
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
		enterRule(_localctx, 132, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			lambdaParameters();
			setState(913);
			match(ARROW);
			setState(914);
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
		enterRule(_localctx, 134, RULE_lambdaParameters);
		int _la;
		try {
			setState(932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(917);
				match(LPAREN);
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33558492L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 511L) != 0)) {
					{
					setState(918);
					formalParameterList();
					}
				}

				setState(921);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(922);
				match(LPAREN);
				setState(923);
				match(IDENTIFIER);
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(924);
					match(COMMA);
					setState(925);
					match(IDENTIFIER);
					}
					}
					setState(930);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(931);
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
		enterRule(_localctx, 136, RULE_lambdaBody);
		try {
			setState(936);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case BOOLEAN:
			case CHAR:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case PRINTF:
			case SCANF:
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
			case NEW:
			case THIS:
			case NULL_LITERAL:
			case BYTE:
			case SHORT:
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
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
		enterRule(_localctx, 138, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			conditionalExpression();
			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -288230341791973376L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1924145348611L) != 0)) {
				{
				{
				setState(939);
				assignmentOperator();
				setState(940);
				conditionalExpression();
				}
				}
				setState(946);
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
		enterRule(_localctx, 140, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -288230341791973376L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1924145348611L) != 0)) ) {
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
		enterRule(_localctx, 142, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			conditionalOrExpression();
			setState(955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(950);
				match(QUESTION);
				setState(951);
				expression();
				setState(952);
				match(COLON);
				setState(953);
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
		enterRule(_localctx, 144, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			conditionalAndExpression();
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(958);
				match(OR);
				setState(959);
				conditionalAndExpression();
				}
				}
				setState(964);
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
		enterRule(_localctx, 146, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			inclusiveOrExpression();
			setState(970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(966);
				match(AND);
				setState(967);
				inclusiveOrExpression();
				}
				}
				setState(972);
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
		enterRule(_localctx, 148, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			exclusiveOrExpression();
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(974);
				match(BITOR);
				setState(975);
				exclusiveOrExpression();
				}
				}
				setState(980);
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
		enterRule(_localctx, 150, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			andExpression();
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(982);
				match(CARET);
				setState(983);
				andExpression();
				}
				}
				setState(988);
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
		enterRule(_localctx, 152, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			equalityExpression();
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(990);
				match(BITAND);
				setState(991);
				equalityExpression();
				}
				}
				setState(996);
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
		enterRule(_localctx, 154, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			relationalExpression();
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(998);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(999);
				relationalExpression();
				}
				}
				setState(1004);
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
		enterRule(_localctx, 156, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			shiftExpression();
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26594437496832L) != 0) || _la==INSTANCEOF) {
				{
				setState(1010);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GT:
				case LT:
				case LE:
				case GE:
					{
					setState(1006);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 26594437496832L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1007);
					shiftExpression();
					}
					break;
				case INSTANCEOF:
					{
					setState(1008);
					match(INSTANCEOF);
					setState(1009);
					type(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1014);
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
		enterRule(_localctx, 158, RULE_shiftExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			additiveExpression();
			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 7L) != 0)) {
				{
				{
				setState(1016);
				_la = _input.LA(1);
				if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1017);
				additiveExpression();
				}
				}
				setState(1022);
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
		enterRule(_localctx, 160, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			multiplicativeExpression();
			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(1024);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1025);
				multiplicativeExpression();
				}
				}
				setState(1030);
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
		enterRule(_localctx, 162, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			unaryExpression();
			setState(1036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 157625986957967360L) != 0)) {
				{
				{
				setState(1032);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 157625986957967360L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1033);
				unaryExpression();
				}
				}
				setState(1038);
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
		enterRule(_localctx, 164, RULE_unaryExpression);
		try {
			setState(1046);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1039);
				preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1040);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(1041);
				match(ADD);
				setState(1042);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(1043);
				match(SUB);
				setState(1044);
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
			case PRINTF:
			case SCANF:
			case BOOLEAN_LITERAL:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case IDENTIFIER:
			case LPAREN:
			case BANG:
			case TILDE:
			case NEW:
			case THIS:
			case NULL_LITERAL:
			case BYTE:
			case SHORT:
			case SUPER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1045);
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
		enterRule(_localctx, 166, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(INC);
			setState(1049);
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
		enterRule(_localctx, 168, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			match(DEC);
			setState(1052);
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
		enterRule(_localctx, 170, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(1060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				match(TILDE);
				setState(1055);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1056);
				match(BANG);
				setState(1057);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1058);
				castExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1059);
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
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
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
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> THIS() { return getTokens(ObjectOrientedParser.THIS); }
		public TerminalNode THIS(int i) {
			return getToken(ObjectOrientedParser.THIS, i);
		}
		public List<TerminalNode> SUPER() { return getTokens(ObjectOrientedParser.SUPER); }
		public TerminalNode SUPER(int i) {
			return getToken(ObjectOrientedParser.SUPER, i);
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
		enterRule(_localctx, 172, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1062);
				primary();
				}
				break;
			case 2:
				{
				setState(1063);
				match(IDENTIFIER);
				setState(1065);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1064);
					typeArguments();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1067);
				match(IDENTIFIER);
				setState(1068);
				arguments();
				}
				break;
			}
			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 844443183742976L) != 0)) {
				{
				setState(1096);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(1071);
					match(DOT);
					setState(1088);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(1072);
						match(IDENTIFIER);
						setState(1074);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LPAREN) {
							{
							setState(1073);
							arguments();
							}
						}

						}
						break;
					case THIS:
						{
						setState(1076);
						match(THIS);
						}
						break;
					case SUPER:
						{
						setState(1077);
						match(SUPER);
						setState(1078);
						arguments();
						}
						break;
					case NEW:
						{
						setState(1079);
						match(NEW);
						setState(1081);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1080);
							typeArguments();
							}
						}

						setState(1083);
						classOrInterfaceType();
						setState(1084);
						arguments();
						setState(1086);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LBRACE) {
							{
							setState(1085);
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
					setState(1090);
					match(LBRACK);
					setState(1091);
					expression();
					setState(1092);
					match(RBRACK);
					}
					break;
				case INC:
					{
					setState(1094);
					match(INC);
					}
					break;
				case DEC:
					{
					setState(1095);
					match(DEC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1100);
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
		enterRule(_localctx, 174, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1101);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(1102);
				primary();
				}
				break;
			}
			setState(1105);
			arguments();
			setState(1110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1106);
				match(DOT);
				setState(1107);
				methodCallTail();
				}
				}
				setState(1112);
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
		enterRule(_localctx, 176, RULE_methodCallTail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			match(IDENTIFIER);
			setState(1114);
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
		enterRule(_localctx, 178, RULE_castExpression);
		int _la;
		try {
			setState(1133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1116);
				match(LPAREN);
				setState(1117);
				primitiveType();
				setState(1118);
				match(RPAREN);
				setState(1119);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1121);
				match(LPAREN);
				setState(1122);
				classOrInterfaceType();
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(1123);
					match(BITAND);
					setState(1124);
					classOrInterfaceType();
					}
					}
					setState(1129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1130);
				match(RPAREN);
				setState(1131);
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
		enterRule(_localctx, 180, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			match(LPAREN);
			setState(1136);
			expression();
			setState(1137);
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
		"\u0004\u0001l\u0474\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0001\u0000\u0003\u0000\u00b8\b\u0000\u0001\u0000\u0005\u0000"+
		"\u00bb\b\u0000\n\u0000\f\u0000\u00be\t\u0000\u0001\u0000\u0005\u0000\u00c1"+
		"\b\u0000\n\u0000\f\u0000\u00c4\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00d0\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u00d7\b\u0003\n\u0003\f\u0003\u00da"+
		"\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00df\b\u0004"+
		"\u0001\u0005\u0005\u0005\u00e2\b\u0005\n\u0005\f\u0005\u00e5\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ea\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00ee\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00f2"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0005\u0006\u00f7\b\u0006"+
		"\n\u0006\f\u0006\u00fa\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00ff\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0103\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0005\u0007\u0108\b\u0007\n\u0007"+
		"\f\u0007\u010b\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0111\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u011b\b\t\n\t\f\t\u011e\t\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u0125\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u012a\b\u000b\n\u000b\f\u000b\u012d\t\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u0132\b\f\u0001\f\u0001\f\u0001\f\u0005\f\u0137"+
		"\b\f\n\f\f\f\u013a\t\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0140\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u0146\b\u000f\n\u000f\f\u000f\u0149\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0151\b\u0010\u0003"+
		"\u0010\u0153\b\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u0157\b\u0011"+
		"\n\u0011\f\u0011\u015a\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0160\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0164"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u016c\b\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u0170"+
		"\b\u0014\n\u0014\f\u0014\u0173\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0179\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0180\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0005\u0018\u0187\b\u0018\n\u0018"+
		"\f\u0018\u018a\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0190\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u0195\b\u0018\n\u0018\f\u0018\u0198\t\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u019c\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01a1"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u01a5\b\u0019\u0001\u0019"+
		"\u0003\u0019\u01a8\b\u0019\u0001\u0019\u0003\u0019\u01ab\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01b2"+
		"\b\u001a\n\u001a\f\u001a\u01b5\t\u001a\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u01b9\b\u001b\u0001\u001b\u0003\u001b\u01bc\b\u001b\u0003\u001b\u01be"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0005\u001c\u01c2\b\u001c\n\u001c\f\u001c"+
		"\u01c5\t\u001c\u0001\u001d\u0005\u001d\u01c8\b\u001d\n\u001d\f\u001d\u01cb"+
		"\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u01d4\b\u001e\n\u001e\f\u001e\u01d7\t\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01dc\b\u001f\n\u001f"+
		"\f\u001f\u01df\t\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01e3\b\u001f"+
		"\u0001 \u0001 \u0003 \u01e7\b \u0001!\u0001!\u0001!\u0001!\u0005!\u01ed"+
		"\b!\n!\f!\u01f0\t!\u0001!\u0003!\u01f3\b!\u0003!\u01f5\b!\u0001!\u0001"+
		"!\u0001\"\u0005\"\u01fa\b\"\n\"\f\"\u01fd\t\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0003\"\u0203\b\"\u0001\"\u0001\"\u0001\"\u0005\"\u0208\b\"\n"+
		"\"\f\"\u020b\t\"\u0001\"\u0001\"\u0003\"\u020f\b\"\u0001\"\u0001\"\u0003"+
		"\"\u0213\b\"\u0001#\u0005#\u0216\b#\n#\f#\u0219\t#\u0001#\u0001#\u0001"+
		"#\u0003#\u021e\b#\u0001#\u0001#\u0001#\u0003#\u0223\b#\u0001#\u0001#\u0001"+
		"$\u0001$\u0003$\u0229\b$\u0001%\u0001%\u0001%\u0005%\u022e\b%\n%\f%\u0231"+
		"\t%\u0001%\u0001%\u0003%\u0235\b%\u0001%\u0003%\u0238\b%\u0001&\u0005"+
		"&\u023b\b&\n&\f&\u023e\t&\u0001&\u0001&\u0001&\u0001\'\u0005\'\u0244\b"+
		"\'\n\'\f\'\u0247\t\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0005(\u0250\b(\n(\f(\u0253\t(\u0001)\u0001)\u0001)\u0005)\u0258\b)"+
		"\n)\f)\u025b\t)\u0001*\u0001*\u0005*\u025f\b*\n*\f*\u0262\t*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0003+\u0269\b+\u0001,\u0003,\u026c\b,\u0001,\u0001"+
		",\u0003,\u0270\b,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0003-\u027a\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u0283\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0004-\u0298\b-\u000b-\f-\u0299\u0001-\u0003-\u029d\b-\u0001-\u0003"+
		"-\u02a0\b-\u0001-\u0001-\u0001-\u0001-\u0005-\u02a6\b-\n-\f-\u02a9\t-"+
		"\u0001-\u0005-\u02ac\b-\n-\f-\u02af\t-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0003-\u02b9\b-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0003-\u02c2\b-\u0001-\u0001-\u0001-\u0003-\u02c7\b-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u02d0\b-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u02db\b.\u0001"+
		"/\u0001/\u0001/\u00010\u00010\u00010\u00050\u02e3\b0\n0\f0\u02e6\t0\u0001"+
		"0\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00051\u02f0\b1\n1"+
		"\f1\u02f3\t1\u00012\u00012\u00012\u00013\u00013\u00033\u02fa\b3\u0001"+
		"3\u00013\u00033\u02fe\b3\u00013\u00013\u00033\u0302\b3\u00033\u0304\b"+
		"3\u00014\u00034\u0307\b4\u00014\u00014\u00034\u030b\b4\u00014\u00014\u0003"+
		"4\u030f\b4\u00015\u00035\u0312\b5\u00015\u00015\u00035\u0316\b5\u0001"+
		"5\u00015\u00015\u00015\u00016\u00016\u00017\u00047\u031f\b7\u000b7\f7"+
		"\u0320\u00017\u00047\u0324\b7\u000b7\f7\u0325\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00038\u0332\b8\u00019\u0001"+
		"9\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0003;\u034b\b;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0003<\u0355\b<\u0001=\u0001=\u0001>\u0001>\u0001>\u0003>\u035c"+
		"\b>\u0001>\u0001>\u0003>\u0360\b>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0005>\u0369\b>\n>\f>\u036c\t>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0005>\u0375\b>\n>\f>\u0378\t>\u0001>\u0003>\u037b\b>"+
		"\u0003>\u037d\b>\u0001?\u0001?\u0003?\u0381\b?\u0001?\u0001?\u0001@\u0001"+
		"@\u0001@\u0005@\u0388\b@\n@\f@\u038b\t@\u0001A\u0001A\u0003A\u038f\bA"+
		"\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0003C\u0398\bC\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0005C\u039f\bC\nC\fC\u03a2\tC\u0001C\u0003"+
		"C\u03a5\bC\u0001D\u0001D\u0003D\u03a9\bD\u0001E\u0001E\u0001E\u0001E\u0005"+
		"E\u03af\bE\nE\fE\u03b2\tE\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0003G\u03bc\bG\u0001H\u0001H\u0001H\u0005H\u03c1\bH\nH\fH\u03c4"+
		"\tH\u0001I\u0001I\u0001I\u0005I\u03c9\bI\nI\fI\u03cc\tI\u0001J\u0001J"+
		"\u0001J\u0005J\u03d1\bJ\nJ\fJ\u03d4\tJ\u0001K\u0001K\u0001K\u0005K\u03d9"+
		"\bK\nK\fK\u03dc\tK\u0001L\u0001L\u0001L\u0005L\u03e1\bL\nL\fL\u03e4\t"+
		"L\u0001M\u0001M\u0001M\u0005M\u03e9\bM\nM\fM\u03ec\tM\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0005N\u03f3\bN\nN\fN\u03f6\tN\u0001O\u0001O\u0001O\u0005"+
		"O\u03fb\bO\nO\fO\u03fe\tO\u0001P\u0001P\u0001P\u0005P\u0403\bP\nP\fP\u0406"+
		"\tP\u0001Q\u0001Q\u0001Q\u0005Q\u040b\bQ\nQ\fQ\u040e\tQ\u0001R\u0001R"+
		"\u0001R\u0001R\u0001R\u0001R\u0001R\u0003R\u0417\bR\u0001S\u0001S\u0001"+
		"S\u0001T\u0001T\u0001T\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0003"+
		"U\u0425\bU\u0001V\u0001V\u0001V\u0003V\u042a\bV\u0001V\u0001V\u0003V\u042e"+
		"\bV\u0001V\u0001V\u0001V\u0003V\u0433\bV\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0003V\u043a\bV\u0001V\u0001V\u0001V\u0003V\u043f\bV\u0003V\u0441\b"+
		"V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0005V\u0449\bV\nV\fV\u044c"+
		"\tV\u0001W\u0001W\u0003W\u0450\bW\u0001W\u0001W\u0001W\u0005W\u0455\b"+
		"W\nW\fW\u0458\tW\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0001Y\u0001Y\u0001Y\u0001Y\u0005Y\u0466\bY\nY\fY\u0469\tY\u0001Y\u0001"+
		"Y\u0001Y\u0003Y\u046e\bY\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0000\u0001"+
		"\u0018[\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u0000\n\u0002\u0000\u0002\u0004PV\u0002\u0000\u0006\u000b"+
		"WX\u0002\u0000LLYY\u0002\u0000\u0014\u0018GG\u0003\u0000##:Afh\u0002\u0000"+
		"**--\u0002\u0000$%+,\u0001\u0000jl\u0001\u000023\u0002\u00004599\u04d2"+
		"\u0000\u00b7\u0001\u0000\u0000\u0000\u0002\u00c7\u0001\u0000\u0000\u0000"+
		"\u0004\u00cb\u0001\u0000\u0000\u0000\u0006\u00d3\u0001\u0000\u0000\u0000"+
		"\b\u00de\u0001\u0000\u0000\u0000\n\u00e3\u0001\u0000\u0000\u0000\f\u00f8"+
		"\u0001\u0000\u0000\u0000\u000e\u0109\u0001\u0000\u0000\u0000\u0010\u0114"+
		"\u0001\u0000\u0000\u0000\u0012\u0116\u0001\u0000\u0000\u0000\u0014\u0121"+
		"\u0001\u0000\u0000\u0000\u0016\u0126\u0001\u0000\u0000\u0000\u0018\u0131"+
		"\u0001\u0000\u0000\u0000\u001a\u013b\u0001\u0000\u0000\u0000\u001c\u013d"+
		"\u0001\u0000\u0000\u0000\u001e\u0141\u0001\u0000\u0000\u0000 \u0152\u0001"+
		"\u0000\u0000\u0000\"\u0154\u0001\u0000\u0000\u0000$\u0163\u0001\u0000"+
		"\u0000\u0000&\u016b\u0001\u0000\u0000\u0000(\u016d\u0001\u0000\u0000\u0000"+
		"*\u0178\u0001\u0000\u0000\u0000,\u017f\u0001\u0000\u0000\u0000.\u0181"+
		"\u0001\u0000\u0000\u00000\u0188\u0001\u0000\u0000\u00002\u01a2\u0001\u0000"+
		"\u0000\u00004\u01ae\u0001\u0000\u0000\u00006\u01b6\u0001\u0000\u0000\u0000"+
		"8\u01bf\u0001\u0000\u0000\u0000:\u01c9\u0001\u0000\u0000\u0000<\u01d0"+
		"\u0001\u0000\u0000\u0000>\u01d8\u0001\u0000\u0000\u0000@\u01e6\u0001\u0000"+
		"\u0000\u0000B\u01e8\u0001\u0000\u0000\u0000D\u01fb\u0001\u0000\u0000\u0000"+
		"F\u0217\u0001\u0000\u0000\u0000H\u0228\u0001\u0000\u0000\u0000J\u0237"+
		"\u0001\u0000\u0000\u0000L\u023c\u0001\u0000\u0000\u0000N\u0245\u0001\u0000"+
		"\u0000\u0000P\u024c\u0001\u0000\u0000\u0000R\u0254\u0001\u0000\u0000\u0000"+
		"T\u025c\u0001\u0000\u0000\u0000V\u0268\u0001\u0000\u0000\u0000X\u026f"+
		"\u0001\u0000\u0000\u0000Z\u02cf\u0001\u0000\u0000\u0000\\\u02da\u0001"+
		"\u0000\u0000\u0000^\u02dc\u0001\u0000\u0000\u0000`\u02df\u0001\u0000\u0000"+
		"\u0000b\u02ec\u0001\u0000\u0000\u0000d\u02f4\u0001\u0000\u0000\u0000f"+
		"\u0303\u0001\u0000\u0000\u0000h\u030e\u0001\u0000\u0000\u0000j\u0315\u0001"+
		"\u0000\u0000\u0000l\u031b\u0001\u0000\u0000\u0000n\u031e\u0001\u0000\u0000"+
		"\u0000p\u0331\u0001\u0000\u0000\u0000r\u0333\u0001\u0000\u0000\u0000t"+
		"\u0335\u0001\u0000\u0000\u0000v\u034a\u0001\u0000\u0000\u0000x\u0354\u0001"+
		"\u0000\u0000\u0000z\u0356\u0001\u0000\u0000\u0000|\u037c\u0001\u0000\u0000"+
		"\u0000~\u037e\u0001\u0000\u0000\u0000\u0080\u0384\u0001\u0000\u0000\u0000"+
		"\u0082\u038e\u0001\u0000\u0000\u0000\u0084\u0390\u0001\u0000\u0000\u0000"+
		"\u0086\u03a4\u0001\u0000\u0000\u0000\u0088\u03a8\u0001\u0000\u0000\u0000"+
		"\u008a\u03aa\u0001\u0000\u0000\u0000\u008c\u03b3\u0001\u0000\u0000\u0000"+
		"\u008e\u03b5\u0001\u0000\u0000\u0000\u0090\u03bd\u0001\u0000\u0000\u0000"+
		"\u0092\u03c5\u0001\u0000\u0000\u0000\u0094\u03cd\u0001\u0000\u0000\u0000"+
		"\u0096\u03d5\u0001\u0000\u0000\u0000\u0098\u03dd\u0001\u0000\u0000\u0000"+
		"\u009a\u03e5\u0001\u0000\u0000\u0000\u009c\u03ed\u0001\u0000\u0000\u0000"+
		"\u009e\u03f7\u0001\u0000\u0000\u0000\u00a0\u03ff\u0001\u0000\u0000\u0000"+
		"\u00a2\u0407\u0001\u0000\u0000\u0000\u00a4\u0416\u0001\u0000\u0000\u0000"+
		"\u00a6\u0418\u0001\u0000\u0000\u0000\u00a8\u041b\u0001\u0000\u0000\u0000"+
		"\u00aa\u0424\u0001\u0000\u0000\u0000\u00ac\u042d\u0001\u0000\u0000\u0000"+
		"\u00ae\u044f\u0001\u0000\u0000\u0000\u00b0\u0459\u0001\u0000\u0000\u0000"+
		"\u00b2\u046d\u0001\u0000\u0000\u0000\u00b4\u046f\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b8\u0003\u0002\u0001\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00bc\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bb\u0003\u0004\u0002\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00c2\u0001\u0000\u0000\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c1\u0003\b\u0004\u0000\u00c0"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0005\u0000\u0000\u0001\u00c6\u0001\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0005J\u0000\u0000\u00c8\u00c9\u0003\u0006\u0003\u0000\u00c9\u00ca"+
		"\u0005 \u0000\u0000\u00ca\u0003\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005"+
		"K\u0000\u0000\u00cc\u00cf\u0003\u0006\u0003\u0000\u00cd\u00ce\u0005\""+
		"\u0000\u0000\u00ce\u00d0\u00054\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0005 \u0000\u0000\u00d2\u0005\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d8\u0005\u0019\u0000\u0000\u00d4\u00d5\u0005\"\u0000\u0000\u00d5"+
		"\u00d7\u0005\u0019\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7"+
		"\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d9\u0007\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00db\u00df\u0003\n\u0005\u0000\u00dc\u00df"+
		"\u0003\f\u0006\u0000\u00dd\u00df\u0003\u000e\u0007\u0000\u00de\u00db\u0001"+
		"\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00dd\u0001"+
		"\u0000\u0000\u0000\u00df\t\u0001\u0000\u0000\u0000\u00e0\u00e2\u0003\u0010"+
		"\b\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0005\u0001\u0000\u0000\u00e7\u00e9\u0005\u0019\u0000"+
		"\u0000\u00e8\u00ea\u0003\u0012\t\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0005L\u0000\u0000\u00ec\u00ee\u0003\u0018\f\u0000\u00ed"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee"+
		"\u00f1\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005M\u0000\u0000\u00f0\u00f2"+
		"\u0003\u0016\u000b\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0003\"\u0011\u0000\u00f4\u000b\u0001\u0000\u0000\u0000\u00f5\u00f7\u0003"+
		"\u0010\b\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0005N\u0000\u0000\u00fc\u00fe\u0005\u0019\u0000"+
		"\u0000\u00fd\u00ff\u0003\u0012\t\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0005L\u0000\u0000\u0101\u0103\u0003\u0016\u000b\u0000\u0102"+
		"\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0003(\u0014\u0000\u0105\r"+
		"\u0001\u0000\u0000\u0000\u0106\u0108\u0003\u0010\b\u0000\u0107\u0106\u0001"+
		"\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010c\u0001"+
		"\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010d\u0005"+
		"O\u0000\u0000\u010d\u0110\u0005\u0019\u0000\u0000\u010e\u010f\u0005M\u0000"+
		"\u0000\u010f\u0111\u0003\u0016\u000b\u0000\u0110\u010e\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u00032\u0019\u0000\u0113\u000f\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0007\u0000\u0000\u0000\u0115\u0011\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0005%\u0000\u0000\u0117\u011c\u0003\u0014\n\u0000\u0118"+
		"\u0119\u0005!\u0000\u0000\u0119\u011b\u0003\u0014\n\u0000\u011a\u0118"+
		"\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011a"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011f"+
		"\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0005$\u0000\u0000\u0120\u0013\u0001\u0000\u0000\u0000\u0121\u0124\u0005"+
		"\u0019\u0000\u0000\u0122\u0123\u0005L\u0000\u0000\u0123\u0125\u0003\u0018"+
		"\f\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000"+
		"\u0000\u0125\u0015\u0001\u0000\u0000\u0000\u0126\u012b\u0003\u0018\f\u0000"+
		"\u0127\u0128\u0005!\u0000\u0000\u0128\u012a\u0003\u0018\f\u0000\u0129"+
		"\u0127\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000\u012b"+
		"\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c"+
		"\u0017\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0006\f\uffff\uffff\u0000\u012f\u0132\u0003\u001a\r\u0000\u0130"+
		"\u0132\u0003\u001c\u000e\u0000\u0131\u012e\u0001\u0000\u0000\u0000\u0131"+
		"\u0130\u0001\u0000\u0000\u0000\u0132\u0138\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\n\u0001\u0000\u0000\u0134\u0135\u0005\u001e\u0000\u0000\u0135\u0137"+
		"\u0005\u001f\u0000\u0000\u0136\u0133\u0001\u0000\u0000\u0000\u0137\u013a"+
		"\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0001\u0000\u0000\u0000\u0139\u0019\u0001\u0000\u0000\u0000\u013a\u0138"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0007\u0001\u0000\u0000\u013c\u001b"+
		"\u0001\u0000\u0000\u0000\u013d\u013f\u0003\u0006\u0003\u0000\u013e\u0140"+
		"\u0003\u001e\u000f\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0001\u0000\u0000\u0000\u0140\u001d\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u0005%\u0000\u0000\u0142\u0147\u0003 \u0010\u0000\u0143\u0144\u0005!"+
		"\u0000\u0000\u0144\u0146\u0003 \u0010\u0000\u0145\u0143\u0001\u0000\u0000"+
		"\u0000\u0146\u0149\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u014a\u0001\u0000\u0000"+
		"\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u014a\u014b\u0005$\u0000\u0000"+
		"\u014b\u001f\u0001\u0000\u0000\u0000\u014c\u0153\u0003\u0018\f\u0000\u014d"+
		"\u0150\u0005(\u0000\u0000\u014e\u014f\u0007\u0002\u0000\u0000\u014f\u0151"+
		"\u0003\u0018\f\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001"+
		"\u0000\u0000\u0000\u0151\u0153\u0001\u0000\u0000\u0000\u0152\u014c\u0001"+
		"\u0000\u0000\u0000\u0152\u014d\u0001\u0000\u0000\u0000\u0153!\u0001\u0000"+
		"\u0000\u0000\u0154\u0158\u0005\u001c\u0000\u0000\u0155\u0157\u0003$\u0012"+
		"\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000"+
		"\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000"+
		"\u0000\u0159\u015b\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000"+
		"\u0000\u015b\u015c\u0005\u001d\u0000\u0000\u015c#\u0001\u0000\u0000\u0000"+
		"\u015d\u0164\u0005 \u0000\u0000\u015e\u0160\u0005Q\u0000\u0000\u015f\u015e"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161"+
		"\u0001\u0000\u0000\u0000\u0161\u0164\u0003T*\u0000\u0162\u0164\u0003&"+
		"\u0013\u0000\u0163\u015d\u0001\u0000\u0000\u0000\u0163\u015f\u0001\u0000"+
		"\u0000\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0164%\u0001\u0000\u0000"+
		"\u0000\u0165\u016c\u0003:\u001d\u0000\u0166\u016c\u0003D\"\u0000\u0167"+
		"\u016c\u0003F#\u0000\u0168\u016c\u0003\f\u0006\u0000\u0169\u016c\u0003"+
		"\n\u0005\u0000\u016a\u016c\u0003\u000e\u0007\u0000\u016b\u0165\u0001\u0000"+
		"\u0000\u0000\u016b\u0166\u0001\u0000\u0000\u0000\u016b\u0167\u0001\u0000"+
		"\u0000\u0000\u016b\u0168\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000"+
		"\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c\'\u0001\u0000\u0000"+
		"\u0000\u016d\u0171\u0005\u001c\u0000\u0000\u016e\u0170\u0003*\u0015\u0000"+
		"\u016f\u016e\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000"+
		"\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000"+
		"\u0172\u0174\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0005\u001d\u0000\u0000\u0175)\u0001\u0000\u0000\u0000\u0176"+
		"\u0179\u0005 \u0000\u0000\u0177\u0179\u0003,\u0016\u0000\u0178\u0176\u0001"+
		"\u0000\u0000\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0179+\u0001\u0000"+
		"\u0000\u0000\u017a\u0180\u0003.\u0017\u0000\u017b\u0180\u00030\u0018\u0000"+
		"\u017c\u0180\u0003\f\u0006\u0000\u017d\u0180\u0003\n\u0005\u0000\u017e"+
		"\u0180\u0003\u000e\u0007\u0000\u017f\u017a\u0001\u0000\u0000\u0000\u017f"+
		"\u017b\u0001\u0000\u0000\u0000\u017f\u017c\u0001\u0000\u0000\u0000\u017f"+
		"\u017d\u0001\u0000\u0000\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u0180"+
		"-\u0001\u0000\u0000\u0000\u0181\u0182\u0003\u0018\f\u0000\u0182\u0183"+
		"\u0003<\u001e\u0000\u0183\u0184\u0005 \u0000\u0000\u0184/\u0001\u0000"+
		"\u0000\u0000\u0185\u0187\u0003\u0010\b\u0000\u0186\u0185\u0001\u0000\u0000"+
		"\u0000\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000"+
		"\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018b\u0001\u0000\u0000"+
		"\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u018c\u0003H$\u0000\u018c"+
		"\u018d\u0005\u0019\u0000\u0000\u018d\u018f\u0005\u001a\u0000\u0000\u018e"+
		"\u0190\u0003J%\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u018f\u0190\u0001"+
		"\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0196\u0005"+
		"\u001b\u0000\u0000\u0192\u0193\u0005\u001e\u0000\u0000\u0193\u0195\u0005"+
		"\u001f\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195\u0198\u0001"+
		"\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001"+
		"\u0000\u0000\u0000\u0197\u019b\u0001\u0000\u0000\u0000\u0198\u0196\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\u0005Z\u0000\u0000\u019a\u019c\u0003R)"+
		"\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000"+
		"\u0000\u019c\u01a0\u0001\u0000\u0000\u0000\u019d\u019e\u0005[\u0000\u0000"+
		"\u019e\u01a1\u0003T*\u0000\u019f\u01a1\u0005 \u0000\u0000\u01a0\u019d"+
		"\u0001\u0000\u0000\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a11\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a4\u0005\u001c\u0000\u0000\u01a3\u01a5\u0003"+
		"4\u001a\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a5\u01aa\u0001\u0000\u0000\u0000\u01a6\u01a8\u0005!\u0000"+
		"\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u00038\u001c\u0000"+
		"\u01aa\u01a7\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005\u001d\u0000\u0000"+
		"\u01ad3\u0001\u0000\u0000\u0000\u01ae\u01b3\u00036\u001b\u0000\u01af\u01b0"+
		"\u0005!\u0000\u0000\u01b0\u01b2\u00036\u001b\u0000\u01b1\u01af\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b5\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b45\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6\u01bd\u0005\u0019\u0000"+
		"\u0000\u01b7\u01b9\u0003~?\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b9\u0001\u0000\u0000\u0000\u01b9\u01bb\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bc\u0003\"\u0011\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc"+
		"\u0001\u0000\u0000\u0000\u01bc\u01be\u0001\u0000\u0000\u0000\u01bd\u01b8"+
		"\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be7\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c3\u0005 \u0000\u0000\u01c0\u01c2\u0003$\u0012"+
		"\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c49\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c8\u0003\u0010\b\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c8"+
		"\u01cb\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9"+
		"\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cc\u0001\u0000\u0000\u0000\u01cb"+
		"\u01c9\u0001\u0000\u0000\u0000\u01cc\u01cd\u0003\u0018\f\u0000\u01cd\u01ce"+
		"\u0003<\u001e\u0000\u01ce\u01cf\u0005 \u0000\u0000\u01cf;\u0001\u0000"+
		"\u0000\u0000\u01d0\u01d5\u0003>\u001f\u0000\u01d1\u01d2\u0005!\u0000\u0000"+
		"\u01d2\u01d4\u0003>\u001f\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d6=\u0001\u0000\u0000\u0000\u01d7\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d8\u01dd\u0005\u0019\u0000\u0000\u01d9\u01da"+
		"\u0005\u001e\u0000\u0000\u01da\u01dc\u0005\u001f\u0000\u0000\u01db\u01d9"+
		"\u0001\u0000\u0000\u0000\u01dc\u01df\u0001\u0000\u0000\u0000\u01dd\u01db"+
		"\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01e2"+
		"\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01e0\u01e1"+
		"\u0005#\u0000\u0000\u01e1\u01e3\u0003@ \u0000\u01e2\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3?\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e7\u0003\u0082A\u0000\u01e5\u01e7\u0003B!\u0000\u01e6"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e7"+
		"A\u0001\u0000\u0000\u0000\u01e8\u01f4\u0005\u001c\u0000\u0000\u01e9\u01ee"+
		"\u0003@ \u0000\u01ea\u01eb\u0005!\u0000\u0000\u01eb\u01ed\u0003@ \u0000"+
		"\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ed\u01f0\u0001\u0000\u0000\u0000"+
		"\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000"+
		"\u01ef\u01f2\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f3\u0005!\u0000\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f5\u0001\u0000\u0000\u0000\u01f4"+
		"\u01e9\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005\u001d\u0000\u0000\u01f7"+
		"C\u0001\u0000\u0000\u0000\u01f8\u01fa\u0003\u0010\b\u0000\u01f9\u01f8"+
		"\u0001\u0000\u0000\u0000\u01fa\u01fd\u0001\u0000\u0000\u0000\u01fb\u01f9"+
		"\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fe"+
		"\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u01ff"+
		"\u0003H$\u0000\u01ff\u0200\u0005\u0019\u0000\u0000\u0200\u0202\u0005\u001a"+
		"\u0000\u0000\u0201\u0203\u0003J%\u0000\u0202\u0201\u0001\u0000\u0000\u0000"+
		"\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000"+
		"\u0204\u0209\u0005\u001b\u0000\u0000\u0205\u0206\u0005\u001e\u0000\u0000"+
		"\u0206\u0208\u0005\u001f\u0000\u0000\u0207\u0205\u0001\u0000\u0000\u0000"+
		"\u0208\u020b\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000"+
		"\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020e\u0001\u0000\u0000\u0000"+
		"\u020b\u0209\u0001\u0000\u0000\u0000\u020c\u020d\u0005Z\u0000\u0000\u020d"+
		"\u020f\u0003R)\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020f\u0001"+
		"\u0000\u0000\u0000\u020f\u0212\u0001\u0000\u0000\u0000\u0210\u0213\u0003"+
		"T*\u0000\u0211\u0213\u0005 \u0000\u0000\u0212\u0210\u0001\u0000\u0000"+
		"\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0213E\u0001\u0000\u0000\u0000"+
		"\u0214\u0216\u0003\u0010\b\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0216"+
		"\u0219\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0217"+
		"\u0218\u0001\u0000\u0000\u0000\u0218\u021a\u0001\u0000\u0000\u0000\u0219"+
		"\u0217\u0001\u0000\u0000\u0000\u021a\u021b\u0005\u0019\u0000\u0000\u021b"+
		"\u021d\u0005\u001a\u0000\u0000\u021c\u021e\u0003J%\u0000\u021d\u021c\u0001"+
		"\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u021f\u0001"+
		"\u0000\u0000\u0000\u021f\u0222\u0005\u001b\u0000\u0000\u0220\u0221\u0005"+
		"Z\u0000\u0000\u0221\u0223\u0003R)\u0000\u0222\u0220\u0001\u0000\u0000"+
		"\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000"+
		"\u0000\u0224\u0225\u0003T*\u0000\u0225G\u0001\u0000\u0000\u0000\u0226"+
		"\u0229\u0003\u0018\f\u0000\u0227\u0229\u0005\u0005\u0000\u0000\u0228\u0226"+
		"\u0001\u0000\u0000\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0229I\u0001"+
		"\u0000\u0000\u0000\u022a\u022f\u0003L&\u0000\u022b\u022c\u0005!\u0000"+
		"\u0000\u022c\u022e\u0003L&\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022e"+
		"\u0231\u0001\u0000\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u022f"+
		"\u0230\u0001\u0000\u0000\u0000\u0230\u0234\u0001\u0000\u0000\u0000\u0231"+
		"\u022f\u0001\u0000\u0000\u0000\u0232\u0233\u0005!\u0000\u0000\u0233\u0235"+
		"\u0003N\'\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0234\u0235\u0001"+
		"\u0000\u0000\u0000\u0235\u0238\u0001\u0000\u0000\u0000\u0236\u0238\u0003"+
		"N\'\u0000\u0237\u022a\u0001\u0000\u0000\u0000\u0237\u0236\u0001\u0000"+
		"\u0000\u0000\u0238K\u0001\u0000\u0000\u0000\u0239\u023b\u0003\u0010\b"+
		"\u0000\u023a\u0239\u0001\u0000\u0000\u0000\u023b\u023e\u0001\u0000\u0000"+
		"\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000"+
		"\u0000\u023d\u023f\u0001\u0000\u0000\u0000\u023e\u023c\u0001\u0000\u0000"+
		"\u0000\u023f\u0240\u0003\u0018\f\u0000\u0240\u0241\u0003P(\u0000\u0241"+
		"M\u0001\u0000\u0000\u0000\u0242\u0244\u0003\u0010\b\u0000\u0243\u0242"+
		"\u0001\u0000\u0000\u0000\u0244\u0247\u0001\u0000\u0000\u0000\u0245\u0243"+
		"\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0248"+
		"\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0248\u0249"+
		"\u0003\u0018\f\u0000\u0249\u024a\u0005\\\u0000\u0000\u024a\u024b\u0003"+
		"P(\u0000\u024bO\u0001\u0000\u0000\u0000\u024c\u0251\u0005\u0019\u0000"+
		"\u0000\u024d\u024e\u0005\u001e\u0000\u0000\u024e\u0250\u0005\u001f\u0000"+
		"\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u0250\u0253\u0001\u0000\u0000"+
		"\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0251\u0252\u0001\u0000\u0000"+
		"\u0000\u0252Q\u0001\u0000\u0000\u0000\u0253\u0251\u0001\u0000\u0000\u0000"+
		"\u0254\u0259\u0003\u0006\u0003\u0000\u0255\u0256\u0005!\u0000\u0000\u0256"+
		"\u0258\u0003\u0006\u0003\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0258"+
		"\u025b\u0001\u0000\u0000\u0000\u0259\u0257\u0001\u0000\u0000\u0000\u0259"+
		"\u025a\u0001\u0000\u0000\u0000\u025aS\u0001\u0000\u0000\u0000\u025b\u0259"+
		"\u0001\u0000\u0000\u0000\u025c\u0260\u0005\u001c\u0000\u0000\u025d\u025f"+
		"\u0003V+\u0000\u025e\u025d\u0001\u0000\u0000\u0000\u025f\u0262\u0001\u0000"+
		"\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000"+
		"\u0000\u0000\u0261\u0263\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000"+
		"\u0000\u0000\u0263\u0264\u0005\u001d\u0000\u0000\u0264U\u0001\u0000\u0000"+
		"\u0000\u0265\u0269\u0003X,\u0000\u0266\u0269\u0003Z-\u0000\u0267\u0269"+
		"\u0003\b\u0004\u0000\u0268\u0265\u0001\u0000\u0000\u0000\u0268\u0266\u0001"+
		"\u0000\u0000\u0000\u0268\u0267\u0001\u0000\u0000\u0000\u0269W\u0001\u0000"+
		"\u0000\u0000\u026a\u026c\u0005\u0004\u0000\u0000\u026b\u026a\u0001\u0000"+
		"\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000"+
		"\u0000\u0000\u026d\u0270\u0003\u0018\f\u0000\u026e\u0270\u0005]\u0000"+
		"\u0000\u026f\u026b\u0001\u0000\u0000\u0000\u026f\u026e\u0001\u0000\u0000"+
		"\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0272\u0003<\u001e\u0000"+
		"\u0272\u0273\u0005 \u0000\u0000\u0273Y\u0001\u0000\u0000\u0000\u0274\u02d0"+
		"\u0003T*\u0000\u0275\u0276\u0005^\u0000\u0000\u0276\u0279\u0003\u0082"+
		"A\u0000\u0277\u0278\u0005)\u0000\u0000\u0278\u027a\u0003\u0082A\u0000"+
		"\u0279\u0277\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000"+
		"\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u027c\u0005 \u0000\u0000\u027c"+
		"\u02d0\u0001\u0000\u0000\u0000\u027d\u027e\u0005\f\u0000\u0000\u027e\u027f"+
		"\u0003\u00b4Z\u0000\u027f\u0282\u0003Z-\u0000\u0280\u0281\u0005\r\u0000"+
		"\u0000\u0281\u0283\u0003Z-\u0000\u0282\u0280\u0001\u0000\u0000\u0000\u0282"+
		"\u0283\u0001\u0000\u0000\u0000\u0283\u02d0\u0001\u0000\u0000\u0000\u0284"+
		"\u0285\u0005\u000e\u0000\u0000\u0285\u0286\u0005\u001a\u0000\u0000\u0286"+
		"\u0287\u0003f3\u0000\u0287\u0288\u0005\u001b\u0000\u0000\u0288\u0289\u0003"+
		"Z-\u0000\u0289\u02d0\u0001\u0000\u0000\u0000\u028a\u028b\u0005\u000f\u0000"+
		"\u0000\u028b\u028c\u0003\u00b4Z\u0000\u028c\u028d\u0003Z-\u0000\u028d"+
		"\u02d0\u0001\u0000\u0000\u0000\u028e\u028f\u0005\u0010\u0000\u0000\u028f"+
		"\u0290\u0003Z-\u0000\u0290\u0291\u0005\u000f\u0000\u0000\u0291\u0292\u0003"+
		"\u00b4Z\u0000\u0292\u0293\u0005 \u0000\u0000\u0293\u02d0\u0001\u0000\u0000"+
		"\u0000\u0294\u0295\u0005_\u0000\u0000\u0295\u029f\u0003T*\u0000\u0296"+
		"\u0298\u0003`0\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0298\u0299\u0001"+
		"\u0000\u0000\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u0299\u029a\u0001"+
		"\u0000\u0000\u0000\u029a\u029c\u0001\u0000\u0000\u0000\u029b\u029d\u0003"+
		"d2\u0000\u029c\u029b\u0001\u0000\u0000\u0000\u029c\u029d\u0001\u0000\u0000"+
		"\u0000\u029d\u02a0\u0001\u0000\u0000\u0000\u029e\u02a0\u0003d2\u0000\u029f"+
		"\u0297\u0001\u0000\u0000\u0000\u029f\u029e\u0001\u0000\u0000\u0000\u02a0"+
		"\u02d0\u0001\u0000\u0000\u0000\u02a1\u02a2\u0005`\u0000\u0000\u02a2\u02a3"+
		"\u0003\u00b4Z\u0000\u02a3\u02a7\u0005\u001c\u0000\u0000\u02a4\u02a6\u0003"+
		"n7\u0000\u02a5\u02a4\u0001\u0000\u0000\u0000\u02a6\u02a9\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000"+
		"\u0000\u02a8\u02ad\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000"+
		"\u0000\u02aa\u02ac\u0003p8\u0000\u02ab\u02aa\u0001\u0000\u0000\u0000\u02ac"+
		"\u02af\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ad"+
		"\u02ae\u0001\u0000\u0000\u0000\u02ae\u02b0\u0001\u0000\u0000\u0000\u02af"+
		"\u02ad\u0001\u0000\u0000\u0000\u02b0\u02b1\u0005\u001d\u0000\u0000\u02b1"+
		"\u02d0\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005T\u0000\u0000\u02b3\u02b4"+
		"\u0003\u00b4Z\u0000\u02b4\u02b5\u0003T*\u0000\u02b5\u02d0\u0001\u0000"+
		"\u0000\u0000\u02b6\u02b8\u0005\u0011\u0000\u0000\u02b7\u02b9\u0003\u0082"+
		"A\u0000\u02b8\u02b7\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000"+
		"\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba\u02d0\u0005 \u0000\u0000"+
		"\u02bb\u02bc\u0005a\u0000\u0000\u02bc\u02bd\u0003\u0082A\u0000\u02bd\u02be"+
		"\u0005 \u0000\u0000\u02be\u02d0\u0001\u0000\u0000\u0000\u02bf\u02c1\u0005"+
		"H\u0000\u0000\u02c0\u02c2\u0005\u0019\u0000\u0000\u02c1\u02c0\u0001\u0000"+
		"\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000"+
		"\u0000\u0000\u02c3\u02d0\u0005 \u0000\u0000\u02c4\u02c6\u0005I\u0000\u0000"+
		"\u02c5\u02c7\u0005\u0019\u0000\u0000\u02c6\u02c5\u0001\u0000\u0000\u0000"+
		"\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000"+
		"\u02c8\u02d0\u0005 \u0000\u0000\u02c9\u02d0\u0005 \u0000\u0000\u02ca\u02d0"+
		"\u0003\\.\u0000\u02cb\u02d0\u0003^/\u0000\u02cc\u02cd\u0005\u0019\u0000"+
		"\u0000\u02cd\u02ce\u0005)\u0000\u0000\u02ce\u02d0\u0003Z-\u0000\u02cf"+
		"\u0274\u0001\u0000\u0000\u0000\u02cf\u0275\u0001\u0000\u0000\u0000\u02cf"+
		"\u027d\u0001\u0000\u0000\u0000\u02cf\u0284\u0001\u0000\u0000\u0000\u02cf"+
		"\u028a\u0001\u0000\u0000\u0000\u02cf\u028e\u0001\u0000\u0000\u0000\u02cf"+
		"\u0294\u0001\u0000\u0000\u0000\u02cf\u02a1\u0001\u0000\u0000\u0000\u02cf"+
		"\u02b2\u0001\u0000\u0000\u0000\u02cf\u02b6\u0001\u0000\u0000\u0000\u02cf"+
		"\u02bb\u0001\u0000\u0000\u0000\u02cf\u02bf\u0001\u0000\u0000\u0000\u02cf"+
		"\u02c4\u0001\u0000\u0000\u0000\u02cf\u02c9\u0001\u0000\u0000\u0000\u02cf"+
		"\u02ca\u0001\u0000\u0000\u0000\u02cf\u02cb\u0001\u0000\u0000\u0000\u02cf"+
		"\u02cc\u0001\u0000\u0000\u0000\u02d0[\u0001\u0000\u0000\u0000\u02d1\u02d2"+
		"\u0005\u0012\u0000\u0000\u02d2\u02d3\u0005\u001a\u0000\u0000\u02d3\u02d4"+
		"\u0003\u0082A\u0000\u02d4\u02d5\u0005\u001b\u0000\u0000\u02d5\u02d6\u0005"+
		" \u0000\u0000\u02d6\u02db\u0001\u0000\u0000\u0000\u02d7\u02d8\u0005\u0013"+
		"\u0000\u0000\u02d8\u02d9\u0005\u001a\u0000\u0000\u02d9\u02db\u0005\u001b"+
		"\u0000\u0000\u02da\u02d1\u0001\u0000\u0000\u0000\u02da\u02d7\u0001\u0000"+
		"\u0000\u0000\u02db]\u0001\u0000\u0000\u0000\u02dc\u02dd\u0003\u0082A\u0000"+
		"\u02dd\u02de\u0005 \u0000\u0000\u02de_\u0001\u0000\u0000\u0000\u02df\u02e0"+
		"\u0005b\u0000\u0000\u02e0\u02e4\u0005\u001a\u0000\u0000\u02e1\u02e3\u0003"+
		"\u0010\b\u0000\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e6\u0001\u0000"+
		"\u0000\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e7\u0001\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e8\u0003b1\u0000\u02e8\u02e9\u0005\u0019\u0000\u0000"+
		"\u02e9\u02ea\u0005\u001b\u0000\u0000\u02ea\u02eb\u0003T*\u0000\u02eba"+
		"\u0001\u0000\u0000\u0000\u02ec\u02f1\u0003\u0006\u0003\u0000\u02ed\u02ee"+
		"\u00057\u0000\u0000\u02ee\u02f0\u0003\u0006\u0003\u0000\u02ef\u02ed\u0001"+
		"\u0000\u0000\u0000\u02f0\u02f3\u0001\u0000\u0000\u0000\u02f1\u02ef\u0001"+
		"\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2c\u0001\u0000"+
		"\u0000\u0000\u02f3\u02f1\u0001\u0000\u0000\u0000\u02f4\u02f5\u0005c\u0000"+
		"\u0000\u02f5\u02f6\u0003T*\u0000\u02f6e\u0001\u0000\u0000\u0000\u02f7"+
		"\u0304\u0003j5\u0000\u02f8\u02fa\u0003h4\u0000\u02f9\u02f8\u0001\u0000"+
		"\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000"+
		"\u0000\u0000\u02fb\u02fd\u0005 \u0000\u0000\u02fc\u02fe\u0003\u0082A\u0000"+
		"\u02fd\u02fc\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000"+
		"\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff\u0301\u0005 \u0000\u0000\u0300"+
		"\u0302\u0003l6\u0000\u0301\u0300\u0001\u0000\u0000\u0000\u0301\u0302\u0001"+
		"\u0000\u0000\u0000\u0302\u0304\u0001\u0000\u0000\u0000\u0303\u02f7\u0001"+
		"\u0000\u0000\u0000\u0303\u02f9\u0001\u0000\u0000\u0000\u0304g\u0001\u0000"+
		"\u0000\u0000\u0305\u0307\u0005\u0004\u0000\u0000\u0306\u0305\u0001\u0000"+
		"\u0000\u0000\u0306\u0307\u0001\u0000\u0000\u0000\u0307\u0308\u0001\u0000"+
		"\u0000\u0000\u0308\u030b\u0003\u0018\f\u0000\u0309\u030b\u0005]\u0000"+
		"\u0000\u030a\u0306\u0001\u0000\u0000\u0000\u030a\u0309\u0001\u0000\u0000"+
		"\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030f\u0003<\u001e\u0000"+
		"\u030d\u030f\u0003\u0080@\u0000\u030e\u030a\u0001\u0000\u0000\u0000\u030e"+
		"\u030d\u0001\u0000\u0000\u0000\u030fi\u0001\u0000\u0000\u0000\u0310\u0312"+
		"\u0005\u0004\u0000\u0000\u0311\u0310\u0001\u0000\u0000\u0000\u0311\u0312"+
		"\u0001\u0000\u0000\u0000\u0312\u0313\u0001\u0000\u0000\u0000\u0313\u0316"+
		"\u0003\u0018\f\u0000\u0314\u0316\u0005]\u0000\u0000\u0315\u0311\u0001"+
		"\u0000\u0000\u0000\u0315\u0314\u0001\u0000\u0000\u0000\u0316\u0317\u0001"+
		"\u0000\u0000\u0000\u0317\u0318\u0003P(\u0000\u0318\u0319\u0005)\u0000"+
		"\u0000\u0319\u031a\u0003\u0082A\u0000\u031ak\u0001\u0000\u0000\u0000\u031b"+
		"\u031c\u0003\u0080@\u0000\u031cm\u0001\u0000\u0000\u0000\u031d\u031f\u0003"+
		"p8\u0000\u031e\u031d\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000"+
		"\u0000\u0320\u031e\u0001\u0000\u0000\u0000\u0320\u0321\u0001\u0000\u0000"+
		"\u0000\u0321\u0323\u0001\u0000\u0000\u0000\u0322\u0324\u0003V+\u0000\u0323"+
		"\u0322\u0001\u0000\u0000\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325"+
		"\u0323\u0001\u0000\u0000\u0000\u0325\u0326\u0001\u0000\u0000\u0000\u0326"+
		"o\u0001\u0000\u0000\u0000\u0327\u0328\u0005d\u0000\u0000\u0328\u0329\u0003"+
		"r9\u0000\u0329\u032a\u0005)\u0000\u0000\u032a\u0332\u0001\u0000\u0000"+
		"\u0000\u032b\u032c\u0005d\u0000\u0000\u032c\u032d\u0003t:\u0000\u032d"+
		"\u032e\u0005)\u0000\u0000\u032e\u0332\u0001\u0000\u0000\u0000\u032f\u0330"+
		"\u0005[\u0000\u0000\u0330\u0332\u0005)\u0000\u0000\u0331\u0327\u0001\u0000"+
		"\u0000\u0000\u0331\u032b\u0001\u0000\u0000\u0000\u0331\u032f\u0001\u0000"+
		"\u0000\u0000\u0332q\u0001\u0000\u0000\u0000\u0333\u0334\u0003\u0082A\u0000"+
		"\u0334s\u0001\u0000\u0000\u0000\u0335\u0336\u0005\u0019\u0000\u0000\u0336"+
		"u\u0001\u0000\u0000\u0000\u0337\u0338\u0005\u001a\u0000\u0000\u0338\u0339"+
		"\u0003\u0082A\u0000\u0339\u033a\u0005\u001b\u0000\u0000\u033a\u034b\u0001"+
		"\u0000\u0000\u0000\u033b\u034b\u0005F\u0000\u0000\u033c\u034b\u0005Y\u0000"+
		"\u0000\u033d\u034b\u0003z=\u0000\u033e\u034b\u0005\u0019\u0000\u0000\u033f"+
		"\u0340\u0005\u0019\u0000\u0000\u0340\u034b\u0003\u001e\u000f\u0000\u0341"+
		"\u0342\u0003H$\u0000\u0342\u0343\u0005\"\u0000\u0000\u0343\u0344\u0005"+
		"\u0001\u0000\u0000\u0344\u034b\u0001\u0000\u0000\u0000\u0345\u0346\u0005"+
		"\u0005\u0000\u0000\u0346\u0347\u0005\"\u0000\u0000\u0347\u034b\u0005\u0001"+
		"\u0000\u0000\u0348\u034b\u0003|>\u0000\u0349\u034b\u0003x<\u0000\u034a"+
		"\u0337\u0001\u0000\u0000\u0000\u034a\u033b\u0001\u0000\u0000\u0000\u034a"+
		"\u033c\u0001\u0000\u0000\u0000\u034a\u033d\u0001\u0000\u0000\u0000\u034a"+
		"\u033e\u0001\u0000\u0000\u0000\u034a\u033f\u0001\u0000\u0000\u0000\u034a"+
		"\u0341\u0001\u0000\u0000\u0000\u034a\u0345\u0001\u0000\u0000\u0000\u034a"+
		"\u0348\u0001\u0000\u0000\u0000\u034a\u0349\u0001\u0000\u0000\u0000\u034b"+
		"w\u0001\u0000\u0000\u0000\u034c\u034d\u0005\u0013\u0000\u0000\u034d\u034e"+
		"\u0005\u001a\u0000\u0000\u034e\u0355\u0005\u001b\u0000\u0000\u034f\u0350"+
		"\u0005\u0012\u0000\u0000\u0350\u0351\u0005\u001a\u0000\u0000\u0351\u0352"+
		"\u0003\u0082A\u0000\u0352\u0353\u0005\u001b\u0000\u0000\u0353\u0355\u0001"+
		"\u0000\u0000\u0000\u0354\u034c\u0001\u0000\u0000\u0000\u0354\u034f\u0001"+
		"\u0000\u0000\u0000\u0355y\u0001\u0000\u0000\u0000\u0356\u0357\u0007\u0003"+
		"\u0000\u0000\u0357{\u0001\u0000\u0000\u0000\u0358\u0359\u0005E\u0000\u0000"+
		"\u0359\u035b\u0003\u001c\u000e\u0000\u035a\u035c\u0003\u001e\u000f\u0000"+
		"\u035b\u035a\u0001\u0000\u0000\u0000\u035b\u035c\u0001\u0000\u0000\u0000"+
		"\u035c\u035d\u0001\u0000\u0000\u0000\u035d\u035f\u0003~?\u0000\u035e\u0360"+
		"\u0003\"\u0011\u0000\u035f\u035e\u0001\u0000\u0000\u0000\u035f\u0360\u0001"+
		"\u0000\u0000\u0000\u0360\u037d\u0001\u0000\u0000\u0000\u0361\u0362\u0005"+
		"E\u0000\u0000\u0362\u0363\u0003\u001a\r\u0000\u0363\u0364\u0005\u001e"+
		"\u0000\u0000\u0364\u0365\u0003\u0082A\u0000\u0365\u036a\u0005\u001f\u0000"+
		"\u0000\u0366\u0367\u0005\u001e\u0000\u0000\u0367\u0369\u0005\u001f\u0000"+
		"\u0000\u0368\u0366\u0001\u0000\u0000\u0000\u0369\u036c\u0001\u0000\u0000"+
		"\u0000\u036a\u0368\u0001\u0000\u0000\u0000\u036a\u036b\u0001\u0000\u0000"+
		"\u0000\u036b\u037d\u0001\u0000\u0000\u0000\u036c\u036a\u0001\u0000\u0000"+
		"\u0000\u036d\u036e\u0005E\u0000\u0000\u036e\u036f\u0003\u001c\u000e\u0000"+
		"\u036f\u0370\u0005\u001e\u0000\u0000\u0370\u0371\u0003\u0082A\u0000\u0371"+
		"\u0376\u0005\u001f\u0000\u0000\u0372\u0373\u0005\u001e\u0000\u0000\u0373"+
		"\u0375\u0005\u001f\u0000\u0000\u0374\u0372\u0001\u0000\u0000\u0000\u0375"+
		"\u0378\u0001\u0000\u0000\u0000\u0376\u0374\u0001\u0000\u0000\u0000\u0376"+
		"\u0377\u0001\u0000\u0000\u0000\u0377\u037a\u0001\u0000\u0000\u0000\u0378"+
		"\u0376\u0001\u0000\u0000\u0000\u0379\u037b\u0003B!\u0000\u037a\u0379\u0001"+
		"\u0000\u0000\u0000\u037a\u037b\u0001\u0000\u0000\u0000\u037b\u037d\u0001"+
		"\u0000\u0000\u0000\u037c\u0358\u0001\u0000\u0000\u0000\u037c\u0361\u0001"+
		"\u0000\u0000\u0000\u037c\u036d\u0001\u0000\u0000\u0000\u037d}\u0001\u0000"+
		"\u0000\u0000\u037e\u0380\u0005\u001a\u0000\u0000\u037f\u0381\u0003\u0080"+
		"@\u0000\u0380\u037f\u0001\u0000\u0000\u0000\u0380\u0381\u0001\u0000\u0000"+
		"\u0000\u0381\u0382\u0001\u0000\u0000\u0000\u0382\u0383\u0005\u001b\u0000"+
		"\u0000\u0383\u007f\u0001\u0000\u0000\u0000\u0384\u0389\u0003\u0082A\u0000"+
		"\u0385\u0386\u0005!\u0000\u0000\u0386\u0388\u0003\u0082A\u0000\u0387\u0385"+
		"\u0001\u0000\u0000\u0000\u0388\u038b\u0001\u0000\u0000\u0000\u0389\u0387"+
		"\u0001\u0000\u0000\u0000\u0389\u038a\u0001\u0000\u0000\u0000\u038a\u0081"+
		"\u0001\u0000\u0000\u0000\u038b\u0389\u0001\u0000\u0000\u0000\u038c\u038f"+
		"\u0003\u0084B\u0000\u038d\u038f\u0003\u008aE\u0000\u038e\u038c\u0001\u0000"+
		"\u0000\u0000\u038e\u038d\u0001\u0000\u0000\u0000\u038f\u0083\u0001\u0000"+
		"\u0000\u0000\u0390\u0391\u0003\u0086C\u0000\u0391\u0392\u0005e\u0000\u0000"+
		"\u0392\u0393\u0003\u0088D\u0000\u0393\u0085\u0001\u0000\u0000\u0000\u0394"+
		"\u03a5\u0005\u0019\u0000\u0000\u0395\u0397\u0005\u001a\u0000\u0000\u0396"+
		"\u0398\u0003J%\u0000\u0397\u0396\u0001\u0000\u0000\u0000\u0397\u0398\u0001"+
		"\u0000\u0000\u0000\u0398\u0399\u0001\u0000\u0000\u0000\u0399\u03a5\u0005"+
		"\u001b\u0000\u0000\u039a\u039b\u0005\u001a\u0000\u0000\u039b\u03a0\u0005"+
		"\u0019\u0000\u0000\u039c\u039d\u0005!\u0000\u0000\u039d\u039f\u0005\u0019"+
		"\u0000\u0000\u039e\u039c\u0001\u0000\u0000\u0000\u039f\u03a2\u0001\u0000"+
		"\u0000\u0000\u03a0\u039e\u0001\u0000\u0000\u0000\u03a0\u03a1\u0001\u0000"+
		"\u0000\u0000\u03a1\u03a3\u0001\u0000\u0000\u0000\u03a2\u03a0\u0001\u0000"+
		"\u0000\u0000\u03a3\u03a5\u0005\u001b\u0000\u0000\u03a4\u0394\u0001\u0000"+
		"\u0000\u0000\u03a4\u0395\u0001\u0000\u0000\u0000\u03a4\u039a\u0001\u0000"+
		"\u0000\u0000\u03a5\u0087\u0001\u0000\u0000\u0000\u03a6\u03a9\u0003\u0082"+
		"A\u0000\u03a7\u03a9\u0003T*\u0000\u03a8\u03a6\u0001\u0000\u0000\u0000"+
		"\u03a8\u03a7\u0001\u0000\u0000\u0000\u03a9\u0089\u0001\u0000\u0000\u0000"+
		"\u03aa\u03b0\u0003\u008eG\u0000\u03ab\u03ac\u0003\u008cF\u0000\u03ac\u03ad"+
		"\u0003\u008eG\u0000\u03ad\u03af\u0001\u0000\u0000\u0000\u03ae\u03ab\u0001"+
		"\u0000\u0000\u0000\u03af\u03b2\u0001\u0000\u0000\u0000\u03b0\u03ae\u0001"+
		"\u0000\u0000\u0000\u03b0\u03b1\u0001\u0000\u0000\u0000\u03b1\u008b\u0001"+
		"\u0000\u0000\u0000\u03b2\u03b0\u0001\u0000\u0000\u0000\u03b3\u03b4\u0007"+
		"\u0004\u0000\u0000\u03b4\u008d\u0001\u0000\u0000\u0000\u03b5\u03bb\u0003"+
		"\u0090H\u0000\u03b6\u03b7\u0005(\u0000\u0000\u03b7\u03b8\u0003\u0082A"+
		"\u0000\u03b8\u03b9\u0005)\u0000\u0000\u03b9\u03ba\u0003\u008eG\u0000\u03ba"+
		"\u03bc\u0001\u0000\u0000\u0000\u03bb\u03b6\u0001\u0000\u0000\u0000\u03bb"+
		"\u03bc\u0001\u0000\u0000\u0000\u03bc\u008f\u0001\u0000\u0000\u0000\u03bd"+
		"\u03c2\u0003\u0092I\u0000\u03be\u03bf\u0005/\u0000\u0000\u03bf\u03c1\u0003"+
		"\u0092I\u0000\u03c0\u03be\u0001\u0000\u0000\u0000\u03c1\u03c4\u0001\u0000"+
		"\u0000\u0000\u03c2\u03c0\u0001\u0000\u0000\u0000\u03c2\u03c3\u0001\u0000"+
		"\u0000\u0000\u03c3\u0091\u0001\u0000\u0000\u0000\u03c4\u03c2\u0001\u0000"+
		"\u0000\u0000\u03c5\u03ca\u0003\u0094J\u0000\u03c6\u03c7\u0005.\u0000\u0000"+
		"\u03c7\u03c9\u0003\u0094J\u0000\u03c8\u03c6\u0001\u0000\u0000\u0000\u03c9"+
		"\u03cc\u0001\u0000\u0000\u0000\u03ca\u03c8\u0001\u0000\u0000\u0000\u03ca"+
		"\u03cb\u0001\u0000\u0000\u0000\u03cb\u0093\u0001\u0000\u0000\u0000\u03cc"+
		"\u03ca\u0001\u0000\u0000\u0000\u03cd\u03d2\u0003\u0096K\u0000\u03ce\u03cf"+
		"\u00057\u0000\u0000\u03cf\u03d1\u0003\u0096K\u0000\u03d0\u03ce\u0001\u0000"+
		"\u0000\u0000\u03d1\u03d4\u0001\u0000\u0000\u0000\u03d2\u03d0\u0001\u0000"+
		"\u0000\u0000\u03d2\u03d3\u0001\u0000\u0000\u0000\u03d3\u0095\u0001\u0000"+
		"\u0000\u0000\u03d4\u03d2\u0001\u0000\u0000\u0000\u03d5\u03da\u0003\u0098"+
		"L\u0000\u03d6\u03d7\u00058\u0000\u0000\u03d7\u03d9\u0003\u0098L\u0000"+
		"\u03d8\u03d6\u0001\u0000\u0000\u0000\u03d9\u03dc\u0001\u0000\u0000\u0000"+
		"\u03da\u03d8\u0001\u0000\u0000\u0000\u03da\u03db\u0001\u0000\u0000\u0000"+
		"\u03db\u0097\u0001\u0000\u0000\u0000\u03dc\u03da\u0001\u0000\u0000\u0000"+
		"\u03dd\u03e2\u0003\u009aM\u0000\u03de\u03df\u00056\u0000\u0000\u03df\u03e1"+
		"\u0003\u009aM\u0000\u03e0\u03de\u0001\u0000\u0000\u0000\u03e1\u03e4\u0001"+
		"\u0000\u0000\u0000\u03e2\u03e0\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001"+
		"\u0000\u0000\u0000\u03e3\u0099\u0001\u0000\u0000\u0000\u03e4\u03e2\u0001"+
		"\u0000\u0000\u0000\u03e5\u03ea\u0003\u009cN\u0000\u03e6\u03e7\u0007\u0005"+
		"\u0000\u0000\u03e7\u03e9\u0003\u009cN\u0000\u03e8\u03e6\u0001\u0000\u0000"+
		"\u0000\u03e9\u03ec\u0001\u0000\u0000\u0000\u03ea\u03e8\u0001\u0000\u0000"+
		"\u0000\u03ea\u03eb\u0001\u0000\u0000\u0000\u03eb\u009b\u0001\u0000\u0000"+
		"\u0000\u03ec\u03ea\u0001\u0000\u0000\u0000\u03ed\u03f4\u0003\u009eO\u0000"+
		"\u03ee\u03ef\u0007\u0006\u0000\u0000\u03ef\u03f3\u0003\u009eO\u0000\u03f0"+
		"\u03f1\u0005i\u0000\u0000\u03f1\u03f3\u0003\u0018\f\u0000\u03f2\u03ee"+
		"\u0001\u0000\u0000\u0000\u03f2\u03f0\u0001\u0000\u0000\u0000\u03f3\u03f6"+
		"\u0001\u0000\u0000\u0000\u03f4\u03f2\u0001\u0000\u0000\u0000\u03f4\u03f5"+
		"\u0001\u0000\u0000\u0000\u03f5\u009d\u0001\u0000\u0000\u0000\u03f6\u03f4"+
		"\u0001\u0000\u0000\u0000\u03f7\u03fc\u0003\u00a0P\u0000\u03f8\u03f9\u0007"+
		"\u0007\u0000\u0000\u03f9\u03fb\u0003\u00a0P\u0000\u03fa\u03f8\u0001\u0000"+
		"\u0000\u0000\u03fb\u03fe\u0001\u0000\u0000\u0000\u03fc\u03fa\u0001\u0000"+
		"\u0000\u0000\u03fc\u03fd\u0001\u0000\u0000\u0000\u03fd\u009f\u0001\u0000"+
		"\u0000\u0000\u03fe\u03fc\u0001\u0000\u0000\u0000\u03ff\u0404\u0003\u00a2"+
		"Q\u0000\u0400\u0401\u0007\b\u0000\u0000\u0401\u0403\u0003\u00a2Q\u0000"+
		"\u0402\u0400\u0001\u0000\u0000\u0000\u0403\u0406\u0001\u0000\u0000\u0000"+
		"\u0404\u0402\u0001\u0000\u0000\u0000\u0404\u0405\u0001\u0000\u0000\u0000"+
		"\u0405\u00a1\u0001\u0000\u0000\u0000\u0406\u0404\u0001\u0000\u0000\u0000"+
		"\u0407\u040c\u0003\u00a4R\u0000\u0408\u0409\u0007\t\u0000\u0000\u0409"+
		"\u040b\u0003\u00a4R\u0000\u040a\u0408\u0001\u0000\u0000\u0000\u040b\u040e"+
		"\u0001\u0000\u0000\u0000\u040c\u040a\u0001\u0000\u0000\u0000\u040c\u040d"+
		"\u0001\u0000\u0000\u0000\u040d\u00a3\u0001\u0000\u0000\u0000\u040e\u040c"+
		"\u0001\u0000\u0000\u0000\u040f\u0417\u0003\u00a6S\u0000\u0410\u0417\u0003"+
		"\u00a8T\u0000\u0411\u0412\u00052\u0000\u0000\u0412\u0417\u0003\u00a4R"+
		"\u0000\u0413\u0414\u00053\u0000\u0000\u0414\u0417\u0003\u00a4R\u0000\u0415"+
		"\u0417\u0003\u00aaU\u0000\u0416\u040f\u0001\u0000\u0000\u0000\u0416\u0410"+
		"\u0001\u0000\u0000\u0000\u0416\u0411\u0001\u0000\u0000\u0000\u0416\u0413"+
		"\u0001\u0000\u0000\u0000\u0416\u0415\u0001\u0000\u0000\u0000\u0417\u00a5"+
		"\u0001\u0000\u0000\u0000\u0418\u0419\u00050\u0000\u0000\u0419\u041a\u0003"+
		"\u00a4R\u0000\u041a\u00a7\u0001\u0000\u0000\u0000\u041b\u041c\u00051\u0000"+
		"\u0000\u041c\u041d\u0003\u00a4R\u0000\u041d\u00a9\u0001\u0000\u0000\u0000"+
		"\u041e\u041f\u0005\'\u0000\u0000\u041f\u0425\u0003\u00a4R\u0000\u0420"+
		"\u0421\u0005&\u0000\u0000\u0421\u0425\u0003\u00a4R\u0000\u0422\u0425\u0003"+
		"\u00b2Y\u0000\u0423\u0425\u0003\u00acV\u0000\u0424\u041e\u0001\u0000\u0000"+
		"\u0000\u0424\u0420\u0001\u0000\u0000\u0000\u0424\u0422\u0001\u0000\u0000"+
		"\u0000\u0424\u0423\u0001\u0000\u0000\u0000\u0425\u00ab\u0001\u0000\u0000"+
		"\u0000\u0426\u042e\u0003v;\u0000\u0427\u0429\u0005\u0019\u0000\u0000\u0428"+
		"\u042a\u0003\u001e\u000f\u0000\u0429\u0428\u0001\u0000\u0000\u0000\u0429"+
		"\u042a\u0001\u0000\u0000\u0000\u042a\u042e\u0001\u0000\u0000\u0000\u042b"+
		"\u042c\u0005\u0019\u0000\u0000\u042c\u042e\u0003~?\u0000\u042d\u0426\u0001"+
		"\u0000\u0000\u0000\u042d\u0427\u0001\u0000\u0000\u0000\u042d\u042b\u0001"+
		"\u0000\u0000\u0000\u042e\u044a\u0001\u0000\u0000\u0000\u042f\u0440\u0005"+
		"\"\u0000\u0000\u0430\u0432\u0005\u0019\u0000\u0000\u0431\u0433\u0003~"+
		"?\u0000\u0432\u0431\u0001\u0000\u0000\u0000\u0432\u0433\u0001\u0000\u0000"+
		"\u0000\u0433\u0441\u0001\u0000\u0000\u0000\u0434\u0441\u0005F\u0000\u0000"+
		"\u0435\u0436\u0005Y\u0000\u0000\u0436\u0441\u0003~?\u0000\u0437\u0439"+
		"\u0005E\u0000\u0000\u0438\u043a\u0003\u001e\u000f\u0000\u0439\u0438\u0001"+
		"\u0000\u0000\u0000\u0439\u043a\u0001\u0000\u0000\u0000\u043a\u043b\u0001"+
		"\u0000\u0000\u0000\u043b\u043c\u0003\u001c\u000e\u0000\u043c\u043e\u0003"+
		"~?\u0000\u043d\u043f\u0003\"\u0011\u0000\u043e\u043d\u0001\u0000\u0000"+
		"\u0000\u043e\u043f\u0001\u0000\u0000\u0000\u043f\u0441\u0001\u0000\u0000"+
		"\u0000\u0440\u0430\u0001\u0000\u0000\u0000\u0440\u0434\u0001\u0000\u0000"+
		"\u0000\u0440\u0435\u0001\u0000\u0000\u0000\u0440\u0437\u0001\u0000\u0000"+
		"\u0000\u0441\u0449\u0001\u0000\u0000\u0000\u0442\u0443\u0005\u001e\u0000"+
		"\u0000\u0443\u0444\u0003\u0082A\u0000\u0444\u0445\u0005\u001f\u0000\u0000"+
		"\u0445\u0449\u0001\u0000\u0000\u0000\u0446\u0449\u00050\u0000\u0000\u0447"+
		"\u0449\u00051\u0000\u0000\u0448\u042f\u0001\u0000\u0000\u0000\u0448\u0442"+
		"\u0001\u0000\u0000\u0000\u0448\u0446\u0001\u0000\u0000\u0000\u0448\u0447"+
		"\u0001\u0000\u0000\u0000\u0449\u044c\u0001\u0000\u0000\u0000\u044a\u0448"+
		"\u0001\u0000\u0000\u0000\u044a\u044b\u0001\u0000\u0000\u0000\u044b\u00ad"+
		"\u0001\u0000\u0000\u0000\u044c\u044a\u0001\u0000\u0000\u0000\u044d\u0450"+
		"\u0005\u0019\u0000\u0000\u044e\u0450\u0003v;\u0000\u044f\u044d\u0001\u0000"+
		"\u0000\u0000\u044f\u044e\u0001\u0000\u0000\u0000\u0450\u0451\u0001\u0000"+
		"\u0000\u0000\u0451\u0456\u0003~?\u0000\u0452\u0453\u0005\"\u0000\u0000"+
		"\u0453\u0455\u0003\u00b0X\u0000\u0454\u0452\u0001\u0000\u0000\u0000\u0455"+
		"\u0458\u0001\u0000\u0000\u0000\u0456\u0454\u0001\u0000\u0000\u0000\u0456"+
		"\u0457\u0001\u0000\u0000\u0000\u0457\u00af\u0001\u0000\u0000\u0000\u0458"+
		"\u0456\u0001\u0000\u0000\u0000\u0459\u045a\u0005\u0019\u0000\u0000\u045a"+
		"\u045b\u0003~?\u0000\u045b\u00b1\u0001\u0000\u0000\u0000\u045c\u045d\u0005"+
		"\u001a\u0000\u0000\u045d\u045e\u0003\u001a\r\u0000\u045e\u045f\u0005\u001b"+
		"\u0000\u0000\u045f\u0460\u0003\u00a4R\u0000\u0460\u046e\u0001\u0000\u0000"+
		"\u0000\u0461\u0462\u0005\u001a\u0000\u0000\u0462\u0467\u0003\u001c\u000e"+
		"\u0000\u0463\u0464\u00056\u0000\u0000\u0464\u0466\u0003\u001c\u000e\u0000"+
		"\u0465\u0463\u0001\u0000\u0000\u0000\u0466\u0469\u0001\u0000\u0000\u0000"+
		"\u0467\u0465\u0001\u0000\u0000\u0000\u0467\u0468\u0001\u0000\u0000\u0000"+
		"\u0468\u046a\u0001\u0000\u0000\u0000\u0469\u0467\u0001\u0000\u0000\u0000"+
		"\u046a\u046b\u0005\u001b\u0000\u0000\u046b\u046c\u0003\u00aaU\u0000\u046c"+
		"\u046e\u0001\u0000\u0000\u0000\u046d\u045c\u0001\u0000\u0000\u0000\u046d"+
		"\u0461\u0001\u0000\u0000\u0000\u046e\u00b3\u0001\u0000\u0000\u0000\u046f"+
		"\u0470\u0005\u001a\u0000\u0000\u0470\u0471\u0003\u0082A\u0000\u0471\u0472"+
		"\u0005\u001b\u0000\u0000\u0472\u00b5\u0001\u0000\u0000\u0000\u008c\u00b7"+
		"\u00bc\u00c2\u00cf\u00d8\u00de\u00e3\u00e9\u00ed\u00f1\u00f8\u00fe\u0102"+
		"\u0109\u0110\u011c\u0124\u012b\u0131\u0138\u013f\u0147\u0150\u0152\u0158"+
		"\u015f\u0163\u016b\u0171\u0178\u017f\u0188\u018f\u0196\u019b\u01a0\u01a4"+
		"\u01a7\u01aa\u01b3\u01b8\u01bb\u01bd\u01c3\u01c9\u01d5\u01dd\u01e2\u01e6"+
		"\u01ee\u01f2\u01f4\u01fb\u0202\u0209\u020e\u0212\u0217\u021d\u0222\u0228"+
		"\u022f\u0234\u0237\u023c\u0245\u0251\u0259\u0260\u0268\u026b\u026f\u0279"+
		"\u0282\u0299\u029c\u029f\u02a7\u02ad\u02b8\u02c1\u02c6\u02cf\u02da\u02e4"+
		"\u02f1\u02f9\u02fd\u0301\u0303\u0306\u030a\u030e\u0311\u0315\u0320\u0325"+
		"\u0331\u034a\u0354\u035b\u035f\u036a\u0376\u037a\u037c\u0380\u0389\u038e"+
		"\u0397\u03a0\u03a4\u03a8\u03b0\u03bb\u03c2\u03ca\u03d2\u03da\u03e2\u03ea"+
		"\u03f2\u03f4\u03fc\u0404\u040c\u0416\u0424\u0429\u042d\u0432\u0439\u043e"+
		"\u0440\u0448\u044a\u044f\u0456\u0467\u046d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}