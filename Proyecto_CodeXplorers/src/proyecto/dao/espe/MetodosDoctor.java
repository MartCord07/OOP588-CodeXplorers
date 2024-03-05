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
    private MongoCollection coleccionDoctor;
    private MongoCollection coleccionHistorial;

    public MetodosDoctor() {
        if (conn != null) {
            this.conn = conn.crearConexion();
            this.database = conn.getDataB();
            this.coleccionUsuario = database.getCollection("usuario");
            this.coleccionMedicina = database.getCollection("medicamentos");
            this.coleccionDoctor = database.getCollection("doctor");
            this.coleccionHistorial = database.getCollection("historial");
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

    public List<Doctor> ListarDoctores() {
        List<Doctor> listaDoctores = new ArrayList<>();
        FindIterable<Document> documentoDoctores;
        try {
            documentoDoctores = coleccionDoctor.find();
            for (Document temp : documentoDoctores) {

                Doctor doctor = new Doctor();
                doctor.setNombreDoc(temp.getString("nombreDoc"));
                doctor.setApellidoDoc(temp.getString("apellidoDoc"));
                doctor.setEspecialidad(temp.getString("especialidad"));
                doctor.setiDdoctor(temp.getString("idDoctor"));
                listaDoctores.add(doctor); // Agregar paciente a la lista
            }
        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar datos" + ex.getMessage());
        } finally {
            cierreConexion();
        }
        return listaDoctores;
    }

    public List<Doctor> ListarHistoriales() {
        List<Doctor> listaHistoriales = new ArrayList<>();
        FindIterable<Document> documentoHistoriales;
        try {
            documentoHistoriales = coleccionHistorial.find();
            for (Document temp : documentoHistoriales) {

                Doctor doctor = new Doctor();
                doctor.setCedula(temp.getString("cedulaPac"));
                doctor.setNombre(temp.getString("nombrePac"));
                doctor.setApellido(temp.getString("apellidoPac"));
                doctor.setEdad(temp.getString("edadPac"));
                doctor.setGenero(temp.getString("generoPac"));
                doctor.setNombreDoc(temp.getString("nombreDoctor"));
                doctor.setApellidoDoc(temp.getString("apellidoDoctor"));
                doctor.setEspecialidad(temp.getString("especialidadDoc"));
                doctor.setiDdoctor(temp.getString("idDoc"));
                doctor.setDiagnostico(temp.getString("diagnosticoDoc"));
                listaHistoriales.add(doctor); // Agregar paciente a la lista
            }
        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar datos" + ex.getMessage());
        } finally {
            cierreConexion();
        }
        return listaHistoriales;
    }

    public Doctor BuscarCedulaPaciente(String cedula) {

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
    public Doctor BuscarHistorial(String cedula) {

        Doctor historial = new Doctor(cedula);

        try {
            Document filtro = new Document("cedula", cedula);
            Document resultado = (Document) coleccionHistorial.find(filtro).first();

            if (resultado != null) {
                historial.setCedula(resultado.getString("cedulaPac"));
                historial.setNombre(resultado.getString("nombrePac"));
                historial.setApellido(resultado.getString("apellidoPac"));
                historial.setEdad(resultado.getString("edadPac"));
                historial.setGenero(resultado.getString("generoPac"));
                historial.setNombreDoc(resultado.getString("nombreDoctor"));
                historial.setApellidoDoc(resultado.getString("apellidoDoctor"));
                historial.setEspecialidad(resultado.getString("especialidadDoc"));
                historial.setiDdoctor(resultado.getString("idDoc"));
                historial.setDiagnostico(resultado.getString("diagnosticoDoc"));
                
            }

        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar por cedula");
        } finally {
            cierreConexion();
        }
        return historial;
    }

    public Doctor BuscarNombreMedicina(String nombreMed) {
        Doctor medicina = null;
        Document filtro = null, resultado = null;
        try {
            filtro = new Document("nombreMed", nombreMed);
            resultado = (Document) coleccionMedicina.find(filtro).first();

            if (resultado != null) {
                medicina = new Doctor();
                medicina.setNombreMed(resultado.getString("nombreMed"));
                medicina.setDescripcionMed(resultado.getString("descrpicionMed"));
                medicina.setDisponibleMed(resultado.getString("disponibleMed"));
                medicina.setTipoMed(resultado.getString("tipoMed"));
            }
        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar medicamento");
        } finally {
            cierreConexion();
        }
        return medicina;
    }

    public List<Doctor> BuscarDoctor(String especialidad) {
        List<Doctor> listaDoctores1 = new ArrayList<>();

        Document filtro = null, resultado = null;
        try {
            filtro = new Document("especialidad", especialidad);

            FindIterable<Document> documents = coleccionDoctor.find(filtro);

            if (documents != null) {
                for (Document documento : documents) {
                    Doctor doctor1 = new Doctor();
                    doctor1.setNombreDoc(documento.getString("nombreDoc"));
                    doctor1.setApellidoDoc(documento.getString("apellidoDoc"));
                    doctor1.setEspecialidad(documento.getString("especialidad"));
                    doctor1.setiDdoctor(documento.getString("idDoctor"));
                    listaDoctores1.add(doctor1);
                }
            }
        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar doctor");
        } finally {
            cierreConexion();
        }
        return listaDoctores1;
    }

    public boolean GenerarHistorial(Doctor historial) {
        Document documento;
        try {
            documento = new Document("cedulaPac", historial.getCedula())
                    .append("nombrePac", historial.getNombre())
                    .append("apellidoPac", historial.getApellido())
                    .append("edadPac", historial.getEdad())
                    .append("generoPac", historial.getGenero())
                    .append("nombreDoctor", historial.getNombreDoc())
                    .append("apellidoDoctor", historial.getApellidoDoc())
                    .append("especialidadDoc", historial.getEspecialidad())
                    .append("idDoc", historial.getiDdoctor())
                    .append("diagnosticoDoc", historial.getDiagnostico());
            coleccionHistorial.insertOne(documento);

        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar historial" + ex.toString());
            return false;
        } finally {
            cierreConexion();
        }
        return true;
    }

}
