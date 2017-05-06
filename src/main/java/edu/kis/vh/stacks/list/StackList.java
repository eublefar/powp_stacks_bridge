package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.IStack;

public class StackList implements IStack {

	private static final int EMPTY_STACK_VALUE = -1;
	private Node last;

	public void push(int i) {
		if (last == null) {
			last = new Node(i);
		} else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty()) {
			return EMPTY_STACK_VALUE;
		}
		return last.getValue();
	}

	public int pop() {
		if (isEmpty()) {
			return EMPTY_STACK_VALUE;
		}
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	@Override
	public int getTotal() {
		int c =0;
		Node node = last;
		while(last != null) {
			node = node.getPrev();
			c++;
		}
		return c;
	}

}

class Node {
	// Stack List uses getValue(); in pop and peek functions
	// 
	//	
		final private int value; 
//		getNext and getPrev are now used in StackList
	//	
	//	
		private Node prev;
		private Node next;
	//
	//	
	//	
		public Node(int i) {
			this.value = i;
		}

		public int getValue() {
			return value;
		}
	//This setter is not needed
//		public void setValue(int value) { 
//			this.value = value;
//		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

	}

