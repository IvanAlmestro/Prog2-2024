package tp11tipoparcial.ej1;

import java.util.ArrayList;

public class Socio {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean pagoCuota;
    private ArrayList<Alquiler> pagos;


    public Socio(String nombre, String apellido, int edad, boolean pagoCuota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pagoCuota = pagoCuota;
        this.pagos = new ArrayList<>();
    }



    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public boolean isPagoCuota() {
        return pagoCuota;
    }
    public void setPagoCuota(boolean pagoCuota) {
        this.pagoCuota = pagoCuota;
    }
    public ArrayList<Alquiler> getPagos() {
        return new ArrayList<>(pagos);
    }



    public boolean alquilerMayorA(int precioMayor) {
       for (Alquiler alquiler : pagos) {
            if(alquiler.getPrecio()> precioMayor){
                return true;
            }
       }
       return false;
    }



    public boolean alquiloCancha(int canchaBuscada) {
        for (Alquiler alquiler : pagos) {
            int idCanchaActual= alquiler.getIdCancha();
            if(idCanchaActual == canchaBuscada){
                return true;
            }
        }
        return false;
    }
 
    public int cantTotalAlquilerCancha(int canchaBuscada){
        int suma= 0;
        for (Alquiler alquiler : pagos) {
            int idCanchaActual = alquiler.getIdCancha();
            if(idCanchaActual == canchaBuscada){
                suma++;
            }
        }
        return suma;
    }


    
}
