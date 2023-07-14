Algoritmo restaurante_descuento
	Definir valorConsumo, descuento, totalPagando Como Real
	salir = 0
	Mientras salir=0 Hacer
		Escribir "Digite el valor del consumo "
		leer valorConsumo
		si valorConsumo >= 50000 entonces
			descuento = valorConsumo * 0.20
		SiNo
			descuento = 0
		FinSi
		totalPagando = valorConsumo - descuento
		Escribir "valor consumo ",valorConsumo
		Escribir "Descuento ",descuento
		Escribir "Total pagado ",totalPagando
		Escribir "Si desea agregar otro cliente presionone 0 o cualquier otro numero para salir"
		leer salir
	FinMientras
FinAlgoritmo
