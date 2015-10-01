import java.util.List;
import java.util.ArrayList;

public class ObjetNumerote {

	private final int number;
	public static int INC;
	
	public ObjetNumerote() {
		number = ++INC;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String toString() {
		return  "Je suis le n° " + number;
	}
	
	public static void main(String args[]) {
		ObjetNumerote n1 = new ObjetNumerote();
		ObjetNumerote n2 = new ObjetNumerote();
		ObjetNumerote n3 = new ObjetNumerote();
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}
}
