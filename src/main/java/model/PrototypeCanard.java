package model;

import model.cancan.Cancan;
import model.vol.*;

public class PrototypeCanard extends Canard{

	
	public PrototypeCanard(String nom) {
		super(nom,new PropulsionAReaction(),new Cancan());
	}

	@Override
	public String afficher() {
		return super.afficher()+"prototype de canard";
	}
	
}
