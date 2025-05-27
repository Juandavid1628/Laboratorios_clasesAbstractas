package Empleado;

public class Gerente extends Empleado {

	public Gerente(String nombre, double salarioBase) {
		super(nombre, salarioBase);

	}
		
	double calcularSalario() {
		return salarioBase + 1000;
	
	}
}
