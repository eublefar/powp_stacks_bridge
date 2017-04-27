package edu.kis.vh.stacks;

public class StackFIFO extends Stack {

	final private Stack temp = new Stack();

	@Override
	public int pop() {
		
		while (!isEmpty()) {
			temp.push(super.pop());
		}

		int ret = temp.pop();

		while (!temp.isEmpty()) {
			push(temp.pop());
		}

		return ret;
	}
	@Override	
	public int top() {
		if (isEmpty()) {
			return EMPTY_STACK_VALUE;
		}
		return ITEMS[0];
	}
}
