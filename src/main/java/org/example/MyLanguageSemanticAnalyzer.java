package org.example;

import org.example.output.generated.ObjectOrientedParser;
import org.example.output.generated.ObjectOrientedParserBaseListener;

import java.util.*;

public class MyLanguageSemanticAnalyzer extends ObjectOrientedParserBaseListener {

    private Map<String, String> tabelaSimbolos = new HashMap<>();
    private List<String> erros = new ArrayList<>();
    private String tipoRetornoMetodoAtual = null;
    private Set<String> tiposPermitidos = new HashSet<>(Arrays.asList(
            "frequenciaMHz", "enderecoDeBlocoEmDisco", "tensaoVolts", "taxaTransferenciaGBpsPrecisa",
            "estadoEnergia", "codigoPostDisplay", "string",
            "int", "long", "float", "double", "boolean", "char", "void", 
            "inteiro", "real", "caractere", "texto"
    ));
    
    private Set<String> funcoesPredefinidas = new HashSet<>(Arrays.asList(
            "mostrarDisplay", "lerEntradaSensor", "printf", "scanf", "print", "read"
    ));
    private boolean metodoTemRetorno = false;

    private StringBuilder codigoLlvm = new StringBuilder();

    private static final Set<String> TIPOS_SUPORTADOS = new HashSet<>(Arrays.asList(
            "int", "float", "double", "char", "string", "frequenciaMHz", "tensaoVolts", "taxaTransferenciaGBpsPrecisa", "codigoPostDisplay", "inteiro", "real", "caractere", "texto"
    ));

    @Override
    public void enterClassDeclaration(ObjectOrientedParser.ClassDeclarationContext ctx) {
        String nomeClasse = ctx.IDENTIFIER().getText();
        System.out.println("Entrando na classe: " + nomeClasse);
        tabelaSimbolos.put(nomeClasse, "CLASSE");
    }

    @Override
    public void exitClassDeclaration(ObjectOrientedParser.ClassDeclarationContext ctx) {
        String nomeClasse = ctx.IDENTIFIER().getText();
        System.out.println("Saindo da classe: " + nomeClasse);

        if (!erros.isEmpty()) {
            System.out.println("\n=== ERROS SEMÂNTICOS ENCONTRADOS ===");
            for (String erro : erros) {
                System.err.println("ERRO: " + erro);
            }
            System.out.println("====================================");
        } else {
            System.out.println("✓ Nenhum erro semântico encontrado na classe " + nomeClasse);
        }
    }

    @Override
    public void enterMethodDeclaration(ObjectOrientedParser.MethodDeclarationContext ctx) {
        String nomeMetodo = ctx.IDENTIFIER().getText();
        metodoTemRetorno = false;

        if (ctx.typeOrVoid() != null) {
            if (ctx.typeOrVoid().VOID() != null) {
                tipoRetornoMetodoAtual = "void";
            } else if (ctx.typeOrVoid().type() != null) {
                tipoRetornoMetodoAtual = ctx.typeOrVoid().type().getText();
                if (!tiposPermitidos.contains(tipoRetornoMetodoAtual)) {
                    adicionarErro(ctx, "Tipo de retorno inválido para o método '" + nomeMetodo + "': '" + tipoRetornoMetodoAtual + "'.");
                }
            }
        }

        if (ctx.formalParameterList() != null) {
            if (ctx.formalParameterList().formalParameter() != null){
                for (ObjectOrientedParser.FormalParameterContext paramCtx : ctx.formalParameterList().formalParameter()) {
                    String tipoParametro = paramCtx.type().getText();
                    String nomeParametro = paramCtx.variableDeclaratorId().IDENTIFIER().getText();
                    tabelaSimbolos.put(nomeParametro, tipoParametro);
                }
            }
        }
        System.out.println("  Entrando no método: " + nomeMetodo + " (retorna: " + tipoRetornoMetodoAtual + ")");
        tabelaSimbolos.put(nomeMetodo, "METODO:" + tipoRetornoMetodoAtual);
    }

    @Override
    public void exitMethodDeclaration(ObjectOrientedParser.MethodDeclarationContext ctx) {
        String nomeMetodo = ctx.IDENTIFIER().getText();
        if (ctx.formalParameterList() != null) {
            if (ctx.formalParameterList().formalParameter() != null){
                for (ObjectOrientedParser.FormalParameterContext paramCtx : ctx.formalParameterList().formalParameter()) {
                    String nomeParametro = paramCtx.variableDeclaratorId().IDENTIFIER().getText();
                    tabelaSimbolos.remove(nomeParametro);
                }
            }
        }

        if (tipoRetornoMetodoAtual != null && !tipoRetornoMetodoAtual.equals("void") && !metodoTemRetorno) {
            adicionarErro(ctx, "Método '" + nomeMetodo + "' com tipo de retorno '" + tipoRetornoMetodoAtual + "' deve ter pelo menos uma instrução de retorno.");
        }
        System.out.println("  Saindo do método: " + nomeMetodo);
        tipoRetornoMetodoAtual = null;
        metodoTemRetorno = false;
    }

