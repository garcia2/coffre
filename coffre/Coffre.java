package coffre;
import java.util.List;

import java.util.ArrayList;

import etat.CacheParBibliotheque;
import etat.Etat;
import graphique.Observateur;

public class Coffre implements I_CoffreChateau {
	
	private Etat etat;
	private boolean lapinLibere;
	private boolean chienLibere;
	
	private List<Observateur> observateurs = new ArrayList<Observateur>();
	
	public Coffre() {
		etat = new CacheParBibliotheque();
		lapinLibere = false;
		chienLibere = false;
	}
	
	@Override
	public void oterLivre() {
		etat.oterLivre(this);

	}

	@Override
	public void remettreLivre() {
		etat.remettreLivre(this);

	}

	@Override
	public void tournerChandelleVersDroite() {
		etat.tournerChandelleVersDroite(this);
	}

	@Override
	public void tournerChandelleVersGauche() {
		etat.tournerChandelleVersGauche(this);
	}

	@Override
	public void fermerCoffre() {
		etat.fermerCoffre(this);
	}

	@Override
	public boolean lapinEstLibere() {
		return lapinLibere;
	}

	@Override
	public boolean chienEstLibere() {
		return chienLibere;
	}

	@Override
	public String nomEtat() {
		return etat.toString();
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
		notif();
	}
	
	public void setChienLibere(boolean b) {
		chienLibere = b;
		notif();
	}
	
	public void setLapinLibere(boolean b) {
		lapinLibere = b;
		notif();
	}
	
	private void notif() {
		for (Observateur observateur : observateurs) {
			observateur.MAJ(this);
		}
	}
	
	public void attacher(Observateur o) {
		observateurs.add(o);
	}

	@Override
	public boolean peutOterLivre() {
		return etat.peutOterLivre();
	}

	@Override
	public boolean peutRemettreLivre() {
		return etat.peutRemettreLivre();
	}

	@Override
	public boolean peutTournerChandelleVersDroite() {
		return etat.peutTournerChandelleVersDroite();
	}

	@Override
	public boolean peutTournerChandelleVersGauche() {
		return etat.peutTournerChandelleVersGauche();
	}

	@Override
	public boolean peutFermerCoffre() {
		return etat.peutFermerCoffre();
	}

}
