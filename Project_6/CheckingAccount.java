package Project_6;

// Class CheckingAccount is an Account, but includes various fees.
public class CheckingAccount extends Account{
	
	//initializations for variables
	
	String accountDescription;
	    String customerId;
	    double initialBalance;
	    float withdraw;
	    float deposit;
	    

	// Create a new checking account
	CheckingAccount (double initialBalance, String customerId, String accountDescription) {
		this.initialBalance = initialBalance;
		this.customerId = customerId;
		this.accountDescription = accountDescription;
		
	}
	
	// Adds a transaction "FEE" based on this account's monthly and other fees. 
	void applyFee( double amount ) {
		 if (initialBalance <= 1000) {
			  initialBalance = initialBalance * 0.1f;  
	           }
	       if (initialBalance > 1000) {
	    	   initialBalance = 1000 + (initialBalance * 0.07f);
	       }
	       return;
	       //fees applied 
		
	}
	
	// Add money into account 
	void deposit (double amount) {
		initialBalance = initialBalance + amount;
		    System.out.println(customerId + " " + accountDescription + " deposited " + deposit + ". Current Balance is" + initialBalance);

		
	}
	
	// Remove money from account 
	void withdraw (double amount) {
		  if (initialBalance >= amount) {
			  initialBalance = initialBalance - amount;
	            System.out.println(customerId + " " + accountDescription + " withdrew $" + amount + ". Current Balance is" + initialBalance);
	            //to provide accurate balance
	        }
	        if (initialBalance < amount) {
	            System.out.println("Unable to withdraw " + amount + " for " + customerId + " " + accountDescription + " due to poor funds.");
	        }
		//to provide a depleted balance 
	}
	
	/* Getters, setters, (for example, to get and set the overdraft fee), 
	 * toString, and other methods as needed (for example, inherited abstract
	 * methods)
	 *  
	 *  You need to test any non-trivial methods your group decides are a good 
	 *  idea. */ 
} // Class CheckingAccount
