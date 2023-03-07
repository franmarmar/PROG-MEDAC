package paquete1;

import java.util.Scanner;

public class uwuproblema1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("dime cuantos centimetros quieres transformar");
		int centimetros = sc.nextInt();
		
		
	int metros = centimetros / 100;
	int centimetrosmenos = centimetros % 100;
	int kilometros = metros / 1000;
	int metrosmenos = metros % 1000;
	System.out.println("en total son " + kilometros +" kilometros " + metrosmenos + " metros y " + centimetrosmenos + " centimetros");
	

		
		
		
	}

}
