package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();
//		second line should start after braces
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(),
						   factory.getFIFOStack(), factory.getHanoiStack()};
//		no braces
		for (int i = 1; i < 15; i++) {
			for (int j = 0; j < 3; j++) {
				stacks[j].push(i);
			}
		}
//		too many tabulations
		java.util.Random rn = new java.util.Random();
//		braces
		for (int i = 1; i < 15; i++) {
			stacks[3].push(rn.nextInt(20));
		}
		
		for (int i = 0; i < stacks.length; i++) {
//			braces
			while (!stacks[i].isEmpty()) {
				System.out.print(stacks[i].pop() + "  ");
			}
//			tabulation
			System.out.println();
		}
//		second line should start after braces
		System.out.println("total rejected is "
							+ ((StackHanoi) stacks[3]).reportRejected());
//		blank lines
	}
}

// Alt + arrow left/right : Go to previous / go to next Editor Window