package paquete1;

import java.util.Scanner;

public class rectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("dime la base del rectangulo");
		double base = sc.nextInt();
		
		System.out.println("ahora dime la altura ");
		double altura = sc.nextInt();
		
		double area = (double) base * altura ;
		
		System.out.println("el area del rectangulo es de " + area + " cm cuadrados ");
	}

}
