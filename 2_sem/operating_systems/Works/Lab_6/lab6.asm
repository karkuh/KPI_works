.MODEL small 
.Stack 100h 
DATA segment 

a dw 2 
c dw 5 
d dw 1 
q dw 4 
w dw 23 
e dw 2 
r dw ? 
g dw ? 
y dw ? 
u dw ? 
znam dw ? 

String db 'Error! Devision by zero.$' 
DATA ends 
CODE segment 
assume CS:CODE, DS:DATA 


Start: 
MOV AX, DATA
mov DS,AX 

mov AX, a 
cwd 
idiv e 
mov y, AX 

mov AX, d 
cwd
imul q
mov u,AX

mov AX,y
sbb AX,u

cmp AX, 1 
je @err 

sbb AX,1
mov znam,AX

mov AX, c 
cwd 
imul d 
mov r, AX 

mov AX, w 
adc AX, r 
cwd
idiv znam 

mov g,AX 
xor AX,AX 
mov AX,g 
push AX 
cmp AX, 0 
jns @plus 
mov ah, 02h 
mov DL, '-'
int 21h
pop AX 
neg AX 
@plus:
xor CX, CX 
mov BX,10 

@dvsn:
xor DX,DX 
div BX
push DX 

inc CX 
test AX,AX 
jnz @dvsn 
mov AH,02h 
@vivod:
pop DX 
add DL, 30h 
int 21h
loop @vivod 
jmp @end 
@err: 
mov DX, offset String 
mov AH, 09h
int 21h
@end: 
mov AX,4c00h
int 21h
CODE ends 
end Start