package edu.kis.vh.stacks;

/**
 * @author evil_unicorn
 * FIFO stack 
 */
public class StackFIFO extends Stack {
//TODO: implement without temp stack
	final private Stack temp = new Stack();

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.Stack#pop()
	 */
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
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.Stack#top()
	 */
	@Override	
	public int top() {
		while (!isEmpty()) {
			temp.push(super.pop());
		}

		int ret = temp.top();

		while (!temp.isEmpty()) {
			push(temp.pop());
		}

		return ret;
	}
}
