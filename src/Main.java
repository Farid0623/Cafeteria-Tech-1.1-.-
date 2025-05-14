import Observer.*;
import State.*;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        // Agregar observadores
        Cliente cliente = new Cliente("Juan");
        Cocina cocina = new Cocina();
        pedido.agregarObservador(cliente);
        pedido.agregarObservador(cocina);

        // Mostrar estado inicial
        pedido.mostrarEstado();

        // Cambiar de estado
        pedido.siguienteEstado(); // En preparación
        pedido.siguienteEstado(); // Listo
        pedido.siguienteEstado(); // Entregado
        pedido.siguienteEstado(); // No hay más estados
    }
}