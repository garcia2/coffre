package etat;
import coffre.Coffre;


public class Visible extends Etat {

	@Override
	public void remettreLivre(Coffre coffre) {
		coffre.setEtat(new CacheParBibliotheque());
		coffre.setChienLibere(false);
	}

	@Override
	public void tournerChandelleVersGauche(Coffre coffre) {
		coffre.setEtat(new Bloque());
		coffre.setLapinLibere(true);
	}
	
	@Override
	public boolean peutRemettreLivre() {
		return true;		
	}
	
	@Override
	public boolean peutTournerChandelleVersDroite() {
		return true;
	}
	
	@Override
	public boolean peutTournerChandelleVersGauche() {
		return true;
	}

}
