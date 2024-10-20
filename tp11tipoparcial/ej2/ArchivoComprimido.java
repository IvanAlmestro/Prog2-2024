package tp11tipoparcial.ej2;

import tp11tipoparcial.ej2.filtros.filtro;

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


    @Override
    public ArrayList<ElementoSA> buscar(filtro f1) {
        ArrayList<ElementoSA> aux = new ArrayList<>();
        for (ElementoSA elem: elementos){
            ArrayList<ElementoSA> elementosCumplen = elem.buscar(f1);

            if(!elementosCumplen.isEmpty()){
                aux.add(this);
            }
        }

        return aux;
    }
}