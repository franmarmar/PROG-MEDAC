package RELACION;

import java.util.Scanner;

public class ejercicio_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int contador = 0;
		System.out.println("porfavor dime una palabra para decirte el numero de vocales y para ponertela al reves");
				String cadena = sc.nextLine();
				
				String invertida = "";
				String copiacadena = cadena.toLowerCase();
				for (int indice = cadena.length() - 1; indice >= 0; indice--) {
					
					
					if (copiacadena.charAt(indice) == 'a' || copiacadena.charAt(indice) == 'e' || copiacadena.charAt(indice) == 'i' || copiacadena.charAt(indice) == 'o' || copiacadena.charAt(indice) == 'u') {
						
						contador++;
					}
					
					
					
					invertida += cadena.charAt(indice);
				}
				System.out.println("Cadena original: " + cadena);
				System.out.println("Cadena invertida: " + invertida);
				System.out.println("el numero de vocales es de " + contador);
			}
		
	    }
	

	


