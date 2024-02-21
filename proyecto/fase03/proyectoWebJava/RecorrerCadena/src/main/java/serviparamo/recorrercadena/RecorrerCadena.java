
package serviparamo.recorrercadena;
import java.util.Scanner;

public class RecorrerCadena {

    public static void main(String[] args) {
        String cadena="rodney-zapata-palacio";
        
        Scanner palabra=new Scanner(cadena);
         palabra.useDelimiter("-");
         
        while (palabra.hasNext()) {
            System.out.println(palabra.next());
            
        }
    }
}
