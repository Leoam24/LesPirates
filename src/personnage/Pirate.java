package personnage;

import cartes.GestionCarte;

public class Pirate {
    private String nom;
    private int pointsDeVie = 5;
    private int pointsDePop = 0;
    private MainJoueur main = new MainJoueur(nom);
    
    public Pirate(String nom) {
        this.nom = nom;
    }

    public String getNomJoueur() {
    	return this.nom;
    }
    
    public int getPointsDeVie() {
        return pointsDeVie;
    }
    
    
    public int getPointDePop() {
    	return pointsDePop;
    }
    
    public void gagnerPopularite(int pointsPopularite) {
		pointsDePop += pointsPopularite;
	}

	public void perdrePopularite(int pointsPopularite) {
		pointsDePop -= pointsPopularite;

	}
    
    public void perdreVie(int vie) {
    	pointsDeVie -= vie;
		if (pointsDeVie < 0)
			pointsDeVie = 0;
	}

	public void gagnerVie(int vie) {
		pointsDeVie += vie;
	}
	
	public boolean estMort() {
		return pointsDeVie <= 0;
	}

	public boolean estPopulaire() {
		return pointsDePop >= 5;
	}
	
	public void jouerCarte(Pirate adversaire, GestionCarte carte) {
		if(carte.getTypeCarte().equals("CartePopularité")) {
			carte.appliquerEffet(this);
			}
		else {
			carte.appliquerEffet(adversaire);
		}
	}
  
}


