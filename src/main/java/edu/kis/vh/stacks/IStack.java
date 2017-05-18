package edu.kis.vh.stacks;

/**
 * @author evil_unicorn
 * Zmiana wartości była ułatwiona przez przeniesienie do interfejsu, ale też miała nieoczywiste efekty, dlatego że implementacja stosów
 * polegała na tej wartości, co ze swojej strony pokazuję potrzebę
 */
public interface IStack {

	public int EMPTY_STACK_VALUE = 0;
	
	int getTotal();

	void push(int i);

	boolean isFull();
	
	public boolean isEmpty();

	int top();

	int pop();

}