package personnages;
import personnages.Equipement;

public class Romain {
	private String nom;
	private int force;
	Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		assert (force >= 0): "La force est nï¿½gative";
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "ï¿½ " + texte + "ï¿½");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aï¿½e");
		} else {
			parler("J'abandonne...");
		}
	}
	

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
			case 2: 
				System.out.println("Le soldat " + this.getNom() + " est déjà bien protégé !");
				break;
			case 1:
				if (equipements[0] == equipement) {
					System.out.println("Le soldat " + this.getNom() + " possède déjà un " + equipement.nom);
					break;
				}
			default:
				equipements[nbEquipement] = equipement;
				nbEquipement += 1;
				System.out.println("Le soldat " + this.getNom() + " s'équipe avec un " + equipement.nom + ".");
				break;
				
		}
				
			
	}
	
		public static void main(String[] args) {
			Romain minus = new Romain("Minus",5);
			minus.sEquiper(Equipement.CASQUE);
			minus.sEquiper(Equipement.CASQUE);
			minus.sEquiper(Equipement.BOUCLIER);
			minus.sEquiper(Equipement.BOUCLIER);
			
			
		}

}
