public class Estudiante {
    String cedula, apellidos, nombres, carrera;
    double notaFinal;
    int nivel;
    Estudiante izquierdo, derecho;

    public Estudiante(String cedula, String apellidos, String nombres, double notaFinal, String carrera, int nivel) {
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.notaFinal = notaFinal;
        this.carrera = carrera;
        this.nivel = nivel;
        this.izquierdo = this.derecho = null;
    }

    @Override
    public String toString() {
        return "[" + cedula + "] " + apellidos + " " + nombres + " | Nota: " + notaFinal + " | " + carrera + " Lvl: " + nivel;
    }
}