; ModuleID = 'CompiladorCompleto'
source_filename = "CompiladorCompleto.cid"

@inteiro = common global i32 0, align 4
@real = common global double 0, align 4
@caractere = common global i8 0, align 4
@texto = common global i8* 0, align 4
@numeros = common global [ x i32] 0, align 4
@decimais = common global [ x double] 0, align 4

define i32 @soma(i32 %a, i32 %b) #0 {
  ret i32 a+b
  %t1 = load i32, i32* %a
  %t2 = load i32, i32* %b
  %t3 = add nsw i32 %t1, %t2
  ret i32 0
}

define i32 @multiplicacao(i32 %x, i32 %y) #0 {
  ret i32 resultado
  ret i32 0
}

define i32 @maiorValor(i32 %num1, i32 %num2) #0 {
  %t5 = icmp ne i32 %t5, 0
  br i1 %t5, label %L0, label %L1
L0:
  %t6 = load i32, i32* %num1, align 4
  ret i32 %t6
  br label %L2
L1:
  %t7 = load i32, i32* %num2, align 4
  ret i32 %t7
  br label %L2
L2:
  %t8 = load i32, i32* %num1, align 4
  ret i32 %t8
  %t9 = load i32, i32* %num2, align 4
  ret i32 %t9
  ret i32 0
}

define i8* @classificarNumero(i32 %valor) #0 {
  %t10 = icmp ne i32 %t10, 0
  br i1 %t10, label %L3, label %L4
L3:
  %t11 = icmp ne i32 %t11, 0
  br i1 %t11, label %L6, label %L7
L6:
  ret i32 "Grande"
  br label %L8
L7:
  ret i32 "Pequeno Positivo"
  br label %L8
L8:
  ret i32 "Grande"
  ret i32 "Pequeno Positivo"
  br label %L5
L4:
  ret i32 "Negativo ou Zero"
  br label %L5
L5:
  %t17 = icmp ne i32 %t17, 0
  br i1 %t17, label %L9, label %L10
L9:
  ret i32 "Grande"
  br label %L11
L10:
  ret i32 "Pequeno Positivo"
  br label %L11
L11:
  ret i32 "Grande"
  ret i32 "Pequeno Positivo"
  ret i32 "Negativo ou Zero"
  ret i8* 0
}

define i32 @calcularExpressao(i32 %a, i32 %b, i32 %c) #0 {
  %t23 = load i32, i32* %a
  %t24 = load i32, i32* %b
  %t25 = add nsw i32 %t23, %t24
  ret i32 resultado
  ret i32 0
}

define double @operacoesComplexas(double %x, double %y) #0 {
  %t27 = load i32, i32* %x
  %t28 = load i32, i32* %y
  %t29 = add nsw i32 %t27, %t28
  %t30 = icmp ne i32 %t30, 0
  br i1 %t30, label %L12, label %L13
L12:
  ret i32 resultado3
  br label %L14
L13:
  ret double 1.0
  br label %L14
L14:
  ret i32 resultado3
  ret double 1.0
  ret double 0
}
