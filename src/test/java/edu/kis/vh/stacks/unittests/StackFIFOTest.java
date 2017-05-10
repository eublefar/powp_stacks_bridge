package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.StackFIFO;

public class StackFIFOTest {

	@Test
	public void testTop() {
		StackFIFO stackObj = new StackFIFO();
		final int EMPTY_STACK_VALUE = 0;

		int result = stackObj.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		stackObj.push(testValue);
		int testValue1 = 5;
		stackObj.push(testValue1);


		result = stackObj.top();
		Assert.assertEquals(testValue, result);
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		StackFIFO stackObj = new StackFIFO();
		final int EMPTY_STACK_VALUE = 0;

		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		stackObj.push(testValue);
		int testValue1 = 5;
		stackObj.push(testValue1);

		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(testValue1, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
}
