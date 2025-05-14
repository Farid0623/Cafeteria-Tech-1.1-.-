package State;

import Observer.Pedido;

public interface EstadoPedido {
    void siguiente(Pedido pedido); // Cambia al siguiente estado
    void mostrarEstado();          // Muestra el estado actual
}