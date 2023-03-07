package paquete1;

import java.util.Scanner;

public class intercambiodevalores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


System.out.println("dime el valor de el primer nuemro");
		int valor1 = sc.nextInt();
		
		System.out.println("dime el valor de el segundo nuemro");
		int valor2 = sc.nextInt();
		
		int auxiliar = valor1;
		 valor1 = valor2;
		 valor2 = auxiliar;
		
		System.out.println("el primer valor ahora vale " + valor1 +" y el segundo valor ahora vale " + valor2);
	}

}
