package test;

import static org.junit.Assert.*;

import org.junit.Test;

import town.BankAccount;

public class BankAccountTest {
	BankAccount account = new BankAccount(100);
	
	@Test
	public void testSetAcount() {
		account.setAccount(200.0);
		assertEquals(200.0, account.getAccount(), 50.0 - account.getAccount());
	}
	
	@Test
	public void testAddCostInAccount() {
		account.addCostInAccount(50.0);
		assertEquals(150.0, account.getAccount(), 100.0 - account.getAccount());
	}
	
	@Test
	public void testRemoveInAccount() {
		account.removeCostInAccount(50.0);
		assertEquals(50.0, account.getAccount(), 50.0 - account.getAccount());
	}

}
