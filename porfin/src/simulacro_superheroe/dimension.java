package simulacro_superheroe;

public class dimension {
private double alto;
private double ancho;
private double profundidad;

public dimension() {
	this.alto=0;
	this.ancho=0;
	this.profundidad=0;
}
public dimension(double alto,double ancho,double profundidad) {
	this.alto=alto;
	this.ancho=ancho;
	this.profundidad=profundidad;
}
public double getAlto() {
	return alto;
}
public void setAlto(double alto) {
	this.alto = alto;
}
public double getAncho() {
	return ancho;
}
public void setAncho(double ancho) {
	this.ancho = ancho;
}
public double getProfundidad() {
	return profundidad;
}
public void setProfundidad(double profundidad) {
	this.profundidad = profundidad;
}

}
