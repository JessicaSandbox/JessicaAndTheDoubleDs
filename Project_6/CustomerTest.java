package Project_6;

import static org.junit.Assert.*;
import org.junit.*;

import java.util.SortedSet;

public class CustomerTest {
	
	Bank testBankObj;
	
	Customer customer;
	
	SavingsAccount savingsAccount;
	
	final String bankName = "Test Bank";
	final String lastName = "Jones";
	final String firstName = "Tom";
	final String description = "Test description";
	
	final double initialBalance = 123.45;
	
	// Executes before tests are run
	@Before
	public void init() {
				
		// Create Bank object
		testBankObj = new Bank(bankName);
		
		// Create Customer Object
		customer = new Customer(testBankObj, lastName, firstName);
		
		// Create SavingsAccount
		savingsAccount = customer.addSavingsAccount(initialBalance, description); 
	}

	// Test Customer constructor
	@Test
	public void testCustomer() { 

		// True if Customer object was created
		assertNotNull(customer);
		
		// True if last name is correct
		assertEquals(customer.getLastName(), lastName);
		
		// True if first name is correct
		assertEquals(customer.getFirstName(), firstName);
	}

	// Test addSavingsAccount
	@Test
	public void testAddSavingsAccount() { 
	
		// True if savings account was created
		assertNotNull(savingsAccount);
		
		// True if initial balance is correct
		assertTrue(savingsAccount.getBalance() == initialBalance);
		
		// True if description is correct
		assertEquals(savingsAccount.getAccountDescription(), description);
	}
	 
	// Test getAccount
	@Test
	public void testGetAccount() {
		
		String savingsAccountID, accountID;
		
		// If savingsAccount exists...
		if (savingsAccount != null) {
			
			// Get ID of savings account
			savingsAccountID = savingsAccount.getAccountId();
			
			// True if a savings account ID was returned
			assertNotNull(savingsAccountID);
			
			// If savingsAccountID exists...
			if (savingsAccountID != null) {
				
				// Create an account using ID of savings account
				Account account = customer.getAccount(savingsAccountID);
				
				// If account exists...
				if (account != null) {
					
					// Get ID of account
					accountID = account.getAccountId();
			
					// True if an account ID was returned
					assertNotNull(accountID);
					
					// True if savings account ID and account ID match
					assertEquals(savingsAccountID, accountID);
				} // If account exists
				else { // else account does not exist
					fail("getAccount returned null");
				} 
			} // If savingsAccountID exists
		} // If savingsAccount exists
		else { // savingsAccount does not exist
			fail("savingsAccount does not exist");
		}
	} // testGetAccount
 	
	// Test getCustomerAccounts
	@Test
	public void testGetCustomerAccounts() {

		// If customer exists...
		if (customer != null) {
			
			// Create the accounts set
			SortedSet<Account> customerAccountsSet 
				= customer.getCustomerAccounts();
		
			// True if set exists
			assertNotNull(customerAccountsSet);
		
			// True if first account balance is correct
			assertTrue(customerAccountsSet.first().getBalance() 
					   == initialBalance);
		
			// True if first account description is correct
			assertEquals(customerAccountsSet.first().getAccountDescription(), 
				         description);
		} // If customer exists
		else { // customer does not exist
			fail("customer does not exist");
		}
	} // testGetCustomerAccounts
	
	// Test removeAccount
	@Test
	public void testRemoveAccount() { 

		// Add another account
		SavingsAccount savingsAccount2 = customer.addSavingsAccount(
				                         initialBalance, description);
		
		// If the savings account exists...
		if (savingsAccount2 != null) {
			
			// Get account ID
			String accountID = savingsAccount2.getAccountId();
		
			// Remove the account
			customer.removeAccount(accountID);
		
			// Need to test whether account was marked as "defunct" 
			// (no method or field for this yet) 
			fail("Not yet implemented");
		} // If the savings account exists
		else { // Else the savings account does not exist
			fail("savingsAccount2 does not exist");
		}
	} // testRemoveAccount

	// Test YtdFees
    @Test
    public void testYtdFees() { 
    	
    	/* For this to be tested, there needs to be a way to set the YTD fees
    	 * and there needs to be a field to store them
    	 */
		fail("Not yet implemented");  
		
		// Test the stub
		assertTrue(customer.ytdFees() == 0.0);
	}

    // Test YtdInterest
    @Test
    public void testYtdInterest() { 
    	
    	/* For this to be tested, there needs to be a way to set the YTD 
    	 * interest and there needs to be a field to store them
    	 */
		fail("Not yet implemented"); 
		
		// Test the stub
		assertTrue(customer.ytdInterest() == 0.0);
	}
} // class CustomerTest
