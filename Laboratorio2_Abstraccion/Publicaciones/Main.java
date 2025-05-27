package Publicaciones;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Investigador i1 = new Investigador("0000-0003-1234-5678", "Carla Oliveri", "Universidad de la Republica");
        Investigador i2 = new Investigador("0000-0001-8765-4321", "Alberto Santos", "Instituto Tecnico");

        ArticuloRevista a1 = new ArticuloRevista("10.1234/abc123", "Fundamentos de POO", new DTFecha(15, 5, 2023), "Programación Avanzada", "Introducción a los principios fundamentales de la programación orientada a objetos, explicando sus conceptos clave como clases, objetos, herencia y polimorfismo.");
        ArticuloRevista a2 = new ArticuloRevista("10.4567/jkl012", "Utilidad de diagramas UML", new DTFecha(10, 2, 2024), "Modelado de Software", "Ejercicio empírico de cómo los diagramas UML pueden ayudar en el proceso y documentación de software, cubriendo los tipos más importantes utilizados, como clases.");

        Libro l1 = new Libro("10.2345/def456", "Patrones de Diseño en c++", new DTFecha(20, 8, 2022), "Software Design", Arrays.asList("Diseño", "OOP", "Class"));
        Libro l2 = new Libro("10.5678/mno345", "Guía de UML", new DTFecha(20, 8, 2022), "IEEE", Arrays.asList("Diagrams", "UML", "Software", "Modelado"));

        PaginaWeb p1 = new PaginaWeb("10.3456/ghi789", "Diagramas para Principiantes", new DTFecha(20, 10, 2024), "www.umlparaprincipiantes.com", "En esta página web se presenta una guía completa sobre los diagramas UML, abordando los diagramas de casos de uso, de clases, de secuencia y de actividades.");

        i1.agregarPublicacion(a1);
        i1.agregarPublicacion(l1);
        i2.agregarPublicacion(a2);
        i2.agregarPublicacion(p1);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(l1);
        System.out.println(p1);
        
        
        Set<String> resultados = i1.listarPublicaciones(new DTFecha(1, 1, 2023), "java");
        System.out.println("Publicaciones de i1 con palabra 'java' después de 1/1/2023: " + resultados);
    }
}

