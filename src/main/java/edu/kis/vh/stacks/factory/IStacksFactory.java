package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public interface IStacksFactory {
	
	public IStack getStandardStack();

	public IStack getFalseStack();

	public StackFIFO getFIFOStack();

	public StackHanoi getHanoiStack();

}