    @Override
    public void enterFieldDeclaration(ObjectOrientedParser.FieldDeclarationContext ctx) {
        String tipo = ctx.type().getText();
        if(!TIPOS_SUPORTADOS.contains(tipo) && !tipo.endsWith("[]")){
            adicionarErro(ctx, "Tipo não suportado: " + tipo);
        }
        for (ObjectOrientedParser.VariableDeclaratorContext varCtx : ctx.variableDeclaratorList().variableDeclarator()) {
            String nomeVariavel = varCtx.IDENTIFIER().getText();
            System.out.println("  Campo encontrado: " + tipo + " " + nomeVariavel);
            tabelaSimbolos.put(nomeVariavel, tipo);
            if (varCtx.variableInitializer() != null) {
                String valor = varCtx.variableInitializer().getText();
                System.out.println("    - com valor inicial: " + valor);
                verificarCompatibilidadeTipo(tipo, varCtx.variableInitializer(), nomeVariavel);
            }
        }
    }

    @Override
    public void enterLocalVariableDeclarationStatement(ObjectOrientedParser.LocalVariableDeclarationStatementContext ctx) {
        if (ctx.type() != null) {
            String tipo = ctx.type().getText();
            if(!TIPOS_SUPORTADOS.contains(tipo) && !tipo.endsWith("[]")){
                adicionarErro(ctx, "Tipo não suportado: " + tipo);
            }
            for (ObjectOrientedParser.VariableDeclaratorContext varCtx : ctx.variableDeclaratorList().variableDeclarator()) {
                String nomeVariavel = varCtx.IDENTIFIER().getText();
                System.out.println("  Variável local encontrada: " + tipo + " " + nomeVariavel);
                tabelaSimbolos.put(nomeVariavel, tipo);

                if (varCtx.variableInitializer() != null) {
                    String valor = varCtx.variableInitializer().getText();
                    System.out.println("    - com valor inicial: " + valor);
                    verificarCompatibilidadeTipo(tipo, varCtx.variableInitializer(), nomeVariavel);
                }
            }
        }
    }

    @Override
    public void enterStatement(ObjectOrientedParser.StatementContext ctx) {
        if (ctx.RETURN() != null) {
            metodoTemRetorno = true;
        }
        
        if (ctx.getText().contains("paraCadaPinoNoConector")) {
            System.out.println("  Estrutura de loop FOR encontrada");
            validarLoopFor(ctx);
        }
        
        if (ctx.getText().contains("enquantoConexaoAtiva")) {
            System.out.println("  Estrutura de loop WHILE encontrada");
            validarLoopWhile(ctx);
        }
        
        if (ctx.getText().contains("mostrarDisplay") || ctx.getText().contains("lerEntradaSensor")) {
            System.out.println("  Chamada de função I/O encontrada");
            validarFuncaoIO(ctx);
        }
        
        if (ctx.expressionStatement() != null && 
            ctx.expressionStatement().expression() != null) {
            validarChamadasMetodo(ctx.expressionStatement().expression());
        }
    }
    
    private void validarLoopFor(ObjectOrientedParser.StatementContext ctx) {
        System.out.println("    Validando semântica do loop FOR");
    }
    
    private void validarLoopWhile(ObjectOrientedParser.StatementContext ctx) {
        System.out.println("    Validando semântica do loop WHILE");
    }
    
    private void validarFuncaoIO(ObjectOrientedParser.StatementContext ctx) {
        System.out.println("    Validando chamada de função I/O");
        String instrucao = ctx.getText();
        if (instrucao.contains("mostrarDisplay")) {
            System.out.println("      Função de saída encontrada: mostrarDisplay");
        }
        if (instrucao.contains("lerEntradaSensor")) {
            System.out.println("      Função de entrada encontrada: lerEntradaSensor");
        }
    }
    
