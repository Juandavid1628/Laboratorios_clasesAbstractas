package Medicina;

public class Ortopedista extends Medico {
	enum tipologia {MAXILOFACIAL, PEDIATRICA};
	tipologia tipo;
	
	public Ortopedista() {
		
	}

	public Ortopedista(String nombre, tipologia tipo) {
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
