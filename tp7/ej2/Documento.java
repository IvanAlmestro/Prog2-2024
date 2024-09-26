import java.util.ArrayList;

public class Documento{
    private String titulo;
    private ArrayList<String> autores;
    private String contenido;
    private ArrayList<String> palabrasClave;

    public Documento(String titulo, String contenido){
        this.autores = new ArrayList<>();
        this.palabrasClave = new ArrayList<>();
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }



    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public ArrayList<String> getPalabrasClave() {
        return palabrasClave;
    }
    
}