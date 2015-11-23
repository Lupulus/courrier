package test;

import static org.junit.Assert.*;

import org.junit.Test;

import letter.SimpleLetter;
import town.Inhabitant;

public class SimpleLetterTest extends LetterTest {
	Inhabitant sender = new Inhabitant("Fishburne");
	Inhabitant receiver = new Inhabitant("Reeves");

	SimpleLetter letterTest = new SimpleLetter(sender, receiver, "test");
	
	@Test
	public void testToString() {
		assertEquals("simple letter", letterTest.toString());
	}
	
	@Override
	public void testAction(){
		assertFalse(letterTest.getOpened());
		letterTest.action();
		assertTrue(letterTest.getOpened());	
	}
	
	@Override
	public void testIsUrgent(){
		super.testIsUrgent();
	}
	
	@Override
	public void testCost(){
		assertEquals(1, letterTest.getCost(), 1 - letterTest.getCost());
	}

}
