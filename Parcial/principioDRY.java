 
public class principioDRY {
    private double aplicarPorcentaje(double precio, double porcentaje) {
        return precio * porcentaje;
    }

    public double calcularDescuento(double precio) {
        return precio - aplicarPorcentaje(precio, 0.1);
    }

    public double calcularImpuesto(double precio) {
        return precio + aplicarPorcentaje(precio, 0.2);
    }
}


