package proyecto.dao.espe;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;
import proyecto.modelo.espe.Doctor;

public class MetodosDoctor {

    MongoDatabase database;
    Conexion conn = new Conexion();
    private MongoCollection coleccionUsuario;
    private MongoCollection coleccionMedicina;

    public MetodosDoctor() {
        if (conn != null) {
            this.conn = conn.crearConexion();
            this.database = conn.getDataB();
            this.coleccionUsuario = database.getCollection("usuario");
            this.coleccionMedicina=database.getCollection("medicamentos");
        }
    }

    private void cierreConexion() {
        try {
            conn.close();
        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexion" + ex.toString());
        }
    }

    public List<Doctor> ListarPacientes() {
        List<Doctor> listaPaciente = new ArrayList<>();
        FindIterable<Document> documentoPaciente;
        try {
            documentoPaciente = coleccionUsuario.find();
            for (Document temp : documentoPaciente) {
                Doctor paciente = new Doctor();
                paciente.setCedula(temp.getString("cedula"));
                paciente.setNombre(temp.getString("nombre"));
                paciente.setApellido(temp.getString("apellido"));
                paciente.setEdad(temp.getString("edad"));
                paciente.setGenero(temp.getString("genero"));

                listaPaciente.add(paciente); // Agregar paciente a la lista
            }
        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar datos" + ex.getMessage());
        } finally {
            cierreConexion();
        }
        return listaPaciente;
    }

    public Doctor BuscarCedulaPaciente(String cedula) {
        //Doctor paciente = null ;
        Doctor paciente = new Doctor(cedula);
        
        try {
            Document filtro = new Document("cedula", cedula);
            Document resultado = (Document) coleccionUsuario.find(filtro).first();
           

            if (resultado != null) {
                paciente.setNombre(resultado.getString("nombre"));
                paciente.setApellido(resultado.getString("apellido"));
                paciente.setEdad(resultado.getString("edad"));
                paciente.setGenero(resultado.getString("genero"));
                paciente.setTelefono(resultado.getString("telefono"));
            }

        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar por cedula");
        } finally {
            cierreConexion();
        }
        return paciente;
    }
    
    public Doctor BuscarNombreMedicina(String nombreMed){
        Doctor medicina = null;
        Document filtro = null, resultado = null;
        try{
            filtro = new Document("nombreMed", nombreMed);
            resultado = (Document)coleccionMedicina.find(filtro).first();
            
            if(resultado !=null){
                medicina = new Doctor();
                medicina.setNombreMed(resultado.getString("nombreMed"));
                medicina.setDescripcionMed(resultado.getString("descrpicionMed"));
                medicina.setDisponibleMed(resultado.getString("disponibleMed"));
                medicina.setTipoMed(resultado.getString("tipoMed"));
            }
        }catch (MongoException ex){
            JOptionPane.showMessageDialog(null, "Error al consultar medicamento");
        }finally{
            cierreConexion();
        }
        return medicina;
    }

}
