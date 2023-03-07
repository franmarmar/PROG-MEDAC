package examen_clases;

public class Jugador {
	//indicamos las propiedades
	private String nombre;
	private Dado dado = new Dado();
	private int Puntuacion;
	// hacemos dos constructores uno sin parametros para iniciarlos a vacio y el otro con valores
	public Jugador() {
		this.nombre="";
		this.Puntuacion=0;
		this.dado=new Dado();
				
	}
	public Jugador(String nombre, Dado dado){
		this.nombre=nombre;
		this.dado=dado;
		this.Puntuacion=0;
	}
	//ponemos getters y setters de todos los atributos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Dado getDado() {
		return dado;
	}
	public void setDado(Dado dado) {
		this.dado = dado;
	}
	public int getPuntuacion() {
		return Puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		Puntuacion = puntuacion;
	}
	//hacemos un metodo utilizando el metodo de la clase de dados para conseguir que puntuacion valga lo mismo que la tirada
	public void tirar(){
		Puntuacion=dado.tirar();
	
	}
	//hacemos un método para mostrar los valores de los atributos
	public String toString() {
		return "El nombre del jugador es: " + nombre + " La puntuacion de la tirada a sido " + Puntuacion + " tu dado es " + dado;
	}
}
