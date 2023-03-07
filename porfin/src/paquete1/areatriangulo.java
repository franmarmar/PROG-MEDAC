package paquete1;

import java.util.Scanner;

public class areatriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime la base del triangulo");
		double base = sc.nextInt();
		
		System.out.println("ahora dime la altura ");
		double altura = sc.nextInt();
		
		double area = (double) base * altura / 2;
		
		System.out.println("el area del triangulo es de " + area + " cm ");
	}

}
