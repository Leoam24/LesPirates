package cartes;

import journalDeBord.JournalDeBord;
import personnage.MainJoueur;

public class TstCarte {
    public static void main(String[] args) {
    	
    	JournalDeBord journal = new JournalDeBord();
    	
    	EnumCarte mainDeFer = EnumCarte.MAIN_DE_FER;
    	//journal.afficherCarte(mainDeFer.getCarte().getDescription(), mainDeFer.getCarte().getTypeCarte(), mainDeFer.getCarte().getPointCarte());
    	
    	MainJoueur main1 = new MainJoueur();
    	
    	
    	main1.piocher();
    	for(int i = 0; i<5; i++) {
    		System.out.println(main1.getCarte(i));
    		
    	}
    	
    }
}