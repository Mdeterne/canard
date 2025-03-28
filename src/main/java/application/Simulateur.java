package application;

import java.util.ArrayList;
import java.util.List;

import model.*;
import model.vol.NePasVoler;
import model.vol.VolerAvecDesAiles;

public class Simulateur {

	private static final String LIGNE = "-----------------";

	public static void main(String[] args) {

		List<Canard> canards = mettreDesCanardsDansMonSimulateur();

		faireAfficherNagerVoler(canards);

	}

	private static List<Canard> mettreDesCanardsDansMonSimulateur() {
		List<Canard> canards = new ArrayList<>();
		canards.add(new Colvert("Piero",new VolerAvecDesAiles()));
		canards.add(new Leurre("Danny", new NePasVoler()));
		canards.add(new Mandarin("Oshidori", new VolerAvecDesAiles()));
		canards.add(new CanardEnPlastique("Rubber", new NePasVoler()));
		return canards;
	}

	private static void faireAfficherNagerVoler(List<Canard> canards) {
		System.out.println(LIGNE);
		System.out.println("Afficher et Nager");
		System.out.println(LIGNE);

		for (Canard canard : canards) {
			System.out.println(canard.getNom() + " : " + canard.afficher());
			System.out.println(canard.nager());
			System.out.println(canard.effectuerVol());
		}
	}

}
