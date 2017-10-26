package com.mybank;
import com.mybank.BankAccount;

public class BankAccountApp {
	public static void main(String[] args) {
		int i = 0;
		
		BankAccount account1 = new BankAccount(987654321);
		
		account1.deposit(1000);
		account1.printUserDetails();
		account1.withdrow(10.99f);
		account1.printUserDetails();
		account1.changeName("Miri Bar");
		account1.printUserDetails();	
		
		System.out.println(account1);
	}
}
