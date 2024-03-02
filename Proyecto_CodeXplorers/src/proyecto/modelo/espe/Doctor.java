package proyecto.modelo.espe;

import java.util.Date;

public class Doctor {

    private String cedula,nombre,apellido,genero,telefono,edad;
    
    private Date fechaNacimiento;

    public Doctor(String cedula, String nombre, String apellido, String genero, String telefono, String edad, Date fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.telefono = telefono;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Doctor() {
        
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        return "Doctor{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", telefono=" + telefono + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

  
   
    
}
