/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.servicio.espe;

import java.util.List;
import proyecto.dao.espe.MetodosCitaAD;
import proyecto.dao.espe.MetodosLogin;
import proyecto.dao.espe.MetodosPaciente;
import proyecto.modelo.espe.CitaAD;
import proyecto.modelo.espe.Paciente;
import proyecto.modelo.espe.Perfil;


/**
 *
 * @author Aliss
 */
public class CitaServicioAD {
    public Paciente BuscarCedulaPersona(String cedula){
        return new MetodosCitaAD().BuscarCedulaPersona(cedula);
    }
    public Perfil BuscarCedulaPerfil(String cedulaPerfil){
        return new MetodosCitaAD().BuscarCedulaPerfil(cedulaPerfil);
    }
    public boolean InsertarAdmin(CitaAD persona){
        return new MetodosCitaAD().InsertarAdmin(persona);
    }
    public boolean ActualizarCita(CitaAD cita){
        return new MetodosCitaAD().ActualizarCita(cita);
    }
    public boolean ActualizarPersona(Perfil perfil){
        return new MetodosCitaAD().ActualizarPersona(perfil);
    }
    public boolean EliminarCita(String cedula){
        return new MetodosCitaAD().EliminarCita(cedula);
    }
    //public CitaAD BuscarIdCita(int idcita);
    public String EncriptarContraseña(String contraseña){
        return new MetodosCitaAD().EncriptarContraseña(contraseña);
    }
}
