package Medicina;
import java.util.Vector;

public class PruebaMedicina {

	public static void main(String[] args) {

				Vector<Medico> listaMedicos = new Vector<>();
				
				Medico medico1 = new Medico();
				listaMedicos.add(medico1);					
							
				Ortopedista op1 = new Ortopedista();
				listaMedicos.add(op1);
	
				Pediatra p1 = new Pediatra();
				listaMedicos.add(p1);
				
		for(int i=0; i < listaMedicos.size(); i++) {
			Medico a =(Medico)listaMedicos.elementAt(i);
				if(a instanceof Ortopedista) {
					System.out.println("El objeto en el indice" + i + " es de la clase ortopedista");
					continue;
				}
				if(a instanceof Pediatra) {
					System.out.println("El objeto en el indice" + i + " es de la clase pediatra");
					continue;
				}
				if(a instanceof Medico) {
					System.out.println("El objeto en el indice" + i + " es de la clase medico");
					continue;
				}
		}
	}
}


