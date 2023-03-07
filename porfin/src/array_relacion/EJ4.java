package array_relacion;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arrayrata = new int [20];
	int acumulador = 0;
	int auxiliar = 0;
	int igual = 0;
		
		for (int i=0;i<arrayrata.length;i++) {
			System.out.println("dime el peso de una rata");
			arrayrata[i]=sc.nextInt();

	
		}	
		
		for (int i=0;i<arrayrata.length;i++) {
			for (int j=0;j<arrayrata.length-1;j++) {
			if (arrayrata[j] > arrayrata[j+1]) {
				auxiliar = arrayrata[j+1];
				arrayrata[j+1]=arrayrata[j];
				arrayrata[j]=auxiliar;
			}
		}
		}
		
		for (int i=0;i<arrayrata.length;i++) {
		 acumulador=acumulador+arrayrata[i];
		}
		
		for (int i=0;i<arrayrata.length-1;i++) {
			igual=igual+1;
			
			if (arrayrata[i] != arrayrata[i+1]) {
				System.out.println("hay " + igual + " ratas que pesan " + arrayrata[i]);
				igual=0;
			} if(i==arrayrata.length-2) {
				igual=igual+1;
				System.out.println("hay " + igual + " ratas que pesan " + arrayrata[i+1]);
			}
			
			
			
		}
		
		int media= acumulador / 20;
		System.out.println(" la media de todo el peso es de " + media + "  gramos");
		
		
		
	}			
	
}