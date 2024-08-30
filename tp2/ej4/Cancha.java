package tp2.ej4;

import java.util.ArrayList;

public class Cancha {
    private String deporte;
    private double precio;
    private ArrayList<Usuario> usuarios;
    private double descuento = 0.1;
    
    public String getDeporte() {
        return deporte;
    }
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        for (Usuario usuario : usuarios) {
            if(usuario.esSocio(usuario)){
                this.precio = precio*this.descuento;
            }
            else{
                this.precio =precio;
            }
        }
   
    }


    
}
