public class CondicionAutor extends Condicion {
    private String autor;

    public CondicionAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Documento doc) {
        return doc.getAutores().contains(autor);
    }


    
}
