package co.edu.sena.demo01;

import java.util.Scanner;

public class EjercicioNumero6 {
    /**
     * Una tienda de prendas de vestir requiere un software el cual permita calcular el valor total de venta por concepto de
     * compra por cada cliente, el sistema requiere capturar el nombre, el genero, edad y valor de la compra del cliente.
     *
     * Si el valor de la compra es superior a 2.500.000 se debera aplicar un descuento del 10%
     * Si el valor de la compra esta entre 1.400.000 y 2.500.000 se debera aplicar un descuento del 5%
     * Si la edad del comprador esta entre 18 años y 25 y adicionalmente es mujer se le aplicara un descuento de 5%
     * Si la edad del comprador esta entre 20 años y 30 y adicionalmente es hombre se le aplicara un descuento de 3%
     *
     * El sistema debe informar al comprador los descuento aplicados
     * informar el valor total de la compra sin descuento
     * informar el valor total de la compra con descuento
     *
     * Gustavo, m, 40, 5.000.000
     * descuento1 = 500.000
     * descuento2 = 0
     * pago final es de 4.500.000
     *
     * Gabriela, f, 19, 3.000.000
     * descuento1 = 300.000
     * descuento2 = 150.000
     * Pago final es de 2.550.000
     *
     */

    public static void main(String[] args) {
        //Entradas ****************************
        Scanner scanner = new Scanner(System.in);

        String nombre;
        char genero;
        int edad;
        int valorCompra;

        System.out.println("Ingrese nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese genero: ");
        genero = scanner.nextLine().charAt(0);

        System.out.println("Ingrese edad: ");
        edad = scanner.nextInt();

        System.out.println("Ingrese valor de la compra: ");
        valorCompra = scanner.nextInt();

        //Proceso ****************************
        int porcentajeDescuento1 = 0;
        int valorDescuento1 = 0;

        if(valorCompra > 2500000) {
            porcentajeDescuento1 = 10;
        } else if (valorCompra >= 1400000 && valorCompra < 2500000){
            porcentajeDescuento1 = 5;
        }

        valorDescuento1 = valorCompra * porcentajeDescuento1 / 100;

        //*************************************
        int porcentajeDescuento2 = 0;
        int valorDescuento2 = 0;

        if(edad >= 18 && edad <= 25 && genero == 'f') {
            porcentajeDescuento2 = 5;
        }else if(edad >= 20 && edad <= 30 && genero == 'm'){
            porcentajeDescuento2 = 3;
        }

        valorDescuento2 = valorCompra * porcentajeDescuento2 / 100;

        int valorFinal = valorCompra - valorDescuento1 - valorDescuento2;

        // Salida *****************************
        System.out.println("Señor " + nombre+ " esta es la informacion de su compra: ");
        if(porcentajeDescuento1 > 0) {
            System.out.println("Un descuento del " + porcentajeDescuento1 + "% ");
            System.out.println("Por valor de $" + valorDescuento1 + " pesos ");
        }
        if(porcentajeDescuento2 > 0) {
            System.out.println("Un descuento del " + porcentajeDescuento2 + "% ");
            System.out.println("Por valor de $" + valorDescuento2 + " pesos ");
        }
        System.out.println("Su compra sin descuento es de $" + valorCompra);
        System.out.println("El valor final de su compra con el descuento es de $" + valorFinal);

    }
}
