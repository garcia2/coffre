package etat;
import coffre.Coffre;


public abstract class Etat {
	
	public void oterLivre(Coffre coffre) {}

	public void remettreLivre(Coffre coffre) {}

	public void tournerChandelleVersDroite(Coffre coffre) {}

	public void tournerChandelleVersGauche(Coffre coffre) {}

	public void fermerCoffre(Coffre coffre) {}
	
	public boolean peutOterLivre() {
		return false;
	}
	
	public boolean peutRemettreLivre() {
		return false;
	}
	
	public boolean peutTournerChandelleVersDroite() {
		return false;
	}
	
	public boolean peutTournerChandelleVersGauche() {
		return false;
	}
	
	public boolean peutFermerCoffre() {
		return false;
	}
}
