package tarea_1_b;

public class AlumnoOnline extends Alumno {
    private String porcentajeConexion;

    public AlumnoOnline(String nombre, int edad, double nota, String porcentajeConexion) {
        super(nombre, edad, nota);
        this.porcentajeConexion = porcentajeConexion;
    }

    public String getPorcentajeConexion() {
        return porcentajeConexion + "%";
    }

    public void setPorcentajeConexion(String porcentajeConexion) {
        if (porcentajeConexion.length() <= 3    ) {
            this.porcentajeConexion = porcentajeConexion + "";
        } else {
            System.out.println("Ha superado el limite");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nota: " + getNota());
        System.out.println("Conexion: " + getPorcentajeConexion());
    }

    @Override
    public String toString() {
        return "AlumnoOnline [Asistencia = " + getPorcentajeConexion() + ", Nombre =" + getNombre()
                + ", Edad =" + getEdad() + ", Nota =" + getNota() + "]";
    }

    @Override
    public String obtenerModalidad() {
        return "Online";
    }
}
