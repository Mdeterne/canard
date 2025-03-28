package model;

import model.cancan.CanardMuet;
import model.vol.NePasVoler;

public class Leurre extends Canard {
	
	public Leurre(String nom) {
		super(nom,new NePasVoler(),new CanardMuet());
	}
	
	@Override
	public String afficher() {
		return super.afficher()+"leurre";
	}
	
	
	
}
