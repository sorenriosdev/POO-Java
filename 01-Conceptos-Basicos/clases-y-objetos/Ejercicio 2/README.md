📦 Ejercicio 02: Clase Caja

🎯 Objetivo
Diseñar e implementar una clase Caja que permita calcular el volumen, peso volumétrico y peso facturable de un paquete, aplicando conceptos de programación orientada a objetos y cálculos matemáticos básicos.

📋 Descripción del Problema
Crear una clase Caja que maneje las dimensiones físicas y el peso real de un paquete, calculando automáticamente los valores necesarios para determinar el costo de envío basado en el peso facturable.

🔧 Especificaciones Técnicas
Atributos de la Clase (públicos)

largo (double): Longitud de la caja en centímetros
ancho (double): Anchura de la caja en centímetros
alto (double): Altura de la caja en centímetros
pesoBalanza (double): Peso real medido en kilogramos

Métodos Requeridos

calcularVolumen(): Retorna el volumen en cm³ (largo × ancho × alto)
calcularPesoVolumetrico(): Retorna el peso volumétrico en kg (volumen ÷ 5000)
calcularPesoFacturable(): Retorna el mayor peso entre balanza y volumétrico

🖥️ Implementación en Clase Principal
En la clase principal, al momento de procesar:

Declarar y crear un objeto de tipo Caja del paquete semana_01
Ingresar datos fijos para las pruebas
Visualizar todas las dimensiones y cálculos de la caja

🎚️ Información del Ejercicio
Nivel 🟢 Básico
Conceptos Clases, Objetos, Métodos, Paquetes
Lenguaje Java

💡 Ejemplo de Salida Esperada

=== DATOS DE LA CAJA ===
Largo: 50.0 cm
Ancho: 30.0 cm
Alto: 25.0 cm
Peso de balanza: 8.5 kg

=== CÁLCULOS ===
Volumen: 37500.0 cm³
Peso volumétrico: 7.5 kg
Peso facturable: 8.5 kg

🎓 Conceptos Aplicados

Paquetes Java: Organización de clases en espacios de nombres
Cálculos matemáticos: Aplicación de fórmulas de volumen y densidad
Lógica condicional: Determinación del peso facturable
Formateo numérico: Presentación de resultados con decimales

📐 Fórmulas Utilizadas

Volumen: V = largo × ancho × alto
Peso Volumétrico: PV = volumen ÷ 5000
Peso Facturable: PF = max(peso_balanza, peso_volumétrico)
