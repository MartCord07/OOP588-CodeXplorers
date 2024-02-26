/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.servicio.espe;

import java.util.List;
import proyecto.dao.espe.MetodosCita;
import proyecto.vista.espe.CitaVista;

/**
 *
 * @author Aliss
 */
public class CitaServicio {
     public static List<CitaVista> ListaPerfil() {
        return new MetodosCita().ListaPerfil();
    }

    public static boolean ActualizarPerfil(CitaVista cita) {
        return new MetodosCita().ActualizarCita(cita);
    }

    public static boolean EliminarPerfil(int idcita) {
        return new MetodosCita().EliminarCita(idcita);

    }
    public CitaVista BuscarIdPerfil(int idcita){
        return new MetodosCita().BuscarIdCita(idcita);
    
    }
}
