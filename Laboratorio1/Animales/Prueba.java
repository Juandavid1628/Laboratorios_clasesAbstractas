package Animales;
import Animales.Animales;

public class Prueba {

	public static void main(String[] args) {
		Animales[] animales = new Animales[4];
		animales[0] = new Gato();
		animales[1] = new Perroo();
		animales[2] = new Lobo();
		animales[3] = new Leon();
		
		for(int i = 0; i < animales.length; i++) {
			System.out.println(animales[i].getNombreCientifico());
			System.out.println("Sonido: " + animales[i].getSonido());
			System.out.println("Alimentos: " + animales[i].getAlimentos());
			System.out.println("Hábitat: " + animales[i].getHabitat());
			System.out.println();
		}
		

	}
}
