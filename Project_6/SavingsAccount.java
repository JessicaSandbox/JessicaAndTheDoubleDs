package Project_6;

// import static TransactionType;

/**
 * @author wpollock
 *
 */
public class SavingsAccount extends Account {
	// Default monthly interest rate, applied on last day of statement cycle:
	private static double DEFAULT_INTEREST_RATE = 2.0;  // a percent

	/**  SavingsAccount constructor, using default interest rate.
	 * @param cust
	 * @param initialBalance
	 * @param accountDescription
	 */
    public SavingsAccount(Customer cust, double initialBalance,
            String accountDescription) {
        super(cust, initialBalance, accountDescription);
    }

    /** SavingsAccount constructor, using a custom interest rate.
     * @param cust
     * @param initialBalance
     * @param accountDescription
     * @param interestRate
     */
    public SavingsAccount(Customer cust, double initialBalance,
            String accountDescription, double interestRate) {
        super(cust, initialBalance, accountDescription);
        // Stub
    }

	@Override
    public void deposit(double amount) {
		  // Stub
    }

    @Override
    public void withdraw(double amount) {
    	  // Stub
    }
    
    /** Adds a transaction "INTEREST PAYMENT" based on this account's
     * monthly interest rate.
     * @param rate Interest rate to apply, as a percentage (e.g. 2.1".
     */
    public void addInterestTransaction ( double rate ) {
    	  // Stub
    }

    /**
	 * @return the interestRate
	 */
	public static double getDefaultInterestRate() {
		return 0.00;  // Stub
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public static void setDefaultInterestRate(double interestRate) {
		  // Stub
	}
}