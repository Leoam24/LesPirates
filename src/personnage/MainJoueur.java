package personnage;
import java.util.Random;
import cartes.CarteAttaque;
import cartes.CartePopularite;
import cartes.EnumCarte;
import cartes.GestionCarte;

public class MainJoueur {
	private int nbMaxCarte = 3;
	private int nbCarte = 0;
	private EnumCarte[] main = new EnumCarte[nbMaxCarte];
	Random random = new Random();
	

	
	public void piocher() {
		int choixCarte;
		int nbCarte2 = nbCarte;
		for (int i = nbCarte2; i < nbMaxCarte; i++) {
			choixCarte = random.nextInt(4); // Tire entre 0 et 3 pour avoir seulement 4 cartes
	        main[i] = EnumCarte.values()[choixCarte]; // Sélectionne une carte parmi les 4 premières
	        nbCarte++;
			}
	}
	
	public void enleverCarte(int indexCarte) {
		main[indexCarte] = null;
		nbCarte--;
		
	}
	
	
	public EnumCarte getCarte(int indexCarte) {
	    return EnumCarte.values()[indexCarte];
	}

	public void setMain(EnumCarte[] main) {
		this.main = main;
	}
}
