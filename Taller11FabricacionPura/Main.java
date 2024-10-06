import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Pérez", "Av. Principal 123");

        Producto producto1 = new Producto("Laptop", 1200.00, 1);
        Producto producto2 = new Producto("Smartphone", 800.00, 2);

        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);

        FabricaPedidos fabrica = new FabricaPedidos();
        Pedido pedido = fabrica.crearPedido(cliente, productos);

        System.out.println(pedido);
    }
}
