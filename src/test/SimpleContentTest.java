package test;

import static org.junit.Assert.*;

import org.junit.Test;

import letter.SimpleContent;

public class SimpleContentTest {
	
	SimpleContent simple = new SimpleContent("just a letter");
	
	@Test
	public void testSetText() {
		assertEquals("just a letter", simple.getText());
		simple.setText("trying setter");
		assertEquals("trying setter", simple.getText());
	}

}
