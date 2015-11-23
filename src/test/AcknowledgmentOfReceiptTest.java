package test;

import static org.junit.Assert.*;
import letter.AcknowledgmentOfReceipt;

import org.junit.Test;

import town.Inhabitant;

public class AcknowledgmentOfReceiptTest {

	AcknowledgmentOfReceipt receipt = new AcknowledgmentOfReceipt(new Inhabitant("Depp"), new Inhabitant("Bloom"), "do what you want ...");	
	@Test
	public void testCost() {
		assertEquals(0, receipt.getCost(), 0 - receipt.getCost());
	}

}
