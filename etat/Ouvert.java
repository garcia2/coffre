package etat;
import coffre.Coffre;


public class Ouvert extends Etat {

	@Override
	public void fermerCoffre(Coffre coffre) {
		coffre.setEtat(new PresqueOuvert());
	}
	
	@Override
	public String toString() {
		return "Ouvert";
	}

	@Override
	public boolean peutFermerCoffre() {
		return true;
	}
}
