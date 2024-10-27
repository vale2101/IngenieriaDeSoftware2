class PagoConPaypal implements MetodoPago {
    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Procesando pago con PayPal: $" + cantidad);
    }
}
