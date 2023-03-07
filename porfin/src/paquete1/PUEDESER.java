package paquete1;

import java.util.Scanner;

public class PUEDESER {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
	System.out.println("dime la cantidad e euros que quieres pasar a pesetas");  
	
	int euros = sc.nextInt();
	
final int pesetas =  166 * euros;



System.out.println(euros + " euros es igual a : " + pesetas + " pesetas " );
 


	
	}
}
