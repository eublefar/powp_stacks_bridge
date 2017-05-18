package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementation.StackArray;
import edu.kis.vh.stacks.implementation.StackList;

/**
 * @author nik
 * Konsekwencją zamniany typu zmniennej stack z StackArray na interfejs IStack jest to 
 * że klasa Stack może być zaimplementowana przez różne klasy. Wynnikiem tego też jest to 
 * że klasa Stack jest faktycznie zbędna.
 * 
 * Quick Type Hierarchy pozwala na przeglądanie hierarchii dotyczącej konkretnego elementu (n.p. przeciążania funkcji) 
 * oraz przesuwania w tej hierarchii. Użycie myszy i ctrl pozwala na przesuwanie wyżej po tej hierarchii oraz znależenie implementacji tej funkcji.
 */
public class Stack implements IStack {

	protected  IStack stack = new StackList();

	
	public Stack() {
		
	}
	
	
	public Stack(IStack stack) {
		super();
		this.stack = stack;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#getTotal()
	 */
	@Override
	public int getTotal() {
		return stack.getTotal();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#push(int)
	 */
	@Override
	public void push(int i) {
		stack.push(i);
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#isFull()
	 */
	@Override
	public boolean isFull() {
		return stack.isFull();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#top()
	 */
	@Override
	public int top() {
		return stack.top();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStack#pop()
	 */
	@Override
	public int pop() {
		return stack.pop();
	}
	


}
