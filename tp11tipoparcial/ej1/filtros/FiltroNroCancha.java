package tp11tipoparcial.ej1.filtros;

import tp11tipoparcial.ej1.Socio;

public class FiltroNroCancha extends Filtro {
    	private int canchaBuscada;
	
	public FiltroNroCancha (int canchaBuscada){
		this.canchaBuscada = canchaBuscada;
	}

	@Override
	public boolean cumple(Socio s) {
		return s.alquiloCancha(canchaBuscada);
	}
}
