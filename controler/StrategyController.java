package controler;

import graphique.Observateur;

public interface StrategyController {

	public abstract void oterLivre();

	public abstract void remettreLivre();

	public abstract void tournerChandelleVersDroite();

	public abstract void tournerChandelleVersGauche();

	public abstract void fermerCoffre();
	
	public boolean peutOterLivre();	
	
	public boolean peutRemettreLivre();
	
	public boolean peutTournerChandelleVersDroite();
	
	public boolean peutTournerChandelleVersGauche();
	
	public boolean peutFermerCoffre();
	
	public void attacher(Observateur o);
	
	
}
