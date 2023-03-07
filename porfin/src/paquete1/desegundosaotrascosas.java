package paquete1;

import java.util.Scanner;

public class desegundosaotrascosas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime cuantos segundos quieres transformar");
		int segundos = sc.nextInt();
		
		
	int minutos = segundos / 60;
	int segundosmenos = segundos % 60;
	int horas = minutos / 60;
	int minutosmenos = minutos % 60;
	System.out.println("en total son " + horas +" horas " + minutosmenos + " minutos y " + segundosmenos + " segundos");
	}

}
