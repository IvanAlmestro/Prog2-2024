package tp11tipoparcial.ej2;

import tp11tipoparcial.ej2.filtros.filtro;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class Archivo extends ElementoSA {

    private double tamanio;

    
    public Archivo(String nombre, LocalDate fechaCreacion, LocalDate fechaModificacion, double tamanio) {
        super(nombre, fechaCreacion, fechaModificacion);
        this.fechaModificacion = fechaModificacion;
        this.tamanio = tamanio;
        this.fechaCreacion = LocalDate.now();
    }



    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }
        
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    @Override
    public ArrayList<ElementoSA> buscarOrdenado(filtro f1, Comparator comp) {
        ArrayList<ElementoSA> aux = new ArrayList<>();
        if(f1.cumple(this)){
            aux.add(this);
        }
        Collections.sort(aux, comp);
        return aux;
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }


    public double getTamanio() {
        return tamanio;
    }


    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }



    @Override
    public int getCantArchivos() {
        return 1;
    }



    @Override
    public String toString() {
        return "Archivo [fechaModificacion=" + fechaModificacion + ", tamanio=" + tamanio + ", getNombre()="
                + getNombre() + "]";
    }



    @Override
    public ArrayList<ElementoSA> buscar(filtro f1) {
        
            ArrayList<ElementoSA> resultado = new ArrayList<>();
            
            if (f1.cumple(this))
                resultado.add(this);// Si el archivo cumple con el filtro, lo añade
            
            return resultado;
        
    }

    
}
