package ca.andre.springboot.first_test;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest {
	
	@Test
	public void testStructure() {
		
		// scenario
		int number1 = 10, number2 = 5;
		
		// execution
		int result = number1 + number2;
		
		// verification
		Assert.assertEquals(15, result);
	}
	

}
