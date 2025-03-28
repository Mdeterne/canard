package model;

import model.vol.ComportementVol;

public class Leurre extends Canard {

	public Leurre(String nom, ComportementVol comportementVol) {
		super(nom,comportementVol);
	}

	@Override
	public String afficher() {
		return super.afficher()+"leurre";
	}
	
	
	
}
