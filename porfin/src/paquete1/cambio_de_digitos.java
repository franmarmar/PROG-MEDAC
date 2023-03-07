package paquete1;

import java.util.Scanner;

public class cambio_de_digitos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("dime un numero de tres cifras");
		int numero = sc.nextInt();
		
		
		System.out.println("dime un numero y te dire si el nuemro de tres cifras contiene ese numero");
		int numero_a_acertar = sc.nextInt();
		
		int cifra3 =  numero % 10;
		int cifra2 =  (numero  / 10) % 10;
		int cifra1 =  (numero  / 100) % 10;

	
		
		boolean resultado = cifra1 == numero_a_acertar || cifra2 == numero_a_acertar || cifra3 == numero_a_acertar;
		
		System.out.println(resultado);
	}
	
	

}
