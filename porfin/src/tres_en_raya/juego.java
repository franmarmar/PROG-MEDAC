package tres_en_raya;

/**
 * esta clase sirve para que funcione los movimientos principales del tres en raya como instertar fichas
 * @author franm
 * @version 30/03/2023
 */


public class juego {
	tablero tablerano;
	

	/**
	 * 
	 * este constructor inicializa un tablero en la clase
	 */
	public juego() {
		this.tablerano = new tablero();
	}
/**
 * metodo el cual devuelve el tablero
 * @return tablero: devuelve el tablero
 */
	public tablero getTablerano() {
		return tablerano;
	}
/**
 * este metodo sirve para modificar el valor del tablero
 * @param tablerano :tablero del juego
 */
	public void setTablerano(tablero tablerano) {
		this.tablerano = tablerano;
	}
	
	/**
	 * esta clase sirve para insetar un valor en forma de ficha en el tablero.
	 * @param posicion: posicion donde se quiere insetar ficha
	 * @param icono: icono de la ficha
	 * @return boolean que dice true si se a insertado correctamente, y false si no se ha insertado correctamente
	 */
	public boolean insertarFicha(char posicion, char icono) {
		boolean resultado=false;
		for(int i=0; i<tablerano.getLength() && !resultado; i++) {
			for(int j=0; j<tablerano.getLength() && !resultado; j++) {
				celda celdita= tablerano.devolverCelda(i, j);
			if(celdita.getValor()==posicion && (celdita.getValor()!='X')&& (celdita.getValor()!='O')) {
				celdita.setValor(icono);
				resultado=true;
			}
			}
		}
		if(resultado==false) {
			System.out.println("NO VALIDO DESGRACIADO");
		}
			
		
		return resultado;
	}
}
