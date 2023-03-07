package ARRAYLISTAS;

public class persona {

	private String nombre;
	private String apellidos;
	
	public persona(String nombre, String apellidos) {
		this.nombre=nombre;
		this.apellidos=apellidos;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String toString() {
	return this.nombre + this.apellidos;
	}
}
