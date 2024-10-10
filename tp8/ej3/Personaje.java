package tp8.ej3;

public class Personaje extends Entidad {
    private Fruta frutaConsumida;

    public Personaje(String nombre, double fuerza, double peso, int edad, Fruta frutaConsumida) {
        super(nombre, fuerza, peso, edad);
        this.frutaConsumida = frutaConsumida;
    }


    
    @Override
    public double getFuerza() {
       if(frutaConsumida != null){
            return frutaConsumida.getFuerza();
       }else{
        
        return super.getFuerza();
       }

  
    }

    @Override
    public double getPeso() {
        return this.peso;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public int getCantMiembros() {
        return 1;
    }
}
