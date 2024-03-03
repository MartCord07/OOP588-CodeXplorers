package proyecto.dao.espe;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.security.MessageDigest;
import javax.swing.JOptionPane;
import org.bson.Document;
import proyecto.vista.doctor.espe.AtencionMedica;
import proyecto.modelo.espe.Perfil;
import proyecto.vista.admin.espe.inicioAdmin;
import proyecto.vista.paciente.espe.PacienteVentana;

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
            conn.close();
        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + ex.toString());
        }
    }

    @Override
    public boolean RegistrarPerfil(Perfil Usuario) {
        boolean validar = false;
        try {
            String contrasenaEncriptada = EncriptarContraseña(Usuario.getContrasena());

            Document documento = new Document("usuario", Usuario.getNombrePerfil())
                    .append("contrasena", contrasenaEncriptada)
                    .append("id_perfil", 1);
            collection.insertOne(documento);

            validar = true;
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
            String contrasenaIngresadaEncriptada = EncriptarContraseña(Usuario.getContrasena());

            Document query = new Document("usuario", Usuario.getNombrePerfil())
                    .append("contrasena", contrasenaIngresadaEncriptada);

            try (MongoCursor<Document> cursor = collection.find(query).iterator()) {
                if (cursor.hasNext()) {
                    Document usuarioAutenticado = cursor.next();
                    int tipoPerfil = usuarioAutenticado.getInteger("id_perfil");

                    switch (tipoPerfil) {
                        case 1:
                          PacienteVentana usuarioFrame = new PacienteVentana();
                            usuarioFrame.setVisible(true);
                            usuarioFrame.setLocationRelativeTo(null);
                            break;
                        case 2:
                            inicioAdmin inicioAdminFrame = new inicioAdmin();
                            inicioAdminFrame.setVisible(true);
                            inicioAdminFrame.setLocationRelativeTo(null);
                            break;
                        case 3:
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

    @Override
    public String EncriptarContraseña(String contraseña) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(contraseña.getBytes());
            byte[] digest = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
            return sb.toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
