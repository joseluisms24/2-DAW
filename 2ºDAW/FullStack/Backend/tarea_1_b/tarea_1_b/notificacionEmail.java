package tarea_1_b;

public class notificacionEmail extends notificacion {
    
    public notificacionEmail(String mensaje) {
        super(mensaje);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación por correo electrónico: " + mensaje);
    }
    

}