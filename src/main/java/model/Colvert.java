package model;

import model.vol.ComportementVol;

public class Colvert extends Canard {

	public Colvert(String nom, ComportementVol comportementVol) {
		super(nom,comportementVol);
	}

	@Override
	public String afficher() {
		return super.afficher()+"vrai colvert";
	}

	
}
