import java.time.LocalDate;

public class Planta{
    private String nombreCientifico, nombre, paisOrigen;
    private LocalDate fechaCompra;
    private static int id_estatico=1;
    private int id_planta;

    public Planta(String nombreCientifico, String nombre, String paisOrigen, LocalDate i) {
        this.nombreCientifico = nombreCientifico;
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.fechaCompra = i;
       
        this.id_planta= id_estatico++;
        
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    
    public String toString(){
        return "nombreCientifico: " + this.getNombreCientifico() +
        " nombre " + this.getNombre() +
        " pais: " +this.getPaisOrigen()+
        " fechaCompra: " +this.getFechaCompra()+
        " id: " + this.getId_planta();
    }

    public int getId_planta() {
        return id_planta;
    }
    
}