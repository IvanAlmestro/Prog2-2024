package tp3.ej2;
import java.util.ArrayList;

public class Stock {
    private ArrayList<Mueble> muebles;


    public Stock() {
        this.muebles = new ArrayList<>(muebles);

    }



    public ArrayList<Mueble> getMuebles() {
        return new ArrayList<>(muebles);
    }
    
    public double costoFabricacionStock(boolean esCostoFabricacion){
        double total = 0;
        for (Mueble mueble : muebles) {
            if(esCostoFabricacion == true){

                total += mueble.getCosto();
            }
            else{
                total+= mueble.getValorVenta();
            }
        }

        return total;
        
    }

    public void addMueble( Mueble mueble){
        this.muebles.add(mueble);
    }

}
