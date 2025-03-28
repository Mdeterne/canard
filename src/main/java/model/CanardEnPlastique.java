package model;

import model.cancan.Coincoin;
import model.vol.NePasVoler;

public class CanardEnPlastique extends Canard {

	@Override
	public String afficher() {
		return super.afficher()+"canard en plastique";
	}

	public CanardEnPlastique(String nom) {
		super(nom,new NePasVoler(),new Coincoin());
	}
	
}
