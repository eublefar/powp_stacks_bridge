package edu.kis.vh.stacks.implementation;

import edu.kis.vh.stacks.IStack;

public class StackArray implements IStack {
	protected static final int CAPACITY = 12;

	protected int[] ITEMS = new int[CAPACITY+1];

	protected int total = IStack.EMPTY_STACK_VALUE;

	public int getTotal() {
		return total;
	}

	public void push(int i) {
		if (!isFull()) {
			ITEMS[++total] = i;
		}
	}

	public boolean isEmpty() {
		return total == IStack.EMPTY_STACK_VALUE;
	}

	public boolean isFull() {
		return total == CAPACITY;
	}

	public int top() {
		if (isEmpty()) {
			return IStack.EMPTY_STACK_VALUE;
		}
		return ITEMS[total];
	}

	public int pop() {
		if (isEmpty()) {
			return IStack.EMPTY_STACK_VALUE;
		}
		return ITEMS[total--];
	}

}
