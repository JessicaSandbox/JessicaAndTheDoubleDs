package Project_6;

import static org.junit.Assert.*;
import org.junit.*;

import java.util.List;
import java.util.SortedSet;

public class BankTest {
	
	Bank testBankObj;
	
	final String bankName = "Test Bank";
	
	final String lastName = "Jones";
	final String firstName = "Tom";
	
	String custID, custID2;

	// Executes before tests are run
	@Before
	public void init() {
	
		// Create Bank object
		testBankObj = new Bank(bankName);
		
		// Add customers
		custID  = testBankObj.addCustomer( lastName, firstName );
		custID2 = testBankObj.addCustomer( lastName, firstName );
	}
	
	// Test Bank constructor
	@Test
	public void testBank() { 
		
		// True if Bank object was created
		assertNotNull(testBankObj);
		
		// True if bank name is correct
		assertEquals(testBankObj.getNAME(),  bankName);
	} // testBank

	// Test construction of Bank by main
	@Test
	public void testMain() { 
		String[] mainTest = {bankName};
		
		// Run main
		Bank.main(mainTest);
		
		// Check for printed "Hello from Bank" message
		fail("Check for printed message, 'Hello from Bank'");
	} // testMain
	
	// Test method addCustomer
	@Test
	public void testAddCustomer() { 

		// True if custID was returned by addCustomer
		assertNotNull(custID);
	
		// Name fields are tested in method testGetCustomer 
	}

	// Test method getCustomer
	@Test
	public void testGetCustomer() { 
		
		// Get customer
		Customer customer = testBankObj.getCustomer( custID );

		// True if customer object exists
		assertNotNull(customer);
		
		// True if last name is correct
		assertEquals(customer.getLastName(), lastName);
		
		// True if first name is correct
		assertEquals(customer.getFirstName(), firstName);
	}
	
	// Test method getCustomer (List)
	@Test
	public void testGetCustomerList() { 

		// Create the customer list
		List<Customer> customerList = testBankObj.getCustomer(lastName, 
				                                           firstName);
		
		// True if list exists
		assertNotNull(customerList);
		
		// If the list exists...
		if (customerList != null) {
			// Iterate over list
			for (int i = 0; i < customerList.size(); i++) {
				Customer customer = customerList.get(i);
			
				// True if last name is correct
				assertEquals(customer.getLastName(), lastName);
			
				// True if first name is correct
				assertEquals(customer.getFirstName(), firstName);			
			} // for i
		} // if list not null
	} // testGetCustomerList
	
	// Test method getAllCustomers
	@Test
	public void testGetAllCustomers() { 

		// Create the customer report/set
		SortedSet<Customer> customerSet = testBankObj.getAllCustomers();
	
		// True if set exists
		assertNotNull(customerSet);
		
		// True if first customer last name is correct
		assertEquals(customerSet.first().getLastName(), lastName);
		
		// True if first customer first name is correct
		assertEquals(customerSet.first().getFirstName(), firstName);
	}
	
	// Test method removeCustomer
	@Test
	public void testRemoveCustomer() { 

		// Add another customer
		String custID3  = testBankObj.addCustomer( lastName, firstName );
		
		// Remove the customer
		testBankObj.removeCustomer(custID3);
		
		// Need to test whether customer was marked as "non-current" 
		// (no method or field for this yet)
		fail("Not yet implemented"); 
	}
	
	// Test method getAllAccounts
	@Test
	public void testGetAllAccounts() { 
		
		final double accountBalance = 123.45;
		final String accountDescription = "Test account description";
		
		// Create an account so there will be at least one in the set
	    Account testAccount = new SavingsAccount(
	    		testBankObj.getCustomer(custID), accountBalance, 
	    	    accountDescription);
		
		// Create the accounts set
		SortedSet<Account> accountsSet = testBankObj.getAllAccounts();
		
		// True if set exists
		assertNotNull(accountsSet);
		
		// True if first customer ID is correct
		assertEquals(accountsSet.first().getCustomerId(), custID);

		// True if first account balance is correct
		assertTrue(accountsSet.first().getBalance() == accountBalance);
		
		// True if first account description is correct
		assertEquals(accountsSet.first().getAccountDescription(), 
				     accountDescription);
	} // testGetAllAccounts
} // class BankTest