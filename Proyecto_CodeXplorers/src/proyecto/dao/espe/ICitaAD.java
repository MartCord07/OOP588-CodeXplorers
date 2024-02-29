
package proyecto.dao.espe;

import java.util.List;
import proyecto.modelo.espe.CitaAD;


public interface ICitaAD {
    public List<CitaAD> ListaCitas();
    public boolean ActualizarCita(CitaAD cita);
    public boolean EliminarCita(int  idcita);
    public CitaAD BuscarIdCita(int idcita);
}
