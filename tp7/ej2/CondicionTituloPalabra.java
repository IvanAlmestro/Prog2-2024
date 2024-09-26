public class CondicionTituloPalabra extends Condicion{
    private String palabraClave;
    
    public CondicionTituloPalabra(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    @Override
    public boolean cumple(Documento doc) {
        return doc.getTitulo().contains(palabraClave);
    }
    
}