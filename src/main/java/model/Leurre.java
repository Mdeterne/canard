package model;

import model.cancan.ComportementCancan;
import model.vol.ComportementVol;

public class Leurre extends Canard {

	public Leurre(String nom, ComportementVol comportementVol, ComportementCancan comportementCancan) {
		super(nom,comportementVol,comportementCancan);
	}

	@Override
	public String afficher() {
		return super.afficher()+"leurre";
	}
	
	
	
}
