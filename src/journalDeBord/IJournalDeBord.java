package journalDeBord;


public interface IJournalDeBord {
	
	void afficherDescriptionCarte(String description);
	
	void afficherNomCarte(String nomCarte);
	
	void afficherCaracteristiqueCarte(int point, String typeCarte);
	
	void afficherCarte(String description, String nom, int pointCarte); 
		
	void afficherMessage(String message);

	void afficherCartePiochee(String nomCarte);

	void afficherMain(String[] nomsCartes, int nbCarte);

	void afficherJouerCarte(String nomCarte, int pointsPopularite);

	void afficherVictoire();
	
}
