package backend_2;

public class alumno {
    String nombre;
    int edad;
    double nota;


public alumno(String nombre, int edad, int nota) {
    this.nombre = nombre;
    this.edad = edad;
    this.nota = nota;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

public double getNota() {
    return nota;
}

public void setNota(double nota) {
    this.nota = nota;
}

public boolean estaAprobado() {
    return nota >= 5.0;
}

public boolean esMayorDeEdad() {
    return edad >= 18;
}

public void subirNota(double incremento) {
    nota += incremento;
    if (nota > 10.0) {
        nota = 10.0; // Limitar la nota máxima a 10
    }
}

}
