package tres_en_raya;

/**
 *  * esta clase sirve como base para los tableros ya que los tableros estan compuestas de celdas 
 * @author franm
 * @version 30/03/2023
 * 
 *
 */ 


public class celda {
	
	private char valor;
	private boolean ocupada;

/**
 * este constructor inicializa una celda sin parametros
 */
	public celda() {
		this.ocupada = false;
	}

/**
 * contructor el cual da a los atrivutos el valor que se a insertado
 * @param valor este da un valor a la celda, por ejemplo 'A'
 * @param ocupada este boolean dirá si la celda esta ocupada o no segun si es true o false
 */
	public celda(char valor, boolean ocupada) {
		this.valor = valor;
		this.ocupada = ocupada;
	}

	/**
	 * este metodo devuelve el valor actual de la celda
	 * @return char del valor
	 */
	public char getValor() {
		return valor;
	}
/**
 * este metodo sirve para modificar el valor actual de la celda
 * @param valor char valor
 */
	public void setValor(char valor) {
		this.valor = valor;
	}
/**
 * Este metodo devuelve si una celda esta ocupada o no
 * @return devuelve el valor de ocupada
 */
	public boolean isOcupada() {
		return ocupada;
	}
/**
 * este metodo sirve para poder cambiar el valor de ocupada
 * @param ocupada sirve para saber si una celda esta ocupado o no
 * 
 */
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

/** el metodo tostring sirve para mostrad con un formato adecuado los valores de la clase
 * @return devuelve un string sobre los valores de la clase
 */
	public String toString() {
		return "el valor de la celda es " + this.valor + " y ocupada es " + this.ocupada;
	}

}
