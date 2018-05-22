package computerBestellung;

public class Bestellung {

	public static void main(String[] args) {
		Computer gamingPc = new Computer("42GHz", "MSI970", 1337, 1.50f);
		Computer notebook = new Computer("2MHz", "750TI", 1, 13.37f );
		
		gamingPc.daten();
		notebook.daten();
		
		gamingPc.prozessor = "8GHz";
		gamingPc.daten();
	}

}
