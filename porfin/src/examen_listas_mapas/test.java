package examen_listas_mapas;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CantanteFamoso challane = new CantanteFamoso("challane",10,"pop");
		CantanteFamoso michaeljakson = new CantanteFamoso("michael",100,"pop");
		
		ListaCantanteFamoso lista = new ListaCantanteFamoso();
		lista.añadirCantante(michaeljakson);
		lista.añadirCantante(challane);
		
		System.out.println(lista);
	}

}
