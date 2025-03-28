package model;

import model.vol.ComportementVol;

public class Mandarin extends Canard {

	public Mandarin(String nom, ComportementVol comportementVol) {
		super(nom,comportementVol);
	}

	@Override
	public String afficher() {
		return super.afficher()+"vrai mandarin";
	}
	
	
	
}
