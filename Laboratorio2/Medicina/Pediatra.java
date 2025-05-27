package Medicina;

public class Pediatra extends Medico {
	enum tipologia{NEUROLOGO,PSICOLOGO};

	tipologia tipo;
	
	public Pediatra() {
		
	}

	public Pediatra(String nombre, tipologia tipo) {
		super(nombre);
		this.tipo = tipo;
		
	}

	public tipologia getTipologia() {
		return tipo;
	}

	public void setTipologia(tipologia tipo) {
		this.tipo = tipo;
	}
}
