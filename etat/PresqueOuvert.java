package etat;
import coffre.Coffre;


public class PresqueOuvert extends Visible {
	
	@Override
	public void tournerChandelleVersDroite(Coffre coffre) {
		coffre.setEtat(new Ouvert());
	}
	
	@Override
	public String toString() {
		return "PresqueOuvert";
	}

}
