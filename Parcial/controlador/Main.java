
public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();

        libreria.anadirLibro(new Libro("el quijote", "Miguel", 50.0, 1605));
        libreria.anadirLibro(new Libro("Cien años de soledad", "Gabriel ", 40.0, 1967));

        System.out.println("Buscar libro por título:");
        System.out.println(libreria.buscarLibroPorTitulo("el quijote"));

        System.out.println("Obtener libros por año:");
        System.out.println(libreria.obtenerLibrosPorAno(1605));

        System.out.println("Obtener libros entre precios:");
        System.out.println(libreria.obtenerLibrosEntrePrecios(30, 50));
    }
}
