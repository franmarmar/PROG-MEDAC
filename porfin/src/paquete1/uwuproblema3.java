package paquete1;

import java.util.Scanner;

public class uwuproblema3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("porfavor dime el tiempo en numero ");
		int t = sc.nextInt();
		
		System.out.println("porfavor dime la distancia en numero ");
		int d = sc.nextInt();
		
		double a= (d/t) ;
		double s= (d%t);
		
		System.out.println("la aceleracion es de " + a + " " + s);
		
	}
}
