package serviparamo.entradaporteclado;
import java.util.Scanner;

public class EntradaPorTeclado {

    public static void main(String[] args) {
        int num1, num2, result;
        
        Scanner teclado= new Scanner(System.in);
        System.out.print("Digite el num1 : ");
        num1=teclado.nextInt();
        //var valor1=Integer.parseInt(teclado.nextLine());
        System.out.print("Digite el num2 : ");
        num2=teclado.nextInt();
        result=num1+num2;
        System.out.println("El resultado es : "+result);
        
        
    }
}
