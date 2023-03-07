package RELACION;

import java.util.Scanner;

public class ejercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int factorial = 1;
		
		System.out.println("porfavor dime el numero hasta donde quieras contar");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			factorial=  factorial * i;
			
	}
System.out.println("la suma de todos los numeros es igual a " + factorial);

	}

}

