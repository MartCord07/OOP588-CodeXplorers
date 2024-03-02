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
 * @author Usuario
 */
public class MetodosDoctor {

    MongoDatabase database;
    Conexion conn = new Conexion();
    private MongoCollection coleccionUsuario;

    public MetodosDoctor() {
        if (conn != null) {
            this.conn = conn.crearConexion();
            this.database = conn.getDataB();
            this.coleccionUsuario = database.getCollection("usuario");
        }
    }

    private void cierreConexion() {
        try {
            conn.getMongo().close();
        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexion" + ex.toString());
        }
    }

    public List<Paciente> ListarPaciente() {
        List<Paciente> listaPaciente = new ArrayList<>();
        FindIterable<Document> documentoPaciente;
        try {
            documentoPaciente = coleccionUsuario.find();
            for (Document temp : documentoPaciente) {
                Paciente paciente = new Paciente();
                paciente.setCedula(temp.getString("cedula"));
                paciente.setNombre(temp.getString("nombre"));
                paciente.setApellido(temp.getString("apellido"));
                paciente.setEdad(temp.getString("edad"));
                paciente.setGenero(temp.getString("genero"));
                paciente.setTelefono(temp.getString("telefono"));
            }
        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar datos" + ex.getMessage());
        } finally {
            cierreConexion();
        }
        return listaPaciente;
    }

    public Paciente BuscarCedulaPaciente(String cedula) {
        Paciente paciente = null;
        Document filtro = null, resultado = null;
        try {
            filtro = new Document("cedula", cedula);
            resultado = (Document) coleccionUsuario.find(filtro).first();

            if (resultado != null) {
                paciente.setNombre(resultado.getString("nombre"));
                paciente.setApellido(resultado.getString("apellido"));
                paciente.setEdad(resultado.getString("edad"));
                paciente.setGenero(resultado.getString("genero"));
                paciente.setTelefono(resultado.getString("telefono"));
            }
        }catch(MongoException ex){
            JOptionPane.showMessageDialog(null, "Error al consultar por cedula");
        }finally{
            cierreConexion();
        }
        return paciente;
    }

}
