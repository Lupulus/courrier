package test;

import static org.junit.Assert.*;

import org.junit.Test;

import letter.NoteContent;

public class NoteContentTest {
	
	NoteContent note = new NoteContent(100);
	
	@Test
	public void testSetAmount() {
		assertEquals(100, note.getAmount());
		note.setAmount(150);
		assertEquals(150, note.getAmount());
	}

}
