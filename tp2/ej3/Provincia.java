package tp2.ej3;
import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> ciudades;
    
    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<Ciudad> (ciudades);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ciudad> getCiudades() {
        return new ArrayList<>(ciudades);
    }

    public boolean mitadCiudadesDeficit(){
        int cantidad=0;
        for (Ciudad ciudad : ciudades) {
            if(ciudad.tieneDeficit()){
                cantidad++;
            }

        }
        return (ciudades.size()/2) < cantidad;
    }
}
