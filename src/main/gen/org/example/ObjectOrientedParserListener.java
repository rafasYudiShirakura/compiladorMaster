// Generated from C:/Users/rafas/Downloads/compiladorJava/src/main/java/org/example/ObjectOrientedParser.g4 by ANTLR 4.13.2
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ObjectOrientedParser}.
 */
public interface ObjectOrientedParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ObjectOrientedParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ObjectOrientedParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(ObjectOrientedParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(ObjectOrientedParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(ObjectOrientedParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(ObjectOrientedParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(ObjectOrientedParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(ObjectOrientedParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(ObjectOrientedParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(ObjectOrientedParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ObjectOrientedParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ObjectOrientedParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(ObjectOrientedParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(ObjectOrientedParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(ObjectOrientedParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(ObjectOrientedParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(ObjectOrientedParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(ObjectOrientedParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(ObjectOrientedParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(ObjectOrientedParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(ObjectOrientedParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(ObjectOrientedParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(ObjectOrientedParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(ObjectOrientedParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ObjectOrientedParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ObjectOrientedParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(ObjectOrientedParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(ObjectOrientedParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(ObjectOrientedParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(ObjectOrientedParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(ObjectOrientedParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(ObjectOrientedParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(ObjectOrientedParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(ObjectOrientedParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(ObjectOrientedParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(ObjectOrientedParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(ObjectOrientedParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(ObjectOrientedParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(ObjectOrientedParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(ObjectOrientedParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(ObjectOrientedParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(ObjectOrientedParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(ObjectOrientedParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(ObjectOrientedParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(ObjectOrientedParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(ObjectOrientedParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(ObjectOrientedParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(ObjectOrientedParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(ObjectOrientedParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(ObjectOrientedParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(ObjectOrientedParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(ObjectOrientedParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(ObjectOrientedParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(ObjectOrientedParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(ObjectOrientedParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(ObjectOrientedParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(ObjectOrientedParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(ObjectOrientedParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(ObjectOrientedParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(ObjectOrientedParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(ObjectOrientedParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(ObjectOrientedParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(ObjectOrientedParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(ObjectOrientedParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(ObjectOrientedParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(ObjectOrientedParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(ObjectOrientedParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(ObjectOrientedParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ObjectOrientedParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ObjectOrientedParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(ObjectOrientedParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(ObjectOrientedParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#typeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeOrVoid(ObjectOrientedParser.TypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#typeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeOrVoid(ObjectOrientedParser.TypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(ObjectOrientedParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(ObjectOrientedParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(ObjectOrientedParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(ObjectOrientedParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(ObjectOrientedParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(ObjectOrientedParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(ObjectOrientedParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(ObjectOrientedParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(ObjectOrientedParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(ObjectOrientedParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ObjectOrientedParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ObjectOrientedParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(ObjectOrientedParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(ObjectOrientedParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(ObjectOrientedParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(ObjectOrientedParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ObjectOrientedParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ObjectOrientedParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ObjectOrientedParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ObjectOrientedParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(ObjectOrientedParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(ObjectOrientedParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(ObjectOrientedParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(ObjectOrientedParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(ObjectOrientedParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(ObjectOrientedParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(ObjectOrientedParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(ObjectOrientedParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(ObjectOrientedParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(ObjectOrientedParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(ObjectOrientedParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(ObjectOrientedParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(ObjectOrientedParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(ObjectOrientedParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(ObjectOrientedParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(ObjectOrientedParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(ObjectOrientedParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(ObjectOrientedParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(ObjectOrientedParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(ObjectOrientedParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(ObjectOrientedParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(ObjectOrientedParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ObjectOrientedParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ObjectOrientedParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ObjectOrientedParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ObjectOrientedParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(ObjectOrientedParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(ObjectOrientedParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ObjectOrientedParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ObjectOrientedParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(ObjectOrientedParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(ObjectOrientedParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ObjectOrientedParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ObjectOrientedParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(ObjectOrientedParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(ObjectOrientedParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(ObjectOrientedParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(ObjectOrientedParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(ObjectOrientedParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(ObjectOrientedParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(ObjectOrientedParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(ObjectOrientedParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(ObjectOrientedParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(ObjectOrientedParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(ObjectOrientedParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(ObjectOrientedParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(ObjectOrientedParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(ObjectOrientedParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(ObjectOrientedParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(ObjectOrientedParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(ObjectOrientedParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(ObjectOrientedParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(ObjectOrientedParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(ObjectOrientedParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(ObjectOrientedParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(ObjectOrientedParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ObjectOrientedParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ObjectOrientedParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ObjectOrientedParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ObjectOrientedParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(ObjectOrientedParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(ObjectOrientedParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ObjectOrientedParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ObjectOrientedParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ObjectOrientedParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ObjectOrientedParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ObjectOrientedParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ObjectOrientedParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(ObjectOrientedParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(ObjectOrientedParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(ObjectOrientedParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(ObjectOrientedParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(ObjectOrientedParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(ObjectOrientedParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(ObjectOrientedParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(ObjectOrientedParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(ObjectOrientedParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(ObjectOrientedParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#methodCallTail}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallTail(ObjectOrientedParser.MethodCallTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#methodCallTail}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallTail(ObjectOrientedParser.MethodCallTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(ObjectOrientedParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(ObjectOrientedParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectOrientedParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(ObjectOrientedParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectOrientedParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(ObjectOrientedParser.ParExpressionContext ctx);
}