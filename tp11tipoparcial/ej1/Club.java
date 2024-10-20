package tp11tipoparcial.ej1;

import java.util.ArrayList;

public class Club {
    private ArrayList<Socio> socios;
    private ArrayList<Alquiler> alquileres;
    private String nombre;

    

    public Club( String nombre) {
        this.socios = new ArrayList<>();
        this.alquileres = new ArrayList<>();
        this.nombre = nombre;
    }
    public ArrayList<Socio> getSocios() {
        return new ArrayList<>(socios) ;
    }

    public ArrayList<Alquiler> getAlquileres() {
        return new ArrayList<>(alquileres);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
