package tarea_1_b;

import java.util.ArrayList;
import java.util.List;



public class Curso implements GeneradorInforme, ExportableCSV {
    private String nombre;
    private String nombreProfesor;
    private List<Alumno> alumnos = new ArrayList<>();

    public Curso(String nombre, String nombreProfesor) {
        this.nombre = nombre;
        this.nombreProfesor = nombreProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public int getNumeroAlumnos() {
        return alumnos.size();
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void eliminarAlumno(Alumno alumno) {
        alumnos.remove(alumno);
        System.out.println("Alumno eliminado: " + alumno.getNombre());
    }

    public int contarAprobados() {
        int res = 0;
        for (Alumno alumno : alumnos) {
            if (alumno.estaAprobado()) {
                res++;
            }
        }
        return res;
    }

    public double calcularMedia() {
        double res = 0;
        for (Alumno alumno : alumnos) {
            res += alumno.getNota();
        }
        return res / alumnos.size();
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

    public Alumno buscarAlumnoPorNombre(String nombre) {
        Alumno res = null;
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().toUpperCase().equals(nombre.toUpperCase())) {
                res = alumno;
            }
        }
        return res;
    }

    public void mostrarModalidadAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: " + alumno.getNombre() + " | Modalidad: " + alumno.obtenerModalidad());
        }
    }

    public String toString() {
        return "Curso: " + nombre + "\n Profesor: " + nombreProfesor + "\n Numero de alumnos: " + getNumeroAlumnos() +
                "\n Media de notas: " + calcularMedia() + "\n Numero de aprobados: " + contarAprobados() +
                "\n Alumno con nota mas alta: " + obtenerAlumnoConNotaMasAlta();
    }

    @Override
    public String generarInforme() {
        return "Informe del curso: " + nombre + "\nProfesor: " + nombreProfesor + "\nNúmero de alumnos: " + getNumeroAlumnos() +
                "\nMedia de notas: " + calcularMedia() + "\nNúmero de aprobados: " + contarAprobados() +
                "\nAlumno con nota más alta: " + obtenerAlumnoConNotaMasAlta();
    }

    @Override 
    public String exportarCSV() {
        return "Curso: " + nombre + ",Profesor: " + nombreProfesor + ",Número de alumnos: " + getNumeroAlumnos() +
                ",Media de notas: " + calcularMedia() + ",Número de aprobados: " + contarAprobados() +
                ",Alumno con nota más alta: " + obtenerAlumnoConNotaMasAlta();
    }
}
