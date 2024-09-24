import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<String> cualidades;
    private ArrayList<String> familiares;
    private Casa casaActual;
    //se podria agregar un aplledio y otros datos

    public Alumno(String nombre) {
        this.nombre = nombre;
       
        this.cualidades = new ArrayList<>();
        
        this.familiares = new ArrayList<>();

    }
    
    
    public Casa getCasaActual() {
        return casaActual;
    }


    public void setCasaActual(Casa casaActual) {
        this.casaActual = casaActual;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<String> getCualidades() {
        return new ArrayList<>(cualidades);
    }


    public ArrayList<String> getFamiliares() {
        return new ArrayList<>(familiares);
    }
    
    public void addFamiliar(String nombre){
        this.familiares.add(nombre);


    }
    public void addCualidad(String cualidadNueva){
        if(!this.cualidades.contains(cualidadNueva)){
            this.cualidades.add(cualidadNueva);
        }else{
            System.out.println("Ya existe esa casa");
        }
    }

    
}
