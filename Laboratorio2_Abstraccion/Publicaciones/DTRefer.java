package Publicaciones;

import java.util.List;

public class DTRefer {
    public String DOI;
    public String titulo;
    public DTFecha fecha;
    public List<String> autores;

    public DTRefer(String DOI, String titulo, DTFecha fecha, List<String> autores) {
        this.DOI = DOI;
        this.titulo = titulo;
        this.fecha = fecha;
        this.autores = autores;
    }

    @Override
    public String toString() {
        return "DOI: " + DOI + "\nTítulo: " + titulo + "\nFecha: " + fecha + "\nAutores: " + autores;
    }
}

