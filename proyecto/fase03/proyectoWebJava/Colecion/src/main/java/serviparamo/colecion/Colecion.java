
package serviparamo.colecion;

import java.util.ArrayList;
import java.util.List;

public class Colecion {

    public static void main(String[] args) {
        System.out.println("coleccionees --list");
        List<Persona> lista = new ArrayList<Persona> ();
        lista.add(new Persona(1,"rodney",48));
        lista.add(new Persona(2,"cecilia",36));
        
        Persona perso= new Persona(3,"juan miguel",16);
        lista.add(perso);
        
        System.out.println("---recorrido por indice FOR-----");
        for (int i = 0; i < lista.size(); i++) {
            //Persona get = lista.get(i);
            System.out.println("traer el elmento : "+lista.get(i).getNombre());
            
        }
        
        System.out.println("-----Recorrrido FOR EACH --------");
        for (Persona pers : lista) {
            System.out.println("trae el elmento: "+pers.getNombre());
            
        }
        
        
        
        
    }
}
