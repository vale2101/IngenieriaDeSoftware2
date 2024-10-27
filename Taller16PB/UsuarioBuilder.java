import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UsuarioBuilder {
    protected String nombre;
    protected int edad;
    protected String correo;
    protected Set<String> intereses;

    public UsuarioBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public UsuarioBuilder setCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    public UsuarioBuilder setIntereses(Set<String> intereses) {
        this.intereses = intereses;
        return this;
    }

    public Usuario build() {
        return new Usuario(this);
    }

    public static void main(String[] args) {
        Set<String> intereses = new HashSet<>(Arrays.asList("Lectura", "Música"));

        Usuario usuario = new UsuarioBuilder()
                .setNombre("Juan")
                .setEdad(30)
                .setCorreo("juan@example.com")
                .setIntereses(intereses)
                .build();

        System.out.println(usuario);
    }
}
