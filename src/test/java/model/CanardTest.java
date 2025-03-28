package model;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.cancan.Cancan;
import model.cancan.Coincoin;
import model.vol.NePasVoler;
import model.vol.VolerAvecDesAiles;

class CanardTest {
	private static final String NAGER = "Tous les canards flottent, même les leurres!";

	private static final String VOLER = "Je vole !";
	private static final String NE_PAS_VOLER = "Je ne sais pas voler";

	private static final String CANCAN = "Can-can";
	private static final String COINCOIN = "Coin-coin";
	private static final String SILENCE = "...Silence...";

	Canard colvert;
	Canard leurre;
	Canard mandarin;
	Canard canardPlastique;

	@BeforeEach
	private void extracted() {
		colvert = new Colvert("Piero");
		leurre = new Leurre("Danny");
		mandarin = new Mandarin("Oshidori");
		canardPlastique = new CanardEnPlastique("Rubber");
	}

	@Test
	public void test_effectuerVol() {
		String texteVolColvert = colvert.effectuerVol();
		assertEquals(VOLER, texteVolColvert);

		// on peut inliner les assert
		// car ici le code de test est simple à lire
		assertEquals(VOLER, mandarin.effectuerVol());

		assertEquals(NE_PAS_VOLER, leurre.effectuerVol());
		assertEquals(NE_PAS_VOLER, canardPlastique.effectuerVol());
	}

	@Test
	public void test_effectuerCancan() {

		assertEquals(CANCAN, colvert.effectuerCancan());
		assertEquals(CANCAN, mandarin.effectuerCancan());

		assertEquals(SILENCE, leurre.effectuerCancan());
		assertEquals(COINCOIN, canardPlastique.effectuerCancan());
	}

	@Test
	public void test_nager() {

		assertEquals(NAGER, colvert.nager());
		assertEquals(NAGER, mandarin.nager());

		assertEquals(NAGER, leurre.nager());
		assertEquals(NAGER, canardPlastique.nager());
	}

	@Test
	public void test_presentation_nom_et_afficher() {
		assertEquals("Piero", colvert.getNom());
		assertEquals("Je suis un vrai colvert", colvert.afficher());

		assertEquals("Oshidori", mandarin.getNom());
		assertEquals("Je suis un vrai mandarin", mandarin.afficher());

		assertEquals("Danny", leurre.getNom());
		assertEquals("Je suis un leurre", leurre.afficher());

		assertEquals("Rubber", canardPlastique.getNom());
		assertEquals("Je suis un canard en plastique", canardPlastique.afficher());
	}
	
	@Test
	public void test_changerComportementVol() {
		colvert.changerComportementVol(new NePasVoler());
		assertEquals(NE_PAS_VOLER, colvert.effectuerVol());
		
		mandarin.changerComportementVol(new NePasVoler());
		assertEquals(NE_PAS_VOLER, mandarin.effectuerVol());

		leurre.changerComportementVol(new VolerAvecDesAiles());
		assertEquals(VOLER, leurre.effectuerVol());
		
		canardPlastique.changerComportementVol(new VolerAvecDesAiles());
		assertEquals(VOLER, canardPlastique.effectuerVol());
	}
	
	@Test
	public void test_changerComportementCancan() {
		colvert.changerComportementCancan(new Coincoin());
		assertEquals(COINCOIN, colvert.effectuerCancan());
		
		mandarin.changerComportementCancan(new Coincoin());
		assertEquals(COINCOIN, mandarin.effectuerCancan());

		leurre.changerComportementCancan(new Coincoin());
		assertEquals(COINCOIN, leurre.effectuerCancan());
		
		canardPlastique.changerComportementCancan(new Cancan());
		assertEquals(CANCAN, canardPlastique.effectuerCancan());
	}
}
