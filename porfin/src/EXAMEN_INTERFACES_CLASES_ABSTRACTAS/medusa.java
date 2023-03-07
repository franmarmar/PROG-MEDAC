package EXAMEN_INTERFACES_CLASES_ABSTRACTAS;

public class medusa extends animal {

	protected medusa(String reino, String familia, String especie) {
		super(reino, familia, especie);

	}

	@Override
	public String sonido() {
		return "PAIRGNPAEIRUVWNPEARISUGSP";
	}

	@Override
	public String comer() {
		return "me alimento (no tengo tanta imaginacion como para imaginarme como comen las medusas)";
	}

	@Override
	public String reproduccion() {
		return "tampoco se como lo hacen pero ya me joderia ser el animal marino mas parecidoa un condon";
	}

}
