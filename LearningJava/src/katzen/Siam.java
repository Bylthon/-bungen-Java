package katzen;

public class Siam extends Hauskatze {
	Siam(int gewicht, String name){
		super("Siam", gewicht, name);
	}
	//Methode miau() aus der hauskatze wird �berschrieben 
	void miau() {
		System.out.println("Miau");
	}
}
