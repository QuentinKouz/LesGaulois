package personnages;

public enum Equipement {
	CASQUE("casque"),BOUCLIER("bouclier");
	private String nom;
	
	public Equipement(String nomEquipment) {
		this.nom = nomEquipment;
	}
	
	@Override
	public String toString() {
		return "Equipement [nom=" + nom + "]";
	}
	
	public static void main(String[] args) {
		Equipement casque = Equipement.CASQUE;
		System.out.println(casque.nom);
	}
}
