TITLE	ASCOM	COM_TASK_THREE
CODESEG SEGMENT	PARA	'Code'
ASSUME 	CS:CODESEG, DS:CODESEG, SS:CODESEG, ES:CODESEG
ORG	100h
PROG:	JMP MAIN
msg 	db	"3)Hello World!", 0Dh, 0Ah, '$'
MAIN	PROC	NEAR
	mov	AH, 09h
	mov     DX, offset msg
	int 	21h
	mov	AH, 4Ch		
	mov     Al, 0			
	int	21h
MAIN	ENDP
CODESEG	ENDS
	END PROG