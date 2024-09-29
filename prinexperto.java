import java.util.ArrayList;
import java.util.List;

class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private double precio;
    private int cantidad;

    public Libro(String titulo, String autor, String isbn, double precio, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularPrecioTotal(int cantidadComprada) {
        return this.precio * cantidadComprada;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void reducirCantidad(int cantidadComprada) {
        this.cantidad -= cantidadComprada;
    }
}

class Carrito {
    private List<Libro> libros;

    public Carrito() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro, int cantidadComprada) {
        if (libro.getCantidad() >= cantidadComprada) {
            libro.reducirCantidad(cantidadComprada);
            libros.add(libro);
        } else {
            System.out.println("No hay suficiente stock para " + libro.getTitulo());
        }
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Libro libro : libros) {
            total += libro.calcularPrecioTotal(libro.getCantidad());
        }
        return total;
    }

    public void mostrarCarrito() {
        System.out.println("Libros en el carrito:");
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo() + " - " + libro.getPrecio() + " por unidad");
        }
    }
}

public class prinexperto {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Don Quijote", "Miguel de Cervantes", "111-1234567890", 20.50, 10);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "222-0987654321", 35.75, 5);

        Carrito carrito = new Carrito();

        carrito.agregarLibro(libro1, 2);
        carrito.agregarLibro(libro2, 1);

        carrito.mostrarCarrito();

        System.out.println("Precio total del pedido: $" + carrito.calcularPrecioTotal());
    }
}
