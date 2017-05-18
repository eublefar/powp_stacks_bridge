package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementation.StackArray;

/**
 * @author evil_unicorn
 * FIFO stack 
 * Używa StackArray dlatego że często dodaje i usuwa elementy - top, pop. 
 * StackArray jest szybszy z tego względu że nie potrzebuję alokacji żadnej pamięci przy dodawaniu i usuwaniu
 */
public class StackFIFO extends Stack {

	public StackFIFO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StackFIFO(IStack stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}
	//TODO: implement without temp stack
	final private IStack temp = new StackArray();

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
