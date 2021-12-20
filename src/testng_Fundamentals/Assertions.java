package testng_Fundamentals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	@Test
	public void paraneterA() {
		
//		String actual = "Hello World";
//		String expected = "Hello World";
//		Assert.assertEquals(expected, actual);
		
		String expOutput = "Hello";
		String actOutput = "Hello1";
		
//		Assert.assertEquals(expOutput, actOutput);
//		Assert.assertTrue(2<1);
//		Assert.assertFalse(1>2);
//		Assert.assertNotEquals(expOutput, actOutput);
		Assert.fail("Deliberate Failure");
		
	}

}
