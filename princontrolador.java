class Entrada {
    private String tipo; // general, VIP, etc.
    private double precio;
    private int disponibilidad;

    public Entrada(String tipo, double precio, int disponibilidad) {
        this.tipo = tipo;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void disminuirDisponibilidad() {
        if (disponibilidad > 0) {
            disponibilidad--;
        }
    }

    public boolean hayDisponibilidad() {
        return disponibilidad > 0;
    }
}

class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void comprarEntrada(ControladorVenta controlador, Entrada entrada) {
        controlador.procesarCompra(this, entrada);
    }
}

class ProcesadorPagos {
    public boolean procesarPago(Usuario usuario, double cantidad) {
        System.out.println("Procesando pago de " + cantidad + " para " + usuario.getNombre());
        return true; // Simula que el pago siempre es exitoso
    }
}

class ControladorVenta {
    private ProcesadorPagos procesadorPagos;

    public ControladorVenta() {
        this.procesadorPagos = new ProcesadorPagos();
    }

    public void procesarCompra(Usuario usuario, Entrada entrada) {
        if (entrada.hayDisponibilidad()) {
            System.out.println("Verificando disponibilidad para " + entrada.getTipo() + "...");

            if (procesadorPagos.procesarPago(usuario, entrada.getPrecio())) {
                entrada.disminuirDisponibilidad();
                System.out.println("Compra realizada con éxito. Quedan " + entrada.getDisponibilidad() + " entradas.");
            } else {
                System.out.println("Error al procesar el pago.");
            }
        } else {
            System.out.println("No hay disponibilidad para este tipo de entrada.");
        }
    }
}

public class princontrolador {
    public static void main(String[] args) {
        // Crear entradas
        Entrada entradaGeneral = new Entrada("General", 50.0, 10);
        Entrada entradaVIP = new Entrada("VIP", 100.0, 5);

        // Crear usuarios
        Usuario usuario1 = new Usuario("Carlos");
        Usuario usuario2 = new Usuario("Ana");

        // Crear controlador de venta
        ControladorVenta controladorVenta = new ControladorVenta();

        // Usuarios compran entradas
        usuario1.comprarEntrada(controladorVenta, entradaGeneral);
        usuario2.comprarEntrada(controladorVenta, entradaVIP);
        usuario1.comprarEntrada(controladorVenta, entradaVIP); // Intento de comprar otra VIP
    }
}
