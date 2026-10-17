Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Punto de Venta y Lectores Ópticos (Interfaces y Inyección de Dependencias en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🛒 Simulación de Punto de Venta y Lectores Ópticos (Interfaces y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema de caja registradora o punto de venta (*Point of Sale*) capaz de interactuar de manera flexible con diferentes tecnologías de escaneo (Escáner Láser de códigos de barra tradicionales y Cámaras de lectura QR). Pone en práctica conceptos avanzados de la **Programación Orientada a Objetos (POO)** como **interfaces**, **inyección de dependencias por constructor**, **polimorfismo** y el **Patrón Strategy** en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza mediante un contrato contractual por interfaz y múltiples implementaciones especializadas para cada dispositivo de lectura:

* **`LectorOptico` (Interfaz)**: Define el contrato genérico que todo dispositivo de escaneo debe cumplir mediante el método `escanearCodigo()`, el cual retorna una cadena con la identificación del producto.
* **`EscanearLaser`**: Modela un lector láser tradicional.
* **Comportamiento:** Simula el escaneo de un código de barras lineal retornando una secuencia numérica fija (`"96498485465221"`).


* **`CamaraQR`**: Modela una cámara de lectura de códigos de respuesta rápida (*QR*).
* **Comportamiento:** Simula la captura digital de un código QR retornando su respectivo identificador numérico (`"64884132208941"`).


* **`PuntoVenta`**: Actúa como el contexto o invocador principal encargado de procesar la venta.
* **Atributos:** Mantiene una referencia a la interfaz `LectorOptico`.
* **Métodos principales:**
* Constructor `PuntoVenta(LectorOptico lector)`, que recibe e inyecta la estrategia de lectura deseada.
* `procesarProducto()`, que invoca de forma polimórfica el escaneo del código y muestra los mensajes de confirmación por consola.




* **`Main`**: Punto de entrada de la aplicación. Instancia los diferentes lectores ópticos, los inyecta en el objeto `PuntoVenta` mediante su constructor y simula el procesamiento de productos cambiando de tecnología en tiempo de ejecución.

---

## ⚙️ Conceptos Clave de POO Aplicados

1. **Inyección de Dependencias por Constructor:** La clase `PuntoVenta` no crea ni acopla una tecnología de escaneo fija; en su lugar, recibe el dispositivo de forma externa a través de su constructor, logrando un diseño sumamente desacoplado y fácil de probar.
2. **Polimorfismo por Interfaces:** Permite que el punto de venta opere de manera idéntica sin importar si el código proviene de un haz láser físico o de una imagen de cámara digital.
3. **Principio Abierto/Cerrado (OCP):** Facilita la incorporación de nuevas tecnologías de escaneo (ej. `LectorRFID`, `EscanearBiometrico`) creando una nueva clase que implemente la interfaz `LectorOptico`, sin necesidad de alterar la lógica interna de la clase `PuntoVenta`.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

---

```text
Codigo del producto: 96498485465221
Producto procesado.
--------------------
Codigo del producto: 64884132208941
Producto procesado.

```

---

## 🚀 Ventajas de este Diseño

* **Desacoplamiento Estricto:** Separa la lógica de negocio de la caja registradora de los detalles de hardware o lectura de datos.
* **Flexibilidad Operativa:** Permite intercambiar el comportamiento del punto de venta dinámicamente con solo cambiar la instancia inyectada.

---

### 💡 Materiales de Apoyo y Videos

Los videos recomendados arriba ilustran cómo aplicar la **Inyección de Dependencias** y el **Patrón Strategy** utilizando interfaces en Java para construir arquitecturas limpias y modulares.
