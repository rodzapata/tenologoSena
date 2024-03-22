package co.edu.sena.demo01;

import java.util.Scanner;

public class EjercicioNumero12 {

    public static void main(String[] args) {
        // 1. Definicion e inicializacion de la varible de control (1 vez)
        // 2. Evaluacion de la variable control con la condicion de salida ()
        // 3. El cambio, modificacion o mutacion de la variable de control ()
        Scanner scanner = new Scanner(System.in);
       int opcion = 0;

        do {
            System.out.println("Menu de operaciones");
            System.out.println("1 - Suma");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicacion");
            System.out.println("4 - Division");
            System.out.println("5 - Salir");
            System.out.println("Ingrese ocion: ");

            opcion = scanner.nextInt();

            if(opcion == 1) {
                System.out.println();
                System.out.println();
                System.out.println("Opt 1 - Suma de numeros");
                System.out.println("Ingrese n1");
                int n1 = scanner.nextInt();
                System.out.println("Ingrese n2");
                int n2 = scanner.nextInt();
                int resultado = n1 + n2;
                System.out.println("El resultado de la suma es " + resultado);
            } else if(opcion == 2) {
                System.out.println();
                System.out.println();
                System.out.println("Opt 2 - Resta de numeros");
                System.out.println("Ingrese n1");
                int n1 = scanner.nextInt();
                System.out.println("Ingrese n2");
                int n2 = scanner.nextInt();
                int resultado = n1 - n2;
                System.out.println("El resultado de la resta es " + resultado);
            } else if(opcion == 3) {
                System.out.println();
                System.out.println();
                    System.out.println("Opt 3 - Multiplicacion de numeros");
                System.out.println("Ingrese n1");
                int n1 = scanner.nextInt();
                System.out.println("Ingrese n2");
                int n2 = scanner.nextInt();
                int resultado = n1 * n2;
                System.out.println("El resultado de la multiplicacion es " + resultado);
            } else if(opcion == 4) {
                System.out.println();
                System.out.println();
                System.out.println("Opt 4 - Division de numeros");
                System.out.println("Ingrese n1");
                float n1 = scanner.nextFloat();
                System.out.println("Ingrese n2");
                float n2 = scanner.nextFloat();
                float resultado = n1 / n2;
                System.out.println("El resultado de la division es " + resultado);
            } else if(opcion == 5) {
                System.out.println("Bye bye!");
            } else {
                System.out.println("Opcion no valida");
            }


        } while(opcion != 5);

    }

}
