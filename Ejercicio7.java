import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int base;
        int exponente;
        int contador = 1;
        long resultado = 1;

        System.out.print("Ingrese la base: ");
        base = sc.nextInt();

        do {
            System.out.print("Ingrese un exponente positivo: ");
            exponente = sc.nextInt();

            if (exponente <= 0) {
                System.out.println("El exponente debe ser mayor que cero");
            }

        } while (exponente <= 0);

        do {
            resultado = resultado * base;
            contador++;

        } while (contador <= exponente);

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}