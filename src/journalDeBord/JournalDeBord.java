package journalDeBord;



public class JournalDeBord implements IJournalDeBord{
	
	
	public void afficherDescriptionCarte(String description) {
		System.out.println(description);
	}
	
	public void afficherNomCarte(String nomCarte) {
		System.out.println("Le nom de la carte est :" + nomCarte);
	}
	
	public void afficherCaracteristiqueCarte(int point, String typeCarte) {
		if(typeCarte.equals("CarteAttaque")) {
			System.out.println("Vous pouvez faire " + point + " de dégats !");
		}
		else if(typeCarte.equals("CartePopularite")) {
			System.out.println("Vous gagnez " + point + " points de popularité !");
		}
	}
	
	public void afficherCarte(String description, String typeCarte, int pointCarte) {
		if(typeCarte.equals("CarteAttaque")) {
			System.out.println("Détails sur la carte Attaque : ");
			afficherDescriptionCarte(description);
			afficherCaracteristiqueCarte(pointCarte, typeCarte);
		}
		else if (typeCarte.equals("CartePopularite")) {
			System.out.println("Détails sur la carte Popularité : ");
			afficherDescriptionCarte(description);
			afficherCaracteristiqueCarte(pointCarte, typeCarte);
			
		}
		
		
	}
	
/*	
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
	// ici ca serait plutot une carte venant de la classe main d'un joueur pour differencier qui attaque de qui prend les degats
	public void prendreDegats(GestionCarte carte, Pirate joueur) {
		if(carte.getPointCarte() >= joueur.getNbPointDeVie()) {
			System.out.println();
			}
	}*/
}
