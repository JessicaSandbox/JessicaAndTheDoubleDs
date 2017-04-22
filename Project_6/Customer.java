package Project_6;

import java.util.*;

/* Class Customer is responsible for managing a customer's details, including 
 * that customer's accounts.  Fields include a reference to the owning bank, 
 * a unique customer ID, Customer's first and last names, and a SortedSet of 
 * transactions (not a List for no particular reason).  Only the customer's 
 * name fields have setters.
 */
public class Customer {
	
	/* Creates a new Customer object from a name.  Note for this project, we 
	 * assume names are unique. 
	 */
	Customer(String lastName, String firstName) { //
		
	}
	
	/* Creates and returns new savings account, with the specified initial 
	 * balance and account description 
	 */
	SavingsAccount addSavingsAccount ( double initBal, String desc ) { //
		return null;
	}
	
	/* Returns an Account with the given account ID, or null if no such 
	 * account 
	 */
	Account getAccount ( String accountId) { //
		return null;
	}
   	
	/* Returns a read-only SortedSet of the customer's active accounts (if 
	 * any) 
	 */
	SortedSet<Account> getCustomerAccounts() { //
		return null;
	}
	
	/* Removes an Account with the given account ID; in a real program, you 
	 * don't delete info, just mark it deleted. 
	 */
	void removeAccount ( String accountId ) { //
		
	}
    	
	// The total fees paid by this customer for year-to-date 
	double YtdFees () { //
		return 123.45;
	}
	
	// Returns the total interest paid to this customer for year-to-date 
	double YtdInterest () { //
		return 678.99;
	}
	
	/* Getters, setters, toString, and other methods as needed
	 * You need to test any non-trivial methods your group decides are a good 
	 * idea. */ 
} // Class Customer