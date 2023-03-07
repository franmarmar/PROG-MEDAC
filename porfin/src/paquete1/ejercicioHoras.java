package paquete1;

import java.util.Scanner;

public class ejercicioHoras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horastrabajadas, horasextras;
		
		System.out.println("dime el numero de horas que trabajas semanalmente (en numero)");
		horastrabajadas= sc.nextInt();
		
		System.out.println("dime el numero de horas que trabajas extras (en numero)");
		horasextras = sc.nextInt();
		
		
		
		final int pagahorasextra = horasextras * 20;
		final int pagahorastrabajadas = horastrabajadas * 10;
		int resultado = pagahorastrabajadas + pagahorasextra;
		
		System.out.println("te pagaran un numero total de " + resultado + " euros, " + pagahorastrabajadas + " euros por tus horas semanales y " + pagahorasextra + " euros por horas extras" );
	
	}
}
