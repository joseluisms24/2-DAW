package tarea_1_b;

public class AlumnoPresencial extends Alumno{
    private int horasAsistencia;

    public AlumnoPresencial(String nombre, int edad, double nota, int horasAsistencia) {
        super(nombre, edad, nota);
        this.horasAsistencia = horasAsistencia;
    }

    public int getHorasAsistencia() {
        return horasAsistencia;
    }

    public void setHorasAsistencia(int horasAsistencia) {
        this.horasAsistencia = horasAsistencia;
    }
    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nota: " + getNota());
        System.out.println("Horas: " + getHorasAsistencia());
    }

    @Override 
    public String toString() {
        return "Nombre: " + this.getNombre() + " | Edad: " + getEdad() + " | Nota: " + getNota() + " | Horas: " + getHorasAsistencia();
    }

    @Override
    public String obtenerModalidad() {
        return "Presencial";
    }
}
