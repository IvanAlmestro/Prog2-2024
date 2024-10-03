package tp4.ej3;


public class EmpleadoHoraExtra extends Empleado{
    private double monto;
    
    public EmpleadoHoraExtra(String nombre, double salario, int horasTrabajadas, double monto) {
        super(nombre, salario, horasTrabajadas);
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public double getSalario(){
        return super.getSalario()+ super.getHorasTrabajadas()*monto;
    }
    public String toString(){
        return super.toString() + " monto: "+ monto;
    }
}
