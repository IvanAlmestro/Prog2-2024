package tp7.ej3;

import java.util.ArrayList;

public class Planta {
    private int minRiego=1;
    private int maxRiego=10;
    private String nombreCientifico, clasificacion, clase, familia;
    private ArrayList<String> nombresVulgares;
    private int cantRiego;
    private int cantSol;

    public Planta(String nombreCientifico, String clasificacion, String clase, String familia,int cantRiego, int cantSol) {
        this.nombreCientifico = nombreCientifico;
        this.clasificacion = clasificacion;
        this.clase = clase;
        this.familia = familia;
        this.nombresVulgares =  new ArrayList<>();
        this.cantRiego = cantRiego;
        this.cantSol = cantSol;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public ArrayList<String> getNombresVulgares() {
        return nombresVulgares;
    }

    public int getCantRiego() {
        return cantRiego;
    }

    public void setCantRiego(int cantRiego) {
        if(cantRiego>minRiego && cantRiego<maxRiego){
            this.cantRiego = cantRiego;
        }
 
    }

    public int getCantSol() {
        return cantSol;
    }

    public void setCantSol(int cantSol) {
        this.cantSol = cantSol;
    }

    @Override
    public String toString() {
        return "Planta [minRiego=" + minRiego + ", maxRiego=" + maxRiego + ", nombreCientifico=" + nombreCientifico
                + ", clasificacion=" + clasificacion + ", clase=" + clase + ", familia=" + familia
                + ", nombresVulgares=" + nombresVulgares + ", cantRiego=" + cantRiego + ", cantSol=" + cantSol + "]";
    }

        

}
