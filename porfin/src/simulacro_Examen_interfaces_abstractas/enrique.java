package simulacro_Examen_interfaces_abstractas;

public class enrique extends profesor {

	public enrique(String nombre, int edad, String asignatura) {
		super(nombre, edad, asignatura);
		
	}

	@Override
	public String fraseCaracterística() {
	
		return "¿Sabías que, en términos de reproducción Vaporeon es el Pokémon más compatible sexualmente con los humanos? No solo están en el grupo huevo de campo, que está compuesto principalmente por mamíferos, sino que los Vaporeon miden un promedio de un metro de altura y pesan 29 kilos.";
	}

	@Override
	public String horaDeLlegada() {
	
		return "elegantemente tarde";
	}

	@Override
	public boolean descansito() {
		return false;
	}

}
