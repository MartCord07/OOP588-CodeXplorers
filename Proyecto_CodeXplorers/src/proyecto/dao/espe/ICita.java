
package proyecto.dao.espe;

import java.util.List;
import proyecto.vista.espe.CitaVista;

public interface ICita {
    public List<CitaVista> ListaPerfil();
    public boolean ActualizarCita(CitaVista cita);
    public boolean EliminarCita(int  idcita);
    public CitaVista BuscarIdCita(int idcita);
}
