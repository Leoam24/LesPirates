package cartes;

import journalDeBord.JournalDeBord;

public class TstCarte {
    public static void main(String[] args) {
        /*
    	CartePopularite cartePop = new CartePopularite("Carte de popularité", 3, "Ceci est la description d'une carte de popularité !");
        cartePop.afficherDescriptionCarte(cartePop.getDescription());
        //cartePop.utiliserCarte(cartePop);
    
        CarteAttaque carteAtta = new CarteAttaque("Carte d'attaque", 4,"Ceci est la description d'une carte d'attaque !");
        //carteAtta.utiliserCarte(carteAtta);
    */
    
    	JournalDeBord journal = new JournalDeBord();
    	
    	journal.afficherCarte("Blablabla description", "CarteAttaque", 3);
    
    }
}