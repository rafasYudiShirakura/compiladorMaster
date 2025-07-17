; ModuleID = 'TesteCompleto'
source_filename = "TesteCompleto.cid"

@inteiro = common global i32 0, align 4
@real = common global double 0, align 4
@caractere = common global i8 0, align 4
@texto = common global i8* 0, align 4
@numeros = common global [ x i32] 0, align 4

define i32 @exemploIO() #0 {
  ret i32 0
}

define i32 @somaVetor([ x i32] %arr) #0 {
  ret i32 soma
  ret i32 0
}

define i32 @fatorial(i32 %n) #0 {
  ret i32 resultado
  ret i32 0
}

define i32 @verificaMaior(i32 %x, i32 %y) #0 {
  %t2 = icmp ne i32 %t2, 0
  br i1 %t2, label %L0, label %L1
L0:
  %t3 = load i32, i32* %x, align 4
  ret i32 %t3
  br label %L2
L1:
  %t4 = load i32, i32* %y, align 4
  ret i32 %t4
  br label %L2
L2:
  %t5 = load i32, i32* %x, align 4
  ret i32 %t5
  %t6 = load i32, i32* %y, align 4
  ret i32 %t6
  ret i32 0
}

define i32 @principal() #0 {
  ret i32 0
}
