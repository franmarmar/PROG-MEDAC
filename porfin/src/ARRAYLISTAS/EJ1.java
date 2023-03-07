package ARRAYLISTAS;

import java.util.ArrayList;
import java.util.Scanner;

public class EJ1 {
	ArrayList<String> arrayColores= new ArrayList<String>();
	private Scanner sc=new Scanner(System.in);
	public EJ1(int ncolores) {
		for(int i=0;i<ncolores;i++) {
			this.arrayColores.add(sc.nextLine());
		}
	}
	
	public ArrayList<String> getArrayColores(){
		return this.arrayColores;

	}
	public void SetArrayColores(ArrayList<String>) {
		this.arrayColores=arrayColores;
		
	}
	

}
