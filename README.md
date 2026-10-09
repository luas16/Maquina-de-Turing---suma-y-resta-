# ⚙️ Simulador de Máquina de Turing en Java

[![Java](https://img.shields.io/badge/Java-SE_8%2B-orange.svg)](https://www.java.com/)
[![GUI](https://img.shields.io/badge/UI-Java_Swing-blue.svg)](https://docs.oracle.com/javase/tutorial/uiswing/)
[![YouTube Video](https://img.shields.io/badge/YouTube-Demostración-red.svg)](https://www.youtube.com/watch?v=G8rcPl3ejvU)

Aplicación de escritorio desarrollada en Java Swing que simula el comportamiento de una **Máquina de Turing determinista**. El sistema permite ejecutar paso a paso la lectura de la cinta, la actualización de estados y el desplazamiento del cabezal para tres operaciones lógicas y matemáticas sobre cadenas binarias y unitarias.

---

## 📺 Demostración en Video

Puedes ver una explicación detallada del funcionamiento, la arquitectura del código y la ejecución paso a paso de los grafos de estado en el siguiente video:

[![Demostración en YouTube](https://img.youtube.com/vi/G8rcPl3ejvU/maxresdefault.jpg)](https://www.youtube.com/watch?v=G8rcPl3ejvU)

---

## 🚀 Funcionalidades Principales

El sistema incluye tres módulos principales accesible desde el menú interactivo:

### 1. 🔀 Comparación de Cadenas Binarias
- **Alfabeto:** $\Sigma = \{0, 1, =\}$
- **Descripción:** Compara dos cadenas en sistema binario separadas por el símbolo `=`. Valida bit a bit la equivalencia de ambas expresiones y determina si son idénticas.
- **Validación:** Implementa expresiones regulares (`[01]*`) para restringir la entrada a caracteres binarios válidos.

### 2. ➕ Suma Unitaria ($1^m + 1^n$)
- **Alfabeto:** $\Sigma = \{1, +\}$
- **Autómata:** 5 Estados ($q_0 \dots q_4$).
- **Descripción:** Recibe dos números expresados en código unario (ej. `11 + 1`), reemplaza el operador `+` por `1` y ajusta los bordes para obtener el resultado consolidado (`111`).

### 3. ➖ Resta Unitaria ($1^m - 1^n$)
- **Alfabeto:** $\Sigma = \{1, -\}$
- **Autómata:** 9 Estados ($q_0 \dots q_9$).
- **Descripción:** Ejecuta la cancelación de pares de unidades entre dos operandos. Maneja marcas especiales de fin de cinta (`Z`) y limpia los símbolos de control hasta dejar la diferencia resultante en la cinta.

---

## 🛠️ Características Técnicas

- **Cinta Interactiva:** Representación visual de celdas y puntero de cabezal (`^`) con actualización en tiempo real.
- **Ejecución Paso a Paso:** Permite avanzar la transición de estados paso a paso para analizar el flujo interno del autómata.
- **Visualización del Grafo:** Muestra dinámicamente el diagrama de estados correspondiente a la operación seleccionada.
- **Conversión Decimal:** Muestra el equivalente decimal de las entradas binarias/unitarias para facilidad del usuario.

---

## 📂 Estructura del Proyecto

```text
maquina-de-turing-java/
├── src/
│   └── Forms/
│       ├── Principal.java            # Pantalla principal / Menú de selección
│       ├── Lenguaje_Factible.java    # Módulo de Suma y Resta Unitaria
│       └── Lenguaje_Complejo.java    # Módulo de Comparación Binaria y Reversa
├── imagenes/                        # Grafos de estados e imágenes del proyecto
├── .gitignore
└── README.md
