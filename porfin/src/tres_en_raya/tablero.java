package tres_en_raya;

/**
 * esta clase sirve para formar el tablero del tres en ralla y para comprobar los ganadores
 * @author franm
 * @version 30/03/2023
 */
public class tablero {
	
	
	private celda[][] celdas = new celda[3][3];
	private static int length = 3;

	/**
	 * este constructor sirve para llenar de valores el tablero
	 */
	public tablero() {
		char[] valores = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I' };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				char letra = valores[3 * i + j];
				celdas[i][j] = new celda(letra, false);
			}
		}
	}
/**
 * este metodo muestra el trablero con un formato especifico para que el usuario pueda ver de forma grafica todo el tablero
 * @return string muestra el tablero
 */
	public String mostrarTablero() {
		String tablero = "";
		for (int i = 0; i < 3; i++) {
			tablero += "| ";
			for (int j = 0; j < 3; j++) {
				tablero += celdas[i][j].getValor() + " | ";
			}
			tablero += "\n";
		}
		return tablero;
	}
/**
 * metodo boolean que comprueba si hay tres valores iguales en una fila
 * @return devuelve el boolean segun si son iguales o no
 * @param a este sirve para que el bucle pueda comprobar las casillas de la tabla
 * @param b este sirve para que el bucle pueda comprobar las casillas de la tabla
 */
	public boolean comprobarFilaYColumnas(int a, int b ) {
		boolean filaCom = true;
		boolean columnaCom = true;
		char letra = celdas[a][b].getValor();
		
		for(int x = 0; x<3; x++) {
			if(filaCom) {
				filaCom=(letra==celdas[a][x].getValor());		
			}
		if(columnaCom) {
			columnaCom=(letra==celdas[x][b].getValor());
		}
		}
		return filaCom || columnaCom;
	}
/**
 *   metodo boolean que comprueba si hay tres valores iguales en una columna
 * @return devuelve el boolean segun si son iguales o no
 */
	

	public boolean comprobarDiagonal() {
		return (celdas[0][0].getValor() == celdas[1][1].getValor())
				&& (celdas[0][0].getValor() == celdas[2][2].getValor())
				|| (celdas[0][2].getValor() == celdas[1][1].getValor())
						&& (celdas[0][2].getValor() == celdas[0][2].getValor());
	
	}
	/**
	 * devuelve true si algun metodo de comprobar es correcto
	 * @return Boolean segun si es correcto o no
	 * @param a este sirve para que el bucle pueda comprobar las casillas de la tabla
	 * @param b este sirve para que el bucle pueda comprobar las casillas de la tabla
	 */
	public boolean comprobarGanador(int a, int b) {
		return comprobarFilaYColumnas(a,b) || comprobarDiagonal();
	}
	/**
	 * metodo para devolver el largo del tablero
	 * @return devuelve el tamaño de la matriz
	 */
	public int getLength() {
		return length;
	}

	/**
	 * metodo que devuelve el valor de una celda el cual se necesita de saber su fila y columna para poder devolver
	 * @param fila: fila donde esta la celda
	 * @param columna: columna donde esta la celda
	 * @return devuelve la celda segun los parametros
	 */
	public celda devolverCelda(int fila, int columna) {
		return this.celdas[fila][columna];	
	}
	
	/**devuelve de forma String todo el tablero
	 * @return devuelve el tablero
	 */
	public String toString() {
		return "Tablero: " + "\n" + this.celdas;
	}
}