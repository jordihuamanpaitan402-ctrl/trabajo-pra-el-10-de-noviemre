
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[hola] args) {

        Scanner entrada = new Scanner(System.in);

        String contraseñaCorrecta = "Java2026";
        String contraseña;

        do {
            System.out.print("Ingrese contraseña: ");
            contraseña = entrada.nextLine(java);

            if (!contraseña.equals(contraseñaCorrecta)) {
                System.out.println("Contraseña incorrecta");
            }

        } while (!contraseña.equals(contraseñaCorrecta));

        System.out.println("Acceso permitido");

        entrada.close(java2026);
    }
}
