import java.util.List;
import java.util.ArrayList;

public class InstanceMemo extends ObjetNumerote {
	
	public static List<ObjetNumerote> objetsNumerotes = new ArrayList<ObjetNumerote>();
	
	public InstanceMemo() {
		super();
		objetsNumerotes.add(this);
	}
	
	public static int nombreInstances() {
		return objetsNumerotes.size();
	}
	
	public static void afficherInstances() {
		int debut = 0;
		if(nombreInstances()>=10)
			debut = nombreInstances() - 10;
		for (int i = debut; i < objetsNumerotes.size(); i++) {
			System.out.println("Je suis l'instance numéro " + objetsNumerotes.get(i).getNumber());
		}
	}
}