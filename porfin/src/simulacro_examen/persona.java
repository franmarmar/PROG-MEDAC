package simulacro_examen;

public class persona {
private double peso;
private double altura;
private int edad;
private String nombre;
private String sexo;
private double IMC;

public persona() {
	this.peso = 0;
	this.altura= 0;
	this.edad=0;
	this.nombre="";
	this.sexo="";

}

public persona(double peso, double altura,int edad,String nombre,String sexo) {
	this.altura=altura;
	this.peso=peso;
	this.edad=edad;
	this.nombre=nombre;
	this.sexo=sexo;
}

public double getPeso() {
	return peso;
}

public void setPeso(double peso) {
	this.peso = peso;
}

public double getAltura() {
	return altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getSexo() {
	return sexo;
}

public void setSexo(String sexo) {
	this.sexo = sexo;
}

public double getIMC() {
	return IMC;
}

public void calcularIMC() {
	IMC = (getPeso()) / Math.pow(getAltura(), 2);
}



}
