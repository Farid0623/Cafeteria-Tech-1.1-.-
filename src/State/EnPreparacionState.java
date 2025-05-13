package State;

public class EnPreparacionState implements EstadoPedido {
    @Override
    public void siguiente(Pedido pedido) {
        pedido.setEstado(new ListoState());
    }

    @Override
    public void mostrarEstado() {
        System.out.println("El pedido está en preparación.");
    }
}