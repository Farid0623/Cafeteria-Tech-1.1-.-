package mediator;

public class Barista extends Componente {
    @Override
    public void recibir(String mensaje) {
        System.out.println("Barista: Preparando -> " + mensaje);
    }
}