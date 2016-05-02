import static org.junit.Assert.*;

import org.junit.Test;

public class MovieTest {
	Movie StarWars = new Movie("StarWarsII",20);
	@Test
	public void testGetPriceCode() {
		assertTrue(StarWars.getPriceCode()== 20);
	}

	@Test
	public void testSetPriceCode() {
		StarWars.setPriceCode(15);
		assertTrue(StarWars.getPriceCode()== 15);
	}

	@Test
	public void testGetTitle() {
		assertTrue(StarWars.getTitle()== "StarWarsII");
	}

	@Test
	public void testGetCharge() {
		assertTrue(StarWars.getCharge(5)!= 0);
	}

	@Test
	public void testGetFrequentRenterPoints() {
		assertTrue(StarWars.getFrequentRenterPoints(5)!= 0);
	}

}
