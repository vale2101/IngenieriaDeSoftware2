import java.util.ArrayList;
import java.util.List;

class Computadora {
    private String procesador;
    private String tarjetaGrafica;
    private int ram;

    private Computadora(String procesador, String tarjetaGrafica, int ram) {
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "procesador='" + procesador + '\'' +
                ", tarjetaGrafica='" + tarjetaGrafica + '\'' +
                ", ram=" + ram +
                '}';
    }

    public static class FabricaComputadoras {
        public Computadora crearComputadora(String procesador, String tarjetaGrafica, int ram) {
            return new Computadora(procesador, tarjetaGrafica, ram);
        }
    }
}

class Orden {
    private List<Computadora> computadoras = new ArrayList<>();
    private Computadora.FabricaComputadoras fabrica = new Computadora.FabricaComputadoras();

    public void agregarComputadora(String procesador, String tarjetaGrafica, int ram) {
        Computadora computadora = fabrica.crearComputadora(procesador, tarjetaGrafica, ram);
        computadoras.add(computadora);
    }

    public void mostrarOrden() {
        System.out.println("Orden de compra:");
        for (Computadora computadora : computadoras) {
            System.out.println(computadora);
        }
    }
}

public class princreador {
    public static void main(String[] args) {
        Orden orden = new Orden();

        orden.agregarComputadora("Intel i7", "NVIDIA GTX 1660", 16);
        orden.agregarComputadora("AMD Ryzen 5", "AMD Radeon RX 5700", 8);

        orden.mostrarOrden();
    }
}
