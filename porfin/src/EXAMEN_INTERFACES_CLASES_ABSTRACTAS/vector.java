package EXAMEN_INTERFACES_CLASES_ABSTRACTAS;

public class vector implements iOperable {
	
private int[] vectorArray;
private int capacidadMaxima;
private int entero;

public vector( int capacidadMaxima){
	this.capacidadMaxima=capacidadMaxima;
}
public int[] getVectorArray() {
	return vectorArray;
}

public void setVectorArray(int[] vectorArray) {
	this.vectorArray = vectorArray;
}

public int getCapacidadMaxima() {
	return capacidadMaxima;
}

public void setCapacidadMaxima(int capacidadMaxima) {
	this.capacidadMaxima = capacidadMaxima;
}

public int getEntero() {
	return entero;
}

public void setEntero(int entero) {
	this.entero = entero;
}




	@Override
	public void sumar() {
		for(int i=0;i<this.capacidadMaxima;i++) {
			this.vectorArray[i]=this.vectorArray[i]+ this.entero;
		}

		
	}

	@Override
	public void restar() {
		for(int i=0;i<this.capacidadMaxima;i++) {
			this.vectorArray[i]=this.vectorArray[i] - this.entero;
		}
		
	}

	@Override
	public void multiplicar() {
		for(int i=0;i<this.capacidadMaxima;i++) {
			this.vectorArray[i]=this.vectorArray[i] * this.entero;
		}
		
	}

	@Override
	public void dividir() {
		for(int i=0;i<this.capacidadMaxima;i++) {
			this.vectorArray[i]=this.vectorArray[i] / this.entero;
		}
		
	}

}
