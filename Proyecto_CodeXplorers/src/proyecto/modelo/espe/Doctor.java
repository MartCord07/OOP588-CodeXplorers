/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.modelo.espe;

/**
 *
 * @author Usuario
 */
public class Doctor {
    
    private String cedula,nombre,apellido,genero;
    private String nacimiento;

    public Doctor() {
    }

    //Consultar paciente
    public Doctor(String cedula, String nombre, String apellido, String genero, String nacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.nacimiento = nacimiento;
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

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Doctor{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", nacimiento=" + nacimiento + '}';
    }
    
    
    
}
