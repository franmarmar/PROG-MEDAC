package RELACION;

import java.util.Scanner;

public class ejercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		double acumular = 0;
		double contador = 0;
		
		System.out.println("dime uno de los datos, cuando no quieras mas datos pon un numero negativo");
		 num = sc.nextDouble();
		 
		while(num>0){
			acumular = acumular + num;
			System.out.println("dime uno de los datos, cuando no quieras mas datos pon un numero negativo");
			 num = sc.nextDouble();
			 contador++; 
		}
double media = acumular / contador;
System.out.println("la media sera de " + media + " " + acumular + " " + contador + " " + num);
	}

}
