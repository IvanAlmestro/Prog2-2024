package tp11.ej1.filtros;

import tp11.ej1.Socio;

public class FiltroPorCuotaImpaga extends Filtro {

	@Override
	public boolean cumple(Socio s) {
		return  !s.isPagoCuota();
	}
}