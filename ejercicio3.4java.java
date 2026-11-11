
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota;
        double suma = 0;
        double promedio;
        int cantidad = 0;
        String continuar;

        do {
            System.out.print("Ingrese nota (0-20): ");
            nota = sc.nextDouble();

            if (nota >= 0 && nota <= 20) {
                suma = suma + nota;
                cantidad++;
            } else {
                System.out.println("Nota no valida");
            }

            sc.nextLine();

            System.out.print("¿Continuar? (S/N): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("S"));

        if (cantidad > 0) {
            promedio = suma / cantidad;

            System.out.println("Cantidad de notas: " + cantidad);
            System.out.println("Suma total: " + suma);
            System.out.printf("Promedio: %.2f%n", promedio);
        } else {
            System.out.println("No se ingresaron notas validas");
        }

        sc.close();
    }
}
