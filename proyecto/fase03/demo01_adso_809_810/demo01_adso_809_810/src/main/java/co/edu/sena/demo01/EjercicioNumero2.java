package co.edu.sena.demo01;


import java.util.Scanner;

public class EjercicioNumero2 {

    /**
     * El instructor Jairo requiere un programa con el cual desea calificar a sus aprendices
     * Donde recibira por cada aprendiz 5 notas, cada una con un porcentaje para calcular la nota final
     * la nota 1 tiene un peso de 15%
     * la nota 2 tiene un peso del 10%
     * la nota 3 tiene un peso del 10%
     * la nota 4 tiene un peso del 30%
     * la nota 5 tiene un peso del 35%
     * los valores maximos a recibir por nota son del peso 0 a 5 y con el valor de 3.5 en adelante se aprueba
     *
     * Se require que el programa capture el nombre del del aprendiz, las 5 notas e informe cual es la nota final
     * y si aprueba o pierde el resultado de aprendizaje, pero debe informar lo siguiente
     * si la nota esta en un rango de 3.5 a 4.3 inidicar que debe estudiar mas y poner carita seria
     * y si el rango es de 4.4 a 5 poner felicitaciones y carita feliz
     * @param args
     */
    public static void main(String[] args) {

        //Definicion de variables
        Scanner scanner = new Scanner(System.in);
        String nombreAprendiz;
        float n1, n2, n3, n4, n5;
        float p1, p2, p3, p4, p5;
        float notaFinal;

        //Ingreso de las variables por parte del usuario
        System.out.println("***** BIENVENIDO AL SOFTWARE DE CALIFICACIONES ****");
        System.out.println("A continuacion se le pediran los datos del aprendiz.");

        System.out.println("Ingrese el nombre del aprendiz: ");
        nombreAprendiz = scanner.nextLine();

        System.out.println("Ingrese nota 1: ");
        n1 = scanner.nextFloat();

        System.out.println("Ingrese nota 2: ");
        n2 = scanner.nextFloat();

        System.out.println("Ingrese nota 3: ");
        n3 = scanner.nextFloat();

        System.out.println("Ingrese nota 4: ");
        n4 = scanner.nextFloat();

        System.out.println("Ingrese nota 5: ");
        n5 = scanner.nextFloat();

        //Ejecuto los procesos

        p1 = n1 * 0.15f;
        p2 = n2 * 0.1f;
        p3 = n3 * 0.1f;
        p4 = n4 * 0.3f;
        p5 = n5 * 0.35f;

        notaFinal = p1 + p2 + p3 + p4 + p5;

        //Imprimo resultados
        System.out.println("Aprendiz " + nombreAprendiz + " su nota final es: " + notaFinal);

        //V && V = V

        //true or false
        if (notaFinal > 4.3) {
            System.out.println("Usted " + nombreAprendiz + " fue APROBADO \uD83D\uDE00!");
        }
        else if(notaFinal >= 3.5 && notaFinal <= 4.3) {
            System.out.println("Usted " + nombreAprendiz + " fue APROBADO pero ponga cuidado \uD83E\uDEE5!");
        }
        else {
            System.out.println("Usted " + nombreAprendiz + " tristemente REPROBO \uD83D\uDE2E\u200D\uD83D\uDCA8!");
        }

        //n1 = 3; operador de asignacion empty
        //4 * 5 + n1; operadores aritmeticos valor numerico
        //n > f; operadores relacionales valor logico true or false


    }

    /*
    * EPS
    * Entrada
    * - nombre del aprendiz es un texto entonces requiero una variable tipo String
    * - 5 variables del tipo decimal, n1,n2,n3,n4,n5 y seran del tipo float, estas variables almacenaran los datos de las notas
    * Proceso
    * - 5 variables del tipo decilmal, p1,p2,p3,p4,p5 y seran del tipo float, estas variables almacenaran los datos del calculo porcentual de cada nota
    * - 1 variable del tipo decimal para acumular los valores parciales de todas las notas, la nota final
    * Salida
    * - imprimir la variable de nota final y la variable del nombre
    *
    * */


}
