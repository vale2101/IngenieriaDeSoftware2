public class Main62 {

    public static void main(String[] args) {
        // Crear instancias de los paquetes
        PaqueteGrande paqueteGrande = new PaqueteGrande(5.0, 10.0, 20.0, 30.0);
        PaquetePeligroso paquetePeligroso = new PaquetePeligroso(3.0, 5.0, 10.0, 15.0);
        PaquetePequeño paquetePequeño = new PaquetePequeño(1.0, 2.0, 3.0, 4.0);

        // Realizar operaciones con los paquetes
        paqueteGrande.calcularCostoEnvioGrande();
        paquetePeligroso.verificarContenidoPeligroso();
        paquetePeligroso.asegurarPaquetePeligroso();
        paquetePequeño.calcularCostoEnvioPequeño();
    }
}

// Clase abstracta para los paquetes
abstract class Paquete {
    private double peso;
    private double alto;
    private double ancho;
    private double largo;

    public Paquete(double peso, double alto, double ancho, double largo) {
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }
}

// Interfaz para paquetes grandes
interface PaqueteG {
    void calcularCostoEnvioGrande();
}

// Clase para paquetes grandes
class PaqueteGrande extends Paquete implements PaqueteG {
    private double volumen;

    public PaqueteGrande(double peso, double alto, double ancho, double largo) {
        super(peso, alto, ancho, largo);
        this.volumen = alto * ancho * largo; // Cálculo del volumen
    }

    @Override
    public void calcularCostoEnvioGrande() {
        System.out.println("Calculando costo de envío para paquete grande.");
    }
}

// Interfaz para paquetes peligrosos
interface PaquetePg {
    void verificarContenidoPeligroso();
    void asegurarPaquetePeligroso();
}

// Clase para paquetes peligrosos
class PaquetePeligroso extends Paquete implements PaquetePg {
    private String etiquetas_de_peligro;
    private boolean embalaje_especial;

    public PaquetePeligroso(double peso, double alto, double ancho, double largo) {
        super(peso, alto, ancho, largo);
        this.etiquetas_de_peligro = "Etiquetas de peligro desconocidas";
        this.embalaje_especial = false; // Asumir embalaje no especial por defecto
    }

    @Override
    public void verificarContenidoPeligroso() {
        System.out.println("Verificando contenido peligroso.");
    }

    @Override
    public void asegurarPaquetePeligroso() {
        System.out.println("Asegurando paquete peligroso.");
    }
}

// Interfaz para paquetes pequeños
interface PaquetePq {
    void calcularCostoEnvioPequeño();
}

// Clase para paquetes pequeños
class PaquetePequeño extends Paquete implements PaquetePq {
    private double valor_declarado;

    public PaquetePequeño(double peso, double alto, double ancho, double largo) {
        super(peso, alto, ancho, largo);
        this.valor_declarado = 0.0; // Valor declarado por defecto
    }

    @Override
    public void calcularCostoEnvioPequeño() {
        System.out.println("Calculando costo de envío para paquete pequeño.");
    }
}