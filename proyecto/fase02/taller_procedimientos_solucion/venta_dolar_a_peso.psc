Algoritmo venta_dolar_a_peso
	Definir precioCamisaDolar, totalVenta Como Real
	definir trmDolar Como Real
	totalVenta=0
	Escribir "digite el valor de la tasa de cambio en dolar par el dia de hoy "
	leer trmDolar
	para n=1 Hasta 5 Hacer
		Escribir "Digite el valor en dolar de la camisa No.",n
		leer precioCamisaDolar
		totalVenta=totalVenta + (precioCamisaDolar * trmDolar)
	FinPara
	Escribir "el valor total en pesos de la compra es ",totalVenta
FinAlgoritmo
