package personnage;
import java.util.Random;

import cartes.CarteAttaque;
import cartes.CartePopularite;
import cartes.GestionCarte;

public class MainJoueur {
	private int nbMaxCarte = 4;
	private int nbCarte = 0;
	private GestionCarte[] main = new GestionCarte[nbMaxCarte];
	
	
	public void piocher() {
		int choixCarte;
		for(int i = nbCarte ; nbCarte < nbMaxCarte; nbCarte++, i++){
	        choixCarte = new Random().nextInt(2) + 1; // choisi une carte aleatoire
	        
	        if (choixCarte == 1) {
	            main[i] = new CartePopularite("Carte Popularité", 3, "Augmente la popularité !");
	        } 
	        else if(choixCarte == 2){
	            main[i] = new CarteAttaque("Carte Attaque", 2, "Permet de faire des degats aux enemis!");
	        }
		}
		
	}
	
	public void enleverCarte(int indexCarte) {
		main[indexCarte]=null;
		nbCarte--;
		
	}
	
	
	public GestionCarte[] getMain() {
		return main;
	}

	public void setMain(GestionCarte[] main) {
		this.main = main;
	}
}
