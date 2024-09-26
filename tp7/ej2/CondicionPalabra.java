public class CondicionPalabra extends Condicion{
    private String palabraClave;

    public CondicionPalabra(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    @Override
    public boolean cumple(Documento doc) {
        return doc.getPalabrasClave().contains(palabraClave);
        }

    
}
