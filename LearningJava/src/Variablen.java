
public class Variablen {

	public static void main(String[] args) {
		
		int zahl = 42; //+/- 2 Millionen
		long groﬂeZahl = 1317L; // sehr lange Zahl
		short kleineZahl = -7; //-32768 bis 32767
		byte sehrKleineZahl = -7; //-128 bis 127
		
		//float kommaZahl = 3.14; //wenige Nachkommastellen
		double genaueKommaZahlen = 3.14587; //mehr Nachkommastellen
		
		char zeichen = 'F'; //Ein Zeichen Buchstabe/Zahl/Sonderzeichen
		System.out.println(zeichen); //Ausgabe
		
		char zeichen2;
		zeichen2 = 'U';
		System.out.println(zeichen2); //Ausgabe
		
		zeichen2 = 'N'; // Inhalt von U auf N ‰ndern
		System.out.println(zeichen2); //Ausgabe
		System.out.println(zahl); //Ausgabe
	}
}
