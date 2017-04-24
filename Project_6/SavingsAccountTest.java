package Project_6;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SavingsAccountTest {
	
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
		savingsAccount = new SavingsAccount(customer, initialBalance, 
				                            description);
	}
	
	// Test SavingsAccount (default interest rate) constructor
	@Test
	public void testSavingsAccount() {

		// True if savings account exists
		assertNotNull(savingsAccount);
		
		// True if balance is correct
		assertTrue(savingsAccount.getBalance() == initialBalance);
		
		// True if description is correct
		assertEquals(savingsAccount.getAccountDescription(), description);
	}

	// Test addInterestTransaction
	@Test
	public void testAddInterestTransaction() {
		
		double intRate = 2.1;  // Interest rate in %
		double newBalance = initialBalance * ( 1 + intRate / 100 );
		
		// Add interest to account
		savingsAccount.addInterestTransaction(intRate);
		
		/* True if interest was added to account.
		 * In general, rules for computing interest can be rather complicated
		 * and have not been fully specified, so the computations here are 
		 * likely WRONG.  They should be adjusted when the exact computation 
		 * rules are known.
		 */
		assertTrue(savingsAccount.getBalance() == Math.round(newBalance * 100) / 100);
	}
	
	// Test deposit
	@Test
	public void testDeposit() {

		double newBalance = 2 * initialBalance;
		
		/* Deposit an amount equal to the initial balance.
		 * This should double the balance, so the new balance should 
		 * equal newBalance.
		 */
		savingsAccount.deposit(initialBalance);
		
		// True if the balance is correct
		assertTrue(savingsAccount.getBalance() == newBalance);
	}
	
	// Test withdraw
	@Test
	public void testWithdraw() {
		
		double newBalance = initialBalance - 1.00;

		/* Withdraw one dollar.
		 * This should reduce the balance by one dollar.
		 */
		savingsAccount.withdraw(1.00);
		
		// True if balance is correct
		assertTrue(savingsAccount.getBalance() == newBalance);
	} // test withdraw 
} // Class SavingsAccountTest