package simulacro_Examen_interfaces_abstractas;

public class luis extends profesor {

	public luis(String nombre, int edad, String asignatura) {
		super(nombre, edad, asignatura);
		
	}

	@Override
	public String fraseCaracterística() {
	
		return "me acuerdo acellavez cuando.....";
	}

	@Override
	public String horaDeLlegada() {

		return "hora en punto";
	}

	@Override
	public boolean descansito() {

		return true;
	}

}
