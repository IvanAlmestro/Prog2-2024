package tp3.ej2;
import java.util.ArrayList;

public class Stock {
    private ArrayList<Mueble> muebles;


    public Stock() {
        this.muebles = new ArrayList<Mueble>();

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
        if (mueble != null){
            this.muebles.add(mueble);
        }else{
            System.out.println("el mueble es nulo");
        }
 
    }

}
