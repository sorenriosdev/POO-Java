# 💻 Ejercicio 03: Clase Equipo

## 🎯 Objetivo
Diseñar una clase `Equipo` que maneje conversiones de moneda automáticamente, aplicando conceptos de POO y operaciones matemáticas.

## 📋 Especificaciones

### Atributos (públicos)
- `codigo` *(int)*: Identificador del equipo
- `marca` *(String)*: Marca del equipo
- `color` *(String)*: Color del equipo
- `precioDolares` *(double)*: Precio base en dólares

### Métodos Requeridos
- **`calcularPrecioSoles()`**: Precio en soles (1 USD = 3.38 PEN)
- **`calcularPrecioEuros()`**: Precio en euros (1 EUR = 1.20 USD)

### Implementación
- Crear objeto `Equipo` en clase principal
- **Ingresar datos por consola**
- Mostrar todos los datos y conversiones

## 💰 Tipos de Cambio
| Moneda | Equivalencia |
|--------|--------------|
| 1 USD | 3.38 PEN |
| 1 EUR | 1.20 USD |

## 📋 Ver Solución
- [Clase Equipo](src/Equipo.java)
- [Clase Principal](src/Principal.java)

## ✅ Lista de Verificación
- [ ] Clase `Equipo` con atributos públicos
- [ ] Métodos de conversión implementados
- [ ] Entrada de datos por consola
- [ ] Salida formateada con todas las monedas
- [ ] Cálculos correctos aplicados
