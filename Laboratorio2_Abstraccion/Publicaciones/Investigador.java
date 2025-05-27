package Publicaciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Investigador {
    private String ORCID;
    private String nombre;
    private String institucion;
    private List<Publicacion> publicaciones;

    public Investigador(String ORCID, String nombre, String institucion) {
        this.ORCID = ORCID;
        this.nombre = nombre;
        this.institucion = institucion;
        this.publicaciones = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion p) {
        publicaciones.add(p);
        p.agregarAutor(this);
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "ORCID: " + ORCID + "\n" +
               "Nombre: " + nombre + "\n" +
               "Institución: " + institucion;
    }


    public Set<String> listarPublicaciones(DTFecha desde, String palabra) {
        Set<String> resultados = new HashSet<>();
        for (Publicacion p : publicaciones) {
            if (p.getFecha().esPosteriorA(desde) && p.contienePalabra(palabra)) {
                resultados.add(p.getDoi());
            }
        }
        return resultados;
    }
}
