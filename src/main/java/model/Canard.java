package model;

import model.vol.ComportementVol;

public abstract class Canard {

	protected final String nom;
	protected ComportementVol comportementVol;
	
	public String nager() {
		return "Tout les canards flottent, même les leurres!";
	}
	
	public String afficher() {
		return"Je suis un ";
	}
	
	protected Canard(String nom, ComportementVol comportementVol) {
		this.nom = nom;
		this.comportementVol = comportementVol;
	}

	public String getNom() {
		return nom;
	}
	
	public String effectuerVol() {
		return comportementVol.voler();
	}
}
