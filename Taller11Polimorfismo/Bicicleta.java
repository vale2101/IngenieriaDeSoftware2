
public class Bicicleta implements Transporte {
    @Override
    public void acelerar() {
        System.out.println("La bicicleta acelera al pedalear.");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta frena con los frenos de mano.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Esto es una bicicleta.");
    }
}
