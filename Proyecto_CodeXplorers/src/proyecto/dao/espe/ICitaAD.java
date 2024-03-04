package proyecto.dao.espe;

import java.util.List;
import proyecto.modelo.espe.CitaAD;
import proyecto.modelo.espe.Paciente;
import proyecto.modelo.espe.Perfil;

public interface ICitaAD {

    //public List<CitaAD> ListaCitas();
    public Paciente BuscarCedulaPersona(String cedula);
    public Perfil BuscarCedulaPerfil(String cedulaPerfil);
    public boolean InsertarAdmin(CitaAD persona);
    public boolean ActualizarCita(CitaAD cita);
    public boolean ActualizarPersona(Perfil perfil);
    public boolean EliminarCita(String cedula);
    //public CitaAD BuscarIdCita(int idcita);
    public String EncriptarContraseña(String contraseña);
}
