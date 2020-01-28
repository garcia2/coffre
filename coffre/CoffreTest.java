package coffre;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CoffreTest {
	
	private I_CoffreChateau coffre;

	@Before
	public void setUp() throws Exception {
		coffre = new Coffre();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAuDemarrage() {
		assertEquals("CacheParBibliotheque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}

	@Test
	public void testApresAvoirOteLeLivreDeLaBibliotheque() {
		coffre.oterLivre();
		assertEquals("Ferme",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirRemisLeLivreDansLaBibliothequeSansAvoirTouchePrealablementALaChandelle() {
		coffre.oterLivre();
		coffre.remettreLivre();
		assertEquals("CacheParBibliotheque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirTourneLaChandelleVersLaDroiteApresAvoirOterLeLivre() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		assertEquals("PresqueOuvert", coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirTourneLaChandelleVersLaGaucheApresAvoirOterLeLivre() {
		coffre.oterLivre();
		coffre.tournerChandelleVersGauche();;
		assertEquals("Bloque", coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertTrue(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirTourneLaChandelleVersLaDroiteEnEtantPresqueOuvert() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		assertEquals("Ouvert", coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirFermeLeCoffreEnEtantOuvert() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		coffre.fermerCoffre();
		assertEquals("PresqueOuvert", coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirRemisLeLivreEnAyantTourneLaChandelleVersLaDroite() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.remettreLivre();
		assertEquals("CacheParBibliotheque",coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirRemisLeLivreEnAyantTourneLaChandelleVersLaDroiteDeuxFois() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		coffre.remettreLivre();
		assertEquals("Ouvert", coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirTourneLaChandelleVersLaDroiteEnEtantBloqueSansAvoirTourneLaChandelleVersLaDroiteAuPrealable() {
		coffre.oterLivre();
		coffre.tournerChandelleVersGauche();
		coffre.tournerChandelleVersDroite();
		assertEquals("Bloque", coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertTrue(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirTourneLaChandelleVersLaDroiteEnEtantBloqueEnAyantTourneLaChandelleVersLaDroiteAuPrealable() {
		coffre.oterLivre();
		coffre.tournerChandelleVersGauche();
		coffre.tournerChandelleVersDroite();
		assertEquals("Bloque", coffre.nomEtat());
		assertFalse(coffre.chienEstLibere());
		assertTrue(coffre.lapinEstLibere());
	}
	
	@Test
	public void testApresAvoirRemisLeLivreEnEtantOuvert() {
		coffre.oterLivre();
		coffre.tournerChandelleVersDroite();
		coffre.tournerChandelleVersDroite();
		coffre.remettreLivre();
		assertEquals("Ouvert", coffre.nomEtat());
		assertTrue(coffre.chienEstLibere());
		assertFalse(coffre.lapinEstLibere());
	}
	
	

}
