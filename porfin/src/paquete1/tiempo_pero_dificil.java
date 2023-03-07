package paquete1;

import java.util.Scanner;

public class tiempo_pero_dificil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		
		
		System.out.println("porfavor dime la hora en horas (osea que si son las 5.56 ponme 5)");
		int h1 = sc.nextInt();
		
		System.out.println("porfavor dime la hora en minutos (osea que si son las 5.56 ponme 56)");
		int m1 = sc.nextInt();
		
		
		System.out.println("porfavor dime la hora en horas de la otra hora(osea que si son las 5.56 ponme 5)");
		int h2 = sc.nextInt();
		
		System.out.println("porfavor dime la hora en minutos de la otra hora(osea que si son las 5.56 ponme 56)");
		int m2 = sc.nextInt();
		
		
		int minutostotales1 = (h1 * 60) + m1;
		int minutostotales2 = (h2 * 60) + m2;
		
		int resultado = minutostotales1 - minutostotales2;
		
		
		int solucionminutos = (resultado % 60);
		int solucionhoras = (resultado / 60);
		
		
		if ( resultado > 0) {
			System.out.println(" la segunda fecha es antes que la primera y el tiempo de diferencia es: " + solucionhoras + " horas " + solucionminutos + " minutos");
		} else if ( resultado < 0) {
			int expresion1=(solucionminutos * -1);
			int expresion2=(solucionhoras * -1);
			System.out.println(" la segunda fecha es despues que la primera y el tiempo de diferencia es: " + expresion2 + " horas " + expresion1 + " minutos");
		}
	}

}
