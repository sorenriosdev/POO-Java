public class Main {
    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE CÁLCULO DE CAJAS ===\n");
        // Simular la pulsación del botón "Procesar"
        procesarCaja();
    }

    public static void procesarCaja() {
        // Declarar y crear un objeto de tipo Caja
        Caja caja = new Caja();

        // Ingresar datos fijos
        caja.largo = 50.0;          // 50 cm
        caja.ancho = 30.0;          // 30 cm
        caja.alto = 25.0;           // 25 cm
        caja.pesoBalanza = 8.5;     // 8.5 kg

        // Visualizar todos sus datos
        caja.mostrarDatos();

        // Información adicional
        System.out.println("\n=== ANÁLISIS ===");
        System.out.println("Tipo de peso facturable: " + caja.obtenerPesoFacturable());

        System.out.println("\n" + "=".repeat(50));

        // Ejemplo adicional con peso volumétrico mayor (paquete voluminoso)
        System.out.println("\n=== EJEMPLO 2: PAQUETE VOLUMINOSO ===");
        Caja caja2 = new Caja(80.0, 60.0, 40.0, 15.0);
        caja2.mostrarDatos();
        System.out.println("\n=== ANÁLISIS ===");
        System.out.println("Tipo de peso facturable: " + caja2.obtenerPesoFacturable());

        System.out.println("\n" + "=".repeat(50));

        // Ejemplo adicional con peso de balanza mayor (paquete pesado)
        System.out.println("\n=== EJEMPLO 3: PAQUETE PESADO ===");
        Caja caja3 = new Caja(25.0, 20.0, 15.0, 10.0);
        caja3.mostrarDatos();
        System.out.println("\n=== ANÁLISIS ===");
        System.out.println("Tipo de peso facturable: " + caja3.obtenerPesoFacturable());
    }
}
