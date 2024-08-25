//La clase Factura viola el SRP al manejar almacenamiento de datos, envio de correo, generación de reportes, y envío a la DIAN, cada una de las cuales debería ser responsabilidad de una clase separada. 
// Estas tareas abarcan persistencia, comunicación, análisis, y cumplimiento regulatorio.

import java.util.ArrayList; //Almacenar elementos
import java.util.List; //Metodos para manejar elementos

// Clase principal Factura
class Factura {
    private int numero;
    private double monto;

    public Factura(int numero, double monto) {
        this.numero = numero;
        this.monto = monto;
    }

    public int getNumero() {
        return numero;
    }

    public double getMonto() {
        return monto;
    }

    public void imprimirDetalle() {
        System.out.println("Factura #" + numero + ", Monto = $" + monto);
    }
}

// Clase Cliente
class Cliente {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public void imprimirDetalle() {
        System.out.println("Cliente: " + nombre + ", Correo: " + email);
    }
}

// Clase FACTURA simulando uso de base de datos
class FACTURA {
    public void guardarFactura(Factura factura) {
        System.out.println("Guardando factura en la base de datos factura #" + factura.getNumero());
    }

    public void guardarCliente(Cliente cliente) {
        System.out.println("Guardando cliente en la base de datos cliente " + cliente.getNombre());
    }
}

// Clase CORREO simulando envio de correo
class CORREO {
    public void enviarEmailFactura(Cliente cliente, Factura factura) {
        System.out.println("Enviando correo a " + cliente.getEmail() + " de la factura #" + factura.getNumero());
    }
}

// Clase REPORTE
class REPORTE {
    public void generarReporteFacturas(List<Factura> facturas) {
        System.out.println("Generando reporte");
        for (Factura factura : facturas) {
            factura.imprimirDetalle();
        }
    }
}

// Clase DIAN simulando envio de factura a la DIAN
class DIAN {
    public void enviarFacturaDian(Factura factura) {
        System.out.println("Enviando factura #" + factura.getNumero() + " a la DIAN");
    }
}

// Clase Principal
public class Main2 {
    public static void main(String[] args) {
        // Se crea cliente y factura
        Cliente cliente = new Cliente("Camila Gomez", "camilaG@gmail.com");
        Factura factura = new Factura(78965, 258.698);

        //Mostrar informacion 
        cliente.imprimirDetalle();
        factura.imprimirDetalle();

        // Guardar información en simulando base de datos
        FACTURA facturaRepo = new FACTURA();
        facturaRepo.guardarCliente(cliente);
        facturaRepo.guardarFactura(factura);

        // Simular envio de correo al cliente
        CORREO emailService = new CORREO();
        emailService.enviarEmailFactura(cliente, factura);

        // Simular envio de factura a la DIAN
        DIAN dianService = new DIAN();
        dianService.enviarFacturaDian(factura);

        // Generar reporte de facturas
        List<Factura> facturas = new ArrayList<>();
        facturas.add(factura); // Añadir una factura al reporte
        REPORTE reporteService = new REPORTE();
        reporteService.generarReporteFacturas(facturas);
    }
}
