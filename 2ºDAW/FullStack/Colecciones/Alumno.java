package Colecciones;


public class Alumno {
    private String nombre;
    private int edad;
    private double nota;


public Alumno(String nombre, int edad, double nota) {
    setNombre(nombre);
    setEdad(edad);
    setNota(nota);
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    if (nombre != null  && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
                }
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    if (edad >= 16 && edad <= 100 ) {
        this.edad = edad;
    } else {
        throw new IllegalArgumentException("La edad debe ser mayor que 16 y menor que 100 ambos incluidos");
    }
}

public double getNota() {
    return nota;
}

public void setNota(double nota) {
    if (nota >= 0 && nota <= 10 ) {
        this.nota = nota;
    } else {
        throw new IllegalArgumentException("La nota debe ser mayor que 0 y menor que 10 ambos incluidos");
    }
}

public boolean estaAprobado() {
    return nota >= 5.0;
}

public boolean esMayorDeEdad() {
    return edad >= 18;
}

public void subirNota(double puntos) {
    nota += puntos;
    if (nota > 10.0) {
        nota = 10.0; // Limitar la nota máxima a 10
    }
}

}
