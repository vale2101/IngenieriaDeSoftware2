public class CanalSMS implements CanalNotificacion {
    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        System.out.println("Enviando notificación por SMS: " + notificacion.getTitulo());
    }
}