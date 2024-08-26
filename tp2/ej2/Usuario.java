package tp2.ej2;

public class Usuario {
    private String nombre, mail, telefono;
    private boolean esAsistente;
    private int DNI;
    
    

    public Usuario(String nombre, String mail, String telefono, boolean esAsistente, int dNI) {
        this.nombre = nombre;
        this.mail = mail;
        this.telefono = telefono;
        this.esAsistente = esAsistente;
        DNI = dNI;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public boolean isEsAsistente() {
        return esAsistente;
    }
    public void setEsAsistente(boolean esAsistente) {
        this.esAsistente = esAsistente;
    }
    public int getDNI() {
        return DNI;
    }


    
}
