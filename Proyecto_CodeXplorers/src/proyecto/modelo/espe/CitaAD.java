/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo.espe;

import java.util.Date;

/**
 * @author Alisson Ayo
 */
public class CitaAD {

    /**
     * Atributos de admin
     */

    private String Nombre, Apellido, email, Naciemiento;
    /**
     * Atributos del registro
     */
    private int id_perfil;
    private String cedulaPerfil, contraseñaPerfil, rolperfil;

    /**
     * Atributos de paciente
     */
    private String cedulaP, nombreP, apellidoP, telefono, dia, horario, genero;
    private Date fechaNacimiento;
    
    /**
     * Atributos Doctor
     */
    private String nombreDoc, apellidoDoc, especialidad, iDdoctor;
    

    /**
     * Constructor para consultar citas
     *
     * @param cedulaP cedula del paciente
     * @param apellidoP apellido del paciente
     * @param telefono telefono del paciente
     * @param dia dia de la cida
     * @param horario hora de la cita
     * @param fechaNacimiento fecha de nacimiento del que se va a atende
     */
    public CitaAD(String cedulaP, String apellidoP, String telefono, String dia, String horario, Date fechaNacimiento) {    
        this.cedulaP = cedulaP;
        this.apellidoP = apellidoP;
        this.telefono = telefono;
        this.dia = dia;
        this.horario = horario;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Constructor para consultar usuarios registrados
     *
     * @param id_perfil verifica si es paciente doctor o admin
     * @param cedulaPerfil cedula del que se registra
     * @param rolperfil rol de cada id perfil
     */
    public CitaAD(int id_perfil, String cedulaPerfil, String rolperfil) {
        this.id_perfil = id_perfil;
        this.cedulaPerfil = cedulaPerfil;
        this.rolperfil = rolperfil;
    }

    /**
     * Constructor para el ingreso de mas administradores
     */
    
    public CitaAD(String Nombre, String Apellido, String email, String Naciemiento, int id_perfil, String cedulaPerfil, String rolperfil) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.email = email;
        this.Naciemiento = Naciemiento;
        this.id_perfil = id_perfil;
        this.cedulaPerfil = cedulaPerfil;
        this.rolperfil = rolperfil;
    }

    /**
     * Constructor para generar el cambio de clave
     *
     * @param cedulaPerfil cedula del usuario registrado
     * @param contraseñaPerfil contraseña con la cual se registro
     */

    public CitaAD(String cedulaPerfil, String contraseñaPerfil) {
        this.cedulaPerfil = cedulaPerfil;
        this.contraseñaPerfil = contraseñaPerfil;
    }

    /**
     * Constructor para actualizar usuario registrado
     */
    public CitaAD(int id_perfil, String contraseñaPerfil) {
        this.id_perfil = id_perfil;
        this.contraseñaPerfil = contraseñaPerfil;
    }

    public CitaAD() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNaciemiento() {
        return Naciemiento;
    }

    public void setNaciemiento(String Naciemiento) {
        this.Naciemiento = Naciemiento;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getCedulaPerfil() {
        return cedulaPerfil;
    }

    public void setCedulaPerfil(String cedulaPerfil) {
        this.cedulaPerfil = cedulaPerfil;
    }

    public String getContraseñaPerfil() {
        return contraseñaPerfil;
    }

    public void setContraseñaPerfil(String contraseñaPerfil) {
        this.contraseñaPerfil = contraseñaPerfil;
    }

    public String getRolperfil() {
        return rolperfil;
    }

    public void setRolperfil(String rolperfil) {
        this.rolperfil = rolperfil;
    }

    public String getCedulaP() {
        return cedulaP;
    }

    public void setCedulaP(String cedulaP) {
        this.cedulaP = cedulaP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    

    @Override
    public String toString() {
        return "CitaAD{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", email=" + email + ", Naciemiento=" + Naciemiento + ", id_perfil=" + id_perfil + ", cedulaPerfil=" + cedulaPerfil + ", contrase\u00f1aPerfil=" + contraseñaPerfil + ", rolperfil=" + rolperfil + ", cedulaP=" + cedulaP + ", nombreP=" + nombreP + ", apellidoP=" + apellidoP + ", telefono=" + telefono + ", dia=" + dia + ", horario=" + horario + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}
