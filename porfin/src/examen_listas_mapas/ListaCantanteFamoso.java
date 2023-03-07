package examen_listas_mapas;

import java.util.ArrayList;




public class ListaCantanteFamoso {

	private ArrayList<CantanteFamoso> lista;
	
	public ListaCantanteFamoso () {
		this.lista=new ArrayList<CantanteFamoso>();
		
	}
	
	public void añadirCantante(CantanteFamoso c) {
	this.lista.add(c);
}
	public void borrarCantante(CantanteFamoso c) {
	this.lista.remove(c);
}
	
	public String BuscarGeneroMusica(int index) {
	return this.lista.get(index).getGéneroMusical();
	}
	
	public String CantanteConMasVentas(ListaCantanteFamoso lista) {
		return "lo siento profe ni idea :( ";
		
		}
	
	public String toString() {
		return this.lista.toString();
	}
	
	
}