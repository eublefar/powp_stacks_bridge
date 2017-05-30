package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.IStacksFactory;
import edu.kis.vh.stacks.factory.ListStacksFactory;

class StacksDemo {

	public static void main(String[] args) {
		IStacksFactory factory = new DefaultStacksFactory();
//		second line should start after braces
		testStacks(factory);
		
		factory = new ListStacksFactory();
		testStacks(factory);
		
		factory = new ArrayStacksFactory();
		testStacks(factory);
	}

	static void testStacks(IStacksFactory factory) {
		IStack[] stacks = { factory.getStandardStack(), factory.getFalseStack(),
						   factory.getFIFOStack(), factory.getHanoiStack()};
//		no braces
		initStacksByRange(stacks, 15);
//		too many tabulations
		java.util.Random rn = new java.util.Random();
//		braces
		for (int i = 1; i < 15; i++) {
			stacks[3].push(rn.nextInt(20));
		}
		printStacks(stacks);
//		second line should start after braces
		System.out.println("total rejected is "
							+ ((StackHanoi) stacks[3]).reportRejected());
//		blank lines
	}

	static void printStacks(IStack[] stacks) {
		for (int i = 0; i < stacks.length; i++) {
//			braces
			while (!stacks[i].isEmpty()) {
				System.out.print(stacks[i].pop() + "  ");
			}
//			tabulation
			System.out.println();
		}
	}

	static void initStacksByRange(IStack[] stacks, int range) {
		for (int i = 1; i < range; i++) {
			for (int j = 0; j < stacks.length; j++) {
				stacks[j].push(i);
			}
		}
	}
}

// Alt + arrow left/right : Go to previous / go to next Editor Window