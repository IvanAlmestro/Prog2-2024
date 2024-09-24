

public class CentroComputos {
    private ColaEspera colaProcesos;
    private ColaEspera colaComputadoras;

    public CentroComputos() {
        this.colaProcesos = new ColaEspera();
        this.colaComputadoras = new ColaEspera();
    }
    public Computadora getSiguienteCompu(){
        return (Computadora)colaComputadoras.getSiguiente();
    }
    public Proceso getSiguienteProceso(){
        return (Proceso)colaProcesos.getSiguiente();
    }
    public void agregarProceso(Proceso proceso) {
        if(proceso !=null){
            //si la cola de compus tiene compus ejecuto el proceso con una compu libre.
            if(!colaComputadoras.estaVacia()){
                Computadora libre = (Computadora) colaComputadoras.getSiguiente();
                libre.ejecutarProceso(proceso);
            }
            else{
                //si no hay computadoras disponibles, agrego el proceso a la cola de espera.
                colaProcesos.addElemento(proceso);

            }
        }
        
    }

    public void agregarComputadora(Computadora compu) {
        if(compu!=null){

            //quiere decir que hay procesos esperando..
            if(!colaProcesos.estaVacia()){
                Proceso proc = (Proceso) colaProcesos.getSiguiente();
                //entonces ejecuto el proceso
                compu.ejecutarProceso(proc);
            
            }else{
                // si no habia procesos esperando agrego a compus disponibles
                colaComputadoras.addElemento(compu);
            }
        }
    
    }
    public ColaEspera getColaProcesos() {
        return colaProcesos;
    }

    public void setColaProcesos(ColaEspera colaProcesos) {
        this.colaProcesos = colaProcesos;
    }

    public ColaEspera getColaComputadoras() {
        return colaComputadoras;
    }

    public void setColaComputadoras(ColaEspera colaComputadoras) {
        this.colaComputadoras = colaComputadoras;
    }

    
    
}
