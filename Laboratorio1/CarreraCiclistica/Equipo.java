package CarreraCiclistica;
import java.util.ArrayList;

public class Equipo {
	String nombre;
	private double totalTiempo;
	String pais;
	public ArrayList<Ciclista> listaCiclistas = new ArrayList<>();
	
	public Equipo(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getTotalTiempo() {
		return totalTiempo;
	}

	public void setTotalTiempo(double totalTiempo) {
		this.totalTiempo = totalTiempo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	public void añadirCiclista(Ciclista ciclista) {
		listaCiclistas.add(ciclista);
	}
	
	public void listarEquipo() {
	    for (Ciclista c : listaCiclistas) {
	        c.imprimirTipo();
	    }
	}
	
	public Ciclista buscarCiclista(int identificador) {
	    for (Ciclista c : listaCiclistas) {
	        if (c.getIdentificador() == identificador) {
	            return c;
	        }
	    }
	    return null; 
	}

	public void calcularTotalTiempo() {
	    totalTiempo = 0;
	    for (Ciclista c : listaCiclistas) {
	        totalTiempo += c.getTiempoAcumulado();
	    }
	}
	

	}
	

