/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.servicio.espe;

import java.util.List;
import proyecto.dao.espe.MetodosDoctor;
import proyecto.modelo.espe.Paciente;


public class DoctorServicio {
    public static List<Paciente>ListarPaciente(){
        return new MetodosDoctor().ListarPaciente();
    }
    public static Paciente BuscarCedulaPaciente(String cedula){
        return new MetodosDoctor().BuscarCedulaPaciente(cedula);
    }
    
}
