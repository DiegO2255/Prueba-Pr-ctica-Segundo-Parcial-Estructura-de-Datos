# Prueba Práctica: Sistema de Gestión Académica (ABB)

Este proyecto ha sido desarrollado como parte de la evaluación del segundo parcial de la asignatura **Estructura de Datos** en la carrera de Ingeniería en Software de la Universidad Técnica de Ambato.

## Descripción del Proyecto
El sistema permite la gestión integral de estudiantes mediante una estructura de **Árbol Binario de Búsqueda (ABB)** implementada en Java. El árbol utiliza la **cédula** del estudiante como clave para organizar la información de manera jerárquica, permitiendo operaciones de búsqueda y ordenamiento eficientes.

## Funcionalidades Principales
El sistema incluye las siguientes operaciones obligatorias:
* **Gestión de Estudiantes:** Insertar, buscar por cédula y eliminar nodos.
* **Recorridos del Árbol:** Inorden, Preorden, Postorden y BFS (Por niveles).
* **Estadísticas:** Conteo de estudiantes, cálculo de la altura del árbol y determinación de la nota mayor y menor.
* **Filtros Académicos:** Listado automático de estudiantes aprobados (nota $\geq 7$) y reprobados (nota $< 7$).

## Especificaciones Técnicas
* **Lenguaje:** Java.
* **IDE:** Visual Studio Code
* **Paradigma:** Programación Orientada a Objetos (POO).
* **Algoritmos:** Uso extensivo de recursividad para operaciones en el árbol y colas para el recorrido BFS.
* **Validación:** Control estricto de rango para notas finales (0-10) y duplicidad de cédulas.

## Pasos para ejecutar el código en la terminal de VS Code
Para poner en marcha el proyecto, siga estos pasos en su terminal:
* javac Main.java
* java Main

1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/Diego02255/Prueba-Pr-ctica-Segundo-Parcial-Estructura-de-Datos.git](https://github.com/Diego02255/Prueba-Pr-ctica-Segundo-Parcial-Estructura-de-Datos.git)
