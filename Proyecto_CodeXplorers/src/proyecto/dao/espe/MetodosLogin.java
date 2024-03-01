package proyecto.dao.espe;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.Random;
import javax.swing.JOptionPane;
import org.bson.Document;
import proyecto.gui.espe.AtencionMedica;
import proyecto.gui.espe.Usuario;
import proyecto.modelo.espe.Perfil;
import proyecto.vista.espe.inicioAdmin;

public class MetodosLogin implements IPerfil {

    Conexion conn = new Conexion();
    MongoDatabase database;
    private MongoCollection<Document> collection;

    public MetodosLogin() {
        if (conn != null) {
            this.conn = conn.crearConexion();
            this.database = conn.getDataB();
            this.collection = database.getCollection("perfil");
        }
    }

    private void cierreConexion() {
        try {
            conn.getMongo().close();
        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + ex.toString());
        }
    }

    @Override
    public boolean RegistrarPerfil(Perfil Usuario) {
        boolean validar = false;
        try{
        Random rand = new Random();
        int randomId = rand.nextInt(1000000); 
    
        Document filtro = new Document("id_perfil", randomId);
        long contador = collection.countDocuments(filtro);

        if (contador == 0) {
            Document documento = new Document("usuario", Usuario.getNombrePerfil())
                    .append("contrasena", Usuario.getContrasena())
                    .append("tipo_perfil", "Paciente")
                    .append("id_perfil", randomId);
            collection.insertOne(documento);
            validar = true;
        } else {
            return RegistrarPerfil(Usuario);
        }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar paciente:" + ex.toString());
            validar = false;
        } finally {
            cierreConexion();
        }
        return validar;
    }

    @Override
    public boolean AutenticarPerfil(Perfil Usuario) {
    boolean validar = false;
    try {
        Document query = new Document("usuario", Usuario.getNombrePerfil())
                        .append("contrasena", Usuario.getContrasena());

        try (MongoCursor<Document> cursor = collection.find(query).iterator()) {
            if (cursor.hasNext()) {
                Document usuarioAutenticado = cursor.next();
                String tipoPerfil = usuarioAutenticado.getString("tipo_perfil");
                
                switch (tipoPerfil) {
                    case "Paciente":
                        Usuario usuarioFrame = new Usuario();
                        usuarioFrame.setVisible(true);
                        usuarioFrame.setLocationRelativeTo(null);
                        break;
                    case "Admin":
                        inicioAdmin inicioAdminFrame = new inicioAdmin();
                        inicioAdminFrame.setVisible(true);
                        inicioAdminFrame.setLocationRelativeTo(null);
                        break;
                    case "Doctor":
                        AtencionMedica atencionMedicaFrame = new AtencionMedica();
                        atencionMedicaFrame.setVisible(true);
                        atencionMedicaFrame.setLocationRelativeTo(null);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Usuario no Existente");
                        break;
                }
                validar = true; 
            }
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error al autenticar paciente:" + ex.toString());
        validar = false;
    } finally {
        cierreConexion();
    }
    return validar;
    }

}
