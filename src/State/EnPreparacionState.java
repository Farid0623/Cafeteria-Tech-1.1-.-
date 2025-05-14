package State;

import Observer.Pedido;

public class EnPreparacionState implements EstadoPedido {

    @Override
    public void siguiente(Pedido pedido) {
        System.out.println("Cambiando estado de 'En preparación' a 'Listo'.");
        pedido.setEstado(new ListoState());
    }

    @Override
    public void mostrarEstado() {
        System.out.println("El pedido está actualmente en estado: En preparación.");
    }

    @Override
    public String toString() {
        return "En preparación";
    }
}