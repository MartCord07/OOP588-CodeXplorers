
package proyecto.modelo.espe;

import java.util.Date;


public class Paciente {
    private String cedula,nombre,apellido,genero,telefono,dia,horario,edad;
    private String Contraseña;
    private Date fechaNacimiento;
    
   

    public Paciente() {
    }

    public Paciente(String cedula, String nombre, String apellido, String genero, String telefono, String dia, String horario, String edad, String Contraseña, Date fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.telefono = telefono;
        this.dia = dia;
        this.horario = horario;
        this.edad = edad;
        this.Contraseña = Contraseña;
        this.fechaNacimiento = fechaNacimiento;
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

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Paciente{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", telefono=" + telefono + ", dia=" + dia + ", horario=" + horario + ", edad=" + edad + ", Contrase\u00f1a=" + Contraseña + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    

    
    
}

   