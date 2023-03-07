package array_relacion;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int [] arrayobjetos = new int [5];
		
		for (int i=0;i<arrayobjetos.length;i++) {
			System.out.println("dime el peso de un objeto");
			arrayobjetos[i]=sc.nextInt();
			
			
		}
		
		for (int i=0;i<arrayobjetos.length;i++) {
			
			int tiempo = arrayobjetos[i] - arrayobjetos[0];
	System.out.println(tiempo);
			
		}
	}

}
