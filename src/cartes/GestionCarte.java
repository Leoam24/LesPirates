package cartes;

public abstract class GestionCarte {
	private String nomCarte;
	private int pointCarte;
	private String descriptionCarte;
	
	protected GestionCarte(String nomCarte, int pointCarte, String descriptionCarte ) {
		this.nomCarte = nomCarte;
		this.pointCarte = pointCarte;
		this.descriptionCarte = descriptionCarte;
	}
	
	public String getNomCarte() {
		return nomCarte;
	}
	
	abstract int getPointCarte();
	
}
