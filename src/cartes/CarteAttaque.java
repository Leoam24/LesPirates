package cartes;

import journalDeBord.IJournalDeBord;

public class CarteAttaque extends GestionCarte implements IJournalDeBord {
	private int pointAttaque;
	
	protected CarteAttaque(String nomCarte, int pointAttaque, String descriptionCarte) {
		super(nomCarte, pointAttaque, descriptionCarte);
		
	}

	@Override
	int getPointCarte() {
		return this.pointAttaque;
	}
	
	@Override
	public void afficherDescriptionCarte(GestionCarte carte) {
		if(carte.getNomCarte().equals("Carte d'attaque")) {
			System.out.println("Au cours d'un abordage, le pirate fait preuve d'une grande bravoure et gagne " + carte.getPointCarte() + "points de " + carte.getNomCarte() + ".");
		}
	}
}
