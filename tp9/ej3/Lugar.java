package tp9.ej3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalTime;
public class Lugar extends ElementoElectoral{
	ArrayList<ElementoElectoral> elementos;
	
	public Lugar(){
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento (ElementoElectoral e){
		this.elementos.add(e);
	}
	@Override
	public int getVotos() {
		int cant = 0;
		for (ElementoElectoral e: elementos)
			cant += e.getVotos();
		return cant;
	}

	@Override
	public double porcentajeVoto(Candidato c) {
		int porcentaje = 0;
		for (ElementoElectoral e:elementos)
			porcentaje += e.porcentajeVoto(c) * e.getVotos()/this.cantidadVotos();
		return porcentaje;
	}

	



	@Override
	public double porcentajeVotoHora(Candidato candidato, LocalTime hora1, LocalTime hora2) {
		int cant = 0;
		for (ElementoElectoral e:elementos)
			cant += e.porcentajeVotoHora(candidato, hora1, hora2);
		return cant/getVotos()*100;
	}

	@Override
	public double porcentajeVotoBlanco() {
		return 0;
		
	}

}