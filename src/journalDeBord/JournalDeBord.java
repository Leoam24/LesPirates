package journalDeBord;

import cartes.CarteAttaque;
import cartes.CartePopularite;
import cartes.GestionCarte;

public abstract class JournalDeBord implements IJournalDeBord{

	public void afficherDescriptionCarte(GestionCarte carte) {
		System.out.println(carte.getDescription());
	}
	
	public void utiliserCarte(GestionCarte carte) {
		if(carte instanceof CartePopularite){
			carte.afficherDescriptionCarte(carte);
			System.out.println("Vous gagnez " + carte.getPointCarte() + " points de popularités.");
			}
		
		else if (carte instanceof CarteAttaque) {
			carte.afficherDescriptionCarte(carte);
			System.out.println("Votre attaque fait " + carte.getPointCarte() + " de dégats.");
			
		}
		
	}
}
