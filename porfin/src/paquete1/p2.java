package paquete1;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("dime el numero de cromosomas que tienes payaso");
		int numero = sc.nextInt();
		int numero2 = 5;
		int resultado = numero + numero2;
		int resta = numero - numero2;
		double division = (double) numero / numero2;
		int producto = numero * numero2;
		int mod = numero % numero2;
		System.out.println("la suma de " + numero + " y " + numero2 + " es " + resultado + " felicidades eres tonto");
		System.out.println("la resta es " + resta);
		System.out.println("la division es " + division);
		System.out.println("la producto es " + producto);
		
	}

}
