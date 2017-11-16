package cw06.oop.abstraction;

import java.util.Scanner;

public class OperationApp {
	
	public static void main(String[] args) {
		
		AbstractOperation plus = new addOperation(2,2);
		System.out.println(plus);
		
		AbstractOperation minus = new subtractOperation(2,2);
		System.out.println(minus);
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter operation: ");
		String operation = in.next();
		
		//Using polymorphism
		AbstractOperation op;
		if ( operation.equals("+")) {
			op = new addOperation(1,2);
		} else {
			op = new subtractOperation(2,2);
		}
		System.out.println(op);
		
		if (op instanceof addOperation) {//ask in runtime what type of class
			addOperation add = (addOperation) op; //Casting example of type
			System.out.println( add.say() ); //call method of addOperation
		}
	}
}
