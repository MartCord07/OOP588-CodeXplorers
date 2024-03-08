/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.servicio.espe;

import java.util.List;
import proyecto.dao.espe.MetodosCitaAD;
import proyecto.modelo.espe.CitaAD;


/**
 *
 * @author Aliss
 */
public class CitaServicioAD {
     public static List<CitaAD> ListaCitas() {
        return new MetodosCitaAD().ListaCitas();
    }

    public static boolean ActualizarCita(CitaAD cita) {
        return new MetodosCitaAD().ActualizarCita(cita);
    }

    public static boolean EliminarCita(int  idcita) {
        return new MetodosCitaAD().EliminarCita(idcita);

    }
    public CitaAD BuscarIdCita(int idcita){
        return new MetodosCitaAD().BuscarIdCita(idcita);
    
    }
}
