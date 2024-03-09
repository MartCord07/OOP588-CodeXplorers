/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.dao.espe;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.conversions.Bson;
import proyecto.modelo.espe.CitaAD;
import proyecto.modelo.espe.Doctor;
import proyecto.modelo.espe.Paciente;
import proyecto.modelo.espe.Perfil;

/**
 *
 * @author Aliss
 */
public class MetodosCitaAD implements ICitaAD {

    Conexion conn = new Conexion();
    MongoDatabase database;
    private MongoCollection coleccionPaciente;
    private MongoCollection coleccionPerfil;
    private MongoCollection coleccionDoctor;
    private MongoCollection coleccionAdmin;

    public MetodosCitaAD() {
        if (conn != null) {
            this.conn = conn.crearConexion();
            this.database = conn.getDataB();
            this.coleccionPerfil = database.getCollection("perfil");
            this.coleccionPaciente = database.getCollection("usuario");
            this.coleccionAdmin = database.getCollection("admin");
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
    public List<Paciente> ListaCitas() {
        List<Paciente> listaPaciente = new ArrayList<>();
        FindIterable<Document> documentoPacientes;
        try {
            documentoPacientes = coleccionPaciente.find();

            for (Document temp : documentoPacientes) {
                Paciente persona = new Paciente();
                persona.setCedula(temp.getString("cedula"));
                persona.setNombre(temp.getString("nombre"));
                persona.setApellido(temp.getString("apellido"));
                persona.setTelefono(temp.getString("telefono"));
                persona.setDia(temp.getString("dia"));
                persona.setHorario(temp.getString("horario"));
                Date fechaNacimiento = temp.getDate("fechaNacimiento");
                SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
                persona.setFechaNacimiento(fechaNacimiento);
                listaPaciente.add(persona);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar los datos : " + ex.getMessage());
        } finally {
            cierreConexion();
        }
        return listaPaciente;
    }

    @Override
    public List<Perfil> ListaLogin() {
        List<Perfil> listaLogin = new ArrayList<>();
        FindIterable<Document> documentoPerfiles;
        try {
            documentoPerfiles = coleccionPerfil.find();

            for (Document temp : documentoPerfiles) {
                Perfil perfil = new Perfil();
                perfil.setCedulaPerfil(temp.getString("cedula_Perfil"));
                perfil.setContrasena(temp.getString("contrasena_Perfil"));
                perfil.setIdPerfil(temp.getInteger("id_Perfil"));
                perfil.setTipoPerfil(temp.getString("rol_Perfil"));
                listaLogin.add(perfil);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar los datos : " + ex.getMessage());
        } finally {
            cierreConexion();
        }
        return listaLogin;
    }

    @Override
    public boolean ActualizarCita(CitaAD cita) {
        Document filtro, update;
        UpdateResult resultado;
        boolean actualizar = false;
        try {
            filtro = new Document("cedula", cita.getCedulaP());
            update = new Document("$set", new Document()
                    .append("nombre", cita.getNombreP())
                    .append("apellido", cita.getApellidoP())
                    .append("telefono", cita.getTelefono())
                    .append("dia", cita.getDia())
                    .append("horario", cita.getHorario())
                    .append("genero", cita.getGenero())
                    .append("fechaNacimiento", cita.getFechaNacimiento()));
            resultado = coleccionPaciente.updateOne(filtro, update);
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
    public boolean EliminarCita(String idcita) {
        Bson filtro = null;
        DeleteResult result = null;
        boolean eliminar = false;

        try {
            filtro = new Document("cedula", idcita);
            result = coleccionPaciente.deleteOne(filtro);
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
    public Perfil buscarIdPerfil(String CIperfil) {
        Perfil perfil = null;
        Document filtro = null, resultado = null;
        try {
            filtro = new Document("cedula_Perfil", CIperfil);
            resultado = (Document) coleccionPerfil.find(filtro).first();

            if (resultado != null) {
                perfil = new Perfil();
                perfil.setCedulaPerfil(resultado.getString("cedula_Perfil"));
                perfil.setContrasena(resultado.getString("contrasena_Perfil"));
                perfil.setIdPerfil(resultado.getInteger("id_Perfil"));
                perfil.setTipoPerfil(resultado.getString("rol_Perfil"));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar datos segun id : " + ex.getMessage());

        } finally {
            cierreConexion();
        }
        return perfil;
    }

    @Override
    public boolean InsertarAdmin(CitaAD admin) {
        Document documento, filtro = new Document("cedula", admin.getCedulaPerfil());
        long contador = coleccionAdmin.countDocuments(filtro);
        try {
            if (contador == 0) {
                documento = new Document("cedula", admin.getCedulaPerfil())
                        .append("nombre", admin.getNombre())
                        .append("apellido", admin.getApellido())
                        .append("fecha_nacimiento", admin.getFechaNacimiento())
                        .append("email", admin.getEmail());

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
    public boolean ActualizarClave(Perfil clave) {
        Document filtro, update;
        UpdateResult resultado;
        boolean actualizar = false;

        try {
            filtro = new Document("cedula", clave.getCedulaPerfil());
            update = new Document("$set", new Document("clave", clave.getContrasena()));
            resultado = coleccionPerfil.updateOne(filtro, update);

            if (resultado.getModifiedCount() > 0) {
                actualizar = true;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar clave : " + ex.getMessage());
            actualizar = false;
        } finally {
            cierreConexion();
        }
        return actualizar;
    }

    @Override
    public Paciente BuscarIdCita(String idcita) {
        Paciente paciente = null;
        Document filtro = null, resultado = null, perfil = null;
        try {
            filtro = new Document("cedula", idcita);
            resultado = (Document) coleccionPaciente.find(filtro).first();

            if (resultado != null) {
                paciente = new Paciente();
                paciente.setCedula(resultado.getString("cedula"));
                paciente.setNombre(resultado.getString("nombre"));
                paciente.setApellido(resultado.getString("apellido"));
                paciente.setTelefono(resultado.getString("telefono"));
                paciente.setDia(resultado.getString("dia"));
                paciente.setHorario(resultado.getString("horario"));
                Date fechaNacimiento = resultado.getDate("fechaNacimiento");
                SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
                paciente.setFechaNacimiento(fechaNacimiento);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar datos segun id : " + ex.getMessage());

        } finally {
            cierreConexion();
        }
        return paciente;
    }

    @Override
    public List<Doctor> ListaDoctor() {
        List<Doctor> listaDoctor = new ArrayList<>();
        FindIterable<Document> documentoPerfiles;
        try {
            documentoPerfiles = coleccionDoctor.find();

            for (Document temp : documentoPerfiles) {
                Doctor doctor = new Doctor();
                doctor.setiDdoctor(temp.getString("idDoctor"));
                doctor.setApellidoDoc(temp.getString("apellidoDoc"));
                doctor.setNombreDoc(temp.getString("nombreDoc"));
                doctor.setEspecialidad(temp.getString("especialidad"));
                listaDoctor.add(doctor);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar los datos : " + ex.getMessage());
        } finally {
            cierreConexion();
        }
        return listaDoctor;
    }

    @Override
    public Doctor buscarIdDoctor(String idDoctor) {
        Doctor doctor = new Doctor();
        Document filtro = null, resultado = null;
        try {
            filtro = new Document("idDoctor", idDoctor);
            resultado = (Document) coleccionDoctor.find(filtro).first();

            if (resultado != null) {
                doctor.setiDdoctor(resultado.getString("idDoctor"));
                doctor.setApellidoDoc(resultado.getString("apellidoDoc"));
                doctor.setNombreDoc(resultado.getString("nombreDoc"));
                doctor.setEspecialidad(resultado.getString("especialidad"));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar datos segun id : " + ex.getMessage());

        } finally {
            cierreConexion();
        }
        return doctor;
    }

}
