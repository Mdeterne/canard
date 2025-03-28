package model;

public abstract class Canard {

	protected final String nom;
	
	public String nager() {
		return "Tout les canards flottent, même les leurres!";
	}
	
	public String afficher() {
		return"Je suis un ";
	}
	
	protected Canard(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}
	
}
