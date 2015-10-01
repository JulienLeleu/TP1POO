import java.util.List;
import java.util.ArrayList;

public class ObjetNumerote {

	public final int number;
	public static int inc;
	public static List<ObjetNumerote> objetsNumerotes = new ArrayList<ObjetNumerote>();
	
	public ObjetNumerote() {
		number = ++inc;
		objetsNumerotes.add(this);
	}
	
	public String toString() {
		return  "Je suis le n° " + number;
	}
	
	public String InstanceMemo() {
		
		return null;
	}
	
	public static void main(String args[]) {
		ObjetNumerote n1 = new ObjetNumerote();
		ObjetNumerote n2 = new ObjetNumerote();
		ObjetNumerote n3 = new ObjetNumerote();
	}
}
