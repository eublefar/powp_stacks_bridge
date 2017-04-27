package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.StackHanoi;

public class StackHanoiTest {
	
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
