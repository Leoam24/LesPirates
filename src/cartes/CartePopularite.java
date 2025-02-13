package cartes;

import journalDeBord.IJournalDeBord;

public class CartePopularite extends GestionCarte implements IJournalDeBord {
	private int pointPopularite;
	private String descriptionCarte;
	
	protected CartePopularite(String nomCarte, int pointPopularite, String descriptionCarte) {
		super(nomCarte, pointPopularite, descriptionCarte);
	}
	
	@Override
	public int getPointCarte() {
		return this.pointPopularite;
	}
	@Override
	public String getDescription() {
		return this.descriptionCarte;
	}
	
}
