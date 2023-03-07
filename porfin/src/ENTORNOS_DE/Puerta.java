package ENTORNOS_DE;

public class Puerta {

	private Boolean abierta = false;
	private Ventana ventana = new Ventana();
	
	public void abrirCerrar(){
		this.abierta = (!this.abierta);
	}
	
	public Ventana getVentana() {
		return ventana;
	}

	public void abrirCerrarVentana() {
		ventana.abrircerrar();
	}
	
}
   