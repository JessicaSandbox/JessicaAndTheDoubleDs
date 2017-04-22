package Project_6;

/* Class SavingsAccount is an Account, but includes monthly interest payments.
 * A field defaultInterestRate holds the assigned monthly interest rate, and 
 * has both a setter and a getter. Class SavingsAccount is an Account, but 
 * includes monthly interest payments.
 */
public class SavingsAccount extends Account {

	// Create a new savings account 
	SavingsAccount ( double initialBalance, String customerId, 
			         String accountDescription ) { //
		super(Bank.getCustomer(customerId), initialBalance, accountDescription);
	}
	
	/* Adds a transaction "INTEREST PAYMENT" based on this account's monthly
	 * interest rate.
	 */
	void addInterest() { //
		
	}
	
	// Add money into account 
	void deposit (double amount) {
		
	}
	
	// Remove money from account 
	void withdraw (double amount) {
		
	} 
	 
	/* Getters, setters, toString, and other methods as needed
	 * You need to test any non-trivial methods your group decides are a good 
	 * idea.
	 */ 
} // Class SavingsAccount