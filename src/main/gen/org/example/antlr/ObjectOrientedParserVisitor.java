// Generated from C:/dev/compila/rafa/compiladorMaster/src/main/java/org/example/antlr/ObjectOrientedParser.g4 by ANTLR 4.13.2
package org.example.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ObjectOrientedParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ObjectOrientedParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(ObjectOrientedParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(ObjectOrientedParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(ObjectOrientedParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(ObjectOrientedParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(ObjectOrientedParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(ObjectOrientedParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(ObjectOrientedParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(ObjectOrientedParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(ObjectOrientedParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(ObjectOrientedParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(ObjectOrientedParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(ObjectOrientedParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ObjectOrientedParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(ObjectOrientedParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(ObjectOrientedParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(ObjectOrientedParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(ObjectOrientedParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(ObjectOrientedParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(ObjectOrientedParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(ObjectOrientedParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(ObjectOrientedParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(ObjectOrientedParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(ObjectOrientedParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(ObjectOrientedParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(ObjectOrientedParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(ObjectOrientedParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(ObjectOrientedParser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(ObjectOrientedParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(ObjectOrientedParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(ObjectOrientedParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(ObjectOrientedParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(ObjectOrientedParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(ObjectOrientedParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(ObjectOrientedParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(ObjectOrientedParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(ObjectOrientedParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#typeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOrVoid(ObjectOrientedParser.TypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(ObjectOrientedParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(ObjectOrientedParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(ObjectOrientedParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(ObjectOrientedParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(ObjectOrientedParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ObjectOrientedParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(ObjectOrientedParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(ObjectOrientedParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ObjectOrientedParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(ObjectOrientedParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(ObjectOrientedParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(ObjectOrientedParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(ObjectOrientedParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(ObjectOrientedParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(ObjectOrientedParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(ObjectOrientedParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(ObjectOrientedParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(ObjectOrientedParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(ObjectOrientedParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(ObjectOrientedParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(ObjectOrientedParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(ObjectOrientedParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ObjectOrientedParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#newExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(ObjectOrientedParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(ObjectOrientedParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(ObjectOrientedParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ObjectOrientedParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(ObjectOrientedParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(ObjectOrientedParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(ObjectOrientedParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(ObjectOrientedParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(ObjectOrientedParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(ObjectOrientedParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(ObjectOrientedParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(ObjectOrientedParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(ObjectOrientedParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(ObjectOrientedParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(ObjectOrientedParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(ObjectOrientedParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(ObjectOrientedParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(ObjectOrientedParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(ObjectOrientedParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(ObjectOrientedParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(ObjectOrientedParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(ObjectOrientedParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(ObjectOrientedParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(ObjectOrientedParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(ObjectOrientedParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(ObjectOrientedParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#methodCallTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallTail(ObjectOrientedParser.MethodCallTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(ObjectOrientedParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectOrientedParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(ObjectOrientedParser.ParExpressionContext ctx);
}