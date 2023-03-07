package array_relacion;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("dime el numero de letras que tiene tu palabra");
		int letras = sc.nextInt();
		int acumulador=0;
		boolean palindromo = true;
		
		char [] arraypalabra = new char [letras];
	
				
				for (int i=0;i<arraypalabra.length;i++) {
					System.out.println("dime tu palabra letra a letra");
					arraypalabra[i]=sc.next().charAt(0);
				}
				
					for (int i=arraypalabra.length-1;i>=0;i--) {
					
						if (arraypalabra[i]!=arraypalabra[acumulador]) {
						palindromo = false;
						}
						acumulador=acumulador+1;
	}
	 if (palindromo == true) {
		 System.out.println("la palabra si es un palindromo");
	 } else {
		 System.out.println("la palabra no es un palindromo");
	 }

}
}
