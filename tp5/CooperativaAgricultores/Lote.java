import java.util.ArrayList;

public class Lote{
    private ArrayList<String> minerales;
    private int hectareas;
    private ArrayList<Cereal> cereales;
    private String nombre;

    public Lote(int hectareas, String nombre) {
        this.minerales = new ArrayList<>(minerales) ;
        this.hectareas = hectareas;
        this.cereales = new ArrayList<>(cereales);
        this.nombre = nombre;


    }

    public ArrayList<String> getMinerales() {
        return new ArrayList<>( minerales);
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHectareas() {
        return hectareas;
    }

    public void setHectareas(int hectareas) {
        this.hectareas = hectareas;
    }

    public ArrayList<Cereal> getCereales() {
        return new ArrayList<>(cereales);
    }



    public boolean isEspecial(ArrayList<String>mineralesEspeciales) {
        int cont= 0;
        
        for(int i = 0; i < mineralesEspeciales.size(); i++){
            String mineralActual = mineralesEspeciales.get(i);
            for(int j = i; j < this.minerales.size(); j++){
                String mineralLote = this.getMinerales().get(i);
                if(mineralActual == mineralLote){
                    cont++;
                }
            }
        }        
        
        return (cont == mineralesEspeciales.size());
           
     
    }



    public boolean sePuedeSembrar(Cereal cereal) {
        return cereal.sePuedeSembrarEn(this);
    }
   



    public boolean tieneMineral(String mineral) {
        return this.minerales.contains(mineral);
    }



}
