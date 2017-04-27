package edu.kis.vh.stacks.list;

public class Node {
// Stack List uses getValue(); in pop and peek functions
// 
//	
	final private int value; 
//	getNext and getPrev are now used in StackList
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
//	public void setValue(int value) { 
//		this.value = value;
//	}

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
