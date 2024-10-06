
public class RepositorioProducto {
    public void guardar(Producto producto) {
        System.out.println("Producto guardado en la base de datos: " + producto.getNombre());
    }

    public void eliminar(Producto producto) {
        System.out.println("Producto eliminado de la base de datos: " + producto.getNombre());
    }

}
