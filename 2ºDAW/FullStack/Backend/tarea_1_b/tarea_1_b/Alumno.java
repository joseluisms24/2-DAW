package tarea_1_b;

import java.util.List;

public abstract class Alumno {
    private String nombre;
    private int edad;
    private double nota;
    
    public Alumno(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        } else {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 16 && edad <= 100) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad introducida no es valida");
        }
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            throw new IllegalArgumentException("La nota introducida no esta entre 0 y 10");
        }
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", edad=" + edad + ", nota=" + nota + "]";
    }

    public boolean estaAprobado() {
        return nota >= 5;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public void subirNota(double incremento) {
        if (nota + incremento >= 10) {
            System.out.println("Te has pasado tienes " + nota + " el maximo que puedes aumenta es : " + (nota - incremento));
        } else if (nota + incremento >= 10){
            nota += incremento;
        } else {
            System.out.println("Te has pasado de 10");
        }
    }

    public int aprobados(List<Alumno> alumnos) {
        int aprove = 0;
        for (Alumno alumno : alumnos) {
            if (alumno.estaAprobado()) {
                aprove++;
            }
        }
        return aprove;
    }

    public int suspensos(List<Alumno> alumnos) {
        int sus = 0;
        for (Alumno alumno : alumnos) {
            if (!alumno.estaAprobado()) {
                sus++;
            }
        }
        return sus;
    }

    public double notaMedia(List<Alumno> alumnos) {
        double notas=0;
        for (Alumno alumno : alumnos) {
            notas += alumno.nota;
        }
        return notas;
    }

    public abstract String obtenerModalidad();
}