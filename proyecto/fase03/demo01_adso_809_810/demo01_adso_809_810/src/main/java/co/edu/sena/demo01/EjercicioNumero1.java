package co.edu.sena.demo01;

public class EjercicioNumero1 {

    public static void main(String[] args) {
        System.out.println("Hola aqui inicia el programa!!!");
        //Numericos enteros
        int numero1; // <- se definio una variable
        int numero2;
        numero1 = 15;
        numero1 = 17 + 4;
        numero2 = numero1 + 3;

        System.out.println(numero1);
        System.out.println(numero2);

        //Numericos flotantes
        float numero3;
        float numero4;

        numero3 = 2.1f;
        numero4 = 3f / 2f;
        numero3 = 1; //1.0

        float numero5 =  numero1;

        System.out.println(numero3);
        System.out.println(numero4);
        System.out.println(numero5);

        numero1 =  3 + 5;

        //Caracter
        char letra1 = 'a';

        //Logico
        int edad = 19;
        boolean isParent = true;
        boolean isSingle = false;
        boolean isMayorEdad =  edad >= 18;

        System.out.println(isParent);
        System.out.println(isSingle);
        System.out.println(isMayorEdad);

        //Cadena
        String nombre;
        nombre = "Gustavo Adolfo Rodriguez Quinayas ... etc etc ℻ ⇅ ⌛ ⌚ dsadasd asdasd zxczczcvbcvb";

        System.out.println("El nombre estipulado es: " + nombre);

        System.out.println("Bye, aqui finaliza el programa");
    }

}

//SnakeCase -> primer_ejercicio_de_la_clase
//CamelCase -> Estructura de nombrado => PrimerEjercicioDeLaClase
//Tipos de datos primitivos
//Nombre de variable o identificador de memoria
// Definicion - Inicializacion - Uso - Destruccion