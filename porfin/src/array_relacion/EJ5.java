package array_relacion;

import java.util.Scanner;

public class EJ5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int m = 0;
		int auxiliar = 0;
		
		System.out.println("dime las dimensiones de la matriz");
		n=sc.nextInt();
		m=sc.nextInt();
		int matriz [][] = new int[n][m];

		for (int i=0;i<matriz[n].length;i++) {
			for (int j=0;j<matriz[m].length-1;j++) {
			if (matriz[j] > matriz[j+1]) {
				auxiliar = matriz[j+1];
				matriz[j+1]=matriz[j];
				matriz[j]=auxiliar;
			}
		}
		}
	}

}
