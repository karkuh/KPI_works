.MODEL SMALL
.DATA
msg 	db	"1)Hello World!", 0Dh, 0Ah, '$'
.CODE
prog:
	mov	AX, @DATA
	mov	DS, AX
	mov	AH, 09h		
	mov	DX, offset msg
	int 	21h			
	mov	AH, 4Ch		
	mov     Al, 0			
	int	21h											
END prog