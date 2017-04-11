package Project_6;

/* Class Account is responsible for managing the details of any type of 
 * account, including an accountId, customerId, description, account 
 * creation date, the current balance, and the account's transaction list.
 */
public abstract class Account {

	// Transfer funds between two accounts of a single customer.
	static void transfer (Account fromAccount, Account toAccount, double amount ) {
		
	}
	 
	// Add money into account 
	abstract void deposit (double amount);
	
	// Remove money from account 
	abstract void withdraw (double amount);
	
	/* Getters, setters, toString, and other methods as needed
	 * You need to test any non-trivial methods your group decides are a good 
	 * idea. */ 
} // Class Account