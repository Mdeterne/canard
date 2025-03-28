package model;

import model.cancan.ComportementCancan;
import model.vol.ComportementVol;

public class Colvert extends Canard {

	public Colvert(String nom, ComportementVol comportementVol, ComportementCancan comportementCancan) {
		super(nom,comportementVol,comportementCancan);
	}

	@Override
	public String afficher() {
		return super.afficher()+"vrai colvert";
	}

	
}
