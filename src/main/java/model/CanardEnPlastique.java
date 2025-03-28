package model;

import model.vol.ComportementVol;

public class CanardEnPlastique extends Canard {

	@Override
	public String afficher() {
		return super.afficher()+"canard en plastique";
	}

	public CanardEnPlastique(String nom, ComportementVol comportementVol) {
		super(nom,comportementVol);
	}
	
}
