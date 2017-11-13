package cw06.oop.abstraction;

public class addOperation extends AbstractOperation {
	
	public addOperation(int operand1, int operand2) {
		super(operand1, operand2);
	}

	@Override
	public int execute() {
		return (int)(operand1 + operand2);
	}
	
	@Override
	public char getSymbol() {
		return '+';
	}
}
