package logica;

/**
 *
 * @author rzapata
 */
public class Usuario {
    private String dni;
    private String nombre;
    private String apellido;
    private String teleno;

    public Usuario() {
    }

    public Usuario(String dni, String nombre, String apellido, String teleno) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.teleno = teleno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTeleno() {
        return teleno;
    }

    public void setTeleno(String teleno) {
        this.teleno = teleno;
    }
    
    
    
    
}
