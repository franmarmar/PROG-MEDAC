package examen_clases;

public class Dado {
//indicamos las propiedades
	private int NumeroCaras;
	private boolean trucado;
	
	// hacemos dos constructores uno sin parametros para iniciarlos a vacio y el otro con valores
	public Dado() {
		this.NumeroCaras=0;
		this.trucado=false;
	}
	public Dado( int NumeroCaras, boolean trucado) {
		this.NumeroCaras=NumeroCaras;
		this.trucado=trucado;
		
	}
	//ponemos getters y setters de todos los atributos
	public int getNumeroCaras() {
		return NumeroCaras;
	}
	public void setNumeroCaras(int numeroCaras) {
		NumeroCaras = numeroCaras;
	}
	public boolean isTrucado() {
		return trucado;
	}
	public void setTrucado(boolean trucado) {
		this.trucado = trucado;
	}
	//hacemos un método para mostrar los valores de los atributos 
	public String toString() {
		return "el numero de caras del dado es " + this.NumeroCaras + "El valor de trucado es : " + this.trucado;
	}
	//hacemos un método el cual nos realiza una tirada, este identifica si el dado esta trucado o no con un if
	//el cual segun si es trucado o no el aleatorio cambiara sus parametros para cumplir con el requisito del trucado
	public int tirar() {
		int tirada=0;
		int trucadotirada = 0;
		if (trucado == true) {
			trucadotirada=(int)(Math.random()*2+1);
			if (trucadotirada==1) { 
			tirada=this.NumeroCaras;
			if (trucadotirada==2) {
				tirada=(int)((Math.random()*NumeroCaras-1)+1);
			}else tirada=(int)(Math.random()*NumeroCaras+1);
			}
			
		} 
		//devolvemos el valor optenido 
			return tirada;
		}
	}

