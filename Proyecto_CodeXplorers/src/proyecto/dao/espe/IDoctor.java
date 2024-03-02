/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
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
    public boolean InsertarHistorial(Doctor paciente);
    
    
    
}
