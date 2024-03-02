package proyecto.servicio.espe;

import proyecto.dao.espe.MetodosLogin;
import proyecto.modelo.espe.Perfil;

public class PerfilServicio {

    public static boolean RegistrarPerfil(Perfil usuario) {
        return new MetodosLogin().RegistrarPerfil(usuario);
    }

    public static boolean AutenticarPerfil(Perfil usuario) {
        return new MetodosLogin().AutenticarPerfil(usuario);
    }
}
