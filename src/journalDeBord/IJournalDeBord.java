package journalDeBord;


public interface IJournalDeBord {
	
	String getNomPirate1();
	
	String getNomPirate2();
	
	void afficherDescriptionCarte(String description);
	
	void afficherNomCarte(String nomCarte);
	
	void afficherCaracteristiqueCarte(int point, String typeCarte);
	
	void afficherCarte(String description, String nom, int pointCarte); 
		
	void afficherMessage(String message);
	
	void afficherMessages(String message);

	void afficherCartePiochee(String nomCarte);

	void afficherMain(String[] nomsCartes, int nbCarte);

	void afficherJouerCarte(String nomCarte, int pointsPopularite, String typeCarte);

	void afficherVictoire();
	
	static void afficherDegat(String message) {
	}
	static void afficherPopularite(String message) {
	}
	
}
