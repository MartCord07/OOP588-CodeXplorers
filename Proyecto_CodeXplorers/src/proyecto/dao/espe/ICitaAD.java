
package proyecto.dao.espe;

import java.util.List;
import proyecto.modelo.espe.CitaAD;
import proyecto.modelo.espe.Doctor;
import proyecto.modelo.espe.Paciente;
import proyecto.modelo.espe.Perfil;


public interface ICitaAD {
    public List<Paciente> ListaCitas();
    public List<Perfil> ListaLogin();
    public boolean ActualizarCita(CitaAD cita);
    public boolean EliminarCita(int  idcita);
    public Paciente BuscarIdCita(int idcita);
    public Perfil buscarIdPerfil(int CIperfil);
    public boolean InsertarAdmin (CitaAD admin);
    public boolean ActualizarClave(Perfil clave);  
}
