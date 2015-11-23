package test;

import static org.junit.Assert.*;
import letter.PromissoryNote;

import org.junit.Test;

import town.Inhabitant;

public class PromissoryNoteTest extends LetterTest{
	PromissoryNote promissoryTest = new PromissoryNote(new Inhabitant("Smith"), new Inhabitant("Lee Jones"),10);
	
	@Override
	public void testAction() {
		assertFalse(promissoryTest.getOpened());
		promissoryTest.action();
		assertTrue(promissoryTest.getOpened());	
	}
	
	@Override
	public void testCost(){
		assertEquals(1 + 0.01*10,promissoryTest.getCost(),1 + 0.01*10 - promissoryTest.getCost());
	}
	
	@Test
	public void testToString(){
		assertEquals("promissory note (10)", promissoryTest.toString());
	}

}
