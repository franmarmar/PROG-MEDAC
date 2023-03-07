package paquete1;

import java.util.Scanner;

public class areacirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int radio = 3;
		
		final double area= Math.PI * (radio * radio);
		
		System.out.println("el area de un circulo con radio 3 es igual a : " + area);

	}

}
