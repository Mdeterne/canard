package model;

import model.cancan.ComportementCancan;
import model.vol.ComportementVol;

public abstract class Canard {

	protected final String nom;
	protected ComportementVol comportementVol;
	protected ComportementCancan comportementCancan;
	
	public String nager() {
		return "Tous les canards flottent, même les leurres!";
	}
	
	public String afficher() {
		return"Je suis un ";
	}
	
	protected Canard(String nom, ComportementVol comportementVol, ComportementCancan comportementCancan) {
		this.nom = nom;
		this.comportementVol = comportementVol;
		this.comportementCancan = comportementCancan;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String effectuerVol() {
		return comportementVol.voler();
	}
	
	public String effectuerCancan() {
		return comportementCancan.cancaner();
	}
			
}
