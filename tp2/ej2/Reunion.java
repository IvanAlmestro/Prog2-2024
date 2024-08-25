package tp2.ej2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reunion {
    private String lugar, tema;
    private int duracion;
    private ArrayList<Usuario> usuarios;
    private LocalDate fecha;

    

    public Reunion(String lugar, String tema, int duracion, LocalDate fecha) {
        this.lugar = lugar;
        this.tema = tema;
        this.duracion = duracion;
        this.usuarios = new ArrayList<>(usuarios);
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public ArrayList<Usuario> getUsuarios() {
        return new ArrayList<>(usuarios);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void addUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    

}
