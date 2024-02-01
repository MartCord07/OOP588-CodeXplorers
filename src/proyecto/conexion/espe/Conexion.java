/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.conexion.espe;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
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

    public Conexion(MongoClient mongoClient, MongoDatabase database) {
        this.mongo = mongoClient;
        this.dataB = database;
    }

    public Conexion() {
    }

    public Conexion crearConexion() {
        String connectionString = "mongodb+srv://maycol08:Maycol2004@codexplorers.yuuaio0.mongodb.net/test";
        
        try {
            mongo = (MongoClient) MongoClients.create(MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .build());
            
            dataB = mongo.getDatabase("BD-PROYECTO");

        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexión a MongoDB. Error: " + ex.toString());
        }
        return new Conexion(mongo, dataB);
    }
}
