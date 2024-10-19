package tp11.ej1.filtros;

import tp11.ej1.Socio;

public class FiltroPrecioMayor extends Filtro{
    	private int precioMayor;
	
	public FiltroPrecioMayor(int precioMayor){
		this.precioMayor = precioMayor;
	}
	@Override
	public boolean cumple(Socio s) {
		return s.alquilerMayorA(precioMayor);
	}

}