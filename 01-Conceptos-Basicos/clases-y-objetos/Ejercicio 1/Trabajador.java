/**
 * Representa un expositor con sus datos laborales y métodos para calcular sueldos
 */

public class Trabajador {
    // Atributos públicos
    public int codigo;
    public String nombre;
    public int horasTrabajadas;
    public double tarifaPorHora;

    // Constructor vacío
    public Trabajador() {
    }

    // Constructor con parámetros
    public Trabajador(int codigo, String nombre, int horasTrabajadas, double tarifaPorHora) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    /**
     * Calcula el sueldo bruto (horas trabajadas * tarifa por hora)
     * @return sueldo bruto
     */
    public double calcularSueldoBruto() {
        return horasTrabajadas * tarifaPorHora;
    }

    /**
     * Calcula el descuento por AFP (10% del sueldo bruto)
     * @return descuento AFP
     */
    public double calcularDescuentoAFP() {
        return calcularSueldoBruto() * 0.10;
    }

    /**
     * Calcula el descuento por EPS (5% del sueldo bruto)
     * @return descuento EPS
     */
    public double calcularDescuentoEPS() {
        return calcularSueldoBruto() * 0.05;
    }

    /**
     * Calcula el sueldo neto (sueldo bruto - descuento AFP - descuento EPS)
     * @return sueldo neto
     */
    public double calcularSueldoNeto() {
        return calcularSueldoBruto() - calcularDescuentoAFP() - calcularDescuentoEPS();
    }

    /**
     * Método para mostrar toda la información del expositor
     */
    public void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DEL EXPOSITOR ===");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Tarifa por hora: S/. " + String.format("%.2f", tarifaPorHora));
        System.out.println();
        System.out.println("=== CÁLCULOS ===");
        System.out.println("Sueldo bruto: S/. " + String.format("%.2f", calcularSueldoBruto()));
        System.out.println("Descuento AFP (10%): S/. " + String.format("%.2f", calcularDescuentoAFP()));
        System.out.println("Descuento EPS (5%): S/. " + String.format("%.2f", calcularDescuentoEPS()));
        System.out.println("Sueldo neto: S/. " + String.format("%.2f", calcularSueldoNeto()));
        System.out.println("================================");
    }
}
