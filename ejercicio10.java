import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre;
        String continuar;

        double precio;
        double subtotal;
        double total = 0;
        double promedio;

        int cantidad;
        int totalProductos = 0;

        do {
            System.out.print("Ingrese nombre del producto: ");
            nombre = sc.nextLine();

            System.out.print("Ingrese precio: ");
            precio = sc.nextDouble();

            System.out.print("Ingrese cantidad: ");
            cantidad = sc.nextInt();

            if (precio > 0 && cantidad > 0) {

                subtotal = precio * cantidad;

                total = total + subtotal;
                totalProductos = totalProductos + cantidad;

                System.out.println("Producto: " + nombre);
                System.out.println("Subtotal: S/ " + subtotal);

            } else {
                System.out.println("Precio o cantidad no validos");
            }

            sc.nextLine();

            System.out.print("¿Desea registrar otro producto? (S/N): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("\n=== RESUMEN DE VENTAS ===");

        System.out.println("Monto total vendido: S/ " + total);
        System.out.println("Cantidad total de productos: " + totalProductos);

        if (totalProductos > 0) {
            promedio = total / totalProductos;
            System.out.printf("Promedio de venta por producto: S/ %.2f%n",
                    promedio);
        } else {
            System.out.println("No se registraron productos validos");
        }

        sc.close();
    }
}