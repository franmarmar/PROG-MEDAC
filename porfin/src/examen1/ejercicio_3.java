package examen1;

import java.util.Scanner;

public class ejercicio_3 {

	public static void main(String[] args) {
		// agregamos la herramienta scanner
		Scanner sc = new Scanner(System.in);
				
		//primero pedire las variables al usuario
		
		System.out.println("porfavor dime el valor del primero numero entero");
		int entero1 = sc.nextInt();
		
		System.out.println("porfavor dime el valor del segundo numero entero");
		int entero2 = sc.nextInt();
		
		//ahora acemos la operacion almacenandolo en un byte haciendo uso de un casting
	
		byte  resultado =(byte) (entero1/entero2);
		
		//le mostramos el resultado al usuario
		System.out.println("el valor de la division en formato byte es : " + resultado);
		
	}

}
