package MobilePhones;

public class IPhone extends SmartPhone {

	public IPhone(String model) {
		super("Apple", model);
		
	}
	
	void useFaceID() {
		System.out.println("Usando Face ID en" + model);
		
	}
	
	void makeCall(String number) {
		System.out.println("Llamando a" + number + "desde un IPhone.");
		
	}
}
