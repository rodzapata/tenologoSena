       
package serviparamo.calculadoraapp;
import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int opcion;
        
        System.out.println("------Calculadora App --------");
        System.out.println("             MENU             ");
    
        System.out.println(""" 
                           1. Sumar
                           2. Restar
                           3. Multiplicar
                           4. Dividir
                           5. Salir
                           """);
        System.out.print("Digige opcion del 1 al 5 : ");
        opcion=teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Opcion 1 Suma");
                break;
            case 2:
                System.out.println("opcion 2 Resta");
                break;
            case 3:
                System.out.println("opcion 3 multiplicacion");
                break;
            case 4:
                System.out.println("opcion 4 Division");
                break;
            default: System.out.println("opcion no valida");
               // throw new AssertionError();
        }
    }
    
}
