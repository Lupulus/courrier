package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import letter.Content;
import letter.Letter;
import letter.SimpleLetter;
import town.City;
import town.Inhabitant;

public class InhabitantTest {
	Inhabitant inhabitant = new Inhabitant("Damon");
	City city = new City("Sin City");
	SimpleLetter letterTest = new SimpleLetter(new Inhabitant("Pitt"), inhabitant, "test letter");
	List<Letter<? extends Content>> expected = new ArrayList<>();
	
	@Test
	public void testSetName() {
		inhabitant.setName("Clooney");
		assertEquals("Clooney", inhabitant.getName());
	}
	
	@Test
	public void testSetCity(){
		inhabitant.setCity(city);
		assertEquals(city, inhabitant.getCity());
	}
	
	@Test
	public void testAddReceivedLetter(){
		expected.add(letterTest);
		inhabitant.addReceivedLetter(letterTest);
		assertEquals(expected, inhabitant.getReceivedLetter());
	}

}
