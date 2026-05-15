
import java.util.LinkedList;
import java.util.Queue;

public class ArbolBinario {

    private Estudiante raiz;

    public boolean insertar(Estudiante nuevo) {
        // Si el estudiante ya existe por cédula, no lo insertamos
        if (buscar(nuevo.cedula) != null) {
            return false;
        }
        raiz = insertarRec(raiz, nuevo);
        return true; // Inserción exitosa
    }

// Asegúrate de que tu método recursivo siga siendo privado y devuelva el nodo
    private Estudiante insertarRec(Estudiante actual, Estudiante nuevo) {
        if (actual == null) {
            return nuevo;
        }

        if (nuevo.cedula.compareTo(actual.cedula) < 0) {
            actual.izquierdo = insertarRec(actual.izquierdo, nuevo);
        } else if (nuevo.cedula.compareTo(actual.cedula) > 0) {
            actual.derecho = insertarRec(actual.derecho, nuevo);
        }
        return actual;
    }

    public Estudiante buscar(String cedula) {
        return buscarRec(raiz, cedula);
    }

    private Estudiante buscarRec(Estudiante actual, String cedula) {
        if (actual == null || actual.cedula.equals(cedula)) {
            return actual;
        }
        return (cedula.compareTo(actual.cedula) < 0) ? buscarRec(actual.izquierdo, cedula) : buscarRec(actual.derecho, cedula);
    }

    public void eliminar(String cedula) {
        raiz = eliminarRec(raiz, cedula);
    }

    private Estudiante eliminarRec(Estudiante actual, String cedula) {
        if (actual == null) {
            return null;
        }

        // Navegar por el árbol
        if (cedula.compareTo(actual.cedula) < 0) {
            actual.izquierdo = eliminarRec(actual.izquierdo, cedula);
        } else if (cedula.compareTo(actual.cedula) > 0) {
            actual.derecho = eliminarRec(actual.derecho, cedula);
        } else {
            // ¡Nodo encontrado! [cite: 20]

            // Caso 1 y 2: Un hijo o ninguno
            if (actual.izquierdo == null) {
                return actual.derecho;
            }
            if (actual.derecho == null) {
                return actual.izquierdo;
            }

            // Caso 3: Dos hijos
            // Buscamos el valor más pequeño en el subárbol derecho
            Estudiante sucesor = encontrarMinimo(actual.derecho);
            actual.cedula = sucesor.cedula;
            actual.apellidos = sucesor.apellidos;
            actual.nombres = sucesor.nombres;
            actual.notaFinal = sucesor.notaFinal;

            // Eliminar el sucesor
            actual.derecho = eliminarRec(actual.derecho, sucesor.cedula);
        }
        return actual;
    }

    private Estudiante encontrarMinimo(Estudiante nodo) {
        while (nodo.izquierdo != null) {
            nodo = nodo.izquierdo;
        }
        return nodo;
    }

    public int contarEstudiantes(Estudiante nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + contarEstudiantes(nodo.izquierdo) + contarEstudiantes(nodo.derecho);
    }

    public int calcularAltura(Estudiante nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + Math.max(calcularAltura(nodo.izquierdo), calcularAltura(nodo.derecho));
    }

    public void mostrarPorNota(Estudiante nodo, boolean aprobado) {
        if (nodo == null) {
            return;
        }
        mostrarPorNota(nodo.izquierdo, aprobado);
        if (aprobado ? nodo.notaFinal >= 7 : nodo.notaFinal < 7) {
            System.out.println(nodo);
        }
        mostrarPorNota(nodo.derecho, aprobado);
    }

    public Estudiante buscarExtremoNota(Estudiante nodo, boolean mayor) {
        if (nodo == null) {
            return null;
        }
        Estudiante res = nodo;
        Estudiante izq = buscarExtremoNota(nodo.izquierdo, mayor);
        Estudiante der = buscarExtremoNota(nodo.derecho, mayor);
        if (izq != null && (mayor ? izq.notaFinal > res.notaFinal : izq.notaFinal < res.notaFinal)) {
            res = izq;
        }
        if (der != null && (mayor ? der.notaFinal > res.notaFinal : der.notaFinal < res.notaFinal)) {
            res = der;
        }
        return res;
    }

    // Recorridos obligatorios
    public void inorden(Estudiante n) {
        if (n != null) {
            inorden(n.izquierdo);
            System.out.println(n);
            inorden(n.derecho);
        }
    }
    
    // RECORRIDOS OBLIGATORIOS [cite: 22, 23]

    public void preorden(Estudiante nodo) {
        if (nodo != null) {
            System.out.println(nodo);
            preorden(nodo.izquierdo);
            preorden(nodo.derecho);
        }
    }

    public void postorden(Estudiante nodo) {
        if (nodo != null) {
            postorden(nodo.izquierdo);
            postorden(nodo.derecho);
            System.out.println(nodo);
        }
    }

// FUNCIÓN AVANZADA: BUSCAR NOTA MENOR [cite: 28, 40]
    public Estudiante buscarNotaMenor(Estudiante nodo) {
        if (nodo == null) {
            return null;
        }

        Estudiante menor = nodo;
        Estudiante izq = buscarNotaMenor(nodo.izquierdo);
        Estudiante der = buscarNotaMenor(nodo.derecho);

        if (izq != null && izq.notaFinal < menor.notaFinal) {
            menor = izq;
        }
        if (der != null && der.notaFinal < menor.notaFinal) {
            menor = der;
        }

        return menor;
    }

    public void bfs() {
        if (raiz == null) {
            return;
        }
        Queue<Estudiante> q = new LinkedList<>();
        q.add(raiz);
        while (!q.isEmpty()) {
            Estudiante t = q.poll();
            System.out.println(t);
            if (t.izquierdo != null) {
                q.add(t.izquierdo);
            }
            if (t.derecho != null) {
                q.add(t.derecho);
            }
        }
    }

    public Estudiante getRaiz() {
        return raiz;
    }
}
