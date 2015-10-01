public class Date {

	private int jour;
	private int mois;
	private int annee;
	private String langue;

	public static final String[] NOM_DES_MOIS = {"Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre"};
	public static final String[] NAME_OF_MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	/**
	*	Constructeur de la classe Date qui permet d'instancier la classe Date
	*	
	*	@param jour le jour de la date
	*	@param mois le mois de la date
	*	@param annee l'année de la date
	*/
	public Date (int jour, int mois, int annee, String langue) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
		this.langue = langue;
	}
	
	/**
	*	Méthode toString() de la classe qui permet de retourner l'objet sous forme de chaine de caractère
	*/
	public String toString() {
		if (langue.equals("-anglais"))
			return jour + " " + NAME_OF_MONTHS[mois-1] + " " + annee;
		return jour + " " + NOM_DES_MOIS[mois-1] + " " + annee;
	}

	public static void main(String args[]) {
		System.out.println("Jour : ");
		int entier1 = Clavier.readInt();
		System.out.println("Mois : ");
		int entier2 = Clavier.readInt();
		System.out.println("Année : ");
		int entier3 = Clavier.readInt();
		
		Date d = new Date(entier1, entier2, entier3, args[args.length-1]);
		System.out.println("Date : " + d);
	}
}
