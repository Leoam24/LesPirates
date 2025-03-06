package cartes;
import java.util.Scanner;
import journalDeBord.JournalDeBord;
import personnage.MainJoueur;


public class TstCarte {
    public static void main(String[] args) {
    	JournalDeBord journal = new JournalDeBord();
    	MainJoueur main1 = new MainJoueur();
    	
    	journal.commencerJeu();
    	
    	main1.piocher();
    	
    }
}