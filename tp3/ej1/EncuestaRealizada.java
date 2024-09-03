package tp3.ej1;

public class EncuestaRealizada {
	private int dniEncuestado;
	private Encuesta encuesta;
	private Empleado empleadoEncuestador;
	private boolean respondida;
	
	public EncuestaRealizada(Encuesta encuesta, Empleado empleadoEncuestador,
			boolean respondida, int dniEncuestado) {
		super();
		this.dniEncuestado = dniEncuestado;
		this.encuesta = encuesta;
		this.empleadoEncuestador = empleadoEncuestador;
		this.respondida = respondida;
		
	}

	public int getPersonaEncuestada() {
		return dniEncuestado;
	}

	public void setPersonaEncuestada(int dniEncuestado) {
		this.dniEncuestado = dniEncuestado;
	}

	public Encuesta getEncuesta() {
		return encuesta;
	}

	public void setEncuesta(Encuesta encuesta) {
		this.encuesta = encuesta;
	}

	public Empleado getEmpleadoEncuestador() {
		return empleadoEncuestador;
	}

	public void setEmpleadoEncuestador(Empleado empleadoEncuestador) {
		this.empleadoEncuestador = empleadoEncuestador;
	}

	

	public Empleado getEmpleado() {
		return empleadoEncuestador;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleadoEncuestador = empleado;
	}


	public boolean isRespondida() {
		return respondida;
	}

	public void setRespondida(boolean respondida) {
		this.respondida = respondida;
	}
	
//	public void addRespuesta(String dni, String ss) {
//		if(!realizoEncuesta(dni)) {
//			
//			this.respuestas.add(ss);
//		}else {
//			System.out.println("Ya se completo la encuesta por la persona con DNI: " + this.dni);
//		}
//	}
//
//	private boolean realizoEncuesta(int dni) {
//		return this.dni == dni;
//	}
	
	
}
