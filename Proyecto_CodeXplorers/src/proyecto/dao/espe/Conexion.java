package proyecto.dao.espe;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import javax.swing.JOptionPane;

public class Conexion {

    private MongoClient mongo;
    private MongoDatabase dataB;

    //getters y constructor vacio
    public MongoClient getMongo() {
        return mongo;
    }

    public MongoDatabase getDataB() {
        return dataB;
    }

    public Conexion(MongoDatabase database) {
        this.dataB = database;
    }

    public Conexion() {
    }

    public Conexion crearConexion() {
        String uriConexion = "mongodb+srv://maycol:CodeXplorers@codexplorers.yuuaio0.mongodb.net/test?retryWrites=true&w=majority&connectTimeoutMS=30000&socketTimeoutMS=30000";
        try {
            dataB = MongoClients.create(uriConexion).getDatabase("BD-PROYECTO");
        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexión a MongoDB. Error: " + ex.toString());
        }
        return new Conexion(dataB);
    }

    public void close() {
        if (mongo != null) {
            try {
                mongo.close();
                JOptionPane.showMessageDialog(null, "Conexión cerrada exitosamente.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión a MongoDB. Error: " + ex.toString());
            }
        }
    }
}
