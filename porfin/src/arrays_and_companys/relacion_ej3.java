package arrays_and_companys;

import java.util.Scanner;

public class relacion_ej3 {
	;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double acumulador=0;
		
		double[] mediaArray = new double [7];
	
	for (int i=0;i<mediaArray.length;i++) {
		mediaArray[i]=sc.nextDouble();
	}
	for 
	
	(int i=0;i<mediaArray.length;i++) {
		acumulador=mediaArray[i]+acumulador;
	}
	double media=acumulador/mediaArray.length;
	System.out.println("la media de tus notas son:" + media);
	}
}
