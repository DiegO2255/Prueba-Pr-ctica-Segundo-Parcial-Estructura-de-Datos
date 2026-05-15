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

## Capturas de ejecución del Código
* **Insertar Estudiante**
<img width="430" height="543" alt="1 Insertar Estudiante" src="https://github.com/user-attachments/assets/0d9e14de-2df2-47ea-b39d-7f337dd08d38" />

* **Buscar Estudiante**
<img width="571" height="423" alt="2 Buscar Estudiante" src="https://github.com/user-attachments/assets/33633293-78e0-4eb8-91f8-a6a4c18029eb" />

* **Eliminar Estudiante**
<img width="543" height="411" alt="3 Eliminar Estudiante" src="https://github.com/user-attachments/assets/eee3aebf-b10f-48d2-9d5b-609ce8943289" />

* **Recorrido Inorden**
<img width="617" height="412" alt="4 Inorden" src="https://github.com/user-attachments/assets/bc42abbd-4630-486c-9799-35277f499c57" />

* **Recorrido Preorden**
<img width="598" height="476" alt="5 Preorden" src="https://github.com/user-attachments/assets/5ba1d122-ff60-4a82-af6c-d251555103d9" />

* **Recorrido Postorden**
<img width="551" height="482" alt="6 Postorden" src="https://github.com/user-attachments/assets/d1ce68a3-988f-4cde-bdd7-1be9d7437dc7" />

* **Recorrido BFS**
<img width="601" height="432" alt="7 BFS" src="https://github.com/user-attachments/assets/5e7f2758-985c-421d-910c-744126540acc" />

* **Contar Estudiantes**
<img width="375" height="387" alt="8 Contar Estudiantes" src="https://github.com/user-attachments/assets/ee5ebbf5-8352-4227-900e-7318a103abca" />

* **Altura**
<img width="331" height="388" alt="9 Altura" src="https://github.com/user-attachments/assets/ef100e58-9d9f-443b-b662-3f4d481223a2" />

* **Mayor Nota**
<img width="676" height="395" alt="10 Mayor nota" src="https://github.com/user-attachments/assets/114184e8-258c-468e-9fcb-dd6d7e2f1d04" />

* **Menor Nota**
<img width="838" height="393" alt="11 Menor nota" src="https://github.com/user-attachments/assets/3ec93457-87e0-4713-b5b4-2f83de422f80" />

* **Estudiantes Aprobados**
<img width="573" height="410" alt="12 Estudiantes Aprobados" src="https://github.com/user-attachments/assets/1801b966-dd18-4c18-9a8d-84752376066c" />

* **Estudiantes Reprobados**
<img width="577" height="390" alt="13 Estudiantes Reprobados" src="https://github.com/user-attachments/assets/2d650153-9b7c-4631-a1b3-8f4d016559cc" />


## Pasos para ejecutar el código en la terminal de VS Code
Para poner en marcha el proyecto, siga estos pasos en su terminal:
* javac Main.java
* java Main

1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/Diego02255/Prueba-Pr-ctica-Segundo-Parcial-Estructura-de-Datos.git](https://github.com/Diego02255/Prueba-Pr-ctica-Segundo-Parcial-Estructura-de-Datos.git)
   ### Pasos finales para la subida (Evidencia de Commits):

 Ejecuta estos comandos finales en su terminal:
   ```bash
   git add README.md
   git commit -m "Evidencia: Documentación completa y guía de usuario en README.md"
   git push origin main
