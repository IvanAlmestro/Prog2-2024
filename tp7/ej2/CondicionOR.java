public class CondicionOR extends Condicion{
    private Condicion c1;
    private Condicion c2;
    
    public CondicionOR(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Documento doc) {
        return c1.cumple(doc) || c2.cumple(doc);
    }
    
    
}   
