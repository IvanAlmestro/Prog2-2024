import java.util.ArrayList;

public class Casa{
    private ArrayList<String> cualidades;
    private int maxAlumnos;
    protected ArrayList<Alumno> alumnos;
    private String nombre;
    

    public Casa(int maxAlumnos, String nombre){
        
        this.cualidades = new ArrayList<String>();
        
        this.maxAlumnos = maxAlumnos;
        this.alumnos = new ArrayList<Alumno>();
        this.nombre = nombre;
    }

    public ArrayList<String> getCualidades() {
        return new ArrayList<String>(cualidades);
    }

 
    public int getMaxAlumnos() {
        return maxAlumnos;
    }

    public void setMaxAlumnos(int maxAlumnos) {
        this.maxAlumnos = maxAlumnos;
    }

    public ArrayList<Alumno> getAlumnos() {
        return new ArrayList<Alumno>(alumnos);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean compararCualidades(Alumno alumno){
        int contador = 0;
        for(int i = 0 ; i < cualidades.size(); i++){
            String cualidadActual = cualidades.get(i);
            for(int j = 0; j < alumnos.size(); j++){
                String cualidadAlumno = alumnos.get(j).getCualidades().get(j);
                if(cualidadActual == cualidadAlumno){
                    contador++;
                }
            }   

        }
        if(contador == cualidades.size()){
            return true;
        }else{
            return false;
        }
        
    }
    
    public void addAlumno(Alumno alumno){
        if(compararCualidades(alumno) && !estaRepetido(alumno) && tieneLugar() && alumno != null){
            this.alumnos.add(alumno);
        }
    }

    public boolean tieneLugar(){
        return this.alumnos.size() <= this.getMaxAlumnos();
    }
    public boolean estaRepetido(Alumno alumno){
        for (Alumno alumnoide : alumnos) {
            if(alumnoide.getNombre() == alumno.getNombre()){
                return true;
            } 
        }
        return false;
    }

    public void addCualidad(String cualidadNueva) {
       this.cualidades.add(cualidadNueva);
    }

}