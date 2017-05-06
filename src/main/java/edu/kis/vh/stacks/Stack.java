package edu.kis.vh.stacks;

import bridge_lab.StackArray;
import edu.kis.vh.stacks.list.StackList;

public class Stack implements IStack {

	protected  IStack stack = new StackList();

	
	public Stack() {
		
	}
	
	
	public Stack(IStack stack) {
		super();
		this.stack = stack;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#getTotal()
	 */
	@Override
	public int getTotal() {
		return stack.getTotal();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#push(int)
	 */
	@Override
	public void push(int i) {
		stack.push(i);
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#isFull()
	 */
	@Override
	public boolean isFull() {
		return stack.isFull();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#top()
	 */
	@Override
	public int top() {
		return stack.top();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#pop()
	 */
	@Override
	public int pop() {
		return stack.pop();
	}
	


}
