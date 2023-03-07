package estructuras_de_datos_trabajos_ej1;

import java.util.HashMap;

public class Pokedex {
	private HashMap<String, pokemon> pokedex;
	private final pokemon bulbasaur = new pokemon("Bulbasaur",1,"Es un Bulbasaur","Planta");
	private final pokemon ivysaur = new pokemon("Ivysaur",2,"Es un Ivysaur","Planta y Veneno");
	private final pokemon venusaur = new pokemon("Venusaur",3,"Es un Venusaur","Planta y Veneno");
	
	public Pokedex() {
		this.pokedex = new HashMap<String, pokemon>();
		añadirHard();
	}

	public HashMap<String, pokemon> getPokedex() {
		return pokedex;
	}

	public void setPokedex(HashMap<String, pokemon> pokedex) {
		this.pokedex = pokedex;
	}

	public pokemon getBulbasaur() {
		return bulbasaur;
	}

	public pokemon getIvysaur() {
		return ivysaur;
	}

	public pokemon getVenusaur() {
		return venusaur;
	}
	
	public void añadirHard() {
		pokedex.put(bulbasaur.getNombre(),bulbasaur);
		pokedex.put(ivysaur.getNombre(),ivysaur);
		pokedex.put(venusaur.getNombre(),venusaur);
	}
	public void añadirPokeP(pokemon p) {
		this.pokedex.put(p.getNombre(), p);
	}
	public String toString() {
		return "-----Pokedex-----" + "\n" + this.pokedex.toString();
	}
}
