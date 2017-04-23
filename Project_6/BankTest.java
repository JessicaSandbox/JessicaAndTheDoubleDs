package Project_6;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;
import java.util.SortedSet;

public class BankTest {

	// Tests Bank constructor
	@Test
	public void testBank() { //
		final String bankName = "Test Bank";
		// Create Bank object
		Bank testBank = new Bank(bankName);
		
		// True if Bank object was created
		assertNotNull(testBank);
		
		// True if bank name is correct
		assertEquals(testBank.Name,  bankName);
	} // testBank

	// Tests construction of Bank by main
	// Tests Transaction constructor
	@Test
	public void testMain() { //
		final String bankName = "Main Test Bank";
		String[] mainTest = {bankName};
		
		// Run main
		Bank.main(mainTest);
		
		// True if main created a Bank object
		assertNotNull(Bank.mainTestBank);
		
		// True if bank name is correct
		assertEquals(Bank.mainTestBank.Name, bankName);
		
		// True if transaction amount is correct
		// Indicates that Transaction was created
		// (Tests Transaction constructor)
	//	assertTrue(Transaction.Amount == 123.45);
	} // testMain
	
	@Test
	public void testAddCustomer() { //
		fail("Not yet implemented");
//		String addCustomer ( String lastName, String firstName )
	}
	
	@Test
	public void testGetCustomer() { //
		fail("Not yet implemented");
//		public static Customer getCustomer(String customerId)
	}
	
	@Test
	public void testGetCustomerList() { //
		fail("Not yet implemented"); 
//		List<Customer> getCustomer(String lastName, String firstName)
	}
	
	@Test
	public void testGetAllCustomers() { //
		fail("Not yet implemented");
//		SortedSet<Customer> getAllCustomers ()
	}
	
	@Test
	public void testRemoveCustomer() { //
		fail("Not yet implemented"); 
//		void removeCustomer(String customerId)
	}
	
	@Test
	public void testGetAllAccounts() { //
		fail("Not yet implemented"); 
//		SortedSet<Account> getAllAccounts ()
	}
} // class BankTest
