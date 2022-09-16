MODEL small
.Stack 100h
DATA segment 
	a dw 1
	b dw 2
	x dw ? 

	String db 'Error! Division by zero.$'
DATA ends

CODE segment 
	Assume CS:CODE, DS:DATA
Start:	mov AX, DATA
	mov ds, AX

	mov AX, a
	cmp AX, b
	jg @onecond
	jl @twocond

	;a==b
	;x = -4
	xor AX, AX
	mov AX, -4
	mov x, AX
	jmp @otv

	;a>b
	;x = (a^3+b)/a
@onecond:
	xor AX, AX
	mov AX, a
	cmp AX, 0
	je @error
	
	mov AX, a
	cwd
	imul a
	cwd
	imul a
	adc AX,b
	idiv a
	mov x, AX
	jmp @otv

	;a<b
	;x = (3*a-5)/b
@twocond:
	xor AX, AX
	mov AX, b
	cmp AX, 0
	je @error
	mov AX, 3
	imul a
	sbb AX, 5
	cwd
	idiv b
	mov x, AX
	jmp @otv

@otv:	xor AX, AX
	mov AX, x
	push AX
	cmp AX, 0
	jns @plus 

	mov dl, '-'
	mov AH, 02h
	int 21h
	pop AX
	neg AX

@plus:	xor CX, CX
	mov BX, 10

@unit:	xor DX, DX
	div BX
	push DX
	inc CX
	test AX, AX
	jnz short @unit 
	mov AH, 02h

@vivod: pop DX
	add DL, 30h ; +30
	int 21h
	loop @vivod
	jmp @end

@error:	mov DX, offset String
	mov AH, 09h
	int 21h

@end:	mov AX, 4c00h
	int 21h
CODE ends
end Start
