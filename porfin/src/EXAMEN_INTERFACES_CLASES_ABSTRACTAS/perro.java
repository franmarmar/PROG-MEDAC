package EXAMEN_INTERFACES_CLASES_ABSTRACTAS;

public class perro extends animal {

	protected perro(String reino, String familia, String especie) {
		super(reino, familia, especie);

	}

	@Override
	public String sonido() {

		return "WUAUF";
	}

	@Override
	public String comer() {

		return "ÑAM MAÑ";
	}

	@Override
	public String reproduccion() {

		return "*se pone en celo y se va de tu comoda casa por 7 dias minimo*";
	}

}
