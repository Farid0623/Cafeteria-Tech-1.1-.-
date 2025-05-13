package State;

public class Pedido {
    private EstadoPedido estado;

    public Pedido() {
        this.estado = new EnEsperaState();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void siguienteEstado() {
        estado.siguiente(this);
    }

    public void mostrarEstado() {
        estado.mostrarEstado();
    }
}