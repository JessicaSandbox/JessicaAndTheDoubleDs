


package Project_6;

import java.util.List;

public class Bank {
	
	private static void Bank(String name){
		
		//creates new bank object with given name
		Bank bank1 = new Bank();
		bank1.addAccount();
		
		
		System.out.println("you have created:" + name);
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello bank");
		Bank("MyBank");
	}
	

	void addAccount(){
		
		//creates new bank account
		
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
