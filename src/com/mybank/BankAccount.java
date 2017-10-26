package com.mybank;

public class BankAccount {
	private String clientName;
	private int accountNumber;
	private float balance;
	
	public BankAccount(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void deposit(float amount) {
		if(amount > 0) {
			this.balance += amount;
		}
	}
	
	public void changeName(String clientName) {
		this.clientName = clientName;
	}
	
	public void withdrow(float amount) {
		if(this.balance >= amount) {
			this.balance -= amount;
		}
    }
	
	public String toString() {
		return "clientName:" + clientName + " accountNumber:" + accountNumber + " balance:" + balance;
	}
	
	public void printUserDetails() {
		System.out.println("clientName:" + clientName + " accountNumber:" + accountNumber + " balance:" + balance);
    }
	

}
