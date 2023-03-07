package examen1;

import java.util.Scanner;

public class ejercicio_1 {

	public static void main(String[] args) {
		// agregamos la herramienta scanner
		Scanner sc = new Scanner(System.in);

		//primero le pido al usuario el precio que quiere pagar y asignandolo a una varable entera
		
		System.out.println("dime el numero de euros que quieres pagar");
		int euros = sc.nextInt();
		
		//ahora pedire la variable billetes diciendole al usuario que billetes va a usar
		
		System.out.println("porfavor dime en que tipo de billetes vas a pagar");
		int billetes = sc.nextInt();
		
		// aqui divido el numero de euros con el tipo de billete para saber cuanto billetes hacen falta y lo guardo en una variable llamada resultado
		int resultado = euros / billetes ;
		
		//para sacar el numero de euros que me faltarían por pagar utilizo un modulo en la division de antes, y lo guardo en una varianble entera euros_sobrantes.
		double euros_sobrantes = euros % billetes;
		
		//aqui sencillametne muestro los resultados
		System.out.println("debes usar " + resultado + " billetes y te faltarían por pagar " + euros_sobrantes + " euros");
	}

}
