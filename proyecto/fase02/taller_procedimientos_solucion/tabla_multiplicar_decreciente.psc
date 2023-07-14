Algoritmo tabla_multiplicar_decreciente
	Definir num, resultado Como Entero
	
	Escribir "ingrese un numero del 1 al 10 -- tabla de mulplicar decreciente "
	leer num
	para i=10 hasta 1 con paso -1 Hacer
		resultado= num * i
		escribir num, " x ", i ," = ", resultado
	FinPara
	
FinAlgoritmo
