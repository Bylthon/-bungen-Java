package katzen;

public class Hauskatze extends Katze { //diese klasse erbt von der hauptklasse Katze, deshalb extends um die hauskatze zu erweitern
	String name;
	
	//Konstruktor
	Hauskatze(String rasse, int gewicht, String derName){
		super(rasse, gewicht);//definiert in der superklasse katze
		this.name = derName;
		
	}
	void miau() {
		System.out.println("Miau");
	}
}
