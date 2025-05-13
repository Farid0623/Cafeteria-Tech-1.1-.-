import java.util.HashMap;
import java.util.Map;

public class MediatorPedidos {
    private final Map<String, Componente> componentes = new HashMap<>();

    public void registrarComponente(String nombre, Componente componente) {
        componentes.put(nombre, componente);
        componente.setMediator(this);
    }

    public void enviar(String mensaje, String destino) {
        if (componentes.containsKey(destino)) {
            componentes.get(destino).recibir(mensaje);
        }
    }
}

abstract class Componente {
    protected MediatorPedidos mediator;

    public void setMediator(MediatorPedidos mediator) {
        this.mediator = mediator;
    }

    public abstract void recibir(String mensaje);
}