    private void validarChamadasMetodo(ObjectOrientedParser.ExpressionContext expr) {
        String textoExpressao = expr.getText();
        
        for (String nomeMetodo : tabelaSimbolos.keySet()) {
            if (tabelaSimbolos.get(nomeMetodo).startsWith("METODO:") && 
                textoExpressao.contains(nomeMetodo + "(")) {
                System.out.println("  Chamada de método encontrada: " + nomeMetodo);
                validarChamadaMetodo(nomeMetodo, expr);
            }
        }
        
        for (String funcaoPredefinida : funcoesPredefinidas) {
            if (textoExpressao.contains(funcaoPredefinida + "(")) {
                System.out.println("  Chamada de função predefinida encontrada: " + funcaoPredefinida);
            }
        }
    }
    
    private void validarChamadaMetodo(String nomeMetodo, ObjectOrientedParser.ExpressionContext expr) {
        String assinaturaMetodo = tabelaSimbolos.get(nomeMetodo);
        if (assinaturaMetodo != null && assinaturaMetodo.startsWith("METODO:")) {
            String tipoRetorno = assinaturaMetodo.substring(7);
            System.out.println("    Método '" + nomeMetodo + "' retorna: " + tipoRetorno);
        }
    }

    private void verificarCompatibilidadeTipo(String tipoDeclarado, ObjectOrientedParser.VariableInitializerContext initCtx, String nomeVariavel) {
        if (initCtx.expression() != null) {
            String tipoExpressao = obterTipoExpressao(initCtx.expression());
            if (!tipoEhCompativel(tipoDeclarado, tipoExpressao)) {
                adicionarErro(initCtx, "Incompatibilidade de tipos para a variável '" + nomeVariavel + "': não é possível converter de '" + 
                          tipoExpressao + "' para '" + tipoDeclarado + "'");
            }
        } else if (initCtx.arrayInitializer() != null) {
            if (!tipoDeclarado.endsWith("[]")) {
                adicionarErro(initCtx, "Não é possível atribuir inicializador de array para variável não-array '" + nomeVariavel + "'");
            } else {
                String tipoElemento = tipoDeclarado.substring(0, tipoDeclarado.length() - 2);
                verificarCompatibilidadeInicializadorArray(tipoElemento, initCtx.arrayInitializer(), nomeVariavel);
            }
        }
    }

    private String obterTipoExpressao(ObjectOrientedParser.ExpressionContext exprCtx) {
        if (exprCtx.assignmentExpression() != null) {
            return obterTipoExpressaoAtribuicao(exprCtx.assignmentExpression());
        }
        return "desconhecido";
    }

    private String obterTipoExpressaoAtribuicao(ObjectOrientedParser.AssignmentExpressionContext ctx) {
        if (ctx.conditionalExpression() != null && !ctx.conditionalExpression().isEmpty()) {
            return obterTipoExpressaoCondicional(ctx.conditionalExpression(0));
        }
        return "desconhecido";
    }

    private String obterTipoExpressaoCondicional(ObjectOrientedParser.ConditionalExpressionContext ctx) {
        if (ctx.conditionalOrExpression() != null) {
            return obterTipoExpressaoOuCondicional(ctx.conditionalOrExpression());
        }
        return "desconhecido";
    }

    private String obterTipoExpressaoOuCondicional(ObjectOrientedParser.ConditionalOrExpressionContext ctx) {
        if (ctx.conditionalAndExpression() != null && !ctx.conditionalAndExpression().isEmpty()) {
            return obterTipoExpressaoECondicional(ctx.conditionalAndExpression(0));
        }
        return "desconhecido";
    }

    private String obterTipoExpressaoECondicional(ObjectOrientedParser.ConditionalAndExpressionContext ctx) {
        if (ctx.inclusiveOrExpression() != null && !ctx.inclusiveOrExpression().isEmpty()) {
            return obterTipoExpressaoOuInclusivo(ctx.inclusiveOrExpression(0));
        }
        return "desconhecido";
    }

    private String obterTipoExpressaoOuInclusivo(ObjectOrientedParser.InclusiveOrExpressionContext ctx) {
        if (ctx.exclusiveOrExpression() != null && !ctx.exclusiveOrExpression().isEmpty()) {
            return obterTipoExpressaoOuExclusivo(ctx.exclusiveOrExpression(0));
        }
        return "desconhecido";
    }

    private String obterTipoExpressaoOuExclusivo(ObjectOrientedParser.ExclusiveOrExpressionContext ctx) {
        if (ctx.andExpression() != null && !ctx.andExpression().isEmpty()) {
            return obterTipoExpressaoE(ctx.andExpression(0));
        }
        return "desconhecido";
    }

    private String obterTipoExpressaoE(ObjectOrientedParser.AndExpressionContext ctx) {
        if (ctx.equalityExpression() != null && !ctx.equalityExpression().isEmpty()) {
            return obterTipoExpressaoIgualdade(ctx.equalityExpression(0));
        }
        return "desconhecido";
    }

