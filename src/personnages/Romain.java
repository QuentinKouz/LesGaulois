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
		switch (nbEquipement) {
			case 2: 
				System.out.println("Le soldat " + this.getNom() + " est d�j� bien prot�g� !");
				break;
			case 1:
				if (equipements[0] == equipement) {
					System.out.println("Le soldat " + this.getNom() + " poss�de d�j� un " + equipement.nom);
					break;
				}
			default:
				equipements[nbEquipement] = equipement;
				nbEquipement += 1;
				System.out.println("Le soldat " + this.getNom() + " s'�quipe avec un " + equipement.nom + ".");
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
