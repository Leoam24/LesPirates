package journalDeBord;
import java.util.Scanner;


public class JournalDeBord implements IJournalDeBord{
	private String nomPirate1;
	private String nomPirate2;
	private static final Scanner scanner = new Scanner(System.in);
    private static JournalDeBord instance = null;

    public JournalDeBord() { 
    	System.out.print("Entrez le nom du premier pirate : ");
        nomPirate1 = scanner.nextLine();
        System.out.print("Entrez le nom du deuxième pirate : ");
        nomPirate2 = scanner.nextLine();
    }

    public static JournalDeBord getInstance() {
        if (instance == null) {
            instance = new JournalDeBord();
        }
        return instance;
    }
    
	@Override
	public void commencerJeu() {
		Scanner scanner = new Scanner(System.in);
	    
		this.afficherMessage("🏴‍☠️ Bienvenue dans le jeu *Les Pirates* !");
		    
		this.afficherMessage("Joueur 1, quel est votre prénom ?");
		nomPirate1 = scanner.next();
		this.afficherMessage("☠ C'est noté, " + nomPirate1 + " !");
		    
		this.afficherMessage("Joueur 2, quel est votre prénom ?");
		nomPirate2 = scanner.next();
		this.afficherMessage("☠ C'est noté, " + nomPirate2 + " !");
		    
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
		System.out.println("votre main :");
		for (int i = 0; i < nbCarte; i++) {
			System.out.println((i + 1) + ". " + nomsCartes[i]);
		}
	}

	@Override
	public void afficherJouerCarte(String nomCarte, int pointsCarte, String typeCarte) {
		System.out.println("\n Vous avez joué : " + nomCarte);
		if(typeCarte.equals("CartePopularite")) {
			System.out.println(" Vous avez maintenant " + pointsCarte + " points de popularité.");
		}
		else if (typeCarte.equals("CarteAttaque") )
			System.out.println(" Vous avez infligé " + pointsCarte + " à votre adversaire !");
	}

	@Override
	public void afficherVictoire() {
		System.out.println("\n Bravo ! Vous avez gagné en atteignant 5 points de popularité ! ");
	}
	
	public static void afficherDegat(String message) {
		System.out.println(message);
	}
	public static void afficherPopularite(String message) {
		System.out.println(message);
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

