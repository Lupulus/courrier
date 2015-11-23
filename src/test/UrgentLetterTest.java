package test;

import static org.junit.Assert.*;
import letter.SimpleLetter;
import letter.UrgentLetter;

import org.junit.Before;
import org.junit.Test;

import exception.AlreadyUrgentException;

import town.Inhabitant;

public class UrgentLetterTest extends LetterTest{
	SimpleLetter letterTest;
	UrgentLetter urgentTest ;
	
	@Before
	public void beforeTest() throws AlreadyUrgentException{
		 letterTest = new SimpleLetter(new Inhabitant("Black"), new Inhabitant("Gass"), "pick of destiny");
		 urgentTest = new UrgentLetter(letterTest);
	}
	
	
	@Test (expected = AlreadyUrgentException.class)
	public void testLaunchException() throws AlreadyUrgentException {
		UrgentLetter urgentTest2 = new UrgentLetter(urgentTest);
		assertNotNull(urgentTest2);
	}
	
	@Override
	public void testAction(){
		assertFalse(letterTest.getOpened());
		letterTest.action();
		assertTrue(letterTest.getOpened());
	}
	
	@Override
	public void testIsUrgent(){
		assertTrue(urgentTest.isUrgent());
	}
	
	@Test
	public void testToString(){
		assertEquals("simple letter urgent", urgentTest.toString());
	}
}
