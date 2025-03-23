package cartes;

import journalDeBord.JournalDeBord;
import personnage.Pirate;

public class CarteAttaque extends GestionCarte {
    
	public CarteAttaque(String nomCarte, String typeCarte, int pointCarte, String descriptionCarte) {
        super(nomCarte, typeCarte, pointCarte, descriptionCarte);
    }
    
    @Override
    public void appliquerEffet(Pirate adversaire) {
        adversaire.perdreVie(getPointCarte());
        JournalDeBord.afficherDegat("La carte " + getNomCarte() + " inflige " + getPointCarte() + 
                                    " points de dégâts. " + adversaire.getNomJoueur() + " a maintenant " + 
                                    adversaire.getPointsDeVie() + " PV restants.");
    }
}