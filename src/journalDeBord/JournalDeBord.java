package journalDeBord;
import java.util.Scanner;


public class JournalDeBord implements IJournalDeBord{
	private String nomPirate1;
	private String nomPirate2;
	private static final Scanner scanner = new Scanner(System.in);
    private static JournalDeBord instance = null;

    public JournalDeBord() { 
    	System.out.println("🏴‍☠️ Bienvenue dans le jeu *Les Pirates* !");
    	System.out.print("Joueur 1, quel est votre prénom : ");
        this.nomPirate1 = scanner.nextLine();
        System.out.print("Joueur 2, quel est votre prénom : ");
        this.nomPirate2 = scanner.nextLine();
    }

    public static JournalDeBord getInstance() {
        if (instance == null) {
            instance = new JournalDeBord();
        }
        return instance;
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
			System.out.println("\n=====================================");
			System.out.println("      DÉTAILS SUR LA CARTE");
			System.out.println("=====================================");
			System.out.println("Type : Attaque");
			System.out.println("-------------------------------------");

			afficherDescriptionCarte("Description : " + description);
			System.out.println("-------------------------------------");

			System.out.println("Caractéristiques de la carte :");
			afficherCaracteristiqueCarte(pointCarte, typeCarte);

			System.out.println("=====================================");
		}
		else if (typeCarte.equals("CartePopularite")) {
			System.out.println("\n=====================================");
			System.out.println("      DÉTAILS SUR LA CARTE");
			System.out.println("=====================================");
			System.out.println("Type : Popularité : ");
			System.out.println("-------------------------------------");

			afficherDescriptionCarte("Description : " + description);
			System.out.println("-------------------------------------");

			System.out.println("Caractéristiques de la carte :");
			afficherCaracteristiqueCarte(pointCarte, typeCarte);

			System.out.println("=====================================");
			
		}
	}

	public void afficherMessage(String message) {
		System.out.println(message);
	}
	public void afficherMessages(String message) {
		System.out.print(message);
	}
	
	@Override
	public void afficherCartePiochee(String nomCarte) {
		System.out.println("\nVous avez pioché : " + nomCarte);
	}

	@Override
	public void afficherMain(String[] nomsCartes, int nbCarte) {
		for (int i = 0; i < nbCarte; i++) {
			System.out.println((i + 1) + ". " + nomsCartes[i] );
		}
	}

	@Override
	public void afficherJouerCarte(String nomCarte, int pointsCarte, String typeCarte) {
		System.out.println("\nVous avez joué : " + nomCarte);
		if(typeCarte.equals("CartePopularite")) {
			System.out.println("Vous avez maintenant " + pointsCarte + " points de popularité.");
		}
		else if (typeCarte.equals("CarteAttaque") )
			System.out.println("Vous avez infligé " + pointsCarte + " à votre adversaire !");
	}

	@Override
	public void afficherVictoire() {
		System.out.println("\nBravo ! Vous avez gagné en atteignant 5 points de popularité ! ");
	}
	
	public static void afficherDegat(String message) {
		System.out.println(message);
	}
	public static void afficherPopularite(String message) {
		System.out.println(message);
	}
}
