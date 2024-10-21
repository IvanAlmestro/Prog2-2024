package tp11.ej3;

import tp11.ej3.Condiciones.Condicion;

import java.util.ArrayList;

public class Categoria extends ElementoNoticia {
    private String descripcion;
    private String nombre;
    protected ArrayList<ElementoNoticia> elementos;
    
    public Categoria(String descripcion, String nombre) {
        this.descripcion = descripcion;
        this.elementos = new ArrayList<>();
        this.nombre = nombre;
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

    @Override
    public ElementoNoticia getCopia(Condicion c) {
        Categoria copiaCategoria = new Categoria(this.getDescripcion(), this.getNombre());
        for (ElementoNoticia elem : elementos) {
            ElementoNoticia elemHijo = elem.getCopia(c);
            if (elemHijo != null) {
                copiaCategoria.addElemento(elemHijo);
            }
        }
        return copiaCategoria;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public ArrayList<String> getMapaSitio() {
        //agrego el actual
        ArrayList<String> resultado = new ArrayList<>();
        resultado.add(this.getNombre() + "//");
        //recorro los hijos del resultado
        for(ElementoNoticia e: elementos){
            //recursivdad
            ArrayList<String> resultadoHijo = e.getMapaSitio();
            for (String s: resultadoHijo){
                resultado.add(this.getNombre()+ "//" + s);
            }

        }
        return resultado;
    }
//
    public void addElemento(ElementoNoticia e){
        this.elementos.add(e);
    }
}
