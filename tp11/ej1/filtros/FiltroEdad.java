package tp11.ej1.filtros;

import tp11.ej1.Socio;

public class FiltroEdad  extends Filtro{
    	private int edadMaxima;
	
	public FiltroEdad(int edadMaxima){
		this.edadMaxima = edadMaxima;
	}
	@Override
	public boolean cumple(Socio s) {
		return s.getEdad()< edadMaxima;
	}
}
