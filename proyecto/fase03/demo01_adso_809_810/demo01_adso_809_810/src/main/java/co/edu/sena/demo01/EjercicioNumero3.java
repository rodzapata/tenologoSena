package co.edu.sena.demo01;

import java.util.Scanner;

public class EjercicioNumero3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Capturar el nombre del aprendiz
        System.out.print("Ingrese el nombre del aprendiz: ");
        String nombre = scanner.nextLine();

        // Capturar las 5 notas
        System.out.println("Ingrese las notas del aprendiz:");
        System.out.print("Nota 1 (15%): ");
        double nota1 = capturarNota(scanner);
        System.out.print("Nota 2 (10%): ");
        double nota2 = capturarNota(scanner);
        System.out.print("Nota 3 (10%): ");
        double nota3 = capturarNota(scanner);
        System.out.print("Nota 4 (30%): ");
        double nota4 = capturarNota(scanner);
        System.out.print("Nota 5 (35%): ");
        double nota5 = capturarNota(scanner);

        // Calcular la nota final
        double notaFinal = (nota1 * 0.15) + (nota2 * 0.10) + (nota3 * 0.10) + (nota4 * 0.30) + (nota5 * 0.35);

        // Verificar si aprueba o pierde
        String resultado = (notaFinal >= 3.5) ? "APROBADO" : "REPROBADO";

        // Mostrar el resultado
        System.out.println("\nResultado para " + nombre + ":");
        System.out.println("Nota Final: " + notaFinal);
        System.out.println("Resultado del aprendizaje: " + resultado);

        scanner.close();
    }

    // Método para capturar la nota y verificar que esté en el rango [0, 5]
    private static double capturarNota(Scanner scanner) {
        double nota;
        do {
            nota = scanner.nextDouble();
            if (nota < 0 || nota > 5) {
                System.out.println("La nota debe estar en el rango de 0 a 5. Por favor, ingrese nuevamente:");
            }
        } while (nota < 0 || nota > 5);
        return nota;
    }
}
