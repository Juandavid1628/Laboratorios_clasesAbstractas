package Empleado;

public abstract class Empleado {
	String nombre;
	double salarioBase;
	
	public Empleado(String nombre, double salarioBase) {
		this.nombre = nombre;
		this.salarioBase = salarioBase;
	}
	
	abstract double calcularSalario();
	
	void mostrarInfo() {
		System.out.println(nombre + " gana $" + calcularSalario());
	}
}
	

