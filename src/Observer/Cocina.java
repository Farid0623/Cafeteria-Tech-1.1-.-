public class Cocina implements Observador {
    @Override
    public void actualizar(String estado) {
        System.out.println("Cocina: El pedido está " + estado);
    }
}