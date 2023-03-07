package array_relacion;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
int premio = 0 ;
int [] arrayboleto = new int [6];
int [] arraypremio = new int [6];
		
		for (int i=0;i<arrayboleto.length;i++) {
			System.out.println("dime tu boleto(de dijito a dijito)");
			arrayboleto[i]=sc.nextInt();
			
		}
		for (int i=0;i<arraypremio.length;i++) {
			System.out.println("dime el boleto ganador(de dijito a dijito)");
			arraypremio[i]=sc.nextInt();
			
		}
		
		for (int i=0;i<arrayboleto.length;i++) {
			if (arrayboleto[i]==arraypremio[i]) {
				premio=premio+1;
			} if (premio == 6) {
				System.out.println("Te a tocado el GORDOOOOOOO");
			}
		}
		System.out.println("tu boleto a tenido " + premio+ " digitos igual que el boleto ganador");
	}

}
