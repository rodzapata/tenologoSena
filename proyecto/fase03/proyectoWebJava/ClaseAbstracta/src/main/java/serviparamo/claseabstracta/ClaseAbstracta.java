
package serviparamo.claseabstracta;
public class ClaseAbstracta {

    public static void main(String[] args) {
        System.out.println("utilizando clase abastracta!");
        
        Cuadrado cuadrado1= new Cuadrado(6,1,2);
        double result=cuadrado1.calcularArea();
        System.out.println("el resultado es "+result);
        
    }
}
