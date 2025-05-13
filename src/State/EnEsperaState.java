package State;

public class EnEsperaState implements EstadoPedido {
    @Override
    public void siguiente(Pedido pedido) {
        pedido.setEstado(new EnPreparacionState());
    }

    @Override
    public void mostrarEstado() {
        System.out.println("El pedido está en espera.");
    }
}