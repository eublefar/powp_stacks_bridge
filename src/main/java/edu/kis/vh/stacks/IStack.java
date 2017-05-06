package edu.kis.vh.stacks;

public interface IStack {

	int getTotal();

	void push(int i);

	boolean isFull();
	
	public boolean isEmpty();

	int top();

	int pop();

}