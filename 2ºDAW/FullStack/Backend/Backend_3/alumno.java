package Backend_3;

public class alumno {
    String nombre;
    int edad;
    double nota;

public alumno(String nombre, int edad, int nota) {
    this.nombre = nombre;
    this.edad = edad;
    this.nota = nota;
    }

    //Getter y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null  && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío");
        }
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

    @Override
    public String toString() {
        return "alumno [nombre=" + nombre + ", edad=" + edad + ", nota=" + nota + "]";
    }

    //Métodos
   public String obtenerCalificacion() {
        if (nota >= 9.0) {
            return "Sobresaliente";
        } else if (nota >= 7.0) {
            return "Notable";
        } else if (nota >= 5.0) {
            return "Aprobado";
        } else {
            return "Suspenso";
        }
    }

    public boolean tieneMejorNotaque(alumno otroAlumno) {
        return this.nota > otroAlumno.getNota();
    }

    public boolean tieneLaMismaNotaQue(alumno otroAlumno) {
        return this.nota == otroAlumno.getNota();
    }
    
    public double obtenerDiferenciaDeNota(alumno otroAlumno) {
        return this.nota - otroAlumno.getNota();
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


