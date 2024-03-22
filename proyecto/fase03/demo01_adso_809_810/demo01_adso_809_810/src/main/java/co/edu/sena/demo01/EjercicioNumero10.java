package co.edu.sena.demo01;

import java.util.Scanner;

public class EjercicioNumero10 {

    /* La profesora Maria requiere un algoritmo que permita ingresar n cantidad de notas
    y calcular el promedio de las notas ingresadas
     */
    public static void main(String[] args) {
        //profesora = 9 (0-8)
        Scanner scanner = new Scanner(System.in);
        float sumatoria = 0;
        int contador = 0;
        char ingresar = 's';
        while(ingresar == 's') {
            System.out.println("Ingrese nota:");
            float nota = scanner.nextFloat();
            sumatoria += nota; // sumatoria = sumatoria + nota;

            System.out.println("Desea continuar? s/n");
            ingresar = scanner.next().charAt(0);
            contador++;
        }

        System.out.println("El resultado es ");
        float prom = sumatoria / contador;
        System.out.println("Su nota promedio es: " + prom);
    }
}
/*
P1

10   10
9    19
8    27
3    30
4    34
5    39

39 / 6

notaFinal = 6.5


p2

5
10
9
9
8
7
1
0
10

59 / 9
notaFinal = 6.5

* */