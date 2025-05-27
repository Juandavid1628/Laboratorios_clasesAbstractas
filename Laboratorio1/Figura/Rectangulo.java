package Figura;

public class Rectangulo extends Figura {
	double ancho, alto;
	
	Rectangulo(double ancho, double alto){
		this.ancho = ancho;
		this.alto = alto;

	}
	
	double calcularArea() {
		return ancho * alto;
		
	}
}
