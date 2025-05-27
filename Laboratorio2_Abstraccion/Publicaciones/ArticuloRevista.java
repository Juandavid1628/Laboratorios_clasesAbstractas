package Publicaciones;

public class ArticuloRevista extends Publicacion {
    private String revista;
    private String extracto;

    public ArticuloRevista(String doi, String titulo, DTFecha fecha, String revista, String extracto) {
        super(doi, titulo, fecha);
        this.revista = revista;
        this.extracto = extracto;
    }

    
    public String getRevista() {
		return revista;
	}


	public void setRevista(String revista) {
		this.revista = revista;
	}


	public String getExtracto() {
		return extracto;
	}


	public void setExtracto(String extracto) {
		this.extracto = extracto;
	}

	@Override
    public boolean contienePalabra(String palabra) {
        return extracto.contains(palabra);
    }
	
	@Override
	public String toString() {
	    return "Tipo: --Articulo de Revista--\n" +
	           "DOI: " + DOI + "\n" +
	           "Título: " + titulo + "\n" +
	           "Fecha: " + fecha + "\n" +
	           "Revista: " + revista + "\n" +
	           "Extracto: " + extracto;
	}

}

