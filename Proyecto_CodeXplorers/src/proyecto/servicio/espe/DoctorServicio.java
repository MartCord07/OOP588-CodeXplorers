package proyecto.servicio.espe;

import java.util.List;
import proyecto.dao.espe.MetodosDoctor;
import proyecto.modelo.espe.Doctor;

public class DoctorServicio {

    public static List<Doctor> ListarPaciente() {
        return new MetodosDoctor().ListarPacientes();
    }

    public static List<Doctor> ListarDoctores() {
        return new MetodosDoctor().ListarDoctores();
    }

    public static List<Doctor> ListarHistoriales() {
        return new MetodosDoctor().ListarHistoriales();
    }
    public static List<Doctor>ListarMedicamentos(){
        return new MetodosDoctor().ListarMedicamentos();
    }

    public static List<Doctor> BuscarDoctor(String especialidad) {
        return new MetodosDoctor().BuscarDoctor(especialidad);
    }

    public static Doctor BuscarCedulaPaciente(String cedula) {
        return new MetodosDoctor().BuscarCedulaPaciente(cedula);
    }

    public static Doctor BuscarNombreMedicina(String nombreMed) {
        return new MetodosDoctor().BuscarNombreMedicina(nombreMed);
    }

    public static Doctor BuscarHistorial(String cedula) {
        return new MetodosDoctor().BuscarHistorial(cedula);
    }

    public static boolean GenerarHistorial(Doctor historial) {
        return new MetodosDoctor().GenerarHistorial(historial);
    }

}
