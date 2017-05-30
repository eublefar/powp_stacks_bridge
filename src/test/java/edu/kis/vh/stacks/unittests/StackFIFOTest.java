package edu.kis.vh.stacks.unittests;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.implementation.IStack;
import edu.kis.vh.stacks.implementation.StackArray;
import edu.kis.vh.stacks.implementation.StackList;
@RunWith(value = Parameterized.class)
public class StackFIFOTest {

	public IStack implementation;
	
	@Parameters
	public static List<Object[]> data() {
		return Arrays.asList(new Object[][]{{new StackArray()}, {new StackList()}});
	}
	
	public StackFIFOTest(IStack implementation) {
		this.implementation = implementation;
	}

	@After
	public void tearDown() {
		while(!implementation.isEmpty()) {
			implementation.pop();
		}
	}
	
	
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
