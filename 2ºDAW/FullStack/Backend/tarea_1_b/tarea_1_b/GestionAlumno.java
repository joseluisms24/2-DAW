package tarea_1_b;
import java.util.ArrayList;
import java.util.List;

public class GestionAlumno {
    private List<Alumno> alumnos = new ArrayList<>();

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void mostrarTodos() {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public Alumno buscarPorNombre(String nombre) {
        Alumno res = null;
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equals(nombre)) {
                res = alumno;
            }
        }
        return res;
    }

    public int contarSuspensos() {
        int res = 0;
        for (Alumno alumno : alumnos) {
            if (alumno.getNota() <= 5) {
                res++;
            }
        }
        return res;
    }

    public Alumno obtenerAlumnoConNotaMasBaja() {
        Alumno res = null;
        double aux = 10;
        for (Alumno alumno : alumnos) {
            if (alumno.getNota() < aux) {
                aux = alumno.getNota();
                res = alumno;
            }
        }
        return res;
    }

    public Alumno obtenerAlumnoConNotaMasAlta() {
        Alumno res = null;
        double aux = 0;
        for (Alumno alumno : alumnos) {
            if (alumno.getNota() > aux) {
                aux = alumno.getNota();
                res = alumno;
            }
        }
        return res;
    }
}