public class CondicionContenidoPalabra extends Condicion{
    private String palabraClave;
    
    public CondicionContenidoPalabra(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    @Override
    public boolean cumple(Documento doc) {
        return doc.getContenido().contains(palabraClave);
    }
    
}
