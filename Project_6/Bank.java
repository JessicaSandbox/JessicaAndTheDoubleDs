


package Project_6;

import java.util.List;

public class Bank {
	
	
	
	Bank(String bankName){
		
		System.out.println("you have created:" + bankName);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello bank");
	}
	
	
	void addAccount(){
		
	}
	
	void removeAccount(String accountId){
		
	}
	
	void getAccounts(){
		
	}
	
	Account getAccount(String accountId){
		return null;
	}
	
	void addCustomer(){
		
	}
	
	void removeCustomer(String customerId){
		
	}
	
	void getCustomers(){
		
	}
	
	Customer getCustomer(String customerId){
		return null;
		
	}
	
	List<Customer> getCustomer(String lastName, String firstName){
		return null;
	}
	
	List<Account> getCustomersAccounts(String customerId){
		return null;
	}
	
}
