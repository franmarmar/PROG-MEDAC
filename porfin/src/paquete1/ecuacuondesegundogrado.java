package paquete1;

import java.util.Scanner;

public class ecuacuondesegundogrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime el valor de A (raiz cuadrada)");
		int valorA = sc.nextInt();
		
		System.out.println("dime el valor de B (raiz cuadrada)");
		int valorB= sc.nextInt();
		
		System.out.println("dime el valor de c (raiz cuadrada");
		int valorC = sc.nextInt();
		
       double resultado1 = (-valorB + (Math.sqrt(Math.pow(valorB,2)-4 * valorA * valorC)))/2*valorA;
       double resultado2 = (-valorB - (Math.sqrt(Math.pow(valorB,2)-4 * valorA * valorC)))/2*valorA;
       
       System.out.println("el resultado con el + es: " + resultado1);
       System.out.println("el resultado con el - es: " + resultado2);
	}

}
