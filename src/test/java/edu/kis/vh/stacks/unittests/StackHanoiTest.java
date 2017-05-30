package edu.kis.vh.stacks.unittests;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.implementation.IStack;
import edu.kis.vh.stacks.implementation.StackArray;
import edu.kis.vh.stacks.implementation.StackList;
@RunWith(value = Parameterized.class)
public class StackHanoiTest {
	
	public IStack implementation;
	
	@Parameters
	public static List<Object[]> data() {
		return Arrays.asList(new Object[][]{{new StackArray()}, {new StackList()}});
	}
	
	public StackHanoiTest(IStack implementation) {
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
		StackHanoi stackObj = new StackHanoi();
		int testValue = 4;
		stackObj.push(testValue);
		int testValue1 = 5;
		stackObj.push(testValue1);
		int testValue2 = 3;
		stackObj.push(testValue2);

		int result = stackObj.pop();
		Assert.assertEquals(testValue2, result);
		int result1 = stackObj.reportRejected();
		Assert.assertEquals(1, result1);
		int result2 = stackObj.pop();
		Assert.assertEquals(testValue, result2);
	}
}
