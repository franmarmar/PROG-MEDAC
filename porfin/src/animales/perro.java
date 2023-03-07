package animales;

public class perro extends animales {

	private String colorpelo;
	private boolean sentado;
	
	public perro() {
		this.colorpelo="marron";
		this.sentado=false;
	}

	public String getColorpelo() {
		return colorpelo;
	}

	public void setColorpelo(String colorpelo) {
		this.colorpelo = colorpelo;
	}

	public boolean isSentado() {
		return sentado;
	}

	public void setSentado(boolean sentado) {
		this.sentado = sentado;
	}
	public boolean sentarse() {
		
		this.sentado=!sentado;
		return sentado;
	}
}
