package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.IStackRefined;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public interface IStacksFactory {
	
	public IStackRefined getStandardStack();

	public IStackRefined getFalseStack();

	public StackFIFO getFIFOStack();

	public StackHanoi getHanoiStack();

}
