	.MODEL TINY
	.CODE
	ORG 	100h
prog:
	mov	AH, 09h
	mov     DX, offset msg
	int 	21h
	mov	AH, 4Ch		
	mov     Al, 0			
	int	21h
	RET
msg 	db	"1)Hello World!", 0Dh, 0Ah, '$'
	end	prog