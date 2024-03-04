package proyecto.dao.espe;

import java.util.List;
import proyecto.modelo.espe.Doctor;

/**
 *
 * @author Usuario
 */
public interface IDoctor {

    public List<Doctor> ListarPaciente();

    public Doctor BuscarCedulaPaciente(String cedula);

    public Doctor BuscarNombreMedicina(String nombreMed);
    
    public Doctor BuscarDoctor(String especialidad);
    
    public List<Doctor> ListarDoctores();

}
