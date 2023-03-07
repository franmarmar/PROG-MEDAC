package animales;

public class animales implements acciones{

	private String nombre;
	private int edad;
	
	public animales() {
		this.nombre="armando";
		this.edad=0;
		
	}
	public animales(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public String hablar() {
		
		return "hola";
	}
	@Override
	public String desplazarse() {
		
		return "me estoy moviuendo";
	}
	@Override
	public String alimentarse() {
		
		return "ñom ñom ñom";
	}
	
}
