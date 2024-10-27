class TarjetaFactory extends MetodoPagoFactory {
    @Override
    public MetodoPago crearMetodoPago() {
        return new PagoConTarjeta();
    }
}
