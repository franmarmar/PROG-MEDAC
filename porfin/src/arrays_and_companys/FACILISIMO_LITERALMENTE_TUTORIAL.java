package arrays_and_companys;

import java.util.Scanner;

public class FACILISIMO_LITERALMENTE_TUTORIAL {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double acumulador=0;
		
		
		System.out.println("dime cuantas notas quieres");
		int numero = sc.nextInt();
		
		double[] mediaArray = new double [numero];
	
	for (int i=0;i<mediaArray.length;i++) {
		System.out.println("dime una nota");
		mediaArray[i]=sc.nextDouble();
	}
	for 
	
	(int i=0;i<mediaArray.length;i++) {
		acumulador=mediaArray[i]+acumulador;
	}
	double media=acumulador/mediaArray.length;
	System.out.println("la media de tus notas son:" + media);
	
	for (int i=0;i<mediaArray.length ;i++) {
		System.out.println("nota: " + (i+1) + "= " + mediaArray[i]);
	
	}

	}

}
