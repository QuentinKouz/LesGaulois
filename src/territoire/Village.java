package territoire;

import personnages.Gaulois;
import personnages.Chef;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	Gaulois[] villageois;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.villageois = new Gaulois[nbVillageoisMaximum];
		this.nom = nom;
	
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois newGaulois) {	
		this.villageois[nbVillageois] = newGaulois;
		this.nbVillageois += 1;
	}
	
	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + this.chef + " vivent les légendaires gaulois : ");
		for (int i = 0; i < nbVillageois; i++) {
				System.out.println("- "+ villageois[i].getNom());
		}
	}
	
	
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
//		Gaulois gaulois = village.trouverHabitant(30);
//		quand on cherche à trouver le 30 habitant, une erreur apparait 
//		et est dû au faite qu'on cherche plus loin que la taille du tableau
		Chef abraracourcix = new Chef("Abraracourcix", 8,1, village);
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(asterix);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//		La réponse est null puisqu'il y a qu'un seul gaulois dans le village
//		et il est à la case 0 et non pas à la case 1
		Gaulois obelix = new Gaulois("Obélix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
}
