import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota;
        double suma = 0;
        double promedio;
        int contador = 1;

        while (contador <= 5) {

            System.out.print("Ingrese la nota " + contador + ": ");
            nota = entrada.nextDouble();

            suma = suma + nota;

            contador++;
        }

        promedio = suma / 5;

        System.out.println("Suma total: " + suma);
        System.out.println("Promedio final: " + promedio);

        entrada.close();
    }
}