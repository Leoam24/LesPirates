package personnage;
import journalDeBord.JournalDeBord;

public class Pirate extends JournalDeBord{
	private int nbPointDeVie = 5;
	private JournalDeBord journal = new JournalDeBord();
	
	
	public int getNbPointDeVie() {
		return this.nbPointDeVie;
	}
	
}
