package arrays_and_companys;

public class relacion_ej2 {

	public static void main(String[] args) {


		int[] invertidoArray = new int [10];
		
		for (int i=0;i<invertidoArray.length;i++) {
			invertidoArray[i]=i+1;
		
		}
		for (int i=invertidoArray.length-1;i>=0;i--) {
			System.out.println(invertidoArray[i]);
			
		}
	}

}
