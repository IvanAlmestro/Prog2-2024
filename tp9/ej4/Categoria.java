package tp9.ej4;
import java.util.ArrayList;

import tp9.ej4.Condiciones.Condicion;
public class Categoria extends ElementoNoticia {
    private String descripcion;
    protected ArrayList<ElementoNoticia> elementos;
    
    public Categoria(String descripcion) {
        this.descripcion = descripcion;
        this.elementos = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<ElementoNoticia> getElementos() {
        return new ArrayList<>(elementos);
    }

    //abstraemos este metodo en vez de preguntar si es una Noticia o una Categoria,
    //ya que esa solucion, serviria para este caso solamente y no si se agregan mas cosas.
    @Override
    public int getCantNoticias() {
        int total = 0;
        for (ElementoNoticia elem : elementos) {
            total+=   elem.getCantNoticias();
        }
        
        return total;
        
    }

    @Override
    public ArrayList<ElementoNoticia> buscar(Condicion c) {
        ArrayList<ElementoNoticia> aux = new ArrayList<>();

        for (ElementoNoticia elementoNoticia : elementos) {
            
            ArrayList<ElementoNoticia> resHijo = elementoNoticia.buscar(c);
            aux.addAll(resHijo);
        }
        return aux;
    }

 
    
}
