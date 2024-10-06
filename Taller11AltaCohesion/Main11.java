public class Main11 {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 1200.00, "Laptop de alto rendimiento");
        Producto producto2 = new Producto("Teléfono", 800.00, "Smartphone de última generación");

        Carrito carrito = new Carrito();

        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);

        double total = carrito.calcularPrecioTotal();
        System.out.println("El precio total del carrito es: " + total);

        RepositorioProducto repositorio = new RepositorioProducto();
        repositorio.guardar(producto1);
        repositorio.guardar(producto2);
    }
}
