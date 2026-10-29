package tarea_1_b;


public class Main {
    public static void main(String[] args) {
        Curso daw2Opt = new Curso("DAW2Optativa", "Javi");
        Curso daw2Pro = new Curso("DAW2Programacion", "Jose Antonio");

        /*daw2Opt.agregarAlumno(new Alumno("Juan", 7, 6));
        daw2Opt.agregarAlumno(new Alumno("Ana", 4, 7));
        daw2Opt.agregarAlumno(new Alumno("Pedro", 9, 4));

        daw2Pro.agregarAlumno(new Alumno("Maria", 8, 9));
        daw2Pro.agregarAlumno(new Alumno("Luis", 5, 6));
        daw2Pro.agregarAlumno(new Alumno("Sofia", 3, 5));

        System.out.println(daw2Opt);
        System.out.println();
        System.out.println(daw2Pro);

        System.out.println();
        daw2Opt.eliminarAlumno(daw2Opt.buscarAlumnoPorNombre("Ana"));
        System.out.println();
        System.out.println(daw2Opt);

        System.out.println(daw2Opt.buscarAlumnoPorNombre("ANA"));
*/
        daw2Opt.agregarAlumno(new AlumnoPresencial("Miguel", 19, 7, 267));
        daw2Pro.agregarAlumno(new AlumnoOnline("Javier", 34, 9, "84"));

        // Cambiar el porcentaje de conexión del alumno "Javier" a "90"
        ((AlumnoOnline)daw2Pro.buscarAlumnoPorNombre("Javier")).setPorcentajeConexion("90");

        System.out.println(daw2Opt.buscarAlumnoPorNombre("Miguel").toString());
        System.out.println(daw2Pro.buscarAlumnoPorNombre("Javier").toString());

        System.out.println();
        daw2Opt.agregarAlumno(new AlumnoPresencial("Laura", 22, 8, 300));
        daw2Pro.agregarAlumno(new AlumnoOnline("Carlos", 28, 6, "75"));
        daw2Opt.agregarAlumno(new AlumnoPresencial("Sofia", 20, 9, 250));
        daw2Pro.agregarAlumno(new AlumnoOnline("Lucia", 25, 7, "80"));
        daw2Opt.mostrarModalidadAlumnos();
        System.out.println();
        daw2Pro.mostrarModalidadAlumnos();
        System.out.println();
        System.out.println(daw2Opt.generarInforme());
        System.out.println();
        System.out.println(daw2Pro.generarInforme());


        //Probar las notificaciones
        notificacion notificacionEmail = new notificacionEmail("¡Hola! Esta es una notificación por correo electrónico.");
        notificacion notificacionSMS = new notificacionSms("¡Hola! Esta es una notificación por SMS."); 

        System.out.println();
        notificacionEmail.enviar("¡Hola! Esta es una notificación por correo electrónico.");
        notificacionSMS.enviar("¡Hola! Esta es una notificación por SMS.");     



        //Probar el csv
        System.out.println();
        System.out.println(daw2Opt.exportarCSV());
        System.out.println();
        System.out.println(daw2Pro.exportarCSV());  
    }
}