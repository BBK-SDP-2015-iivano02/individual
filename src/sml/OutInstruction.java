package sml;

/**
 * This class ....
 * 
 * @author someone
 */

public class OutInstruction extends Instruction {

	private int result;
	private int op1;
	private int op2;

	public OutInstruction(String label, String op) {
		super(label, op);
	}

	public OutInstruction(String label, int op1) {
		this(label, "out");
		this.op1 = op1;
	}

	@Override
	public void execute(Machine m) {
		int value1 = m.getRegisters().getRegister(op1);
		int value2 = m.getRegisters().getRegister(op2);
		m.getRegisters().setRegister(result, value1 / value2);
	}

	@Override
	public String toString() {
		return super.toString() + " " + op1 + " / " + op2 + " to " + result;
	}
}
