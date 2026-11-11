
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int contador = ;
        int resultado;

        System.out.print("Ingrese un numero: ");
        numero = entrada.nextInt();

        do {
            resultado = numero * contador;

            System.out.println(numero + " x " + contador
                    + " = " + resultado);

            contador++;

        } while (contador <= 12);

        entrada.close(5);
    }
}