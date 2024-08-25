package tp1;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class Persona{
    private String nombre, apellido, sexo;
    private int edad, DNI;
    private LocalDate fnac;
    private double peso, altura;
    private double minimoIMC= 18.5;
    private double maximoIMC = 22;
    private int minimoEdad = 18;
    private int edadVotar = 16;

    // Constructores
    public Persona(int dni) {
        this(dni, "N", "N", "femenino", LocalDate.of(2000, 1, 1), 1, 1);
    }

    // Constructor con DNI, nombre y apellido
    public Persona(int DNI, String nombre, String apellido) {
        this(DNI, nombre, apellido, "femenino", LocalDate.of(2000, 1, 1), 1, 1);
    }

    // Constructor completo
    public Persona(int DNI, String nombre, String apellido, String sexo, LocalDate fnac, double peso, double altura) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fnac = fnac;
        this.peso = peso;
        this.altura = altura;
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
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDNI() {
        return DNI;
    }
    

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getMinimoIMC() {
        return minimoIMC;
    }

    public void setMinimoIMC(double minimoIMC) {
        this.minimoIMC = minimoIMC;
    }

    public double getMaximoIMC() {
        return maximoIMC;
    }

    public void setMaximoIMC(double maximoIMC) {
        this.maximoIMC = maximoIMC;
    }

    public int getMinimoEdad() {
        return minimoEdad;
    }

    public void setMinimoEdad(int minimoEdad) {
        this.minimoEdad = minimoEdad;
    }

    public int getEdadVotar() {
        return edadVotar;
    }

    public void setEdadVotar(int edadVotar) {
        this.edadVotar = edadVotar;
    }

    public LocalDate getFnac() {
        return fnac;
    }
    public void setFnac(LocalDate fnac) {
        this.fnac = fnac;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
		LocalDate hoy = LocalDate.now();
		int edad = hoy.getYear()-fnac.getYear();

		if (hoy.getMonthValue()>fnac.getMonthValue())
			return edad;
		else {
			if (hoy.getMonthValue()<fnac.getMonthValue())
				return edad-1;
			else {
				if (hoy.getDayOfMonth()>=fnac.getDayOfMonth()) {
					return edad;
				}else {
					return edad-1;
				}
			}
		}	
	}
    
    public double getIMC(){
        return this.peso/(this.altura * this.altura);
    }

    public boolean enForma(){
        double IMC = getIMC();
        if(IMC> minimoIMC && IMC < maximoIMC){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean cumpleAnios(){
        LocalDate hoy = LocalDate.now();

        if(hoy.getDayOfMonth()==this.fnac.getDayOfMonth() && hoy.getMonth() == this.fnac.getMonth()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean mayorDeEdad(){
        return this.getEdad() >= this.minimoEdad;
    }
    public boolean puedeVotar(int edadVotar){
        return this.getEdad() >= this.edadVotar;
    }

    public static void main (String[] args) {

		Persona ivan = new Persona(44535277, "ivan", "almestro","Masculino", LocalDate.of(2003, 3, 23), 60.3, 1.83);
        System.out.println("la persona es: " + ivan.getNombre()+ " y su edad es: " + ivan.getEdad());
	}
}