    private String obterTipoExpressaoIgualdade(ObjectOrientedParser.EqualityExpressionContext ctx) {
        if (ctx.relationalExpression() != null && !ctx.relationalExpression().isEmpty()) {
            return obterTipoExpressaoRelacional(ctx.relationalExpression(0));
        }
        return "desconhecido";
    }

    private String obterTipoExpressaoRelacional(ObjectOrientedParser.RelationalExpressionContext ctx) {
        if (ctx.shiftExpression() != null && !ctx.shiftExpression().isEmpty()) {
            return obterTipoExpressaoDeslocamento(ctx.shiftExpression(0));
        }
        return "desconhecido";
    }

    private String obterTipoExpressaoDeslocamento(ObjectOrientedParser.ShiftExpressionContext ctx) {
        if (ctx.additiveExpression() != null && !ctx.additiveExpression().isEmpty()) {
            return obterTipoExpressaoAditiva(ctx.additiveExpression(0));
        }
        return "desconhecido";
    }

    private String obterTipoExpressaoAditiva(ObjectOrientedParser.AdditiveExpressionContext ctx) {
        if (ctx.multiplicativeExpression() != null && !ctx.multiplicativeExpression().isEmpty()) {
            return obterTipoExpressaoMultiplicativa(ctx.multiplicativeExpression(0));
        }
        return "desconhecido";
    }

    private String obterTipoExpressaoMultiplicativa(ObjectOrientedParser.MultiplicativeExpressionContext ctx) {
        if (ctx.unaryExpression() != null && !ctx.unaryExpression().isEmpty()) {
            return obterTipoExpressaoUnaria(ctx.unaryExpression(0));
        }
        return "desconhecido";
    }

    private String obterTipoExpressaoUnaria(ObjectOrientedParser.UnaryExpressionContext ctx) {
        if (ctx.unaryExpressionNotPlusMinus() != null) {
            return obterTipoExpressaoUnariaSemMaisMenos(ctx.unaryExpressionNotPlusMinus());
        } else if (ctx.preIncrementExpression() != null) {
            return obterTipoExpressaoUnaria(ctx.preIncrementExpression().unaryExpression());
        } else if (ctx.preDecrementExpression() != null) {
            return obterTipoExpressaoUnaria(ctx.preDecrementExpression().unaryExpression());
        } else if (ctx.unaryExpression() != null) {
            return obterTipoExpressaoUnaria(ctx.unaryExpression());
        }
        return "desconhecido";
    }

    private String obterTipoExpressaoUnariaSemMaisMenos(ObjectOrientedParser.UnaryExpressionNotPlusMinusContext ctx) {
        if (ctx.postfixExpression() != null) {
            return obterTipoExpressaoPosfixo(ctx.postfixExpression());
        } else if (ctx.castExpression() != null) {
            return "desconhecido";
        }
        return "desconhecido";
    }

    private String obterTipoExpressaoPosfixo(ObjectOrientedParser.PostfixExpressionContext ctx) {
        if (ctx.primary() != null) {
            return obterTipoExpressaoPrimaria(ctx.primary());
        }
        
        // Handle method calls like verificaMaior(a, b)
        String textoExpressao = ctx.getText();
        for (String nomeMetodo : tabelaSimbolos.keySet()) {
            if (tabelaSimbolos.get(nomeMetodo).startsWith("METODO:") && 
                textoExpressao.contains(nomeMetodo + "(")) {
                String assinaturaMetodo = tabelaSimbolos.get(nomeMetodo);
                return assinaturaMetodo.substring(7); // Remove "METHOD:" prefix
            }
        }
        
        // Handle I/O functions
        if (textoExpressao.contains("lerEntradaSensor(")) {
            return "frequenciaMHz"; // lerEntradaSensor returns an integer type
        }
        
        return "desconhecido";
    }

    private String obterTipoExpressaoPrimaria(ObjectOrientedParser.PrimaryContext primaryCtx) {
        if (primaryCtx == null) return "desconhecido";
        
        if (primaryCtx.literal() != null) {
            return obterTipoLiteral(primaryCtx.literal());
        } else if (primaryCtx.IDENTIFIER() != null) {
            String nomeVariavel = primaryCtx.IDENTIFIER().getText();
            return tabelaSimbolos.getOrDefault(nomeVariavel, "desconhecido");
        } else if (primaryCtx.THIS() != null) {
            return "this";
        } else if (primaryCtx.getText().equals("null")) {
            return "null";
        } else if (primaryCtx.ioExpression() != null) {
            // Handle I/O expressions
            String ioText = primaryCtx.ioExpression().getText();
            if (ioText.contains("lerEntradaSensor(")) {
                return "frequenciaMHz"; // lerEntradaSensor returns an integer type
            } else if (ioText.contains("mostrarDisplay(")) {
                return "sinalDeAck"; // mostrarDisplay returns void (sinalDeAck)
            }
        }
        return "desconhecido";
    }

