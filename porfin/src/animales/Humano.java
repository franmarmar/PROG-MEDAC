package animales;

public class Humano extends animales {

	private float altura;
	private perro miperro = new perro();
	
	
	
	public String jugar(){
		String jugar = "estoy jugando absurdamente divertido";
		return jugar;
	}
	
	public String dormir() {
		String dormir = "ZZZZZZZZZZZZ";
				return dormir;
	}
	public boolean sentarmascota() {
		boolean sentaomascota = miperro.sentarse();
		return sentaomascota;
		
	}
}
