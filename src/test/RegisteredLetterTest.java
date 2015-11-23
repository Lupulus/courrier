package test;

import static org.junit.Assert.*;
import letter.RegisteredLetter;
import letter.SimpleLetter;

import org.junit.Test;

import town.Inhabitant;

public class RegisteredLetterTest extends LetterTest {
	
	SimpleLetter letterTest = new SimpleLetter(new Inhabitant("Stallone"), new Inhabitant("Schwarzenegger"), "Expendables");
	RegisteredLetter registeredTest = new RegisteredLetter(letterTest) ;
	
	@Override
	public void testAction() {
		assertFalse(letterTest.getOpened());
		letterTest.action();
		assertTrue(letterTest.getOpened());
	}
	
	@Override
	public void testCost(){
		assertEquals(16, registeredTest.getCost(), 16 - registeredTest.getCost());
	}
	
	@Override
	public void testIsUrgent(){
		assertFalse(registeredTest.isUrgent());
	}
	
	@Test
	public void testToString(){
		assertEquals("simple letter registered", registeredTest.toString());
	}

}
