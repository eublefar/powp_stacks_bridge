package edu.kis.vh.stacks.implementation;

import edu.kis.vh.stacks.IStack;

public class StackArray implements IStack {
	protected static final int EMPTY_STACK_VALUE = -1;

	protected static final int CAPACITY = 12;

	protected int[] ITEMS = new int[CAPACITY];

	protected int total = EMPTY_STACK_VALUE;

	public int getTotal() {
		return total;
	}

	public void push(int i) {
		if (!isFull()) {
			ITEMS[++total] = i;
		}
	}

	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}

	public boolean isFull() {
		return total == 11;
	}

	public int top() {
		if (isEmpty()) {
			return EMPTY_STACK_VALUE;
		}
		return ITEMS[total];
	}

	public int pop() {
		if (isEmpty()) {
			return EMPTY_STACK_VALUE;
		}
		return ITEMS[total--];
	}

}
