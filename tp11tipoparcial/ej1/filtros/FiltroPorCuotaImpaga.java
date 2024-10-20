package tp11tipoparcial.ej1.filtros;

import tp11tipoparcial.ej1.Socio;

public class FiltroPorCuotaImpaga extends Filtro {

	@Override
	public boolean cumple(Socio s) {
		return  !s.isPagoCuota();
	}
}