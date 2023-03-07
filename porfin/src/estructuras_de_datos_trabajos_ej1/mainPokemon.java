package estructuras_de_datos_trabajos_ej1;

public class mainPokemon {

	public static void main(String[] args) {
		
		pokemon bulbasaur = new pokemon("Bulbasaur",1,"Es un Bulbasaur","Planta");
		pokemon ivysaur = new pokemon("Ivysaur",2,"Es un Ivysaur","Planta y Veneno");
		pokemon venusaur = new pokemon("Venusaur",3,"Es un Venusaur","Planta y Veneno");
		pokemon charmander = new pokemon("Charmander",7,"Es un Charmander","Fuego");
		
		ArrayPokemon arra= new ArrayPokemon();
		arra.añadirPokemon(bulbasaur);
		arra.añadirPokemon(charmander);
		arra.añadirPokemon(ivysaur);
		arra.añadirPokemon(venusaur);
		
		//System.out.println(arra);
		
		Pokedex poke = new Pokedex();
		
		poke.añadirPokeP(charmander);
		System.out.println(poke);
	}

}
