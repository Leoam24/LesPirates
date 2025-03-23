package personnage;
import java.util.Random;

import cartes.CarteAttaque;
import cartes.CartePopularite;
import cartes.EnumCarte;
import cartes.GestionCarte;
import journalDeBord.JournalDeBord;

public class MainJoueur {
	
	private String nomJoueur;
	private int nbMaxCarte = 4;
	private int nbCarte = 0;
	private EnumCarte[] main = new EnumCarte[nbMaxCarte];
	Random random = new Random();
	public JournalDeBord journal;
	
	public MainJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
		this.journal = JournalDeBord.getInstance();
	}
	
	public void initialiserPioche(String joueur) {
		if (nbCarte >= nbMaxCarte) {
            journal.afficherMessage(joueur + ", votre main est pleine !");
            return;
        }
		journal.afficherMessage("\n" + joueur +"  pioche sa main");

	    for (int i = nbCarte; i < nbMaxCarte; i++) {  
	        int choixCarte = random.nextInt(4);  // Limité aux 4 premières cartes  
	        EnumCarte carteTiree = EnumCarte.values()[choixCarte];  

	        main[i] = carteTiree;  // Ajout dans la main  
	        nbCarte++;  // Augmente le nombre de cartes  
	    }  

	    // Affichage final de la main
	    String[] nomsCartes = new String[nbCarte];
	    for (int i = 0; i < nbCarte; i++) {
	        nomsCartes[i] = main[i].getNom();
	    }
	    System.out.print("\n" + joueur + " ");
	    journal.afficherMain(nomsCartes, nbCarte);
	}
	
	public void piocher(String joueur) {
		if (nbCarte >= nbMaxCarte) {
        journal.afficherMessage(nomJoueur + ", votre main est déjà pleine !");
        return;
		}

    journal.afficherMessage(joueur + " pioche une nouvelle carte...");

    int choixCarte = random.nextInt(4);
    EnumCarte carteTiree = EnumCarte.values()[choixCarte];

    // Trouver un emplacement vide pour ajouter la carte
    for (int i = 0; i < nbMaxCarte; i++) {  
        if (main[i] == null) {  
            main[i] = carteTiree;  
            nbCarte++;
            break;
        }
    }

    // Affichage de la carte piochée
    journal.afficherCartePiochee(carteTiree.getNom());
    System.out.print("\n" + joueur + " ");
    afficherMain();
}
	
	public void jouerCarteMain(int indexCarte, Pirate joueurCourant, Pirate adversaire) {
	    if (indexCarte < 0 || indexCarte >= nbMaxCarte || main[indexCarte] == null) {
	        journal.afficherMessage("Carte invalide. Choisissez une carte existante !");
	        return;
	    }
		int pointCarte = -1;
		GestionCarte carte = main[indexCarte-1].getCarte();
		//EnumCarte enumCarte = main[indexCarte];
		//GestionCarte carte = enumCarte.getCarte();
		String nomCarte = carte.getNomCarte();
		main[indexCarte-1] = null;
		this.nbCarte--;

		if( carte instanceof CartePopularite) {
			pointCarte = carte.getPointCarte();
			carte.appliquerEffet(joueurCourant);
		}
		else if (carte instanceof CarteAttaque){
			pointCarte = carte.getPointCarte();
			carte.appliquerEffet(adversaire);
		}
		   // Affichage de la carte joué
	    //journal.afficherCartePiochee(carte.getNomCarte());
	    journal.afficherCarte(carte.getDescription(),
	                          carte.getTypeCarte(),
	                          carte.getPointCarte());
		
	    journal.afficherJouerCarte(nomCarte, pointCarte, carte.getTypeCarte());
		afficherMain();
	}
	
	public EnumCarte getCarte(int indexCarte) { // pour afficher la main
	    return main[indexCarte];
	}
	
	public EnumCarte[] getMain() {
		return this.main;
	}

	public void setMain(EnumCarte[] main) {
		this.main = main;
	}
	
	public void afficherMain() {
	    if (nbCarte == 0) {
	        journal.afficherMessage(nomJoueur + ", votre main est vide !");
	        return;
	    }
	    // Calcul du nombre réel de cartes
	    int nbCartesValides = 0;
	    for (int i = 0; i < nbMaxCarte; i++) {  
	        if (main[i] != null) {  
	            nbCartesValides++;
	        }
	    }
	    // Création du tableau avec la bonne taille
	    String[] nomsCartes = new String[nbCartesValides]; 
	    int index = 0;
	    
	    for (int i = 0; i < nbMaxCarte; i++) {  
	        if (main[i] != null) {  
	            nomsCartes[index] = main[i].getNom();
	            index++;
	        }
	    }

	    journal.afficherMain(nomsCartes, nbCartesValides);
	}
	public int getNbCartes() {
		return nbCarte;
	}
}
