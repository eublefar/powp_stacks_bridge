package edu.kis.vh.stacks;

public interface IStackRefined {

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#getTotal()
	 */
	int getTotal();

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#push(int)
	 */
	void push(int i);

	boolean isEmpty();

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#isFull()
	 */
	boolean isFull();

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#top()
	 */
	int top();

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#pop()
	 */
	int pop();

}