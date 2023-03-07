package paquete1;

import java.util.Scanner;

public class hora_del_lol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		
		
		System.out.println("porfavor diga la hora en la que estamos y te dire que toca");
		double hora = sc.nextDouble();
		
		
		if (hora > 24 || hora < 0 ) {
			System.out.println("TU ERES SUBNORMAL??? DIME UNA HORA QUE ERES TONTISIMO");
		}
		
		if (hora >= 0 && hora <6) {
			System.out.println("hora de desperdiciar tu vida");
			
			
		} else if (hora >=6 && hora <= 14) {
			System.out.println("duerme bella duermente");
			
		} else if (hora >14 && hora <= 15) {
			System.out.println("moster y tirando");
		} else if (hora > 15 && hora<= 21.30) {
			System.out.println("ojala tener programación");
		} else if (hora >21.30 && hora < 24) {
			System.out.println("autocuidado consolacion y hora sad");
		}
	}

}
