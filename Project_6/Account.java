package Project_6;

import java.util.*;

/* Class Account is responsible for managing the details of any type of 
 * account, including an accountId, customerId, description, account 
 * creation date, the current balance, and the account's transaction list.
 * Only the account description has a setter.
 */
public abstract class Account {
	
	/* Constructor for abstract class, taking a customer, initial balance, and
	 *  an account description. 
	 */
	Account ( Customer cust, double initBal, String desc ) { //
		
	}
	
	// Add money into account 
	abstract void deposit (double amount); //
	
	// Remove money from account 
	abstract void withdraw (double amount); //
    
	// Transfer funds between two accounts of a single customer.
	static void transfer ( Account fromAccount, Account toAccount, 
			               double amount ) { //
		
	}
	
	// Returns a List of all transactions for this account. 
	List<Transaction> getTransactions () { //
		return null;
	}
	
	// Returns the specified transaction.
	Transaction getTransaction ( int transactionId ) { //
		return null;
	}
	
	/* Getters, setters, toString, and other methods as needed
	 * You need to test any non-trivial methods your group decides are a good 
	 * idea. */ 
} // Class Account