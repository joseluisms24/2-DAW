package tarea_1_b;

public class notificacionSms extends notificacion {

    public notificacionSms(String mensaje) {
        super(mensaje);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación por SMS: " + mensaje);
    }
    
}