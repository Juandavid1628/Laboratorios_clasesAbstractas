package Publicaciones;

public class PaginaWeb extends Publicacion {
    private String url;
    private String contenidoExtraido;

    public PaginaWeb(String doi, String titulo, DTFecha fecha, String url, String contenidoExtraido) {
        super(doi, titulo, fecha);
        this.url = url;
        this.contenidoExtraido = contenidoExtraido;
    }
    
    public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getContenidoExtraido() {
		return contenidoExtraido;
	}

	public void setContenidoExtraido(String contenidoExtraido) {
		this.contenidoExtraido = contenidoExtraido;
	}

	@Override
    public boolean contienePalabra(String palabra) {
        return contenidoExtraido.contains(palabra);
    }
	
	@Override
	public String toString() {
	    return "Tipo: --Página Web--\n" +
	           "DOI: " + DOI + "\n" +
	           "Título: " + titulo + "\n" +
	           "Fecha: " + fecha + "\n" +
	           "URL: " + url + "\n" +
	           "Contenido: " + contenidoExtraido;
	}

}

