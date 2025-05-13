package Observer;

import Observador;

public class Cliente implements Observador {
    private final String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String estado) {
        System.out.println("Cliente " + nombre + ": El pedido está " + estado);
    }
}