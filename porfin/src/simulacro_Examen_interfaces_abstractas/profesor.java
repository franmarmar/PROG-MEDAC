package simulacro_Examen_interfaces_abstractas;

public abstract class profesor {
private String nombre;
private int edad;
private String asignatura;

public profesor (String nombre,int edad, String asignatura) {
	this.nombre=nombre;
	this.edad=edad;
	this.asignatura=asignatura;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public String getAsignatura() {
	return asignatura;
}

public void setAsignatura(String asignatura) {
	this.asignatura = asignatura;
}


public abstract String fraseCaracterística();

public abstract String horaDeLlegada();

public abstract boolean descansito();

}


