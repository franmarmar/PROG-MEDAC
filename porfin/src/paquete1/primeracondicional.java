package paquete1;

import java.util.Scanner;

public class primeracondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("porfavor dime a que temperaturas estas en numero como me lo digas en letra te meto un satenazo");
		
		int temp = sc.nextInt();
				
		
		if(temp <0){
			System.out.println("HIELO");
		} else if (temp < 100 && temp >0) {
			
			System.out.println("AGUA");
			
			
		}else  {
			
			System.out.println("VAPOR");
		}
		
		
		
	}

}
