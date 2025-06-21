/** la clase principal donde se ejecuta la logica y los objetos, 
aca tenemos la clase main que es necesario en todos los lenguajes de bajo nivel */

public class Principal {
    public static void main(String[] args) {
        System.out.println("PROGRAMA: GESTIÓN DE EXPOSITOR");
        System.out.println("==============================\n");

        // Declarar y crear objeto de tipo Expositor
        Trabajador trabajador = new Trabajador();

        // Ingresar datos fijos
        trabajador.codigo = 1001;
        trabajador.nombre = "Carlos Mendoza";
        trabajador.horasTrabajadas = 160;
        trabajador.tarifaPorHora = 25.50;

        // Visualizar todos los datos
        trabajador.mostrarInformacion();

        System.out.println("\n=== EJEMPLO CON CONSTRUCTOR ===");

        // Crear otro expositor usando el constructor con parámetros
        Trabajador expositor2 = new Trabajador(1002, "Ana García", 140, 30.00);
        expositor2.mostrarInformacion();

        // Mostrar solo algunos cálculos específicos
        System.out.println("\n=== CÁLCULOS INDIVIDUALES ===");
        System.out.println("Expositor: " + expositor2.nombre);
        System.out.println("Sueldo bruto: S/. " + String.format("%.2f", expositor2.calcularSueldoBruto()));
        System.out.println("Total descuentos: S/. " + String.format("%.2f",
                expositor2.calcularDescuentoAFP() + expositor2.calcularDescuentoEPS()));
        System.out.println("Sueldo neto: S/. " + String.format("%.2f", expositor2.calcularSueldoNeto()));
    }
}
