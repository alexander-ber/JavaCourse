package cw02.oop.com.mybank;
import cw02.oop.com.mybank.BankAccount;

public class BankAccountApp {
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount(987654321);
		
		account1.deposit(1000);
		account1.printUserDetails();
		account1.withdrow(10.99f);
		account1.printUserDetails();
		account1.changeName("Miri Bar");
		
		//Don't do this way
		account1.printUserDetails();	
		
		//Print returned string
		System.out.println(account1.description());
		
		//Print default, use this call toString()
		System.out.println(account1);
	}
}
