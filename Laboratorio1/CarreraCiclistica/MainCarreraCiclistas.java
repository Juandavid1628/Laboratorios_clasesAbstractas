package CarreraCiclistica;


public class MainCarreraCiclistas {

	public static void main(String[] args) {
		
		Equipo equipo1 = new Equipo("Sky","Estados Unidos");
		
		Velocista v1 = new Velocista(123979, "Geranint Thomas", 320, 25);
		Escalador e1 = new Escalador(123980, "Egan Bernal", 25, 10);
		Contrarrelojista c1 = new Contrarrelojista(123981, "Jonathan Castroviejo", 120);
	
		equipo1.listaCiclistas.add(v1);
		equipo1.listaCiclistas.add(e1);
		equipo1.listaCiclistas.add(c1);
		
		System.out.println("equipo1: Equipo");
        System.out.println("nombre = " + equipo1.nombre );
        System.out.println("país = " + equipo1.pais);

        System.out.println("velocista1: Velocista");
        System.out.println("Identificador: " + v1.identificador);
        System.out.println("Nombre: " + v1.nombre);
        System.out.println("Potencia: " + v1.potenciaPromedio);
        System.out.println("Velocidad: " + v1.velocidadPromedio);
        System.out.println("Tiempo Acumulado: " + v1.tiempoAcumulado);

        System.out.println("escalador1: Escalador");
        System.out.println("Identificador:" + e1.identificador);
        System.out.println("Nombre: " + e1.nombre);
        System.out.println("Aceleración: " + e1.aceleracionPromedio);
        System.out.println("Grado de Rampa: " + e1.gradoRampa);
        System.out.println("Tiempo Acumulado: " + e1.tiempoAcumulado);

        System.out.println("contrarrelojista1: Contrarrelojista");
        System.out.println("Identificador: " + c1.identificador);
        System.out.println("Nombre: " + c1.nombre);
        System.out.println("VelocidadMáxima: " + c1.velocidadMaxima);
        System.out.println("Tiempo Acumulado:" + c1.tiempoAcumulado);
		
		
	}

}
