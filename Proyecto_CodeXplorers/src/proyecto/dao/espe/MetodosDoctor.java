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
import proyecto.gui.espe.Usuario;
import proyecto.modelo.espe.Doctor;

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
            this.database=conn.getDataB();
            this.coleccionUsuario = database.getCollection("usuario");
        }
    }
    private void cierreConexion(){
        try{
            conn.getMongo().close();
        }catch(MongoException ex){
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexion"+ex.toString());
        }
    }
    public List <Usuario> ListarUsuario(){
        List<Usuario> listaUsuario = new ArrayList<>();
        FindIterable<Document>documentoUsuarios;
        /*try{
            documentoUsuarios=coleccionUsuario.find();
            for(Document temp : documentoUsuarios){
                Usuario usuario = new Usuario();
                
                usuario.set
            }
        }
    
}


}
*/
