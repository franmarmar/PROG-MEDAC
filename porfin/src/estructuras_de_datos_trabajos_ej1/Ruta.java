package estructuras_de_datos_trabajos_ej1;

import java.util.ArrayList;

public class Ruta {

	private ArrayList<ArrayList<pokemon>> ruta = new ArrayList<ArrayList<pokemon>>();
	
	public Ruta(ArrayPokemon ruta1){
	ArrayList<pokemon> pokes = ruta1.getPokes();
	ruta.add(pokes);
}


	public void AñadirRuta(ArrayPokemon ruta2){
		ArrayList<pokemon> pokes = ruta2.getPokes();
		ruta.add(pokes);
	}
	

	public ArrayList<ArrayList<pokemon>> getRuta() {
		return ruta;
	}

	public String toString() {
		return ruta.toString();
	}

}
