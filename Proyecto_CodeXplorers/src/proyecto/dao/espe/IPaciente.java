/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyecto.dao.espe;

import java.util.List;
import proyecto.modelo.espe.Paciente;

/**
 *
 * @author Victoria
 */
public interface IPaciente {
    public List<Paciente>ListarPaciente();
    public Paciente BuscarCedulaPaciente(String cedula);
    public boolean InsertarPaciente(Paciente paciente);
    
}
