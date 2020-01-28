package graphique;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import coffre.Coffre;

public class FenetreChateauMedieval extends JFrame implements ActionListener, WindowListener, Observateur {

	private JButton btOterLivre;
	private JButton btRemettreLivre;
	private JButton btTournerGauche;
	private JButton btTournerDroite;
	private JButton btFermerCoffre;
	private JButton btQuitter;

	private Coffre coffre;

	private FenetreChienGentil fenetreChienGentil;
	private FenetreLapinTueur fenetreLapinTueur;
	private FenetreEtat fenetreEtat;

	public FenetreChateauMedieval() {

		setTitle("exercice Chateau Médiéval (F02)");
		setBounds(500, 100, 400, 200);
		JPanel panBibliotheque = new JPanel();
		JPanel panCentre = new JPanel();
		JPanel panChandelle = new JPanel();
		JPanel panCoffre = new JPanel();
		JPanel panQuitter = new JPanel();
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		btOterLivre = new JButton("Oter livre UML");
		btRemettreLivre = new JButton("Remettre livre UML");
		btTournerGauche = new JButton("Tourner chandelle gauche");
		btTournerDroite = new JButton("Tourner chandelle droite");
		btFermerCoffre = new JButton("Fermer Coffre");
		btQuitter = new JButton("Quitter");
		panBibliotheque.add(btOterLivre);
		panBibliotheque.add(btRemettreLivre);
		panChandelle.add(btTournerGauche);
		panChandelle.add(btTournerDroite);
		panCoffre.add(btFermerCoffre);
		panQuitter.add(btQuitter);

		panCentre.add(panChandelle, "North");
		panCentre.add(panCoffre, "South");
		contentPane.add(panBibliotheque, "North");
		contentPane.add(panCentre);
		contentPane.add(panQuitter, "South");

		btOterLivre.addActionListener(this);
		btRemettreLivre.addActionListener(this);
		btTournerGauche.addActionListener(this);
		btTournerDroite.addActionListener(this);
		btFermerCoffre.addActionListener(this);
		btQuitter.addActionListener(this);

		addWindowListener(this);
		setVisible(true);

		coffre = new Coffre();

		fenetreChienGentil = new FenetreChienGentil();
		fenetreLapinTueur = new FenetreLapinTueur();
		fenetreEtat = new FenetreEtat();

		this.MAJ(coffre);
		fenetreChienGentil.MAJ(coffre);
		fenetreLapinTueur.MAJ(coffre);
		fenetreEtat.MAJ(coffre);

		coffre.attacher(this);
		coffre.attacher(fenetreChienGentil);
		coffre.attacher(fenetreLapinTueur);
		coffre.attacher(fenetreEtat);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btOterLivre) {
			System.out.println("Vous venez d'appuyer sur le bouton Oter Livre UML");
			coffre.oterLivre();
		}
		if (e.getSource() == btRemettreLivre) {
			System.out.println("Vous venez d'appuyer sur le bouton Remettre Livre UML");
			coffre.remettreLivre();
		}
		if (e.getSource() == btTournerGauche) {
			System.out.println("Vous venez d'appuyer sur le bouton Tourner Chandelle vers la Gauche");
			coffre.tournerChandelleVersGauche();
		}
		;
		if (e.getSource() == btTournerDroite) {
			System.out.println("Vous venez d'appuyer sur le bouton Tourner Chandelle vers la Droite");
			coffre.tournerChandelleVersDroite();
		}
		;
		if (e.getSource() == btFermerCoffre) {
			System.out.println("Vous venez d'appuyer sur le bouton Fermer Coffre");
			coffre.fermerCoffre();
		}
		;
		if (e.getSource() == btQuitter) {
			System.out.println("Vous venez d'appuyer sur le bouton Quitter");
			;
			System.exit(0);
		}
	}

	public void windowClosing(WindowEvent arg0) {
		System.out.println("terminer");
		System.exit(0);
	}

	public void windowActivated(WindowEvent arg0) {
	}

	public void windowClosed(WindowEvent arg0) {
	}

	public void windowDeactivated(WindowEvent arg0) {
	}

	public void windowDeiconified(WindowEvent arg0) {
	}

	public void windowIconified(WindowEvent arg0) {
	}

	public void windowOpened(WindowEvent arg0) {
	}

	/*
	private void afficherBtChandelle() {
		btTournerDroite.setVisible(true);
		btTournerGauche.setVisible(true);
	}

	private void cacherBtChandelle() {
		btTournerDroite.setVisible(false);
		btTournerGauche.setVisible(false);
	}

	private void afficherBtFermerCoffre() {
		btFermerCoffre.setVisible(true);
	}

	private void cacherBtFermerCoffre() {
		btFermerCoffre.setVisible(false);
	}

	private void afficherBtOterLivre() {
		btOterLivre.setVisible(true);
	}

	private void cacherBtOterLivre() {
		btOterLivre.setVisible(false);
	}

	private void afficherBtRemettreLivre() {
		btRemettreLivre.setVisible(true);
	}

	private void cacherBtRemettreLivre() {
		btRemettreLivre.setVisible(false);
	}
	*/

	public static void main(String[] args) {
		FenetreChateauMedieval c = new FenetreChateauMedieval();
	}

	@Override
	public void MAJ(Coffre coffre) {
		btTournerDroite.setEnabled(coffre.peutTournerChandelleVersDroite());
		btTournerGauche.setEnabled(coffre.peutTournerChandelleVersGauche());
		btFermerCoffre.setEnabled(coffre.peutFermerCoffre());
		btOterLivre.setEnabled(coffre.peutOterLivre());
		btRemettreLivre.setEnabled(coffre.peutRemettreLivre());
	}

}
