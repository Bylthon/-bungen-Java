
public class IfElse {

	public static void main(String[] args) {
		int zahl1 = 5;
		int zahl2 = 10;
		boolean bool = true;
		
		if(zahl1 > zahl2) {
			System.out.println("zahl1 ist größer als zahl2");
			System.out.println(zahl1 + ">" + zahl2);
		}
		if(zahl1 == zahl2) {
			System.out.println("zahl1 ist gleich der zahl2!");
			System.out.println(zahl1 + "==" + zahl2);
		}
		if(zahl1 >= zahl2) {
			System.out.println("zahl1 ist größer oder gleich der zahl2!");
			System.out.println(zahl1 + ">=" + zahl2);
		}
		if(zahl1<= zahl2) {
			System.out.println("zahl1 ist kleiner oder gleich der zahl2!");
			System.out.println(zahl1 + "<=" + zahl2);
		}
		if(zahl1<zahl2) {
			System.out.println("zahl1 ist kleiner als zahl2!");
			System.out.println(zahl1 + "<" + zahl2);
		}

	
			if (!bool) {
				System.out.println("boolean ist false!");
			}
			if(bool) {
				System.out.println("boolean ist true!");
			}
			else {
				System.out.println("Fehler!");
			}

	}
}


