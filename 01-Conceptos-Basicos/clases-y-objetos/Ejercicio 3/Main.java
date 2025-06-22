// Importamos Scanner para leer datos e interactuar desde la consola
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE GESTIÓN DE EQUIPOS ===");
        System.out.println("Conversor automático de monedas\n");

        // Llamamos al método que solicita datos y muestra la información del equipo
        procesarEquipo(scanner);

        // Cerramos el Scanner al final
        scanner.close();
    }

    /**
     * Solicita al usuario los datos de un equipo por consola
     * y luego muestra sus atributos.
     */
    private static void procesarEquipo(Scanner scanner) {
        // Declarar y crear un objeto de tipo Equipo
        Equipo equipo = new Equipo();

        // Ingresar datos por consola
        System.out.println("Ingrese los datos del equipo:");

        System.out.print("Código: ");
        equipo.codigo = scanner.nextInt();
        scanner.nextLine(); // salto de línea

        System.out.print("Marca: ");
        equipo.marca = scanner.nextLine();

        System.out.print("Color: ");
        equipo.color = scanner.nextLine();

        System.out.print("Precio en dólares: $");
        equipo.precioDolares = scanner.nextDouble();

        // Visualizar todos sus datos
        equipo.mostrarDatos();
    }
}
