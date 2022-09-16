.MODEL SMALL
.STACK 100H
.DATA


Data segment
		message db '647A791MKZS123T $' 
		CR_LF db 0dh,0ah, '$'

Data ends
.CODE
Code segment
	Assume CS:Code,DS:Data
START:
	mov AX, Data
	mov DS, AX
	mov AH, 40h 
	mov BX, 1 
	mov CX, 15 
	lea DX, message 
	int 21h
	mov AH, 9h 
	mov DX, offset CR_LF 
	int 21h 


	mov message+3," " 
	mov message+7," "
	mov message+8," "
	mov message+9," "
	mov message+10," "
	mov message+14," "

	mov AH, 40h 
	mov BX, 1 
	mov CX, 15  
	lea DX, message 
	int 21h
	mov AH, 4ch 
	int 21h 
Code ends
	end START
