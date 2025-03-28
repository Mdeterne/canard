package model;

public class Mandarin extends Canard {

	public Mandarin(String nom) {
		super(nom);
	}

	@Override
	public String afficher() {
		return super.afficher()+"vrai mandarin";
	}
	
	
	
}
