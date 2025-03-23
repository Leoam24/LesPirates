package cartes;

import journalDeBord.JournalDeBord;
import personnage.MainJoueur;
import personnage.Pirate;
import java.util.Scanner;

public class Jeu {
    private JournalDeBord journal = JournalDeBord.getInstance();
    private Pirate pirate1 = new Pirate(journal.getNomPirate1());
    private Pirate pirate2 = new Pirate(journal.getNomPirate2());

    private MainJoueur mainPirate1 = new MainJoueur(pirate1.getNomJoueur());
    private MainJoueur mainPirate2 = new MainJoueur(pirate2.getNomJoueur());

    private Scanner scanner = new Scanner(System.in);



    public void deroulementJeu(Pirate joueurCourant, Pirate joueurAttendant) {
        MainJoueur mainJoueurCourant = (joueurCourant == pirate1) ? mainPirate1 : mainPirate2;
        MainJoueur mainJoueurAttendant = (joueurCourant == pirate2) ? mainPirate2 : mainPirate1;
        		
        journal.afficherMessage("\nVoici les cartes de " + joueurCourant.getNomJoueur() + " : ");
        mainJoueurCourant.afficherMain();

        int choix = -1;
        boolean choixValide = false;
        
        while (!choixValide) {
            journal.afficherMessage("Choisissez une carte à jouer (entrez un numéro) : ");
            if (scanner.hasNextInt()) {
                choix = scanner.nextInt();
                scanner.nextLine(); 
                if (choix >= 1 && choix <= mainJoueurCourant.getNbCartes()) {
                    choixValide = true;
                } else {
                    journal.afficherMessage("Numéro invalide. Réessayez.");
                }
            } else {
                journal.afficherMessage("Entrée invalide. Réessayez.");
                scanner.next(); 
            }
        }
      
        mainJoueurCourant.jouerCarteMain(choix, joueurCourant, joueurAttendant);
        mainJoueurCourant.piocher();
        mainJoueurAttendant.piocher();
    }


    public Pirate quiAGagne(Pirate joueurCourant, Pirate joueurAttendant) {
        if (joueurCourant.estPopulaire() || joueurAttendant.estMort()) {
            return joueurCourant;
        } else if (joueurAttendant.estPopulaire() || joueurCourant.estMort()) {
            return joueurAttendant;
        }
        return null;
    }

    public void lancerJeu() {
        // Initialisation des mains des joueurs
    	mainPirate1.initialiserPioche(pirate1.getNomJoueur());
        mainPirate2.initialiserPioche(pirate2.getNomJoueur());

        boolean partieFinie = false;
        Pirate joueurCourant = pirate1;
        Pirate joueurAttendant = pirate2;

        while (!partieFinie) {
            // Exécuter le tour de jeu
            deroulementJeu(joueurCourant, joueurAttendant);
            
            // Vérifier si un pirate a gagné
            Pirate gagnant = quiAGagne(joueurCourant, joueurAttendant);
            if (gagnant != null) {
                partieFinie = true;
                journal.afficherMessage("\n=====================================");
                journal.afficherMessage("      🎉 FIN DE LA PARTIE 🎉");
                journal.afficherMessage("=====================================");
                journal.afficherMessage("🏆 VICTOIRE ! 🏆");
                journal.afficherMessage("Le pirate " + gagnant.getNomJoueur() + " a remporté la partie ! 🎊");
                journal.afficherMessage("=====================================\n");
            } else {
            	journal.afficherMessages("\n####### Au tour de " + joueurAttendant.getNomJoueur() + " #######");
                // Alternance des joueurs
                Pirate temp = joueurCourant;
                joueurCourant = joueurAttendant;
                joueurAttendant = temp;
            }
        }
    }

    
}