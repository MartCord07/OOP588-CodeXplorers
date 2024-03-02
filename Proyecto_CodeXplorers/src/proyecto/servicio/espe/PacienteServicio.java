package proyecto.servicio.espe;

import java.util.List;
import proyecto.dao.espe.MetodosLogin;
import proyecto.dao.espe.MetodosPaciente;
import proyecto.modelo.espe.Paciente;
import proyecto.modelo.espe.Perfil;

public class PacienteServicio {

    public static boolean RegistrarPerfil(Perfil usuario) {
        return new MetodosLogin().RegistrarPerfil(usuario);
    }
    public static boolean AutenticarPerfil(Perfil usuario) {
        return new MetodosLogin().AutenticarPerfil(usuario);
    }
    
   public static Paciente BuscarCedulaPaciente(String cedula) {
        return new MetodosPaciente().BuscarCedulaPaciente(cedula);
    }
    
    public static boolean InsertarPaciente(Paciente paciente) {
        return new MetodosPaciente().InsertarPaciente(paciente);
    }
    public static List<Paciente>ListarPaciente(){
        return new MetodosPaciente().ListarPaciente();
    }
   
}
