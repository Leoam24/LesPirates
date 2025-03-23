package cartes;

public class TstCarte {
    
	/*
	public static void mainA(String[] args) {

    	JournalDeBord journal = new JournalDeBord();
    	
    	journal.commencerJeu();
    	String nomJoueur1 = journal.getNomPirate1();
    	String nomJoueur2 = journal.getNomPirate2();
    	
    	MainJoueur mainJoueur1 = new MainJoueur(journal.getNomPirate1());
    	MainJoueur mainJoueur2 = new MainJoueur(journal.getNomPirate2());
    	
    	mainJoueur1.initialiserPioche(journal.getNomPirate1());
    	mainJoueur2.initialiserPioche(journal.getNomPirate2());
    	
    	journal.afficherMessage(nomJoueur1 + " quelle carte voulez vous jouer ?");
    	
    	
    	mainJoueur1.jouerCarteMain(1);
    	
    	
    	mainJoueur1.piocher(nomJoueur1);
    	
    }*/
    
    public static void main(String[] args) {
        Jeu jeu = new Jeu();
        jeu.lancerJeu();
    }
}