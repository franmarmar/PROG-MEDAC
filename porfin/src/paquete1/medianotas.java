package paquete1;

import java.util.Scanner;

public class medianotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dime porfavor tus 5 notas para hacer la media");
	
		
		
		double nota1 = sc.nextDouble();
		System.out.println("dime otra");
		
		double nota2 = sc.nextDouble();
		System.out.println("dime otra mas");
		
		double nota3 = sc.nextDouble();
		
		System.out.println("otra mas, ya casi terminamos");
		double nota4 = sc.nextDouble();
		
		System.out.println("venga la ultima");
		double nota5 =sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4 + nota5) /5;
		
		
		System.out.println("tu nota media es de " + media);
		
		
		
	}
	
	

}
