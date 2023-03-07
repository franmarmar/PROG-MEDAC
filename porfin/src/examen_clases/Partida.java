package examen_clases;

public class Partida {
	//indicamos las propiedades
	private Jugador jugador1 = new Jugador();
	private Jugador jugador2 = new Jugador();
	private Jugador Ganador = new Jugador();
	private int numRondas;
	// hacemos solo un constructor el cual pille los valores que queremos meter
	public Partida(Jugador jugador1,Jugador jugador2, int numRondas) {
		this.jugador1=jugador1;
		this.jugador2=jugador2;
		this.numRondas=numRondas;
		this.Ganador=new Jugador();
	}
//ponemos getters y setters de todos los atributos
	public Jugador getJugador1() {
		return jugador1;
	}

	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}

	public Jugador getJugador2() {
		return jugador2;
	}

	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}

	public Jugador getGanador() {
		return Ganador;
	}

	public void setGanador(Jugador ganador) {
		Ganador = ganador;
	}

	public int getNumRondas() {
		return numRondas;
	}

	public void setNumRondas(int numRondas) {
		this.numRondas = numRondas;
	}
	//hacemos un método para mostrar los valores de los atributos
	public String toString() {
		return "jugador1 Es : " + jugador1 + "jugador2 es " + jugador2 + "Ganador es " + Ganador + "el numero de rondas jugadas es "+ numRondas;
	}
	//hacemos un metodo para poder definir a un ganador para ello optenemos la puntuacion de la tirada de la clase personaje 
	//de esta manera podemos hacer el sumatorio de todos los puntos y ganará el que tenga mas puntos acumulados.
	//si estos empatan ganara el jugador1 porque es el prota y porque a recordado el poder de la amistad.
	public void jugar() {
		int sumajug1=0;
		int sumajug2=0;
		for (int i = 0; i <= numRondas; i++) {
			sumajug1 =  sumajug1 + jugador1.getPuntuacion();
			sumajug2 = sumajug2 + jugador2.getPuntuacion();
			
	}
		//aqui es donde defino al ganador
		if (sumajug1<sumajug2) {
			Ganador=jugador2;
		} else Ganador=jugador1;
		
	}
}
