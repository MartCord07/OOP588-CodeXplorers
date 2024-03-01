
package proyecto.modelo.espe;


public class Paciente {
    private String Nombre;
    private String Contraseña;

    public Paciente() {
    }

    public Paciente(String Nombre, String Contraseña) {
        this.Nombre = Nombre;
        this.Contraseña = Contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
}
