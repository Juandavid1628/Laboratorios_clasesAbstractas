package Publicaciones;

import java.util.List;

public class Libro extends Publicacion {
    private String editorial;
    private List<String> palabrasClave;

    public Libro(String doi, String titulo, DTFecha fecha, String editorial, List<String> palabrasClave) {
        super(doi, titulo, fecha);
        this.editorial = editorial;
        this.palabrasClave = palabrasClave;
        
    }
    
        public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public List<String> getPalabrasClave() {
		return palabrasClave;
	}

	public void setPalabrasClave(List<String> palabrasClave) {
		this.palabrasClave = palabrasClave;
	}

	@Override
    public boolean contienePalabra(String palabra) {
        return palabrasClave.contains(palabra);
    }
	
	@Override
	public String toString() {
	    return "Tipo: --Libro--\n" +
	           "DOI: " + DOI + "\n" +
	           "Título: " + titulo + "\n" +
	           "Fecha: " + fecha + "\n" +
	           "Editorial: " + editorial + "\n" +
	           "Palabras clave: " + String.join(", ", palabrasClave);
	}

}

