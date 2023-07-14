Algoritmo calcular_hora
	Definir h, m, s Como Entero
	Escribir "Digite hora : "
	leer h
	Escribir "Digite minutos : "
	leer m
	Escribir "Digite segundos : "
	leer s
	Mientras h <= 23 Hacer
		Mientras m <= 59 Hacer
			Mientras s<=59 Hacer
				Limpiar Pantalla
				si h > 9 Entonces
					Escribir h Sin Saltar
				SiNo
					Escribir "0",h Sin Saltar
				FinSi
				si m > 9 Entonces
					Escribir ":",m Sin Saltar
				SiNo
					Escribir ":0",m Sin Saltar
				FinSi
				si s > 9 Entonces
					Escribir ":",s Sin Saltar
				SiNo
					Escribir ":0",s Sin Saltar
				FinSi
				s=s+1
				Esperar 1 Segundos
			finMientras
			s=0
			m=m+1
		FinMientras
		m=0
		h=h+1
		si h==24 Entonces
			h=0
		FinSi
	FinMientras
FinAlgoritmo
