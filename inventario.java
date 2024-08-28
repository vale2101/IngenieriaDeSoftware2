interface Enviar {
    void enviarPorCorreo(String direccionCorreo);
}

abstract class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public abstract double calcularCostoTotal();
}

class ProductoFisico extends Producto implements Enviar {
    private double peso;

    public ProductoFisico(String nombre, double precio, int cantidad, double peso) {
        super(nombre, precio, cantidad);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double calcularCostoTotal() {
        return getPrecio() * getCantidad();
    }

    @Override
    public void enviarPorCorreo(String direccionCorreo) {
        System.out.println("Enviando producto físico '" + getNombre() + "' a " + direccionCorreo);
    }
}

class ProductoDigital extends Producto implements Enviar {
    private double tamanoArchivo;

    public ProductoDigital(String nombre, double precio, int cantidad, double tamanoArchivo) {
        super(nombre, precio, cantidad);
        this.tamanoArchivo = tamanoArchivo;
    }

    public double getTamanoArchivo() {
        return tamanoArchivo;
    }

    public void setTamanoArchivo(double tamanoArchivo) {
        this.tamanoArchivo = tamanoArchivo;
    }

    @Override
    public double calcularCostoTotal() {
        return getPrecio() * getCantidad();
    }

    @Override
    public void enviarPorCorreo(String direccionCorreo) {
        System.out.println("Enviando producto digital '" + getNombre() + "' a " + direccionCorreo);
    }
}

class ProductoMixto extends Producto implements Enviar {
    private double peso;
    private double tamanoArchivo;

    public ProductoMixto(String nombre, double precio, int cantidad, double peso, double tamanoArchivo) {
        super(nombre, precio, cantidad);
        this.peso = peso;
        this.tamanoArchivo = tamanoArchivo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanoArchivo() {
        return tamanoArchivo;
    }

    public void setTamanoArchivo(double tamanoArchivo) {
        this.tamanoArchivo = tamanoArchivo;
    }

    @Override
    public double calcularCostoTotal() {
        return getPrecio() * getCantidad();
    }

    @Override
    public void enviarPorCorreo(String direccionCorreo) {
        System.out.println("Enviando producto mixto '" + getNombre() + "' a " + direccionCorreo);
    }
}

public class inventario {
    public static void main(String[] args) {
        ProductoFisico productoFisico = new ProductoFisico("Cuaderno", 20.0, 2, 1.5);
        ProductoDigital productoDigital = new ProductoDigital("Libro digital", 10.0, 3, 500);
        ProductoMixto productoMixto = new ProductoMixto("Juego fisico y de descarga", 50.0, 1, 0.5, 1500);

        System.out.println("Costo total del producto físico: " + productoFisico.calcularCostoTotal());
        System.out.println("Costo total del producto digital: " + productoDigital.calcularCostoTotal());
        System.out.println("Costo total del producto mixto: " + productoMixto.calcularCostoTotal());

        productoFisico.enviarPorCorreo("camila.t@gmail.com");
        productoDigital.enviarPorCorreo("juan@hotmail.com");
        productoMixto.enviarPorCorreo("sara@gmail.com");
    }
}