package tp2.ej4;

import java.util.ArrayList;

public class Establecimiento {
    private String nombre;
    private ArrayList<Cancha> canchas;
    private ArrayList<Usuario> socios;

    public Establecimiento(String nombre) {
        this.nombre = nombre;
        this.canchas = new ArrayList<Cancha>();
        this.socios = new ArrayList<Usuario>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancha> getCanchas() {
        return new ArrayList<>(canchas) ;
    }

    public ArrayList<Usuario> getSocios() {
        return new ArrayList<>(socios);
    }

    public void addCanchas(Cancha cancha) {
        canchas.add(cancha);
    }

    public void addSocios(Usuario usuario) {
        if (usuario.esSocio(usuario) && !socios.contains(usuario)) {
            socios.add(usuario);
        }
    }
    
}