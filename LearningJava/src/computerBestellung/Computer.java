package computerBestellung;

public class Computer {
	
	String prozessor;
	String grafikkarte;
	int arbeitsspeicher;
	float preis;


	Computer(String derprozessor, String diegrafikkarte, int derarbeitsspeicher, float derpreis){
		prozessor = derprozessor;
		grafikkarte = diegrafikkarte;
		arbeitsspeicher = derarbeitsspeicher;
		preis = derpreis;
	}
	
	void daten() {
		System.out.println("Prozessor: " + prozessor);
		System.out.println("Grafikkarte: " + grafikkarte);
		System.out.println("Arbeitsspeicher: " + arbeitsspeicher + "GB");
		System.out.println("Preis: " + preis + " Euro");
	}
}