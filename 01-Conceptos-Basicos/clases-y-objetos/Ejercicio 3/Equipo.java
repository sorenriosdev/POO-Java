public class Equipo {

    // Atributos públicos
    public int codigo;
    public String marca;
    public String color;
    public double precioDolares;

    //Variables para el tipo de cambio
    public double dolarASoles = 3.38;
    public double euroADolares = 1.20;

    // Constructor vacío
    public Equipo() {
    }

    // Constructor con parámetros
    public Equipo(int codigo, String marca, String color, double precioDolares) {
        this.codigo = codigo;
        this.marca = marca;
        this.color = color;
        this.precioDolares = precioDolares;
    }

    // Método que retorna el precio en soles
    public double calcularPrecioSoles() {
        return precioDolares * dolarASoles;
    }

    // Método que retorna el precio en euros
    public double calcularPrecioEuros() {
        return precioDolares / euroADolares;
    }

    // Método para mostrar todos los datos
    public void mostrarDatos() {
        System.out.println("\n=== DATOS DEL EQUIPO ===");
        System.out.println("Código: " + codigo);
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("\n=== PRECIOS ===");
        // En el formato "$%.2f%n"
        //  "$"      → imprime el signo de dólar literal
        //  "%":     → inicio de especificador de formato
        //  ".2f":   → número de punto flotante con exactamente 2 decimales
        //  "%n":    → salto de línea portátil (equivalente a '\n' en cualquier SO)
        System.out.println("Precio en dólares: $" + String.format("%.2f", precioDolares));
        System.out.println("Precio en soles: S/. " + String.format("%.2f", calcularPrecioSoles()));
        System.out.println("Precio en euros: €" + String.format("%.2f", calcularPrecioEuros()));

        // Información adicional de tipos de cambio
        System.out.println("\n=== TIPOS DE CAMBIO UTILIZADOS ===");
        System.out.println("1 USD = " + dolarASoles + " PEN");
        System.out.println("1 EUR = " + euroADolares + " USD");
    }
}
