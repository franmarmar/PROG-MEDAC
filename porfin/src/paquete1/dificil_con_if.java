package paquete1;

import java.util.Scanner;

public class dificil_con_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dia,mes,año;
		
		System.out.println("dime el dia en el que estamos");
		dia = sc.nextInt();
		
		System.out.println("dime el MES en el que estamos en numero");
		mes = sc.nextInt();
		
		System.out.println("dime el año en el que estamos en numero");
		año = sc.nextInt();
		
		
		int resultado= dia+1;
		
		int febrerobisiesto= año % 4;
		
	if (dia <= 27) {
		System.out.println(resultado + " " + mes + " " + año);
		
		} else if (dia == 28 && mes == 2 ) {
			if (febrerobisiesto == 0 ) {
				System.out.println(resultado + " " + mes + " " + año);
				
				
			} else if (dia == 28 && febrerobisiesto != 0) { 
				mes++;
				System.out.println(1 + " " + mes + " " + año);
			
			}
		}
	
			if (dia == 28 && mes != 2) {
				System.out.println(resultado + " " + mes + " " + año);
				
				
			}
			if (dia == 29 && febrerobisiesto == 0 && mes==2) {
				mes++;
				System.out.println(1 + " " + mes + " " + año);
			
			
			}
			if (dia == 30 && (mes ==4 || mes == 6 || mes==9 || mes == 11) ) {
				mes++;
				System.out.println(1 + " " + mes + " " + año);
				
			} else if (dia == 30 && (mes ==1 || mes == 3 || mes==7 || mes == 8 || mes == 10 || mes ==12)) {
				System.out.println(resultado + " " + mes + " " + año);
				
			}
			if (dia == 31 && (mes ==1 || mes == 3 || mes==7 || mes == 8 || mes == 10) ) {
				mes++;
				System.out.println(1 + " " + mes + " " + año);
					
				} 
			
			if ( dia == 31 && mes == 12) {
				año++;
				System.out.println(1 + " " + 1 + " " + año);
				
			}
		}
	}


