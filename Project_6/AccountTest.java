package Project_6;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AccountTest {
	
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

	/* Test Account constructor
	 * Account is tested indirectly using SavingsAccount, which extends 
	 * Account
	 */
	@Test
	public void testAccount() {
		
		// True if account was created
		assertNotNull(savingsAccount);
		
		// True if balance is correct
		assertTrue(savingsAccount.getBalance() == initialBalance);
		
		// True if description is correct
		assertEquals(savingsAccount.getAccountDescription(), description);
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
	}
	
	// Test transfer
	@Test
	public void testTransfer() {

		double newBalance  = initialBalance - 1.00;
		double newBalance2 = initialBalance + 1.00;
		
		// Create a second account
		SavingsAccount savingsAccount2 = new SavingsAccount(customer, 
				                                            initialBalance, 
                                                            description);
		
		/* Transfer one dollar from savingsAccount to savingsAccount2
		 * This should reduce the balance of savingsAccount by one dollar
		 * and increase the balance of savingsAccount2 by one dollar.
		 */
		Account.transfer(savingsAccount, savingsAccount2, 1.00);
		
		// True if balance is correct
		assertTrue(savingsAccount.getBalance() == newBalance);
		
		// True if balance is correct
		assertTrue(savingsAccount2.getBalance() == newBalance2);
	} // testTransfer
	
	// Test getTransactions
	@Test
	public void	testGetTransactions() {
		
		double depositAmount = 1.00;
		
		/* Perform a transaction so the transaction list will hold at least 
		 * one transaction
		 */
		savingsAccount.deposit(depositAmount);
		
		// Create the transaction list
		List<Transaction> transactionList = savingsAccount.getTransactions();
		
		// True if list exists
		assertNotNull(transactionList);
		
		// If the list exists...
		if (transactionList != null) {
			
			// Get the transaction from the list
			Transaction transaction = transactionList.get(0);
			
			// True if transaction type is correct
			assertEquals(transaction.getType(), TransactionType.DEPOSIT);
			
			// True if transaction amount is correct
			assertTrue(transaction.getAmount() == depositAmount);			
		} // if list not null		
	} // testGetTransactions

	// Test getTransaction
	@Test
	public void testGetTransaction() {	

		double depositAmount = 1.00;
		
		/* Perform a transaction so the transaction list will hold at least 
		 * one transaction
		 */
		savingsAccount.deposit(depositAmount);
		
		// Create the transaction list
		List<Transaction> transactionList = savingsAccount.getTransactions();
		
		// If the list exists...
		if (transactionList != null) {
			
			// Get the transaction from the list
			Transaction transaction = transactionList.get(0);
			
			// Get the transaction ID
			int transactionID = transaction.getId();
			
			// Get transaction from transaction ID
			Transaction transactionFromID = savingsAccount.getTransaction(
					                                       transactionID);
			
			// True if transaction is returned
			assertNotNull(transactionFromID);
			
			// True if transaction type is correct
			assertEquals(transactionFromID.getType(), TransactionType.DEPOSIT);
			
			// True if transaction amount is correct
			assertTrue(transactionFromID.getAmount() == depositAmount);
		} // if list not null
		else { // Else transaction list does not exist
			fail("Transaction list does not exist");
		}
	} // testGetTransaction
} // Class AccountTest