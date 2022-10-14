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
			if (this.equipements[0] == equipement.nom){
				System.out.println("Le soldat" + this.nom + "possède déjà un " + equipement.nom + " !");
			}
			else {
				this.nbEquipement = 2;
				equipements[this.nbEquipement] = equipement;
				System.out.println("Le soldat " + this.nom + "s'équipe avec un " + equipement.nom + ".");
			}
		case 0:
			this.nbEquipement = 2;
			equipements[this.nbEquipement] = equipement;
			System.out.println("Le soldat " + this.nom + "s'équipe avec un " + equipement.nom + ".");
		
		default:
			System.out.println("Le soldat " + this.nom + " ne peux pas s'équiper de cet équipement");
		}
	}
	
		public static void main(String[] args) {
			Romain minus = new Romain("Minus",5);
			Equipement casque = Equipement.CASQUE;
			Equipement bouclier = Equipement.BOUCLIER;
			minus.sEquiper(casque);
			minus.sEquiper(casque);
			minus.sEquiper(bouclier);
			minus.sEquiper(bouclier);
			
			
		}

}
