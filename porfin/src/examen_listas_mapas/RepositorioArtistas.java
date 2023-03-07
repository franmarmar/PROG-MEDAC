package examen_listas_mapas;

import java.util.HashMap;
import java.util.ArrayList;


public class RepositorioArtistas {

	private HashMap<String,ArrayList> Repositor;
	
public RepositorioArtistas (){
	this.Repositor=new HashMap<String,ArrayList>();
}

public void añadirCantante_Canciones(String artista, ArrayList canciones){
	this.Repositor.put(artista, canciones);
}
public void añadircancionesauncantante( ArrayList canciones){
	this.Repositor.put(null, canciones);
}


public String ConsultarCancionesDeUnArtista(String artista) {
return "me quedo grande muchachos";
}


public String toString() {
	return "-----repositorio de artistas-----" + "\n" + this.Repositor.toString();
}
}
