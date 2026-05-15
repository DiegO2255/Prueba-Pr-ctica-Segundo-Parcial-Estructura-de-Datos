
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n--- SISTEMA ACADÉMICO UTA ---");
            System.out.println("1. Insertar estudiante\n2. Buscar por cédula\n3. Eliminar (No impl.)\n4. Inorden\n5. Preorden\n6. Postorden\n7. BFS\n8. Contar estudiantes\n9. Altura\n10. Nota Mayor\n11. Nota Menor\n12. Aprobados\n13. Reprobados\n14. Salir");
            System.out.print("Seleccione: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("\n--- Registro de Nuevo Estudiante ---");
                    System.out.print("Cédula: ");
                    String c = sc.nextLine();
                    System.out.print("Apellidos: ");
                    String a = sc.nextLine();
                    System.out.print("Nombres: ");
                    String n = sc.nextLine();

                    double nt;
                    do {
                        System.out.print("Nota Final (0-10): ");
                        nt = sc.nextDouble();
                        if (nt < 0 || nt > 10) {
                            System.out.println("¡Error! La nota debe estar entre 0 y 10.");
                        }
                    } while (nt < 0 || nt > 10);

                    sc.nextLine(); // Limpiar buffer
                    System.out.print("Carrera: ");
                    String cr = sc.nextLine();
                    System.out.print("Nivel: ");
                    int nv = sc.nextInt();

                    boolean insertado = arbol.insertar(new Estudiante(c, a, n, nt, cr, nv));

                    if (insertado) {
                        System.out.println("\n>>> ¡Estudiante insertado con éxito! <<<");
                    } else {
                        System.out.println("\n>>> Error: La cédula ya existe en el sistema. <<<");
                    }
                    break;

                case 2:
                    System.out.print("Cédula a buscar: ");
                    Estudiante bus = arbol.buscar(sc.nextLine());
                    System.out.println(bus != null ? bus : "No encontrado");
                    break;

                case 3:
                    System.out.print("Ingrese la cédula del estudiante a eliminar: ");
                    String cedEliminar = sc.nextLine();
                    if (arbol.buscar(cedEliminar) != null) {
                        arbol.eliminar(cedEliminar);
                        System.out.println(">>> Estudiante eliminado correctamente. <<<");
                    } else {
                        System.out.println(">>> Error: No se encontró un estudiante con esa cédula. <<<");
                    }
                    break;

                case 4:
                    arbol.inorden(arbol.getRaiz());
                    break;

                case 5: // Preorden
                    System.out.println("\n--- Recorrido Preorden ---");
                    arbol.preorden(arbol.getRaiz());
                    break;

                case 6: // Postorden
                    System.out.println("\n--- Recorrido Postorden ---");
                    arbol.postorden(arbol.getRaiz());
                    break;

                case 7:
                    arbol.bfs();
                    break;

                case 8:
                    System.out.println("Total: " + arbol.contarEstudiantes(arbol.getRaiz()));
                    break;

                case 9:
                    System.out.println("Altura: " + arbol.calcularAltura(arbol.getRaiz()));
                    break;

                case 10:
                    System.out.println("Mayor nota: " + arbol.buscarExtremoNota(arbol.getRaiz(), true));
                    break;

                case 11: // Nota Menor
                    Estudiante menor = arbol.buscarNotaMenor(arbol.getRaiz());
                    if (menor != null) {
                        System.out.println("Estudiante con menor nota: " + menor);
                    } else {
                        System.out.println("El árbol está vacío.");
                    }
                    break;

                case 12:
                    arbol.mostrarPorNota(arbol.getRaiz(), true);
                    break;

                case 13:
                    arbol.mostrarPorNota(arbol.getRaiz(), false);
                    break;
            }
        } while (op != 14);
    }
}
