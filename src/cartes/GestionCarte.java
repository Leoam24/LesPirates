package cartes;

public abstract class GestionCarte {
	private String nomCarte;
	
	protected GestionCarte(String nomCarte) {
		this.nomCarte = nomCarte;
	}

	
	
	public String getNomCarte() {
		return nomCarte;
	}
}
