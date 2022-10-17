package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int nbTrophees;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];


	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	
	
//	private String prendreParole() {
//		return  "Le gaulois " + nom + " : ";
//	}

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans le m�choire de " + romain.getNom());
//		romain.recevoirCoup(force / 3);
//	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion =  forcePotion;
		this.parler("Merci Druide, je sens que ma force est "+ forcePotion + " fois d�cupl�e");
	}
	
	
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}

	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		Equipement[] newTrophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; newTrophees != null && i < newTrophees.length; i++, nb_trophees++) {
			this.trophees[nbTrophees] = newTrophees[i];
		}
	}

	
	

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("minus", 8);
		asterix.prendreParole();
		asterix.parler("Salut !");
		asterix.frapper(minus);
	}
	

	
}
