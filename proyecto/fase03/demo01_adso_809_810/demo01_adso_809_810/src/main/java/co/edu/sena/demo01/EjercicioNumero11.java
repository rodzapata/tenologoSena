package co.edu.sena.demo01;

import java.util.Scanner;

public class EjercicioNumero11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el texto a validar: ");
        String texto = scanner.next();
        String invertido = "";

        for(int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        System.out.println(texto);
        System.out.println(invertido);

        if(texto.toLowerCase().equals(invertido.toLowerCase())) {
            System.out.println("Es palindrome");
        } else {
            System.out.println("No es palindrome");
        }

    }

}
