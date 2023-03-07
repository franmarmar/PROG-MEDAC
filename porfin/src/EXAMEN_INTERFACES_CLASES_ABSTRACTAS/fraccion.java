package EXAMEN_INTERFACES_CLASES_ABSTRACTAS;

public class fraccion implements iOperable{

	private int numerador;
	private int denominador;
	private int entero;
	
	public fraccion(int numerador, int denominador, int entero){
		this.denominador=denominador;
		this.numerador=numerador;
		this.entero=entero;
	}
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	public int getEntero() {
		return entero;
	}
	public void setEntero(int entero) {
		this.entero = entero;
	}
	
	

	
	@Override
	public void sumar() {

		this.numerador=(this.numerador*this.numerador)+(this.entero+this.entero);
		this.denominador=(this.denominador*1);
	}
	@Override
	public void restar() {
		this.numerador=(this.numerador*this.numerador)-(this.entero+this.entero);
		this.denominador=(this.denominador*1);
		
	}
	@Override
	public void multiplicar() {
		this.numerador=(this.numerador*this.entero);
		this.denominador=(this.denominador*1);
		
	}
	@Override
	public void dividir() {
		this.numerador=(this.numerador*1);
		this.denominador=(this.denominador*entero);
		
	}
}
