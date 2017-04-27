package edu.kis.vh.stacks.list;

public class StackList {

	private static final int EMPTY_STACK_VALUE = -1;
	private Node last;

	public void pushElement(int i) {
		if (last == null) {
			last = new Node(i);
		} else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean empty() {
		return last == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (empty()) {
			return EMPTY_STACK_VALUE;
		}
		return last.getValue();
	}

	public int pop() {
		if (empty()) {
			return EMPTY_STACK_VALUE;
		}
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
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

