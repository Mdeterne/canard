package model;

import model.cancan.Cancan;
import model.vol.VolerAvecDesAiles;

public class Colvert extends Canard {
	
	public Colvert(String nom) {
		super(nom,new VolerAvecDesAiles(),new Cancan());
	}

	@Override
	public String afficher() {
		return super.afficher()+"vrai colvert";
	}

	
}
