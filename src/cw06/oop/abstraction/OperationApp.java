package cw06.oop.abstraction;

public class OperationApp {
	
	public static void main(String[] args) {
		
		AbstractOperation plus = new addOperation(2,2);
		System.out.println(plus);
		
		AbstractOperation minus = new subtractOperation(2,2);
		System.out.println(minus);
	}
}
