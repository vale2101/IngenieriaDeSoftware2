
public class Garage {
    public void estacionar(Transporte transporte) {
        System.out.println("Estacionando el transporte...");
        transporte.mostrarInformacion();
        transporte.acelerar();
        transporte.frenar();
    }
}
