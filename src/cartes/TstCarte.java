package cartes;

public class TstCarte {
    public static void main(String[] args) {
        CartePopularite cartePop = new CartePopularite("Carte de popularité", 3, "Ceci est la description d'une carte de popularité !");
        //cartePop.afficherDescriptionCarte(cartePop);
        cartePop.utiliserCarte(cartePop);
    
        CarteAttaque carteAtta = new CarteAttaque("Carte d'attaque", 4,"Ceci est la description d'une carte d'attaque !");
        carteAtta.utiliserCarte(carteAtta);
    
    
    
    }
}