package edu.kis.vh.stacks;

public interface IStack {

	public int EMPTY_STACK_VALUE = 0;
	
	int getTotal();

	void push(int i);

	boolean isFull();
	
	public boolean isEmpty();

	int top();

	int pop();

}