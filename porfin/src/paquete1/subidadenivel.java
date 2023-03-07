package paquete1;

import java.util.Scanner;

public class subidadenivel {

	public static void main(String[] args) {
		/* escribe un problema que lea desde el teclado una fiche de nacimiento y la fecha del dia de hoy 
		 * imprima por pantalla excriba por pantalla una fecha del tiempo que lleva viviendo
		 * una fecha consta de 3 numeros enteros correspondientes al año, mes y dia. considere que todos los 
		 * años tienen 365 dias y que todos los meses del año tiene 30 dias
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("por favor dime el año en el que naciste");
		int año = sc.nextInt();
		
		System.out.println("ahora dime el mes(en numero porfa no me seas cateto)");
		int mes = sc.nextInt();
		
		System.out.println("por ultimo dime los dias");
		int dias = sc.nextInt();
		
		System.out.println("por favor dime el año en el que estamos");
		int añohoy = sc.nextInt();
	
		System.out.println("ahora dime el mesen el que estamos(en numero porfa no me seas cateto)");
		int meshoy = sc.nextInt();
		
		System.out.println("por ultimo dime el dia de hoy");
		int diashoy = sc.nextInt();
		
		
		final int añoadias = 365*año;
		final int mesadias = 30*mes;
		
		final int añosadiashoy = 365*añohoy;
		final int mesadiashoy = 30* meshoy;
		
		int  diasañosvividos = añosadiashoy - añoadias;
		int diasmesesvividos =mesadiashoy - mesadias;
		int diasvividosfinal =dias-diashoy;
		
		int dediasaaños = diasañosvividos /365;
		int dediasameses= diasmesesvividos/30;
		
		System.out.println ( " as vivido " + dediasaaños +" años " + dediasameses + " meses "+ diasvividosfinal+"dias");
		
		
				
	}

}
