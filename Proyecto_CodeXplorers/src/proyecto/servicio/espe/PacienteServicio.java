package proyecto.servicio.espe;

import proyecto.dao.espe.MetodosPaciente;
import proyecto.modelo.espe.Paciente;

public class PacienteServicio {

    public static Paciente BuscarCedulaPaciente(String cedula) {
        return new MetodosPaciente().BuscarCedulaPaciente(cedula);
    }

    public static boolean InsertarPaciente(Paciente paciente) {
        return new MetodosPaciente().InsertarPaciente(paciente);
    }



}
