package tp2.ej3;

public class Ciudad {
    private double imp1, imp2, imp3, imp4, imp5;
    private double mantenimiento;
    private String nombre;
    private int habitantes;
    private int minHabitantes;
    
    public Ciudad(double imp1, double imp2, double imp3, double imp4, double imp5, double mantenimiento, String nombre,
            int habitantes) {
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
        this.mantenimiento = mantenimiento;
        this.nombre = nombre;
        this.habitantes = habitantes;
    }

    public double getImp1() {
        return imp1;
    }

    public void setImp1(double imp1) {
        this.imp1 = imp1;
    }

    public double getImp2() {
        return imp2;
    }

    public void setImp2(double imp2) {
        this.imp2 = imp2;
    }

    public double getImp3() {
        return imp3;
    }

    public void setImp3(double imp3) {
        this.imp3 = imp3;
    }

    public double getImp4() {
        return imp4;
    }

    public void setImp4(double imp4) {
        this.imp4 = imp4;
    }

    public double getImp5() {
        return imp5;
    }

    public void setImp5(double imp5) {
        this.imp5 = imp5;
    }

    public double getGastoMantenimiento() {
        return mantenimiento;
    }

    public void setGastoMantenimiento(double mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }
    
    public boolean tieneDeficit(){
        double recaudado = this.imp1 + this.imp2 + this.imp3 + this.imp4 + this.imp5;
        if(recaudado < this.getGastoMantenimiento()&& habitantes > minHabitantes ){
            return true;
        }else{
            return false;
        }
    }
}
