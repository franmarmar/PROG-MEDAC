package RELACION;

import java.util.Scanner;

public class ejercicio_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("porfavor dime el valor que quieres que represente en fivonacchi");
		int num = sc.nextInt();
		
		int resultado=0;
		int X = 0;
		int Y = 1;
		
		if ( num == 1 || num == 2) {
			
		System.out.println("la sucesion de fivonacvhi en este caso sera de 1");
		} else {
		
		for (int i = 3; i <= num; i++){
			
			
			resultado = X + Y;
			
			X = Y;
			Y = resultado;
			
			
		}
		System.out.println("la sucesion de fivonachi repetida " + num + " veces es igual a " + resultado);
		}
	}

}
