Algoritmo duplicar_capital
	Definir capital Como Entero;
	definir interes Como Real
	Escribir "Digite capital inicial"
	leer capital
	Escribir "Digite interes anual"
	leer interes
	interesAnual=(capital * interes)/100
	total=Capital
	año=0
	Mientras total < (capital *2) Hacer
		total = total + interesAnual
		año = año + 1
	FinMientras
	Escribir "necesita ", año, " para duplicarse el capital"
	
FinAlgoritmo
