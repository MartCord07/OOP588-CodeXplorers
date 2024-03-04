/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.dao.espe;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.conversions.Bson;
import proyecto.modelo.espe.CitaAD;
import proyecto.modelo.espe.Paciente;
import proyecto.modelo.espe.Perfil;

/**
 *
 * @author Aliss
 */
public class MetodosCitaAD implements ICitaAD {

    Conexion conn = new Conexion();
    MongoDatabase database;
    private MongoCollection coleccionAdmin;
    private MongoCollection coleccionPerfil;
    private MongoCollection coleccionUsuario;
    private MongoCollection coleccionDoctor;

    public MetodosCitaAD() {
        if (conn != null) {
            this.conn = conn.crearConexion();
            this.database = conn.getDataB();
            this.coleccionPerfil = database.getCollection("perfil");
            this.coleccionAdmin = database.getCollection("admin");
            this.coleccionUsuario = database.getCollection("usuario");
            this.coleccionDoctor = database.getCollection("doctor");
        }
    }

    private void cierreConexion() {
        try {
            conn.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexion:" + ex.toString());
        }
    }

    @Override
    public boolean InsertarAdmin(CitaAD persona) {
        Document documento, filtro = new Document("cedula", persona.getCedula_Perfil());
        long contador = coleccionAdmin.countDocuments(filtro);
        try {
            if (contador == 0) {
                documento = new Document("cedula", persona.getCedula_Perfil())
                        .append("nombre", persona.getNombre())
                        .append("apellido", persona.getApellido())
                        .append("idPerfil", persona.getId_perfil());
                coleccionAdmin.insertOne(documento);

            } else {
                return false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar registro : " + ex.getMessage());

        } finally {
            cierreConexion();
        }

        return true;

    }

    @Override
    public boolean ActualizarCita(CitaAD cita) {
        Document filtro, update;
        UpdateResult resultado;
        boolean actualizar = false;
        try {
            filtro = new Document("cedula", cita.getCedulaP());
            update = new Document("$set", new Document()
                    .append("telefono", cita.getTelefonoP())
                    .append("dia", cita.getDiaP())
                    .append("horario", cita.getHorarioP())
                    .append("idDoctor", cita.getIdDoctor()));

            resultado = coleccionUsuario.updateOne(filtro, update);

            if (resultado.getModifiedCount() > 0) {
                actualizar = true;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar datos : " + ex.getMessage());

        } finally {
            cierreConexion();
        }

        return actualizar;
    }

    @Override
    public boolean ActualizarPersona(Perfil perfil) {
        Document filtro, update;
        UpdateResult resultado;
        boolean actualizar = false;
        try {
            filtro = new Document("cedula", perfil.getCedulaPerfil());
            update = new Document("$set", new Document()
                    .append("rol_Perfil", perfil.getTipoPerfil())
                    .append("id_Perfil", perfil.getIdPerfil()));
            resultado = coleccionPerfil.updateOne(filtro, update);

            if (resultado.getModifiedCount() > 0) {
                actualizar = true;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar datos : " + ex.getMessage());

        } finally {
            cierreConexion();
        }

        return actualizar;
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

    @Override
    public boolean EliminarCita(String cedula) {
        Bson filtro = null;
        DeleteResult result = null;
        boolean eliminar = false;

        try {
            filtro = new Document("cedula", cedula);
            result = coleccionUsuario.deleteOne(filtro);
            if (result.getDeletedCount() > 0) {
                eliminar = true;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el registro para eliminar");
                eliminar = false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar persona : " + ex.getMessage());

        }
        return eliminar;
    }

    @Override
    public Paciente BuscarCedulaPersona(String cedula) {
        Paciente usuario = null;
        Document filtro = null, resultado = null, perfil = null;
        try {
            filtro = new Document("cedula", cedula);
            resultado = (Document) coleccionUsuario.find(filtro).first();

            if (resultado != null) {
                usuario = new Paciente();
                usuario.setCedula(resultado.getString("cedula"));
                usuario.setNombre(resultado.getString("nombre"));
                usuario.setApellido(resultado.getString("apellido"));
                Date fechaNac = resultado.getDate("fechaNacimiento");
                SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
                usuario.setFechaNacimiento(fechaNac);
                usuario.setGenero(resultado.getString("genero"));
                usuario.setTelefono(resultado.getString("telefono"));
                usuario.setDia(resultado.getString("dia"));
                usuario.setHorario(resultado.getString("horario"));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar datos segun id : " + ex.getMessage());

        } finally {
            cierreConexion();
        }
        return usuario;
    }

    @Override
    public Perfil BuscarCedulaPerfil(String cedulaPerfil) {
        Perfil registro = null;
        Document filtro = null, resultado = null, perfil = null;
        try {
            filtro = new Document("cedula", cedulaPerfil);
            resultado = (Document) coleccionPerfil.find(filtro).first();

            if (resultado != null) {
                registro = new Perfil();
                registro.setCedulaPerfil(resultado.getString("cedula_Perfil"));
                registro.setIdPerfil(resultado.getInteger("id_Perfil"));
                registro.setTipoPerfil(resultado.getString("rol_Perfil"));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar datos segun id : " + ex.getMessage());

        } finally {
            cierreConexion();
        }
        return registro;
    }

}
