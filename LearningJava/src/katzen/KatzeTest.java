package katzen;

public class KatzeTest {

	public static void main(String[] args) {
		Siam katze = new Siam(5, "Hans");
		katze.miau();
		
		Tiger raubkatze = new Tiger(12);
		System.out.println(raubkatze.gewicht);
		
	}

}
