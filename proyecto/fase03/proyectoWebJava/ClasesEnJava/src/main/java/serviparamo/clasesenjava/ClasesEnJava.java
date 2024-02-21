
package serviparamo.clasesenjava;

import java.util.Scanner;

public class ClasesEnJava {
    private int edad;
    private String nombre;
    private Scanner teclado;
    
    public void inicializar(){
        teclado=new Scanner(System.in);
        System.out.print("Entre edad : ");
        edad = teclado.nextInt();
        System.out.print("Entre nombre : ");
        nombre=teclado.next();
        
    }
    public void imprimir(){
        System.out.println("el nombre es: "+nombre);
        System.out.println("la edad es: "+edad);
    }

    public void esMayorEdad(){
        if (edad>=18){
            System.out.print("es mayor edad ");
        }
        else{
            System.out.print("es menor edad");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("primera clase en java");
        
        ClasesEnJava clase1 =new ClasesEnJava();
        clase1.inicializar();
        clase1.imprimir();
        clase1.esMayorEdad();
    }
}
