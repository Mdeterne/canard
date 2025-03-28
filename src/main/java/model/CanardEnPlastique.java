package model;

public class CanardEnPlastique extends Canard {

	@Override
	public String afficher() {
		return super.afficher()+"canard en plastique";
	}

	public CanardEnPlastique(String nom) {
		super(nom);
	}
	
}
