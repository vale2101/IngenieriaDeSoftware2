
import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Libro> libros = new ArrayList<>();

    public void anadirLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) return libro;
        }
        return null;
    }

    public List<Libro> buscarLibrosPorAutor(String autor) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                resultado.add(libro);
            }
        }
        return resultado;
    }

    public List<Libro> obtenerLibrosPorAno(int ano) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAno() == ano) {
                resultado.add(libro);
            }
        }
        return resultado;
    }

    public List<Libro> obtenerLibrosEntrePrecios(double precioMin, double precioMax) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getPrecio() >= precioMin && libro.getPrecio() <= precioMax) {
                resultado.add(libro);
            }
        }
        return resultado;
    }
}
