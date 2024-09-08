package tp3.ej4;

import java.time.LocalDate;

public class Contacto {
    private String nombre, apellido, direccion, mail, ciudad, telefono;
    private LocalDate fnac;
    private int edad;

    public Contacto(String nombre, String apellido, String direccion, String mail, String ciudad, String telefono,
            LocalDate fnac, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.mail = mail;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.fnac = fnac;
        this.edad = edad;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFnac() {
        return fnac;
    }

    public void setFnac(LocalDate fnac) {
        this.fnac = fnac;
    }

    //este metodo se tendria que hacer manualmente
    public int getEdad(){
        return edad;
    }

    public boolean equals(Contacto contacto){
        if(this.apellido == contacto.getApellido() 
        && this.nombre == contacto.getNombre()
        && this.telefono == contacto.getTelefono()){
            return true;
        }
        else{ 
            return false;
        }
    }
    
}
