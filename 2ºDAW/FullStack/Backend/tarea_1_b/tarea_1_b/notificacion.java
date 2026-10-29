package tarea_1_b;

public abstract class notificacion {
    String mensaje;
    
    public notificacion(String mensaje) {
        this.mensaje = mensaje;
    }
    public abstract void enviar(String mensaje);
}

