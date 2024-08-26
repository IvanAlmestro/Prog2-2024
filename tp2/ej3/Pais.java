package tp2.ej3;
import java.util.ArrayList;
public class Pais {
    private String nombre;
    private ArrayList<Provincia> provincias;
    
    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>(provincias);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Provincia> getProvincias() {
        return new ArrayList<>(provincias);
    }

    
}
