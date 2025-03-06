package journalDeBord;
import java.util.Scanner;


public class JournalDeBord implements IJournalDeBord{
	private String nomPirate1;
	private String nomPirate2;
	
	public void commencerJeu() {
		Scanner scanner = new Scanner(System.in);
	    
		this.afficherMessage("🏴‍☠️ Bienvenue dans le jeu *Les Pirates* !");
		    
		this.afficherMessage("👤 Joueur 1, quel est votre prénom ?");
		nomPirate1 = scanner.next();
		this.afficherMessage("☠ C'est noté, " + nomPirate1 + " !");
		    
		this.afficherMessage("👤 Joueur 2, quel est votre prénom ?");
		nomPirate2 = scanner.next();
		this.afficherMessage("☠ C'est noté, " + nomPirate2 + " !");
		    
		// Fermeture du scanner si plus utilisé
		scanner.close();
	}
	@Override
	public String getNomPirate1() {
		return nomPirate1;
	}
	@Override
	public String getNomPirate2() {
		return nomPirate2;
	}
	@Override
	public void afficherDescriptionCarte(String description) {
		System.out.println(description);
	}
	
	@Override
	public void afficherNomCarte(String nomCarte) {
		System.out.println("Le nom de la carte est :" + nomCarte);
	}
	
	@Override
	public void afficherCaracteristiqueCarte(int point, String typeCarte) {
		if(typeCarte.equals("CarteAttaque")) {
			System.out.println("Vous pouvez faire " + point + " de dégats !");
		}
		else if(typeCarte.equals("CartePopularite")) {
			System.out.println("Vous gagnez " + point + " points de popularité !");
		}
	}

	@Override
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

	public void afficherMessage(String message) {
		System.out.println(message);
	}

	@Override
	public void afficherCartePiochee(String nomCarte) {
		System.out.println("\nVous avez pioché : " + nomCarte);
	}

	@Override
	public void afficherMain(String[] nomsCartes, int nbCarte) {
		System.out.println("\n Votre main :");
		for (int i = 0; i < nbCarte; i++) {
			System.out.println((i + 1) + ". " + nomsCartes[i]);
		}
	}

	@Override
	public void afficherJouerCarte(String nomCarte, int pointsPopularite) {
		System.out.println("\n Vous avez joué : " + nomCarte);
		System.out.println(" Vous avez maintenant " + pointsPopularite + " points de popularité.");
	}

	@Override
	public void afficherVictoire() {
		System.out.println("\n Bravo ! Vous avez gagné en atteignant 5 points de popularité ! ");
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

