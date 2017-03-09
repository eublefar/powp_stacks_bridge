package edu.kis.vh.stacks;

public class Stack {

	private static final int EMPTY_STACK_VALUE = -1;

	private static final int CAPACITY = 12;

	private int[] ITEMS = new int[CAPACITY];

	public int total = EMPTY_STACK_VALUE;

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
