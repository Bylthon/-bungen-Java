package katzen;
import java.util.ArrayList;

public class ArrayListGenerisch {

	public static void main(String[] args) {
		ArrayList<Siam> listekatze = new ArrayList<Siam>();
		
		listekatze.add(new Siam(4, "Pia"));
		listekatze.add(new Siam(6, "Guenther"));
		
		for(Siam element : listekatze) {
			element.miau();
		}

	}

}
