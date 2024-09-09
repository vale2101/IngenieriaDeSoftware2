// Clase Padre Paquete
abstract class Paquete {
    protected double peso;
    protected String dimensiones;

    // Constructor en la clase Paquete
    public Paquete(double peso, String dimensiones) {
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    public double getPeso() {
        return peso;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public abstract void detallesPaquete();
}

// Clase Paquete Pequeño
class PaquetePequeno extends Paquete {
    private double valorDeclarado;

    // Constructor en la clase PaquetePequeno llamando al constructor de la clase padre
    public PaquetePequeno(double peso, String dimensiones, double valorDeclarado) {
        super(peso, dimensiones);  // Llamada al constructor de la clase padre
        this.valorDeclarado = valorDeclarado;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }

    @Override
    public void detallesPaquete() {
        System.out.println("Paquete Pequeño -> Peso: " + peso + " kg, Dimensiones: " + dimensiones 
                           + ", Valor Declarado: $" + valorDeclarado);
    }
}

// Clase Paquete Grande
class PaqueteGrande extends Paquete {
    private double volumen;
    private String medioTransporte;

    // Constructor en la clase PaqueteGrande llamando al constructor de la clase padre
    public PaqueteGrande(double peso, String dimensiones, double volumen, String medioTransporte) {
        super(peso, dimensiones);  // Llamada al constructor de la clase padre
        this.volumen = volumen;
        this.medioTransporte = medioTransporte;
    }

    public double getVolumen() {
        return volumen;
    }

    public String getMedioTransporte() {
        return medioTransporte;
    }

    @Override
    public void detallesPaquete() {
        System.out.println("Paquete Grande -> Peso: " + peso + " kg, Dimensiones: " + dimensiones 
                           + ", Volumen: " + volumen + " m3, Medio de Transporte: " + medioTransporte);
    }
}

// Clase Paquete Peligroso
class PaquetePeligroso extends Paquete {
    private String etiquetasPeligro;
    private boolean embalajeEspecial;

    // Constructor en la clase PaquetePeligroso llamando al constructor de la clase padre
    public PaquetePeligroso(double peso, String dimensiones, String etiquetasPeligro, boolean embalajeEspecial) {
        super(peso, dimensiones);  // Llamada al constructor de la clase padre
        this.etiquetasPeligro = etiquetasPeligro;
        this.embalajeEspecial = embalajeEspecial;
    }

    public String getEtiquetasPeligro() {
        return etiquetasPeligro;
    }

    public boolean isEmbalajeEspecial() {
        return embalajeEspecial;
    }

    @Override
    public void detallesPaquete() {
        System.out.println("Paquete Peligroso -> Peso: " + peso + " kg, Dimensiones: " + dimensiones 
                           + ", Etiquetas de Peligro: " + etiquetasPeligro 
                           + ", Embalaje Especial: " + (embalajeEspecial ? "Sí" : "No"));
    }
}

// Clase Principal para pruebas
public class paquetes7 {
    public static void main(String[] args) {
        PaquetePequeno pequeno = new PaquetePequeno(2.5, "30x20x10 cm", 150.0);
        PaqueteGrande grande = new PaqueteGrande(10.0, "100x50x50 cm", 0.25, "Marítimo");
        PaquetePeligroso peligroso = new PaquetePeligroso(5.0, "50x40x30 cm", "Inflamable", true);

        pequeno.detallesPaquete();
        grande.detallesPaquete();
        peligroso.detallesPaquete();
    }
}