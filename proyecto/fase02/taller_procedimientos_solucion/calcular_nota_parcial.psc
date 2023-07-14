Algoritmo calcular_nota_parcial
	Definir notaTaller1, notaTaller2, notaQuiz Como Real
	definir parcial Como Real
	Escribir "las notas se debe digita en una escala del 0 al 5 "
	Escribir "Digite la nota del taller 1"
	leer notaTaller1
	Escribir "Digite la nota del taller 2"
	leer notaTaller2
	Escribir "Digite la nota del Quiz"
	leer notaQuiz
	parcial=(5 - (notaTaller1 + notaTaller2 + notaQuiz) * 0.30) / (0.70)
	Escribir "La nota parcial es : ",parcial
	
	
FinAlgoritmo
