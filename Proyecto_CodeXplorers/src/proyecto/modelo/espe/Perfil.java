
package proyecto.modelo.espe;


public class Perfil {
    private int id_Perfil;
    private String cedulaPerfil;
    private String rol_perfil;
    private String contrasena;

    public Perfil() {
    }

    public Perfil(int idPerfil, String nombrePerfil, String tipoPerfil, String contrasena) {
        this.id_Perfil = idPerfil;
        this.cedulaPerfil = nombrePerfil;
        this.rol_perfil = tipoPerfil;
        this.contrasena = contrasena;
    }

    public Perfil(String nombrePerfil, String contrasena) {
        this.cedulaPerfil = nombrePerfil;
        this.contrasena = contrasena;
    }
    

    public int getIdPerfil() {
        return id_Perfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.id_Perfil = idPerfil;
    }

    public String getCedulaPerfil() {
        return cedulaPerfil;
    }

    public void setCedulaPerfil(String nombrePerfil) {
        this.cedulaPerfil = nombrePerfil;
    }

    public String getTipoPerfil() {
        return rol_perfil;
    }

    public void setTipoPerfil(String tipoPerfil) {
        this.rol_perfil = tipoPerfil;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Perfil{" + "idPerfil=" + id_Perfil + ", nombrePerfil=" + cedulaPerfil + ", tipoPerfil=" + rol_perfil + ", contrasena=" + contrasena + '}';
    }
    
    
}
