package sml;

/**
 * This class ....
 * 
 * @author someone
 */

public class BnzInstruction extends Instruction {

	private int op1;
	private String nextOp;

	public BnzInstruction(String label, String op) {
		super(label, op);
	}

	public BnzInstruction(String label, int op1, String nextOp) {
		this(label, "bnz");
		this.op1 = op1;
		this.nextOp = nextOp;
	}

	@Override
	public void execute(Machine m) {
		StringBuilder sb = new StringBuilder(label);
		System.out.println(label);
		sb.deleteCharAt(0);
		System.out.println(label);
		int nextOpInt = Integer.parseInt(label);
		if (m.getRegisters().getRegister(op1) != 0) {
			
		}
	}

	@Override
	public String toString() {
		return super.toString() + " " + op1 + " / " + op2 + " to " + result;
	}
}
