package mediator;

public class Repartidor extends Componente {
    @Override
    public void recibir(String mensaje) {
        System.out.println("Repartidor: Entregando -> " + mensaje);
    }
}