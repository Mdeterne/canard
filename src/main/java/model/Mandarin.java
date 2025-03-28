package model;

import model.cancan.Cancan;
import model.vol.VolerAvecDesAiles;

public class Mandarin extends Canard {
	
	public Mandarin(String nom) {
		super(nom,new VolerAvecDesAiles(),new Cancan());
	}

	@Override
	public String afficher() {
		return super.afficher()+"vrai mandarin";
	}
	
	
	
}
