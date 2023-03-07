package RELACION;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("porfavor dime el numero hasta donde quieras contar");
		int num = sc.nextInt();
		
		for (int i = 0; i <= num ; i++) {
			System.out.println(i);
		}
		

	}

}
