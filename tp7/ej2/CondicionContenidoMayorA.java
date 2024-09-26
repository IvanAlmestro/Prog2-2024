public class CondicionContenidoMayorA extends Condicion{
    private int minPalabras;
    
    public CondicionContenidoMayorA(int minPalabras) {
        this.minPalabras = minPalabras;
    }

    @Override
    public boolean cumple(Documento doc) {
        return doc.getPalabrasClave().size() > minPalabras;
    }
    
}
