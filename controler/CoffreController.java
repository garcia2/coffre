package controler;

import coffre.Coffre;
import graphique.FenetreChateauMedieval;
import graphique.FenetreChienGentil;
import graphique.FenetreEtat;
import graphique.FenetreLapinTueur;
import graphique.Observateur;

public class CoffreController implements StrategyController {

	private Coffre coffre;
	
	public CoffreController() {
		coffre = new Coffre();
		coffre.attacher(new FenetreChateauMedieval(this));
		coffre.attacher(new FenetreChienGentil());
		coffre.attacher(new FenetreLapinTueur());
		coffre.attacher(new FenetreEtat());
	}
	
	@Override
	public void oterLivre() {
		// TODO Auto-generated method stub
		coffre.oterLivre();
	}

	@Override
	public void remettreLivre() {
		// TODO Auto-generated method stub
		coffre.remettreLivre();
	}

	@Override
	public void tournerChandelleVersDroite() {
		// TODO Auto-generated method stub
		coffre.tournerChandelleVersDroite();
	}

	@Override
	public void tournerChandelleVersGauche() {
		// TODO Auto-generated method stub
		coffre.tournerChandelleVersGauche();
	}

	@Override
	public void fermerCoffre() {
		// TODO Auto-generated method stub
		coffre.fermerCoffre();
	}

	@Override
	public boolean peutOterLivre() {
		// TODO Auto-generated method stub
		return coffre.peutOterLivre();
	}

	@Override
	public boolean peutRemettreLivre() {
		return coffre.peutOterLivre();
	}

	@Override
	public boolean peutTournerChandelleVersDroite() {
		return coffre.peutTournerChandelleVersDroite();
	}

	@Override
	public boolean peutTournerChandelleVersGauche() {
		return coffre.peutTournerChandelleVersGauche();
	}

	@Override
	public boolean peutFermerCoffre() {
		return coffre.peutFermerCoffre();
	}

	@Override
	public void attacher(Observateur o) {
		coffre.attacher(o);
	}
	
	public static void main(String[] args) {
		new CoffreController();
	}
	

}
