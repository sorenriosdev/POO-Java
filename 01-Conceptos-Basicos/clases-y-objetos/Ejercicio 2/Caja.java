public class Caja {

    public double largo;
    public double ancho;
    public double alto;
    public double pesoBalanza;

    // Constructor vacío
    public Caja() {
    }

    // Constructor con parámetros
    public Caja(double largo, double ancho, double alto, double pesoBalanza) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.pesoBalanza = pesoBalanza;
    }

    // Método que retorna el volumen en centímetros cúbicos
    public double calcularVolumen (){
        return largo * alto * ancho;
    }

    // Método que retorna el peso volumétrico en kilogramos
    public double calcularPesoVolumetrico(){
        return calcularVolumen() / 5000.0;
    }

    // Método que retorna el peso facturable (el mayor entre peso de balanza y peso volumétrico)
    public double calcularPesoFacturable() {
        double pesoVolumetrico = calcularPesoVolumetrico();
        return Math.max(pesoBalanza, pesoVolumetrico);
    }

    // Método para mostrar todos los datos de la caja
    public void mostrarDatos() {
        System.out.println("=== DATOS DE LA CAJA ===");
        System.out.println("Largo: " + largo + " cm");
        System.out.println("Ancho: " + ancho + " cm");
        System.out.println("Alto: " + alto + " cm");
        System.out.println("Peso de balanza: " + pesoBalanza + " kg");
        System.out.println("\n=== CÁLCULOS ===");
        System.out.println("Volumen: " + String.format("%.1f", calcularVolumen()) + " cm³");
        System.out.println("Peso volumétrico: " + String.format("%.2f", calcularPesoVolumetrico()) + " kg");
        System.out.println("Peso facturable: " + String.format("%.2f", calcularPesoFacturable()) + " kg");
    }

    // Método para determinar qué peso se está cobrando
    public String obtenerPesoFacturable() {
        double pesoVolumetrico = calcularPesoVolumetrico();
        if (pesoBalanza > pesoVolumetrico) {
            return "Peso de balanza (el paquete es pesado)";
        } else if (pesoVolumetrico > pesoBalanza) {
            return "Peso volumétrico (el paquete es voluminoso)";
        } else {
            return "Ambos pesos son iguales";
        }
    }
}
