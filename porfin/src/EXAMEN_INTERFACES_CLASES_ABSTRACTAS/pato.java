package EXAMEN_INTERFACES_CLASES_ABSTRACTAS;

public class pato extends animal{

	protected pato(String reino, String familia, String especie) {
		super(reino, familia, especie);

	}

	@Override
	public String sonido() {

		return "CUACK";
	}

	@Override
	public String comer() {

		return "PAN PNA PAN PNA";
	}

	@Override
	public String reproduccion() {

		return "*pone tremendo huevo*";
	}

}
