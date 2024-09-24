import java.time.LocalDate;
import java.util.ArrayList;
public class Sistema{
    private ArrayList<Cliente> clientes;
    

    public Sistema(){
        this.clientes = new ArrayList<>();

    }
    
    public void addCliente(Cliente cliente){
        if(!this.clientes.contains(cliente)){
            this.clientes.add(cliente);
        }
    }

    public ArrayList<Cliente> getClientes() {
        return new ArrayList<>(clientes);
    }

    public ArrayList<Cliente> getClienteAlqulilerVencido(){
        //creo una lista para guardar los clientes que tienen alquilerVencido y la lleno para retornarla e imprimirla
        ArrayList<Cliente> lista = new ArrayList<>();
        for(int i = 0; i < this.clientes.size(); i++){
            //cliente actual del arreglo.
            Cliente clienteActual = clientes.get(i);

            //pregunto si la fecha de vencimiento es antes que la fecha actual. Lo que quiere decir que ya vencio.
            if(clienteActual.getFechaVencimiento().isBefore(LocalDate.now())){
                //agregoa a la lista el cliente que tiene el alquiler vencido.
                lista.add(clienteActual);
            }
        }
        return lista;
        
    }
}