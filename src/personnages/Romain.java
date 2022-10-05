package personnages;
import personnages.Equipement;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		assert (force >= 0): "La force est négative";
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
	}
	}
	
		public static void main(String[] args) {
			System.out.println("test");
			Romain romain = new Romain("Romain", 6);
			System.out.println(Equipement.BOUCLIER);
			System.out.println(Equipement.CASQUE);
		}

}
