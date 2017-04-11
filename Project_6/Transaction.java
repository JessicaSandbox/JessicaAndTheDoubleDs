package Project_6;

/* Class Transaction objects represent any deposit or withdrawal on any 
 * account.  (Note transfers are implemented as a pair of transactions.) */
public class Transaction implements Comparable<Transaction> {
	
	// Test code
	static double Amount;
	
	// Create a new transaction 
	public Transaction(TransactionType type, double amount, String description) {
		
		Amount = amount;
	}
	
	//@Override
	public int compareTo(Transaction arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* Getters, setters, (for example, to get and possibly set the id, 
	 * transaction timestamp, type, amount, and description), toString, and 
	 * other methods as needed
	 * 
	 * You need to test any non-trivial methods your group decides are a good 
	 * idea. */
} // Class Transaction