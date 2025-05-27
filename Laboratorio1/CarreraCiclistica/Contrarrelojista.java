package CarreraCiclistica;

public class Contrarrelojista extends Ciclista {
	double velocidadMaxima;
	
	public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
		super(identificador, nombre);
		this.velocidadMaxima = velocidadMaxima;

	}
	
	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public String imprimirTipo() {

		return "Contrarrelojista";
	}

}
