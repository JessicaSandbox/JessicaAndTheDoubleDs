package Project_6;

import static org.junit.Assert.*;
import org.junit.Test;

public class TransactionTest {
	
	final double transactionAmount = 123.45;
	final TransactionType transactionType = TransactionType.DEPOSIT;
	final String transactionDescription = "Test transaction";
	
	// Test Transaction constructor
	@Test
	public void testTransaction(){
		
		// Test the Transaction constructor 
		Transaction testTransaction = new Transaction(transactionType, transactionAmount, transactionDescription);
		
		// True if Transaction object was created
		assertNotNull(testTransaction);
		
		// True if transaction amount is correct
		assertTrue(testTransaction.getAmount() == transactionAmount);
		
		// True if transaction description is correct
		assertEquals(testTransaction.getDescription(), transactionDescription);
	}
} // Class TransactionTest
	