package examen1;

import java.util.Scanner;

public class ejercicio_2 {

	public static void main(String[] args) {
		// agregamos la herramienta scanner
		Scanner sc = new Scanner(System.in);
		
		//primero pediremos las variables de Y y de Z al usuario, el tipo de variable sera double
		
		System.out.println("porfavor dime el valor de Y");
		double Y = sc.nextDouble();
		
		System.out.println("porfavor dime el valor de Z");
		double Z = sc.nextDouble();
		
		//ahora definire la variable C
		
		double C = 356.18;
		
		//ahora procedere con la operación (tortura) 
		
		double X = C * ((Math.pow(Z,2)*(Math.pow(Y,2)))/(Z+C));
	
		//finalmente ponemos el resultado
		
		System.out.println("el valor de X es igual a = " + X );
	}

}
