package Project_6;

import java.util.List;
import java.util.*;

// import Project_6.*;
// import Project_6.TransactionType;

/* Class Bank is responsible for the main method, managing customers, and 
 * keeping track of various fees and interest rates; only the fees and rates 
 * have setter methods.
 */
public class Bank { //
	
	// Test code
	static Bank mainTestBank;
	String Name;

	// creates new bank object with given name
	public Bank(String name){ //
		
		// Test code
		Name = name;

		// Test code
		System.out.println("You have created: " + name);
	}
	
    /* Handles initialization tasks (such as persistence, if that was 
     * implemented in this project, which it is not)
     */
	public static void main(String[] args) { //
	
		// Test code
    	System.out.println("Hello from Main");
    		
    	// Test code
    	// Create new Bank object
        for (String string: args) {
        	mainTestBank = new Bank(string);
        }
		
		// Test Code: checking the Transaction constructor 
//		TransactionType type = TransactionType.DEPOSIT;
	//	Transaction TTT = new Transaction(type, 123.45, "This is a deposit transaction");
	} // Main

	// Add a new customer to the bank, using a GUI 
	void addCustomerGUI () { //
		
	}
	
	// Add a new customer to the bank; return the customer's ID 
	String addCustomer ( String lastName, String firstName ) { //
		return null;
	}
	
	// Get a Customer object, given a customer's ID 
	public static Customer getCustomer(String customerId){ //
		return null;
		
	}
	
	/* Get a List of Customer objects, given a customer's last and first 
	 * names.  (In general there may be multiple customers with the same 
	 * names; for testing, assume customer names are unique.)
	 */
	List<Customer> getCustomer(String lastName, String firstName){ //
		return null;

	}
	
	/* Generates a report of all current customers, in customer ID order, and 
	 * returns a SortedSet of customers
	 */
	SortedSet<Customer> getAllCustomers () { //
		return null;
	}
	
	/* Deletes a customer from the bank.  (In reality, just marks the customer
	 * as non-current.) */ 
	void removeCustomer(String customerId){ //
		
	}
	
	/* Generates a report of all current accounts by all customers, in account
	 *  ID order, and return a Sorted Set of accounts
	 */
	SortedSet<Account> getAllAccounts () { //
		return null;
	}
          
	/*    // Creates a new bank account 
	void addAccount(){

	} */
	
	/* Deletes a given account.  (In the real world, just marks it as defunct 
	 * or something.) 
	 */
	/* void removeAccount(String accountId){
		
	} */
	
	// Generates a report of all current accounts, in account ID order 
	/* void getAccounts(){
		
	} */
	
	// Find an account given an account ID 
	/* Account getAccount(String accountId){
		return null;
	} */
		
	// Generates a report of all current customers, in customer ID order 
	/* void getCustomers(){
		
	} */
	
	// Return a List of a given customer's accounts (if any) 
	/* List<Account> getCustomersAccounts(String customerId){
		return null;
	} */
	
	/* Getters, setters, toString, and other methods as needed
	 * You need to test any non-trivial methods your group decides are a good 
	 * idea. */ 
} // Class Bank