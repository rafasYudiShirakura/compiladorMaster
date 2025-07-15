; ModuleID = 'TesteCompleto'
source_filename = "TesteCompleto.cid"

@inteiro = common global i32 0, align 4
@real = common global double 0, align 4
@caractere = common global i8 0, align 4
@texto = common global i8* 0, align 4
@numeros = common global [ x i32] 0, align 4

define i32 @soma(i32 %a, i32 %b) #0 {
  ret i32 a+b
  %t1 = load i32, i32* %a
  %t2 = load i32, i32* %b
  %t3 = add nsw i32 %t1, %t2
  ret i32 0
}

define i32 @verificaMaior(i32 %x, i32 %y) #0 {
  %t4 = icmp ne i32 %t4, 0
  br i1 %t4, label %L0, label %L1
L0:
  %t5 = load i32, i32* %x, align 4
  ret i32 %t5
  br label %L2
L1:
  %t6 = load i32, i32* %y, align 4
  ret i32 %t6
  br label %L2
L2:
  %t7 = load i32, i32* %x, align 4
  ret i32 %t7
  %t8 = load i32, i32* %y, align 4
  ret i32 %t8
  ret i32 0
}
