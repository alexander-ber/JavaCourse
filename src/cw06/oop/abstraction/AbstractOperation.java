package cw06.oop.abstraction;

public abstract class AbstractOperation {
	
	protected int operand1;
	protected int operand2;
	
	abstract public int execute();
	abstract public char getSymbol();
	
	public AbstractOperation(int operand1, int operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	public String toString() {
		return " " + this.operand1 + " " +getSymbol() + " " + this.operand2 + " = " + execute();
	}

}
