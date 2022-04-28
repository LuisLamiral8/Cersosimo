package Postnet;

/**
 *
 * @author Luis Lamiral
 */
public class Persona {
    private final String id;
    private final String nombre;
    private final String apellido;
    private final String telefono;
    private final String mail;

    public Persona(String id, String nombre, String apellido, String telefono, String mail) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", mail=" + mail + '}';
    }
    
}
