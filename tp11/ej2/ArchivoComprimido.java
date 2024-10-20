package tp11.ej2;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArchivoComprimido extends Carpeta {
    private ArrayList<ElementoSA> elementos;
    private int tasaCompresion;

    public ArchivoComprimido(String nombre, LocalDate fechaCreacion, int tasaCompresion) {
        super(nombre, fechaCreacion, LocalDate.now());
        elementos = new ArrayList<>();
        this.tasaCompresion = tasaCompresion;
    }

    public ArrayList<ElementoSA> getElementos() {
        return elementos;
    }

    public int getTasaCompresion() {
        return tasaCompresion;
    }

    public void setTasaCompresion(int tasaCompresion) {
        this.tasaCompresion = tasaCompresion;
    }
    
    

}