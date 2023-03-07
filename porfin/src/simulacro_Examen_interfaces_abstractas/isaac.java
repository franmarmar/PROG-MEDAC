package simulacro_Examen_interfaces_abstractas;

public class isaac extends profesor{

	public isaac(String nombre, int edad, String asignatura) {
		super(nombre, edad, asignatura);
		
	}

	@Override
	public String fraseCaracterística() {
		return "BUENOS DIAS :D";
	}

	@Override
	public String horaDeLlegada() {
		
		return "3.00";
	}

	@Override
	public boolean descansito() {
		return true;
	}

}
