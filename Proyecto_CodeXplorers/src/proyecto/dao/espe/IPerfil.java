package proyecto.dao.espe;

import proyecto.modelo.espe.Perfil;

public interface IPerfil {

    public boolean RegistrarPerfil(Perfil Usuario);

    public boolean AutenticarPerfil(Perfil Usuario);
}
