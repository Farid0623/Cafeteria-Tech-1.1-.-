package State;

public class ListoState implements EstadoPedido {
    @Override
    public void siguiente(Pedido pedido) {
        pedido.setEstado(new EntregadoState());
    }

    @Override
    public void mostrarEstado() {
        System.out.println("El pedido está listo.");
    }
}