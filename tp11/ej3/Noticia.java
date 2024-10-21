package tp11.ej3;

import tp11.ej3.Condiciones.Condicion;

import java.util.ArrayList;

public class Noticia extends ElementoNoticia {
    private String titulo, texto, autor, link, introduccion;
    private ArrayList<String> palabrasClave;


    
    public Noticia(String titulo, String texto, String autor, String link, String introduccion) {
        this.titulo = titulo;
        this.texto = texto;
        this.autor = autor;
        this.link = link;
        this.introduccion = introduccion;
        this.palabrasClave = new ArrayList<>();
    }

    

    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getTexto() {
        return texto;
    }



    public void setTexto(String texto) {
        this.texto = texto;
    }



    public String getAutor() {
        return autor;
    }



    public void setAutor(String autor) {
        this.autor = autor;
    }



    public String getLink() {
        return link;
    }



    public void setLink(String link) {
        this.link = link;
    }



    public String getIntroduccion() {
        return introduccion;
    }



    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }



    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave) ;
    }






    @Override
    public int getCantNoticias() {
       return 1;
    }



    @Override
    public ArrayList<ElementoNoticia> buscar(Condicion c) {
        ArrayList<ElementoNoticia> aux = new ArrayList<>();
        if(c.cumple(this)){
            aux.add(this);
        }
        return aux;
    }

    @Override
    public ElementoNoticia getCopia(Condicion c) {
        if(c.cumple(this)) {
            Noticia noticiaCopia = new Noticia(this.getTitulo(), this.getTexto(), this.getAutor(), this.getLink(), this.getIntroduccion());

            for (String p : palabrasClave) {
                noticiaCopia.addPalabraClave(p);

            }
            return noticiaCopia;

        }return null;
    }



    public ElementoNoticia copia(Condicion c){
        // creo la copia solo si cumple, asi si no cumple retorna null
        if(c.cumple(this)){
            Noticia nCopia = new Noticia(this.getTitulo(), this.getTexto(), this.getAutor(), this.getLink(), this.getIntroduccion());
            for (String s: palabrasClave){
                nCopia.addPalabraClave(s);
            }
            return nCopia;
        }
        return null;
    }

    private void addPalabraClave(String p) {
        this.palabrasClave.add(p);
    }

    @Override
    public ArrayList<String> getMapaSitio() {
        ArrayList<String> resultado = new ArrayList<>();
        resultado.add(this.getLink());
        return resultado;
    }

}