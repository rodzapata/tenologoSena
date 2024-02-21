
package serviparamo.tablamultiplicar;
import java.util.Scanner;

public class TablaMultiplicar {

    public void cargarDatos(){
            int valor;
            Scanner teclado= new Scanner(System.in);
            
           
            do{
            System.out.print("Digite el valor de la tabla de multiplicar y para finalizar digite -1  :");
            valor=teclado.nextInt();
               if (valor!=-1){
                   calcular(valor);
               }
            } while (valor!=-1);
            
    }
    public void calcular(int v){
        for (int f = v; f <= v*10; f=f+v) {
            System.out.print(f+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        TablaMultiplicar tabla=new TablaMultiplicar();
        tabla.cargarDatos();
    }
}
