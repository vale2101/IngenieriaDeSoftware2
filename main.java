class Cliente {
    public String nombre;
    public String correoE;

    // Recibe el nombre y correo electrónico del cliente
    public Cliente(String nombre, String correoE) {
        this.nombre = nombre;
        this.correoE = correoE;
    }

    // Obtener el nombre del cliente
    public String obtenerNombre() {
        return nombre;
    }

    // Actualizar el nombre del cliente
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    // Obtener el correo del cliente
    public String obtenerCorreoElectronico() {
        return correoE;
    }

    // Actualizar el correo del cliente
    public void establecerCorreoElectronico(String correoE) {
        this.correoE = correoE;
    }
}

// Simula el envío de correos 
class ServicioEmail {
    // Método que simula el envío de un correo electrónico a un destino específico
    public void enviarEmail(String destinatario, String asunto, String mensaje) {
        System.out.println("Enviando correo a: " + destinatario); 
        System.out.println("Asunto: " + asunto); 
        System.out.println("Mensaje: " + mensaje); 
    }
}

// Verifica que las contraseñas cumplan con ciertos requisitos
class ValidadorDeContrasena {
    // Método que valida si la contraseña tiene al menos 8 caracteres
    public boolean validarContrasena(String contrasena) {
        return contrasena.length() >= 8; 
    }
}

// Calcula el salario de un cliente
class CalculadoraDeSalario {
    public double calcularSalario(Cliente cliente) {
        System.out.println("Calculando salario para: " + cliente.obtenerNombre());
        return 5000.0; 
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Pérez", "juan.perez@email.com");

        ValidadorDeContrasena validadorDeContrasena = new ValidadorDeContrasena();
        String contrasena = "contrasenacliente";
        boolean esValida = validadorDeContrasena.validarContrasena(contrasena);
        System.out.println("Contraseña válida: " + esValida); 

        ServicioEmail servicioEmail = new ServicioEmail();
        servicioEmail.enviarEmail(cliente.obtenerCorreoElectronico(), "Bienvenido", "Este es tu mensaje de bienvenida.");

        CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();
        double salario = calculadoraDeSalario.calcularSalario(cliente); 
        System.out.println("Salario calculado: " + salario);
    }
}
