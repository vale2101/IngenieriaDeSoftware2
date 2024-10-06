public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Coche coche = new Coche();
        Avion avion = new Avion();
        Bicicleta bicicleta = new Bicicleta();

        garage.estacionar(coche);
        System.out.println();
        garage.estacionar(avion);
        System.out.println();
        garage.estacionar(bicicleta);
    }
}
