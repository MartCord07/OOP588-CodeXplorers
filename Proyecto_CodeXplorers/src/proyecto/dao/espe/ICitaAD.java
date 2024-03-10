
package proyecto.dao.espe;

import java.util.List;
import proyecto.modelo.espe.CitaAD;
import proyecto.modelo.espe.Doctor;
import proyecto.modelo.espe.Paciente;
import proyecto.modelo.espe.Perfil;


public interface ICitaAD {
    public List<Paciente> ListaCitas();
    public List<Perfil> ListaLogin();
    public List<Doctor> ListaDoctor();
    public boolean ActualizarCita(CitaAD cita);
    public boolean EliminarCita(String  idcita);
    public Paciente BuscarIdCita(String idcita);
    public Perfil buscarIdPerfil(String CIperfil);
    public Doctor buscarIdDoctor(String idDoctor);
    public boolean InsertarAdmin (CitaAD admin);
    public boolean ActualizarClave(Perfil clave);  
    public boolean ActualizarUsuario(CitaAD usuario);  
}
