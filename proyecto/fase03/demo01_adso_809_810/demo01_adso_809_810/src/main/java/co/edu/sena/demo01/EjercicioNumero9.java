package co.edu.sena.demo01;

import java.util.Scanner;

public class EjercicioNumero9 {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String ingresar = "si";
        int contador = 0;

        //ingresar == "si"
        //n > 10 = false/true
        //c == 'n' = false/true
        while(ingresar.equals("si")) {
            System.out.println("Ingreso al ciclo");

            System.out.println("Desea continuar? si/no");
            ingresar = scanner.nextLine();

            contador++;
        }

        System.out.println("Finalizo el ciclo");
        System.out.println("Ingreso al ciclo " + contador);

    }
}
