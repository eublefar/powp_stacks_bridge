package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.implementation.StackArray;
import edu.kis.vh.stacks.implementation.StackList;

public class ArrayStacksFactory implements IStacksFactory {

	@Override
	public IStack getStandardStack() {
		// TODO Auto-generated method stub
		return new StackArray();
	}

	@Override
	public IStack getFalseStack() {
		// TODO Auto-generated method stub
		return new StackList();
	}

	@Override
	public StackFIFO getFIFOStack() {
		// TODO Auto-generated method stub
		return new StackFIFO(new StackArray());
	}

	@Override
	public StackHanoi getHanoiStack() {
		// TODO Auto-generated method stub
		return new StackHanoi(new StackArray());
	}

}
