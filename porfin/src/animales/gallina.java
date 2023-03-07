package animales;

public class gallina extends animales {

	
	private String colorplumas;
	private String huebo;
	public gallina() {
		this.colorplumas="blanco";
		this.huebo = "";
		
	}
	public gallina(String colorplumas, String huebo) {
		this.colorplumas=colorplumas;
		this.huebo=huebo;
	}
	public String getColorplumas() {
		return colorplumas;
	}
	public void setColorplumas(String colorplumas) {
		this.colorplumas = colorplumas;
	}
	public String getHuebo() {
		return huebo;
	}
	public void setHuebo(String huebo) {
		this.huebo = huebo;
	}
	
	public String ponerHuevo() {
		huebo="HE PUESTO UN HUEVO :)";
		return huebo;
	}
	
}
