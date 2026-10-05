package backend_2;

public class main {
    public static void main(String[] args) {
        alumno alumno1 = new alumno("Juan", 20, 8);

        System.out.println("Alumno: " + alumno1.getNombre());
        System.out.println("Edad: " + alumno1.getEdad());
        System.out.println("Nota: " + alumno1.getNota());
        System.out.println("Aprobado: " + alumno1.estaAprobado());
        System.out.println("Mayor de edad: " + alumno1.esMayorDeEdad());
        alumno1.subirNota(1.0);
        System.out.println("Nota actualizada: " + alumno1.getNota());

        alumno alumno2 = new alumno("Maria", 22, 9);

        System.out.println("Alumno: " + alumno2.getNombre());
        System.out.println("Edad: " + alumno2.getEdad());
        System.out.println("Nota: " + alumno2.getNota());
        System.out.println("Aprobado: " + alumno2.estaAprobado());
        System.out.println("Mayor de edad: " + alumno2.esMayorDeEdad());
      }

    }
