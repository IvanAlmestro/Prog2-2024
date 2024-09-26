public class CondicionTituloIgual extends Condicion{
    Documento doc2;

    public CondicionTituloIgual(Documento doc2){
        this.doc2 = doc2;
    }    
    public boolean cumple(Documento doc){
        return doc.getTitulo().equals(doc2.getTitulo());
    }
}