public class Proceso  extends ElementoCola{
    private int reqMemoria;

    
    public Proceso(int reqMemoria, String nombre){
        super(nombre);
        this.reqMemoria = reqMemoria;

    }

    public int getReqMemoria() {
        return reqMemoria;
    }

    public void setReqMemoria(int reqMemoria) {
        this.reqMemoria = reqMemoria;
    }


    @Override
    public String toString() {
        return "RequerimientoMemoria: " + getReqMemoria() + " "
                + ", Nombre: " + getNombre() + "]";
    }

    @Override
    public boolean esMayor(ElementoCola elem) {
        return ((Proceso)elem).getReqMemoria()>this.getReqMemoria();
    }

    public void ejecutar(){
        System.out.println("ejecutando");
    }
    
    
}
