package RELACION;

import java.util.Scanner;

public class ejercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int suma = 0;
		System.out.println("porfavor dime el numero hasta donde quieras contar");
		int num = sc.nextInt();
		
		for (int i = 0; i <= num; i++) {
			suma= suma + i;
			
	}
System.out.println("la suma de todos los numeros es igual a " + suma);
}
}