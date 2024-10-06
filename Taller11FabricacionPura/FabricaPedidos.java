
import java.util.Date;
import java.util.List;

public class FabricaPedidos {

    private static int contadorId = 1;

    public Pedido crearPedido(Cliente cliente, List<Producto> productos) {
        Pedido pedido = new Pedido(contadorId++, new Date(), cliente, productos);
        return pedido;
    }
}
