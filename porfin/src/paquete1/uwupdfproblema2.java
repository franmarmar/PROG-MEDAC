package paquete1;

import java.util.Scanner;

public class uwupdfproblema2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime la masa del primer objeto, en numero porfa que ya me la conozco");
		int m1 = sc.nextInt();
		
		System.out.println("dime la masa del segundo objeto, en numero o te mato ");
		int m2 = sc.nextInt();
		
		
		System.out.println("dime la distancia en numero, que te esperabas");
		int r1 = sc.nextInt();
		
		double G = 6.673e-11;
		
		double F = (G * (m1 * m2)/(Math.pow(r1,2)));
		
		System.out.println("la fuerza con la que se atraen es de " + F);
	}

}
