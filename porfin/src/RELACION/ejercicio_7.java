package RELACION;

import java.util.Scanner;

public class ejercicio_7 {

	public static void main(String[] args) {
	
				Scanner sc = new Scanner(System.in);
				
				System.out.println("dime un numero y te dire si es primo o no ");
				int num = sc.nextInt();
				
				if (num==2 || num==3) {
					System.out.println("este numero es primo");
				} else if (num == 1) {
					System.out.println("este numero no es primo");
				}	
				
				
				for (int i=2;i<=num/2;i++) {
					
					if (num%i == 0) {
						System.out.println("el numero no es primo");
						break;
					} else {
						
						System.out.println("el numero es primo");
						break;
					}
					
					

	}

	}
}
