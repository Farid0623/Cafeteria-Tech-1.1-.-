package State;

public interface EstadoPedido {
    void siguiente(Pedido pedido);
    void mostrarEstado();
}