    private String obterTipoLiteral(ObjectOrientedParser.LiteralContext literalCtx) {
        if (literalCtx.INTEGER_LITERAL() != null) {
            return "frequenciaMHz";
        } else if (literalCtx.FLOAT_LITERAL() != null) {
            return "tensaoVolts";
        } else if (literalCtx.CHAR_LITERAL() != null) {
            return "codigoPostDisplay";
        } else if (literalCtx.STRING_LITERAL() != null) {
            return "string";
        } else if (literalCtx.BOOLEAN_LITERAL() != null) {
            return "estadoEnergia";
        }
        return "desconhecido";
    }

    private boolean tipoEhCompativel(String tipoDeclarado, String tipoExpressao) {
        if (tipoDeclarado.equals(tipoExpressao)) {
            return true;
        }
        
        if ("null".equals(tipoExpressao) && !ehTipoPrimitivo(tipoDeclarado)) {
            return true;
        }
        
        if (ehTipoNumerico(tipoDeclarado) && ehTipoNumerico(tipoExpressao)) {
            return ehConversaoNumericaValida(tipoExpressao, tipoDeclarado);
        }
        
        return false;
    }

    private boolean ehTipoPrimitivo(String tipo) {
        return Arrays.asList("frequenciaMHz", "enderecoDeBlocoEmDisco", "tensaoVolts", 
                            "taxaTransferenciaGBpsPrecisa", "estadoEnergia", "codigoPostDisplay",
                            "int", "long", "float", "double", "boolean", "char",
                            "inteiro", "real", "caractere").contains(tipo);
    }

    private boolean ehTipoNumerico(String tipo) {
        return Arrays.asList("frequenciaMHz", "enderecoDeBlocoEmDisco", "tensaoVolts", 
                            "taxaTransferenciaGBpsPrecisa", "int", "long", "float", "double",
                            "inteiro", "real").contains(tipo);
    }

    private boolean ehConversaoNumericaValida(String tipoDe, String tipoPara) {
        if (tipoDe.equals("frequenciaMHz") || tipoDe.equals("int") || tipoDe.equals("inteiro")) {
            return Arrays.asList("frequenciaMHz", "enderecoDeBlocoEmDisco", "tensaoVolts", 
                                "taxaTransferenciaGBpsPrecisa", "int", "long", "float", "double",
                                "inteiro", "real").contains(tipoPara);
        }
        if (tipoDe.equals("enderecoDeBlocoEmDisco") || tipoDe.equals("long")) {
            return Arrays.asList("enderecoDeBlocoEmDisco", "tensaoVolts", "taxaTransferenciaGBpsPrecisa",
                                "long", "float", "double", "real").contains(tipoPara);
        }
        if (tipoDe.equals("tensaoVolts") || tipoDe.equals("float") || tipoDe.equals("real")) {
            return Arrays.asList("tensaoVolts", "taxaTransferenciaGBpsPrecisa", "float", "double", "real").contains(tipoPara);
        }
        if (tipoDe.equals("taxaTransferenciaGBpsPrecisa") || tipoDe.equals("double")) {
            return Arrays.asList("taxaTransferenciaGBpsPrecisa", "double").contains(tipoPara);
        }
        return false;
    }

    private void verificarCompatibilidadeInicializadorArray(String tipoElemento, ObjectOrientedParser.ArrayInitializerContext arrayCtx, String nomeVariavel) {
        if (arrayCtx.variableInitializer() != null) {
            for (ObjectOrientedParser.VariableInitializerContext initCtx : arrayCtx.variableInitializer()) {
                verificarCompatibilidadeTipo(tipoElemento, initCtx, nomeVariavel + "[]");
            }
        }
    }

    public List<String> obterErros() {
        return new ArrayList<>(erros);
    }

    public boolean temErros() {
        return !erros.isEmpty();
    }

    private void adicionarErro(org.antlr.v4.runtime.ParserRuleContext ctx, String mensagem) {
        int linha = ctx.getStart().getLine();
        int coluna = ctx.getStart().getCharPositionInLine();
        String erroFormatado = String.format("ERRO SEMÂNTICO na linha %d:%d - %s", linha, coluna, mensagem);
        erros.add(erroFormatado);
    }
}