package cartes;
import personnage.Pirate;

public abstract class GestionCarte{
	private String typeCarte;
    private int pointCarte;
    private String descriptionCarte;
    private String nomCarte;

    protected GestionCarte(String nomCarte, String typeCarte, int pointCarte, String descriptionCarte) {
        this.nomCarte = nomCarte;
        this.pointCarte = pointCarte;
        this.descriptionCarte = descriptionCarte;
        this.typeCarte = typeCarte;
    }

    
    
    public String getTypeCarte() {
        return typeCarte;
    }

    public int getPointCarte() {
        return pointCarte;
    }

    public String getDescription() {
        return descriptionCarte;
    }

	public String getNomCarte() {
		return nomCarte;
	}



	public abstract void appliquerEffet(Pirate joueur);
	

}




