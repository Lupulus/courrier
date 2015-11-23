package test;

import static org.junit.Assert.*;
import letter.Letter;

import org.junit.Test;

public abstract class LetterTest {
	Letter<?> letterTest;
	
	@Test
	public void testAction() {
		assertFalse(letterTest.getOpened());
		letterTest.action();
		assertTrue(letterTest.getOpened());
	}
	
	@Test
	public void testIsUrgent(){
		assertFalse(letterTest.isUrgent());
	}
	
	@Test
	public void testCost(){
		
	}

}
