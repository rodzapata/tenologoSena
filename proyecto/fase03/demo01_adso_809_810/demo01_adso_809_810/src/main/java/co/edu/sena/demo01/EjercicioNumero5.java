package co.edu.sena.demo01;

import java.util.Scanner;

public class EjercicioNumero5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero: ");
        numero = scanner.nextInt();

        /*if(numero > 0) {
            System.out.println("El numero " + numero+ " es positivo!");
        } else {
            if(numero < 0) {
                System.out.println("El numero " + numero + " es negativo!");
            } else {
                System.out.println("El numero es cero");
            }
        }*/

        if(numero > 0) {
            System.out.println("El numero " + numero+ " es positivo!");
        } else if (numero < 0){
            System.out.println("El numero " + numero + " es negativo!");
        } else {
            System.out.println("El numero es cero");
        }

        System.out.println("Bye!");

    }


}
