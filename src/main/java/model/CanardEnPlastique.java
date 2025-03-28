package model;

import model.cancan.ComportementCancan;
import model.vol.ComportementVol;

public class CanardEnPlastique extends Canard {

	@Override
	public String afficher() {
		return super.afficher()+"canard en plastique";
	}

	public CanardEnPlastique(String nom, ComportementVol comportementVol, ComportementCancan comportementCancan) {
		super(nom,comportementVol,comportementCancan);
	}
	
}
