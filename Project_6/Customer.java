package Project_6;

import java.util.*;

// Class Customer is responsible for managing a customers details, including that customer's accounts.
public class Customer {
	
	// Creates a new Customer object from a name.  Note for this project, we assume names are unique. 
	Customer(String lastName, String firstName) {
		
	}
	
	// Returns a read-only SortedSet of the customer's active accounts (if any) 
	SortedSet<Account> getCustomerAccounts() {
		return null;
	}
	
	// Returns an Account with the given account ID, or null if no such account 
	Account getAccount ( String accountId) {
		return null;
	}
	
	// The total fees paid by this customer for year-to-date 
	double YtdFees () {
		return 123.45;
	}
	
	// Returns the total interest paid to this customer for year-to-date 
	double YtdInterest () {
		return 678.99;
	}
	
	/* Getters, setters, toString, and other methods as needed
	 * You need to test any non-trivial methods your group decides are a good 
	 * idea. */ 
} // Class Customer