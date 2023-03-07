package paquete1;

import java.util.Scanner;

public class primer_bucle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		
		do  {
			System.out.println("porfavor dime un numero");
			numero = sc.nextInt();
			
		}while (numero>10 || numero<1);
				
	System.out.println("a pues al final acertaste");
	}

}
