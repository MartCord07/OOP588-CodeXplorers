/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo.espe;

import java.util.Date;

public class CitaAD {

    private String nombre, apellido;
    // datos paciente
    private String cedulaP, apellidoP, generoP, telefonoP, diaP, horarioP;
    private Date fechaNacimiento;

    //datos doctor 
    private String idDoctor;
    private String NombreD, apellidoD, Especialidad;
    //datos perfil 
    private int id_perfil;
    private String cedula_Perfil;
    private String rol_Perfil;
    private String contraseña_Perfil;
    

    public CitaAD() {
    }
    
    //Actualizar Cita

    public CitaAD(String telefonoP, String diaP, String horarioP, String idDoctor) {
        this.telefonoP = telefonoP;
        this.diaP = diaP;
        this.horarioP = horarioP;
        this.idDoctor = idDoctor;
    }
    
    // Actualizar perfiles

    public CitaAD(int id_perfil, String cedula_Perfil, String rol_Perfil) {
        this.id_perfil = id_perfil;
        this.cedula_Perfil = cedula_Perfil;
        this.rol_Perfil = rol_Perfil;
    }

    
    //Insertar Admins 

    public CitaAD(String nombre, String apellido, int id_perfil, String cedula_Perfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_perfil = id_perfil;
        this.cedula_Perfil = cedula_Perfil;
    }

    
    //clave
    public CitaAD(String cedula_Perfil, String contraseña_Perfil) {
        this.cedula_Perfil = cedula_Perfil;
        this.contraseña_Perfil = contraseña_Perfil;
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

    public String getCedulaP() {
        return cedulaP;
    }

    public void setCedulaP(String cedulaP) {
        this.cedulaP = cedulaP;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getGeneroP() {
        return generoP;
    }

    public void setGeneroP(String generoP) {
        this.generoP = generoP;
    }

    public String getTelefonoP() {
        return telefonoP;
    }

    public void setTelefonoP(String telefonoP) {
        this.telefonoP = telefonoP;
    }

    public String getDiaP() {
        return diaP;
    }

    public void setDiaP(String diaP) {
        this.diaP = diaP;
    }

    public String getHorarioP() {
        return horarioP;
    }

    public void setHorarioP(String horarioP) {
        this.horarioP = horarioP;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(String idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getNombreD() {
        return NombreD;
    }

    public void setNombreD(String NombreD) {
        this.NombreD = NombreD;
    }

    public String getApellidoD() {
        return apellidoD;
    }

    public void setApellidoD(String apellidoD) {
        this.apellidoD = apellidoD;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getCedula_Perfil() {
        return cedula_Perfil;
    }

    public void setCedula_Perfil(String cedula_Perfil) {
        this.cedula_Perfil = cedula_Perfil;
    }

    public String getRol_Perfil() {
        return rol_Perfil;
    }

    public void setRol_Perfil(String rol_Perfil) {
        this.rol_Perfil = rol_Perfil;
    }

    public String getContraseña_Perfil() {
        return contraseña_Perfil;
    }

    public void setContraseña_Perfil(String contraseña_Perfil) {
        this.contraseña_Perfil = contraseña_Perfil;
    }

    @Override
    public String toString() {
        return "CitaAD{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedulaP=" + cedulaP + ", apellidoP=" + apellidoP + ", generoP=" + generoP + ", telefonoP=" + telefonoP + ", diaP=" + diaP + ", horarioP=" + horarioP + ", fechaNacimiento=" + fechaNacimiento + ", idDoctor=" + idDoctor + ", NombreD=" + NombreD + ", apellidoD=" + apellidoD + ", Especialidad=" + Especialidad + ", id_perfil=" + id_perfil + ", cedula_Perfil=" + cedula_Perfil + ", rol_Perfil=" + rol_Perfil + ", contrase\u00f1a_Perfil=" + contraseña_Perfil + '}';
    }

    
    
}
