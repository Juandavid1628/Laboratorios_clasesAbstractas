package Empleado;

public class Ingeniero extends Empleado {

	public Ingeniero(String nombre, double salarioBase) {
		super(nombre, salarioBase);

	}

	double calcularSalario() {
		return salarioBase + 500;
	
	}
}
