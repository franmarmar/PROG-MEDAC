package EXAMEN_INTERFACES_CLASES_ABSTRACTAS;

public abstract class animal {

	private String reino;
	private String familia;
	private String especie;
	
	protected animal(String reino, String familia, String especie) {
		this.reino = reino;
		this.familia = familia;
		this.especie = especie;
	}
	
	public String getReino() {
		return reino;
	}
	public void setReino(String reino) {
		this.reino = reino;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public abstract String sonido();
	
	public abstract String comer();

	public abstract String reproduccion();
		
	
	
	}
	
	

