package katzen;

public class Raubkatze extends Katze {
	String beute;
	
	//Konstruktor
	Raubkatze(String rasse, int gewicht, String dieBeute){
		super(rasse, gewicht);
		this.beute = dieBeute;
	}

}
