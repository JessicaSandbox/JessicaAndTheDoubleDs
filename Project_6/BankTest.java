package Project_6;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {

	// Tests Bank constructor
	@Test
	public void testBank() {
		// Create Bank object
		Bank testBank = new Bank("Test Bank");
		
		// True if Bank object was created
		assertTrue(testBank != null);
		
		// True if bank name is correct
		assertEquals(testBank.Name,  "Test Bank");
	} // testBank

	// Tests construction of Bank by main
	// Tests Transaction constructor
	@Test
	public void testMain() {
		String[] mainTest = {"Main test"};
		
		// Run main
		Bank.main(mainTest);
		
		// True if main created a Bank object
		assertTrue(Bank.mainTestBank != null);
		
		// True if bank name is correct
		assertEquals(Bank.mainTestBank.Name, "Main Test Bank");
		
		// True if transaction amount is correct
		// Indicates that Transaction was created
		// (Tests Transaction constructor)
		assertTrue(Transaction.Amount == 123.45);
	} // testMain

	@Test
	public void testAddAccount() {
		fail("Not yet implemented"); // TODO
		
		//called when bank object is created
		//gives account number
	}

	@Test
	public void testRemoveAccount() {
		fail("Not yet implemented"); // TODO
	
	}

	@Test
	public void testGetAccounts() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetAccount() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testAddCustomer() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testRemoveCustomer() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetCustomers() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetCustomerString() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetCustomerStringString() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetCustomersAccounts() {
		fail("Not yet implemented"); // TODO
	}

}
