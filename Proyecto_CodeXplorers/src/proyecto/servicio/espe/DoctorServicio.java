/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.servicio.espe;

import java.util.List;
import proyecto.dao.espe.MetodosDoctor;
import proyecto.modelo.espe.Doctor;



public class DoctorServicio {
    public static List<Doctor>ListarPaciente(){
        return new MetodosDoctor().ListarPacientes();
    }
    public static Doctor BuscarCedulaPaciente(String cedula){
        return new MetodosDoctor().BuscarCedulaPaciente(cedula);
    }
    public static Doctor BuscarNombreMedicina(String nombreMed){
        return new MetodosDoctor().BuscarNombreMedicina(nombreMed);
    }
     public static Doctor obtenerPacientePorCedula(String cedula) {
        return new MetodosDoctor().BuscarCedulaPaciente(cedula);
    }

    
}
