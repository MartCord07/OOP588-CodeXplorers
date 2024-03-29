package proyecto.modelo.espe;

import java.util.Date;

public class Doctor {

    private String cedula, nombre, apellido, genero, edad;
    private String nombreMed, descrpicionMed, disponibleMed, tipoMed;
    private String nombreDoc, apellidoDoc, especialidad, iDdoctor, diagnostico,pastillaDoc,cantidadMed;

    private Date fechaNacimiento;

    public Doctor(String cedula, String nombre, String apellido, String genero, String edad, String nombreMed, String descrpicionMed, String disponibleMed, String tipoMed, String nombreDoc, String apellidoDoc, String especialidad, String iDdoctor, String diagnostico, String pastillaDoc, String cantidadMed, Date fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
        this.nombreMed = nombreMed;
        this.descrpicionMed = descrpicionMed;
        this.disponibleMed = disponibleMed;
        this.tipoMed = tipoMed;
        this.nombreDoc = nombreDoc;
        this.apellidoDoc = apellidoDoc;
        this.especialidad = especialidad;
        this.iDdoctor = iDdoctor;
        this.diagnostico = diagnostico;
        this.pastillaDoc = pastillaDoc;
        this.cantidadMed = cantidadMed;
        this.fechaNacimiento = fechaNacimiento;
    }

  

    public Doctor(String cedula, String nombre, String apellido, String genero, String edad, String nombreDoc, String apellidoDoc, String especialidad, String iDdoctor, String diagnostico, String pastillaDoc, String cantidadMed) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
        this.nombreDoc = nombreDoc;
        this.apellidoDoc = apellidoDoc;
        this.especialidad = especialidad;
        this.iDdoctor = iDdoctor;
        this.diagnostico = diagnostico;
        this.pastillaDoc = pastillaDoc;
        this.cantidadMed = cantidadMed;
    }

    public String getPastillaDoc() {
        return pastillaDoc;
    }

    public void setPastillaDoc(String pastillaDoc) {
        this.pastillaDoc = pastillaDoc;
    }

    public String getCantidadMed() {
        return cantidadMed;
    }

    public void setCantidadMed(String cantidadMed) {
        this.cantidadMed = cantidadMed;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getNombreDoc() {
        return nombreDoc;
    }

    public void setNombreDoc(String nombreDoc) {
        this.nombreDoc = nombreDoc;
    }

    public String getApellidoDoc() {
        return apellidoDoc;
    }

    public void setApellidoDoc(String apellidoDoc) {
        this.apellidoDoc = apellidoDoc;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getiDdoctor() {
        return iDdoctor;
    }

    public void setiDdoctor(String iDdoctor) {
        this.iDdoctor = iDdoctor;
    }

    public Doctor(String cedula) {
        this.cedula = cedula;
    }

    public Doctor() {

    }

    public String getNombreMed() {
        return nombreMed;
    }

    public void setNombreMed(String nombreMed) {
        this.nombreMed = nombreMed;
    }

    public String getDescripcionMed() {
        return descrpicionMed;
    }

    public void setDescripcionMed(String descripcionMed) {
        this.descrpicionMed = descripcionMed;
    }

    public String getDisponibleMed() {
        return disponibleMed;
    }

    public void setDisponibleMed(String disponibleMed) {
        this.disponibleMed = disponibleMed;
    }

    public String getTipoMed() {
        return tipoMed;
    }

    public void setTipoMed(String tipoMed) {
        this.tipoMed = tipoMed;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Doctor{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", edad=" + edad + ", nombreMed=" + nombreMed + ", descrpicionMed=" + descrpicionMed + ", disponibleMed=" + disponibleMed + ", tipoMed=" + tipoMed + ", nombreDoc=" + nombreDoc + ", apellidoDoc=" + apellidoDoc + ", especialidad=" + especialidad + ", iDdoctor=" + iDdoctor + ", diagnostico=" + diagnostico + ", pastillaDoc=" + pastillaDoc + ", cantidadMed=" + cantidadMed + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    
}
