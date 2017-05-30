package edu.kis.vh.stacks.unittests;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.implementation.IStack;
import edu.kis.vh.stacks.implementation.StackArray;
import edu.kis.vh.stacks.implementation.StackList;

@RunWith(value = Parameterized.class)
public class StackTest {

	public IStack implementation;
	
	@Parameters
	public static List<Object[]> data() {
		return Arrays.asList(new Object[][]{{new StackArray()}, {new StackList()}});
	}
	
	public StackTest(IStack implementation) {
		this.implementation = implementation;
	}

	@After
	public void tearDown() {
		while(!implementation.isEmpty()) {
			implementation.pop();
		}
	}

	
	@Test
	public void testPush() {
		
		Stack stackObj = new Stack(implementation);
		int testValue = 4;
		stackObj.push(testValue);

		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		Stack stackObj = new Stack(implementation);
		boolean result = stackObj.isEmpty();
		Assert.assertEquals(true, result);

		stackObj.push(888);

		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		Stack stackObj = new Stack(new StackArray());
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackObj.isFull();
			System.out.println("" + i + " " + result);
			Assert.assertEquals(false, result);
			stackObj.push(888);
		}

		boolean result = stackObj.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testTop() {
		Stack stackObj = new Stack(implementation);
		final int EMPTY_STACK_VALUE = 0;

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
		Stack stackObj = new Stack(implementation);
		final int EMPTY_STACK_VALUE = 0;

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
