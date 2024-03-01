
package proyecto.modelo.espe;


public class Perfil {
    private int id_Perfil;
    private String nombrePerfil;
    private String tipo_perfil;
    private String contrasena;

    public Perfil() {
    }

    public Perfil(int idPerfil, String nombrePerfil, String tipoPerfil, String contrasena) {
        this.id_Perfil = idPerfil;
        this.nombrePerfil = nombrePerfil;
        this.tipo_perfil = tipoPerfil;
        this.contrasena = contrasena;
    }

    public Perfil(String nombrePerfil, String contrasena) {
        this.nombrePerfil = nombrePerfil;
        this.contrasena = contrasena;
    }
    

    public int getIdPerfil() {
        return id_Perfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.id_Perfil = idPerfil;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public String getTipoPerfil() {
        return tipo_perfil;
    }

    public void setTipoPerfil(String tipoPerfil) {
        this.tipo_perfil = tipoPerfil;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Perfil{" + "idPerfil=" + id_Perfil + ", nombrePerfil=" + nombrePerfil + ", tipoPerfil=" + tipo_perfil + ", contrasena=" + contrasena + '}';
    }
    
    
}
