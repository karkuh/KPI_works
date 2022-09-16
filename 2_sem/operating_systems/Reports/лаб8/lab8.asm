init_Data macro
	mov AX, @data
	mov DS,AX
endm

end_Prog macro
	mov AX, 4c00h
	int 21h

endm

positive_Number macro		
	local makeDec,printDec				
	xor CX, CX			
   	mov BX, 10  		
	makeDec:
    		xor DX, DX			
    		div BX			
    		push DX			
    		inc CX			
    		test AX, AX			
    		jnz makeDec			
    		mov AH, 02h			
	printDec:
    		pop DX			
    		add DL, 30h			
    		int 21h 
    		loop printDec		
endm

negative_Number macro 		
    push AX			
    mov AH, 02h			
    mov DL, '-'
    int 21h     
    pop AX			 
    neg AX 			
endm

new_Line macro			
    mov DX,offset CR_LF    
    mov AH,09h 
    int 21h
endm

probil macro			
    mov AH, 02h
    mov DL, ' '
    int 21h
endm

print_Matrix macro		
local str,clm,pos,neg,nextElem			

    xor SI,SI			
    xor CX,CX			
    mov CX,strn			
    new_Line			
str:
    push CX			
    mov CX,clmn		
clm:
    xor AX,AX			
    mov AX, arr+si		
    push CX			
    cmp AX,0			
    jns pos			
    jmp neg			
pos:
    positive_Number			
    jmp nextElem		
neg:
    negative_Number		
    positive_Number			
    jmp nextElem		

nextElem:			
    probil			
    add SI,2			
    pop CX			
    loop clm 		
    new_Line			
    pop CX			
    loop str  			
endm

task macro
local cycle, skip

xor BX,BX
xor SI,SI
mov CX,5
  cycle:
	push SI
	mov AX, arr_elem
	mov temp,CX
	push CX 
	mov CX, strn
	sub CX, temp
	add CX,1
	cwd
	imul arr_elem
	mov arr_elem, AX
	push BX
	mov BX,3
	cmp temp,BX
	je skip
	mov bx,temp
	sub BX,1
	add BX,BX
	mov SI,BX
	pop BX
	mov AX, arr_elem
	cwd
	imul arr_elem
	cwd
	mov arr_elem,AX
	xor AX,AX
	push BX
  skip:
	pop BX
	pop CX
	pop SI
	add BX,10
	add SI,2
	loop cycle

endm



.model small
.stack 100h


.data

arr dw 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25
temp dw ?
CR_LF db 0dh,0ah, '$'
strn equ 5
clmn equ 5
arr_elem equ arr[BX][SI]


.code

First:
init_Data
print_Matrix
task
print_Matrix
end_Prog
end First
