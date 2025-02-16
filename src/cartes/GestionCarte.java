package cartes;

import journalDeBord.JournalDeBord;

public abstract class GestionCarte extends JournalDeBord {
    private String nomCarte;
    private int pointCarte;
    private String descriptionCarte;

    protected GestionCarte(String nomCarte, int pointCarte, String descriptionCarte) {
        this.nomCarte = nomCarte;
        this.pointCarte = pointCarte;
        this.descriptionCarte = descriptionCarte;
    }

    public String getNomCarte() {
        return nomCarte;
    }

    public int getPointCarte() {
        return pointCarte;
    }

    public String getDescription() {
        return descriptionCarte;
    }
}