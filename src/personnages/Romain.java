package personnages;
import personnages.Equipement;

public class Romain {
	private String nom;
	private int force;
	Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		assert (force >= 0): "La force est n�gative";
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
	}
	
	public void sEquiper(Equipement equipement) {
		switch(this.nbEquipement) {
		case 2:
			System.out.println("Le soldat" + this.nom + "est déjà bien protégé !");
		case 1:
			switch(equipement) {
			case this.equipements[0]:
				System.out.println("Le soldat" + this.nom + "possède déjà un " + equipement);
			}
		}
	}
		public static void main(String[] args) {
			System.out.println("test");
			Romain romain = new Romain("Romain", 6);
			System.out.println(Equipement.BOUCLIER);
			System.out.println(Equipement.CASQUE);
		}

}
