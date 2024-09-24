public class Pelicula extends Item{
    private String info;
    private int cantCopias;
    
    public Pelicula(String info, int cantCopias) {
        this.info = info;
        this.cantCopias = cantCopias;
        
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getCantCopias() {
        return cantCopias;
    }

    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }

    @Override
    public boolean puedeAlquilarse() {
        if(cantCopias > 0){
            return true;
        }else{
            return false;
        }
    }

   

    
}