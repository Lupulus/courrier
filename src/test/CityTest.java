package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import letter.SimpleLetter;
import town.City;
import town.Inhabitant;

public class CityTest {
	
	City city = new City("Goldfinger");
	Inhabitant inhabitant = new Inhabitant("Brosnan");
	List<Inhabitant> expected = new ArrayList<Inhabitant>();
	SimpleLetter letterTest = new SimpleLetter(new Inhabitant("Moore"), inhabitant, "test letter");

	@Test
	public void testAddInhabitant() {
		expected.add(inhabitant);
		city.addInhabitant(inhabitant);
		assertEquals(expected, city.getInhabitants());
	}
	
	@Test
	public void testGetSize(){
		assertEquals(expected.size(), city.getSize());
	}
	
	@Test
	public void testSendLetter(){
		assertTrue(city.sendLetter(letterTest));
	}
	
	@Test
	public void testSetName(){
		city.setName("GoldenEye");
		assertEquals("GoldenEye", city.getName());
	}
	
	@Test
	public void testDistributeLetter(){
		city.sendLetter(letterTest);
		assertEquals(city.getPostBox().size(), 1);
		city.distributeLetter();
		assertEquals(city.getPostBox().size(), 0);
	}

}
