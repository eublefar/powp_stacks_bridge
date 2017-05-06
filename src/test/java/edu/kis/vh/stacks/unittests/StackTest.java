package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.list.StackArray;

public class StackTest {

	@Test
	public void testPush() {
		IStack stackObj = new Stack();
		int testValue = 4;
		stackObj.push(testValue);

		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		Stack stackObj = new Stack();
		boolean result = stackObj.isEmpty();
		Assert.assertEquals(true, result);

		stackObj.push(888);

		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		IStack stackObj = new Stack(new StackArray());
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackObj.isFull();
			Assert.assertEquals(false, result);
			stackObj.push(888);
		}

		boolean result = stackObj.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testTop() {
		IStack stackObj = new Stack();
		final int EMPTY_STACK_VALUE = -1;

		int result = stackObj.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		stackObj.push(testValue);

		result = stackObj.top();
		Assert.assertEquals(testValue, result);
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		IStack stackObj = new Stack();
		final int EMPTY_STACK_VALUE = -1;

		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		stackObj.push(testValue);

		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
