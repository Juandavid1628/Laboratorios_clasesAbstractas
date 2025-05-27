package Publicaciones;

import java.util.ArrayList;
import java.util.List;

	public abstract class Publicacion {
	    protected String DOI;
	    protected String titulo;
	    protected DTFecha fecha;
	    protected List<Investigador> autores;

	    public Publicacion(String DOI, String titulo, DTFecha fecha) {
	        this.DOI = DOI;
	        this.titulo = titulo;
	        this.fecha = fecha;
	        this.autores = new ArrayList<>();
	    }

	    public void agregarAutor(Investigador autor) {
	        autores.add(autor);
	    }

	    public String getDoi() {
	        return DOI;
	    }

	    public DTFecha getFecha() {
	        return fecha;
	    }

	    public abstract boolean contienePalabra(String palabra);

	    public DTRefer getDT() {
	        List<String> nombres = new ArrayList<>();
	        for (Investigador inv : autores) {
	            nombres.add(inv.getNombre());
	        }
	        return new DTRefer(DOI, titulo, fecha, nombres);
	    }
	}



