/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.servicio.espe;

import java.util.List;
import proyecto.dao.espe.MetodosCitaAD;
import proyecto.modelo.espe.CitaAD;
import proyecto.modelo.espe.Doctor;
import proyecto.modelo.espe.Paciente;
import proyecto.modelo.espe.Perfil;

/**
 *
 * @author Aliss
 */
public class CitaServicioAD {
    public List<Paciente> ListaCitas(){
        return new MetodosCitaAD().ListaCitas();
    }
    public List<Perfil> ListaLogin(){
        return new MetodosCitaAD().ListaLogin();
    }
    public boolean ActualizarCita(CitaAD cita){
        return new MetodosCitaAD().ActualizarCita(cita);
    }
    public boolean EliminarCita(String  idcita){
        return new MetodosCitaAD().EliminarCita(idcita);
    }
    public Paciente BuscarIdCita(String idcita){
        return new MetodosCitaAD().BuscarIdCita(idcita);
    }
    public Perfil buscarIdPerfil(String CIperfil){
        return new MetodosCitaAD().buscarIdPerfil(CIperfil);
    }
    public boolean InsertarAdmin (CitaAD admin){
        return new MetodosCitaAD().InsertarAdmin(admin);
    }
    public boolean ActualizarClave(Perfil clave){
        return new MetodosCitaAD().ActualizarClave(clave);
    }
    public List<Doctor> ListaDoctor(){
        return new MetodosCitaAD().ListaDoctor();
    }
    public Doctor buscarIdDoctor(String idDoctor){
        return new MetodosCitaAD().buscarIdDoctor(idDoctor);
    }
    public boolean ActualizarUsuario(CitaAD usuario){
        return new MetodosCitaAD().ActualizarUsuario(usuario);
    }


}
