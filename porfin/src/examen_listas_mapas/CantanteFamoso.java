package examen_listas_mapas;

public class CantanteFamoso {

	private String nombre;
	private int ventas;
	private String GéneroMusical;
	
	public CantanteFamoso(String nombre, int ventas, String GéneroMusical) {
		this.nombre=nombre;
		this.ventas=ventas;
		this.GéneroMusical=GéneroMusical;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public String getGéneroMusical() {
		return GéneroMusical;
	}

	public void setGéneroMusical(String géneroMusical) {
		GéneroMusical = géneroMusical;
	}
	public String toString() {
		return "Nombre: " + this.nombre + "\n" +"VENTAS:" + this.ventas +"\n" + "genero musical:" + this.GéneroMusical +"\n";
	}
}
