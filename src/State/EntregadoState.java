package State;

public class EntregadoState implements EstadoPedido {
    @Override
    public void siguiente(Pedido pedido) {
        System.out.println("Pedido ya entregado. No se puede avanzar más.");
    }

    @Override
    public void mostrarEstado() {
        System.out.println("El pedido ha sido entregado.");
    }
}