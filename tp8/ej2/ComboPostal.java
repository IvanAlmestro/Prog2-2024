package tp8.ej2;

import java.util.ArrayList;

public class ComboPostal extends Envio {
    private ArrayList<Envio> envios;
    private int nroTrackingCombo;

    public ComboPostal(int nroTrackingCombo) {
        this.envios = new ArrayList<>();
        this.nroTrackingCombo = nroTrackingCombo;
    }

    public ArrayList<Envio> getEnvios() {
        return new ArrayList<>(envios);
    }



    public int getNroTrackingCombo() {
        return nroTrackingCombo;
    }

    public void setNroTrackingCombo(int nroTrackingCombo) {
        this.nroTrackingCombo = nroTrackingCombo;
    }
    public void cambiarTrackingEnvios(){
        for (Envio envio : envios) {
            envio.setNroTracking(nroTrackingCombo);
        }
    }
    public void addEnvio(Envio envio){
        envio.setNroTracking(this.getNroTrackingCombo());
        cambiarTrackingEnvios();
        this.envios.add(envio);
    }


    public double getPeso(){
        double total = 0;
        for (Envio envio : envios) {
            total+=envio.getPeso();
        }
        return total;
    }

    @Override
    public String getDireccionDestino() {
        if(!envios.isEmpty()){
           return envios.get(0).getDireccionDestino();
        }else{
            return null;
        }
    }

    @Override
    public String getDireccionOrigen() {
        if(!envios.isEmpty()){
            return envios.get(0).getDireccionOrigen();
         }else{
             return null;
         }
    }

    @Override
    public void setDireccionDestino(String s) {
        for (Envio envio : envios) {
            envio.setDireccionDestino(s);
        }
    }

    @Override
    public void setDireccionOrigen(String s) {
        for (Envio envio : envios) {
            envio.setDireccionOrigen(s);
        }
    }
    
    
}
