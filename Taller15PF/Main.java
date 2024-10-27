public class Main {
    public static void main(String[] args) {
        MetodoPagoFactory tarjetaFactory = new TarjetaFactory();
        MetodoPago pagoConTarjeta = tarjetaFactory.crearMetodoPago();
        pagoConTarjeta.procesarPago(100.0);

        MetodoPagoFactory paypalFactory = new PaypalFactory();
        MetodoPago pagoConPaypal = paypalFactory.crearMetodoPago();
        pagoConPaypal.procesarPago(200.0);
    }
}
