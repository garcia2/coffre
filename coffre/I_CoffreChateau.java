package coffre;
public interface I_CoffreChateau {

	public abstract void oterLivre();

	public abstract void remettreLivre();

	public abstract void tournerChandelleVersDroite();

	public abstract void tournerChandelleVersGauche();

	public abstract void fermerCoffre();

	public abstract boolean lapinEstLibere();

	public abstract boolean chienEstLibere();
	
	public abstract String nomEtat();
	
	public boolean peutOterLivre();	
	
	public boolean peutRemettreLivre();
	
	public boolean peutTournerChandelleVersDroite();
	
	public boolean peutTournerChandelleVersGauche();
	
	public boolean peutFermerCoffre();

}