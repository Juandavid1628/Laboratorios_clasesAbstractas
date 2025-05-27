package CarreraCiclistica;

abstract class Ciclista {
	int identificador;
	String nombre;
	int tiempoAcumulado = 0;
	private int posicionGeneral;

	public Ciclista(int identificador, String nombre) {
		this.identificador = identificador;
		this.nombre = nombre;

	}
	
	public abstract String imprimirTipo();

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTiempoAcumulado() {
		return tiempoAcumulado;
	}

	public void setTiempoAcumulado(int tiempoAcumulado) {
		this.tiempoAcumulado = tiempoAcumulado;
	}

	public int getPosicionGeneral() {
		return posicionGeneral;
	}

	public void setPosicionGeneral(int posicionGeneral) {
		this.posicionGeneral = posicionGeneral;
	}
	
}
