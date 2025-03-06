package cartes;

public enum EnumCarte {
	DISCOURS_INSPIRANT(new CartePopularite("Discours inspirant", "CartePopularite", 1, 
			"Debout sur le pont, vous enflammez les cœurs avec vos mots ! L’équipage gronde d’enthousiasme, prêt à vous suivre jusqu’au bout du monde.")),
	
	REVOLTE_ORGANISE(new CartePopularite("Révolte organisé", "CartePopularite", 1, 
			"Dans l’ombre des cales, vous ralliez les mécontents. Quand le moment vient, le pont s’embrase : c’est l’heure de renverser le capitaine !")),
	
	COUP_DE_SABRE(new CarteAttaque("Coup de sabre", "CarteAttaque", 2,
			"Dans un éclair d’acier, votre lame fend l’air et trouve sa cible ! Un coup net, précis… et redoutable.")),
	
	ABORDAGE_REUSSI(new CartePopularite("Abordage réussi", "CartePopularite", 2, 
			"Dans un fracas de bois brisé et de cris, votre équipage prend d’assaut le navire ennemi ! Le butin est vôtre, et votre légende grandit.")),
	
	MAIN_DE_FER(new CartePopularite("Main de fer", "CartePopularite", 2, 
			"Vous dirigez votre équipage sans trembler, imposant respect et discipline. Ceux qui osent défier votre autorité apprennent vite à ne plus recommencer."));
	//Main de fer a modifier --> ajouter le fait de perdre 1 point de vie !
	
	private final GestionCarte carte;
	
	EnumCarte(GestionCarte carte) {
		this.carte = carte;
    }

    public GestionCarte getCarte() {
        return carte;
    }
    public String getNom() {
        return carte.getNomCarte();  
    }

}
