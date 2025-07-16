package org.example.ast;

import org.example.output.generated.ObjectOrientedParser;
import org.example.output.generated.ObjectOrientedParserBaseVisitor;

public class ASTBuilder extends ObjectOrientedParserBaseVisitor<ASTNode> {
    
    @Override
    public ASTNode visitClassDeclaration(ObjectOrientedParser.ClassDeclarationContext ctx) {
        String className = ctx.IDENTIFIER().getText();
        ClassNode classNode = new ClassNode(className);
        
        // Set position information
        classNode.setPosition(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
        
        // Visit class body
        if (ctx.classBody() != null) {
            ASTNode bodyNode = visit(ctx.classBody());
            if (bodyNode != null) {
                for (ASTNode child : bodyNode.getChildren()) {
                    classNode.addChild(child);
                }
            }
        }
        
        return classNode;
    }
    
    @Override
    public ASTNode visitClassBody(ObjectOrientedParser.ClassBodyContext ctx) {
        ASTNode bodyNode = new ASTNode("CLASS_BODY") {
            @Override
            public String toString() {
                return "Class Body";
            }
        };
        
        if (ctx.classBodyDeclaration() != null) {
            for (ObjectOrientedParser.ClassBodyDeclarationContext declCtx : ctx.classBodyDeclaration()) {
                ASTNode declNode = visit(declCtx);
                if (declNode != null) {
                    bodyNode.addChild(declNode);
                }
            }
        }
        
        return bodyNode;
    }
    
    @Override
    public ASTNode visitFieldDeclaration(ObjectOrientedParser.FieldDeclarationContext ctx) {
        String fieldType = ctx.type().getText();
        
        // Handle multiple field declarations
        ASTNode fieldsNode = new ASTNode("FIELDS") {
            @Override
            public String toString() {
                return "Field Declarations";
            }
        };
        
        if (ctx.variableDeclaratorList() != null && ctx.variableDeclaratorList().variableDeclarator() != null) {
            for (ObjectOrientedParser.VariableDeclaratorContext varCtx : ctx.variableDeclaratorList().variableDeclarator()) {
                String fieldName = varCtx.IDENTIFIER().getText();
                FieldNode fieldNode;
                
                if (varCtx.variableInitializer() != null) {
                    String initialValue = varCtx.variableInitializer().getText();
                    fieldNode = new FieldNode(fieldName, fieldType, initialValue);
                    
                    // Add initializer as child
                    ASTNode initNode = visit(varCtx.variableInitializer());
                    if (initNode != null) {
                        fieldNode.addChild(initNode);
                    }
                } else {
                    fieldNode = new FieldNode(fieldName, fieldType);
                }
                
                fieldNode.setPosition(varCtx.getStart().getLine(), varCtx.getStart().getCharPositionInLine());
                fieldsNode.addChild(fieldNode);
            }
        }
        
        return fieldsNode.getChildren().size() == 1 ? fieldsNode.getChildren().get(0) : fieldsNode;
    }
    
    @Override
    public ASTNode visitMethodDeclaration(ObjectOrientedParser.MethodDeclarationContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        String returnType = "void";
        String visibility = "public"; // default
        
        if (ctx.typeOrVoid() != null) {
            returnType = ctx.typeOrVoid().getText();
        }
        
        MethodNode methodNode = new MethodNode(methodName, returnType, visibility);
        methodNode.setPosition(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
        
        // Add parameters
        if (ctx.formalParameterList() != null) {
            ASTNode paramsNode = visit(ctx.formalParameterList());
            if (paramsNode != null) {
                methodNode.addChild(paramsNode);
            }
        }
        
        // Add method body
        if (ctx.block() != null) {
            ASTNode bodyNode = visit(ctx.block());
            if (bodyNode != null) {
                methodNode.addChild(bodyNode);
            }
        }
        
        return methodNode;
    }
    
    @Override
    public ASTNode visitFormalParameterList(ObjectOrientedParser.FormalParameterListContext ctx) {
        ASTNode paramsNode = new ASTNode("PARAMETERS") {
            @Override
            public String toString() {
                return "Parameters";
            }
        };
        
        if (ctx.formalParameter() != null) {
            for (ObjectOrientedParser.FormalParameterContext paramCtx : ctx.formalParameter()) {
                ASTNode paramNode = visit(paramCtx);
                if (paramNode != null) {
                    paramsNode.addChild(paramNode);
                }
            }
        }
        
        return paramsNode;
    }
    
    @Override
    public ASTNode visitFormalParameter(ObjectOrientedParser.FormalParameterContext ctx) {
        String paramType = ctx.type().getText();
        String paramName = ctx.variableDeclaratorId().IDENTIFIER().getText();
        
        ParameterNode paramNode = new ParameterNode(paramName, paramType);
        paramNode.setPosition(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
        
        return paramNode;
    }
    
    @Override
    public ASTNode visitBlock(ObjectOrientedParser.BlockContext ctx) {
        ASTNode blockNode = new ASTNode("BLOCK") {
            @Override
            public String toString() {
                return "Block";
            }
        };
        
        if (ctx.blockStatement() != null) {
            for (ObjectOrientedParser.BlockStatementContext stmtCtx : ctx.blockStatement()) {
                ASTNode stmtNode = visit(stmtCtx);
                if (stmtNode != null) {
                    blockNode.addChild(stmtNode);
                }
            }
        }
        
        return blockNode;
    }
    
    @Override
    public ASTNode visitStatement(ObjectOrientedParser.StatementContext ctx) {
        if (ctx.RETURN() != null) {
            StatementNode returnNode = new StatementNode("RETURN");
            returnNode.setPosition(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
            
            if (ctx.expression() != null && !ctx.expression().isEmpty()) {
                ASTNode exprNode = visit(ctx.expression(0));
                if (exprNode != null) {
                    returnNode.addChild(exprNode);
                }
            }
            
            return returnNode;
        }
        
        if (ctx.IF() != null) {
            StatementNode ifNode = new StatementNode("IF");
            ifNode.setPosition(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
            
            // Add condition
            if (ctx.parExpression() != null) {
                ASTNode conditionNode = visit(ctx.parExpression());
                if (conditionNode != null) {
                    ifNode.addChild(conditionNode);
                }
            }
            
            // Add then statement
            if (ctx.statement() != null && !ctx.statement().isEmpty()) {
                ASTNode thenNode = visit(ctx.statement(0));
                if (thenNode != null) {
                    ifNode.addChild(thenNode);
                }
                
                // Add else statement if present
                if (ctx.statement().size() > 1) {
                    ASTNode elseNode = visit(ctx.statement(1));
                    if (elseNode != null) {
                        ifNode.addChild(elseNode);
                    }
                }
            }
            
            return ifNode;
        }
        
        if (ctx.block() != null) {
            return visit(ctx.block());
        }
        
        if (ctx.expressionStatement() != null) {
            return visit(ctx.expressionStatement());
        }
        
        // Handle other statement types as needed
        
        return new StatementNode("UNKNOWN", ctx.getText());
    }
    
    @Override
    public ASTNode visitLocalVariableDeclarationStatement(ObjectOrientedParser.LocalVariableDeclarationStatementContext ctx) {
        if (ctx.type() != null) {
            String varType = ctx.type().getText();
            
            ASTNode varDeclNode = new ASTNode("VAR_DECLARATION") {
                @Override
                public String toString() {
                    return "Variable Declaration";
                }
            };
            
            if (ctx.variableDeclaratorList() != null && ctx.variableDeclaratorList().variableDeclarator() != null) {
                for (ObjectOrientedParser.VariableDeclaratorContext varCtx : ctx.variableDeclaratorList().variableDeclarator()) {
                    String varName = varCtx.IDENTIFIER().getText();
                    FieldNode varNode;
                    
                    if (varCtx.variableInitializer() != null) {
                        String initialValue = varCtx.variableInitializer().getText();
                        varNode = new FieldNode(varName, varType, initialValue);
                        
                        ASTNode initNode = visit(varCtx.variableInitializer());
                        if (initNode != null) {
                            varNode.addChild(initNode);
                        }
                    } else {
                        varNode = new FieldNode(varName, varType);
                    }
                    
                    varNode.setPosition(varCtx.getStart().getLine(), varCtx.getStart().getCharPositionInLine());
                    varDeclNode.addChild(varNode);
                }
            }
            
            return varDeclNode.getChildren().size() == 1 ? varDeclNode.getChildren().get(0) : varDeclNode;
        }
        
        return new StatementNode("LOCAL_VAR", ctx.getText());
    }
    
    @Override
    public ASTNode visitExpression(ObjectOrientedParser.ExpressionContext ctx) {
        if (ctx.assignmentExpression() != null) {
            return visit(ctx.assignmentExpression());
        }
        
        return new ExpressionNode("UNKNOWN", ctx.getText());
    }
    
    @Override
    public ASTNode visitAssignmentExpression(ObjectOrientedParser.AssignmentExpressionContext ctx) {
        if (ctx.conditionalExpression().size() == 1) {
            return visit(ctx.conditionalExpression(0));
        } else if (ctx.conditionalExpression().size() > 1) {
            ExpressionNode assignNode = new ExpressionNode("ASSIGNMENT", "=");
            
            for (ObjectOrientedParser.ConditionalExpressionContext condCtx : ctx.conditionalExpression()) {
                ASTNode exprNode = visit(condCtx);
                if (exprNode != null) {
                    assignNode.addChild(exprNode);
                }
            }
            
            return assignNode;
        }
        
        return new ExpressionNode("ASSIGNMENT", ctx.getText());
    }
    
    @Override
    public ASTNode visitVariableInitializer(ObjectOrientedParser.VariableInitializerContext ctx) {
        if (ctx.expression() != null) {
            return visit(ctx.expression());
        }
        
        if (ctx.arrayInitializer() != null) {
            return visit(ctx.arrayInitializer());
        }
        
        return new ExpressionNode("INITIALIZER", ctx.getText());
    }
    
    @Override
    public ASTNode visitArrayInitializer(ObjectOrientedParser.ArrayInitializerContext ctx) {
        ASTNode arrayNode = new ASTNode("ARRAY_INITIALIZER") {
            @Override
            public String toString() {
                return "Array Initializer";
            }
        };
        
        if (ctx.variableInitializer() != null) {
            for (ObjectOrientedParser.VariableInitializerContext initCtx : ctx.variableInitializer()) {
                ASTNode initNode = visit(initCtx);
                if (initNode != null) {
                    arrayNode.addChild(initNode);
                }
            }
        }
        
        return arrayNode;
    }
    
    @Override
    public ASTNode visitLiteral(ObjectOrientedParser.LiteralContext ctx) {
        if (ctx.INTEGER_LITERAL() != null) {
            return new LiteralNode("INTEGER", ctx.INTEGER_LITERAL().getText());
        }
        if (ctx.FLOAT_LITERAL() != null) {
            return new LiteralNode("FLOAT", ctx.FLOAT_LITERAL().getText());
        }
        if (ctx.CHAR_LITERAL() != null) {
            return new LiteralNode("CHAR", ctx.CHAR_LITERAL().getText());
        }
        if (ctx.STRING_LITERAL() != null) {
            return new LiteralNode("STRING", ctx.STRING_LITERAL().getText());
        }
        if (ctx.BOOLEAN_LITERAL() != null) {
            return new LiteralNode("BOOLEAN", ctx.BOOLEAN_LITERAL().getText());
        }
        
        return new LiteralNode("UNKNOWN", ctx.getText());
    }
    
    @Override
    public ASTNode visitPrimary(ObjectOrientedParser.PrimaryContext ctx) {
        if (ctx.literal() != null) {
            return visit(ctx.literal());
        }
        
        if (ctx.IDENTIFIER() != null) {
            return new ExpressionNode("IDENTIFIER", ctx.IDENTIFIER().getText());
        }
        
        if (ctx.expression() != null) {
            return visit(ctx.expression());
        }
        
        return new ExpressionNode("PRIMARY", ctx.getText());
    }
    
    // Handle other expression types
    @Override
    protected ASTNode defaultResult() {
        return null;
    }
    
    @Override
    protected ASTNode aggregateResult(ASTNode aggregate, ASTNode nextResult) {
        if (aggregate == null) {
            return nextResult;
        }
        if (nextResult == null) {
            return aggregate;
        }
        
        // If both are non-null, create a container node
        ASTNode container = new ASTNode("AGGREGATE") {
            @Override
            public String toString() {
                return "Multiple Results";
            }
        };
        container.addChild(aggregate);
        container.addChild(nextResult);
        
        return container;
    }
}