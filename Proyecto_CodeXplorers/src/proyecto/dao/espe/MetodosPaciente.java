/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.dao.espe;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;
import proyecto.modelo.espe.Paciente;

/**
 *
 * @author Victoria
 */
public class MetodosPaciente implements IPaciente {
    Conexion conn = new Conexion();
    MongoDatabase database;
    private MongoCollection coleccionUsuario;
    

    public MetodosPaciente() {
        if (conn != null) {
            this.conn = conn.crearConexion();
            this.database=conn.getDataB();
            this.coleccionUsuario = database.getCollection("usuario");
        }
    }
    private void cierreConexion() {
        try {
            conn.getMongo().close();
        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión " + ex.toString());
        }
    }
  
    @Override
    public Paciente BuscarCedulaPaciente(String cedula) {
        Paciente paciente = null;
        Document filtro = null, resultado = null;
        try {
            filtro = new Document("cedula", cedula);
            resultado = (Document) coleccionUsuario.find(filtro).first();

            if (resultado != null) {
                paciente.setNombre(resultado.getString("nombre"));
                paciente.setApellido(resultado.getString("apellido"));
                paciente.setFechaNacimiento(resultado.getDate("fechaNacimiento"));
                paciente.setEdad(resultado.getString("edad"));
                paciente.setGenero(resultado.getString("genero"));
                paciente.setTelefono(resultado.getString("telefono"));
                paciente.setDia(resultado.getString("dia"));
                paciente.setHorario(resultado.getString("horario"));
            }
        }catch(MongoException ex){
            JOptionPane.showMessageDialog(null, "Error al consultar por cedula");
        }finally{
            cierreConexion();
        }
        return paciente;
    
    }

    @Override
    public boolean InsertarPaciente(Paciente paciente) {
        Document documento;
       try{
           documento=new Document ("cedula",paciente.getCedula())
                   .append("nombre", paciente.getNombre())
                    .append("apellido", paciente.getApellido())
                    .append("fecha_nacimiento", paciente.getFechaNacimiento())
                    .append("edad", paciente.getEdad())
                    .append("genero", paciente.getGenero())
                    .append("telefono", paciente.getTelefono())
                    .append("dia", paciente.getDia())
                    .append("horaria", paciente.getHorario());
           
            coleccionUsuario.insertOne(documento);
            
       }catch(MongoException ex){
           JOptionPane.showMessageDialog(null, "Error al insertar datos "+ex.toString());
           return false;
       }finally{
           cierreConexion();
       }
       return true;
    }
    
}
