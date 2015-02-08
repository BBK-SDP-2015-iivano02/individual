package sml;

/**
 * This class ....
 * 
 * @author someone
 */

public class BnzInstruction extends Instruction {

	private int op1;
	private int nextOp;

	public BnzInstruction(String label, String op) {
		super(label, op);
	}

	public BnzInstruction(String label, int op1, int nextOp) {
		this(label, "bnz");
		this.op1 = op1;
		
	}

	@Override
	public void execute(Machine m) {
	}

	@Override
	public String toString() {
		return super.toString() + " " + op1 + " / " + op2 + " to " + result;
	}
}
