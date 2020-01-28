package etat;
import coffre.Coffre;


public class CacheParBibliotheque extends Etat {

	@Override
	public void oterLivre(Coffre coffre) {
		coffre.setEtat(new Ferme());
	}
	
	@Override
	public String toString() {
		return "CacheParBibliotheque";
	}
	
	@Override
	public boolean peutOterLivre() {
		return true;
	}
	

}
