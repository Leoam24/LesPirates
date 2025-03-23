package cartes;

import journalDeBord.JournalDeBord;
import personnage.Pirate;

public class CartePopularite extends GestionCarte {
    public CartePopularite(String nomCarte, String typeCarte, int pointPopularite, String descriptionCarte) {
        super(nomCarte, typeCarte, pointPopularite, descriptionCarte);
    }
    
    @Override
    public void appliquerEffet(Pirate joueur) {
        joueur.gagnerPopularite(getPointCarte());
        JournalDeBord.afficherPopularite("La carte " + getNomCarte() + " donne " + getPointCarte() + 
                                    " points de popularité. " + joueur.getNomJoueur() + " a maintenant " + 
                                    joueur.getPointDePop() + " de popularité");
    }


}
	