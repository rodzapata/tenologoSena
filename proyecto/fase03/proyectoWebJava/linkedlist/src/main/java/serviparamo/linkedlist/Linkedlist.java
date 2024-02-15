
package serviparamo.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

    public static void main(String[] args) {
        System.out.println("coleccionees --list");
        List<Persona> lista = new LinkedList<Persona> ();
        lista.add(new Persona(1,"rodney",48));
        lista.add(new Persona(2,"cecilia",36));
        lista.add(new Persona(3,"juan miguel",16));        
        
        //agregamos un iten al principio
        lista.add(0,new Persona(4,"samuel",8));        
        
        System.out.println("-----Recorrrido FOR EACH --------");
        for (Persona pers : lista) {
            System.out.println("trae el elmento: "+pers.getNombre());
            
        }
        
        
    }
}
