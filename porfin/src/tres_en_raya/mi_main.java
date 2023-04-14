package tres_en_raya;

import java.util.Scanner;

public class mi_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		juego jugar = new juego();
		boolean play = true;
		boolean turno = true;
		char icono = ' ';
		char posicion = ' ';
		int contador = 1;
		int fila = 0;
		int columna=0;

		while(play) {
			System.out.println("TRES EN RAYA");
			
			if(turno) {
				icono = 'X';
			} else {
				icono = 'O';
			}
			
			System.out.println(jugar.tablerano.mostrarTablero());
			System.out.println("pon una letra del tablero segun donde quieres colocar la ficha, JUGADOR " + icono);
			
			posicion = sc.next().toUpperCase().charAt(0);
			jugar.insertarFicha(posicion, icono);
			contador++;
			if(jugar.tablerano.comprobarGanador(fila , columna)) {
				play = false;
			
			}
			
			turno = !turno;
		}
		if(contador==9 ) {
			 System.out.println("\n");
			 System.out.println("EMPATE");
		 }else {
			 System.out.println(jugar.tablerano.mostrarTablero());
			 System.out.println("El jugador " + icono + " Ha Ganado!!");
		 }
	}

}
