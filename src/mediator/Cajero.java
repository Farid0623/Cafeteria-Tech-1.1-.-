package mediator;

public class Cajero extends Componente {
    public void enviarSolicitud(String mensaje) {
        System.out.println("Cajero: Enviando solicitud -> " + mensaje);
        mediator.enviar(mensaje, "barista");
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Cajero: Recibió mensaje -> " + mensaje);
    }
}