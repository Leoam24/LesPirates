package personnage;
import java.util.Random;
import cartes.EnumCarte;
import journalDeBord.JournalDeBord;

public class MainJoueur {
	private int nbMaxCarte = 4;
	private int nbCarte = 0;
	private EnumCarte[] main = new EnumCarte[nbMaxCarte];
	Random random = new Random();
	public JournalDeBord journal = new JournalDeBord();

	
	public void piocher() {
	    journal.afficherMessage("🔄 Pioche d'une carte en cours...");

	    for (int i = nbCarte; i < nbMaxCarte; i++) {  
	        int choixCarte = random.nextInt(4);  // Limité aux 4 premières cartes  
	        EnumCarte carteTiree = EnumCarte.values()[choixCarte];  

	        main[i] = carteTiree;  // Ajout dans la main  
	        nbCarte++;  // Augmente le nombre de cartes  

	        // Affichage via JournalDeBord  
	        journal.afficherCartePiochee(carteTiree.getNom());  
	        journal.afficherCarte(carteTiree.getCarte().getDescription(),
	                              carteTiree.getCarte().getTypeCarte(),
	                              carteTiree.getCarte().getPointCarte());

	        journal.afficherMessage("📜 Votre main contient maintenant " + nbCarte + " cartes.");
	    }  

	    // Affichage final de la main
	    String[] nomsCartes = new String[nbCarte];
	    for (int i = 0; i < nbCarte; i++) {
	        nomsCartes[i] = main[i].getNom();
	    }
	    journal.afficherMain(nomsCartes, nbCarte);
	}
	
	public void enleverCarte(int indexCarte) {
		main[indexCarte] = null;
		nbCarte--;
		
	}
	
	public EnumCarte getCarte(int indexCarte) { // pour afficher la main
	    return main[indexCarte];
	}

	public void setMain(EnumCarte[] main) {
		this.main = main;
	}
}
