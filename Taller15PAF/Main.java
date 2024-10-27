public class Main {
    public static void main(String[] args) {
        FabricaDeMuebles fabricaModerna = new FabricaModerna();
        Silla sillaModerna = fabricaModerna.crearSilla();
        Mesa mesaModerna = fabricaModerna.crearMesa();
        sillaModerna.crear();
        mesaModerna.crear();

        FabricaDeMuebles fabricaClasica = new FabricaClasica();
        Silla sillaClasica = fabricaClasica.crearSilla();
        Mesa mesaClasica = fabricaClasica.crearMesa();
        sillaClasica.crear();
        mesaClasica.crear();
    }
}
