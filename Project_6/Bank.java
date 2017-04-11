package Project_6;

import java.util.List;

import Project_6.Transaction;
import Project_6.TransactionType;

/* Class Bank is responsible for the main method, and managing customers and 
 * accounts.
 */
public class Bank {
	
	// Test code
	static Bank mainTestBank;
	public String Name;

	// creates new bank object with given name
	public Bank(String name){
		
		// Test code
		Name = name;
		
	//	Bank bank1 = new Bank();
	//	bank1.addAccount();		
		
		System.out.println("You have created: " + name);
	}
	
    /* Handles initialization tasks (such as persistence, if that was 
     * implemented in this project, which it is not)
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    		System.out.println("Hello from Main!!!");
    		
    		// Create new Bank object
    		mainTestBank = new Bank("Main Test Bank");
		
		// Test Code: checking the Transaction constructor 
		TransactionType type = TransactionType.DEPOSIT;
		Transaction TTT = new Transaction(type, 123.45, "This is a deposit transaction");
	} // Main
	
    // Creates a new bank account 
	void addAccount(){

	}
	
	/* Deletes a given account.  (In the real world, just marks it as defunct 
	 * or something.) 
	 */
	void removeAccount(String accountId){
		
	}
	
	// Generates a report of all current accounts, in account ID order 
	void getAccounts(){
		
	}
	
	// Find an account given an account ID 
	Account getAccount(String accountId){
		return null;
	}
	
	// Add a new customer to the bank 
	void addCustomer(){
		
	}
	
	/* Deletes a customer from the bank.  (In reality, just marks the customer
	 * as non-current.) */ 
	void removeCustomer(String customerId){
		
	}
	
	// Generates a report of all current customers, in customer ID order 
	void getCustomers(){
		
	}
	
	// Get a Customer object, given a customer's ID 
	Customer getCustomer(String customerId){
		return null;
		
	}
	
	/* Get a List of Customer objects, given a customer's last and first 
	 * names.  (In this version, assume customer names are unique.) 
	 */
	List<Customer> getCustomer(String lastName, String firstName){
		return null;
	}
	
	// Return a List of a given customer's accounts (if any) 
	List<Account> getCustomersAccounts(String customerId){
		return null;
	}
	
	/* Getters, setters, toString, and other methods as needed
	 * You need to test any non-trivial methods your group decides are a good 
	 * idea. */ 
} // Class Bank