package ca.andre.springboot.first_test;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FirstTest {

	@Test
	public void mustSumTwoNumbers() {

		// scenario
		Calculator calculator = new Calculator();
		int num1 = 10, num2 = 5;

		// execution
		int result = calculator.sum(num1, num2);

		// verification
		Assertions.assertThat(result).isEqualTo(15);
	}

	@Test(expected = RuntimeException.class)
	public void shouldntSumNetagiveNumbers() {

		// scenario
		Calculator calculator = new Calculator();
		int num1 = -10, num2 = 5;

		// execution
		int result = calculator.sum(num1, num2);

		// verification
	}
	
	@Test
	public void mustSubtractTwoNumbers() {
		
		// scenario
		Calculator calculator = new Calculator();
		int num1 = 10, num2 = 5;
		
		// execution
		int result = calculator.subtraction(num1, num2);
		
		// verification
		Assertions.assertThat(result).isEqualTo(5);
	}
	
	public void mustMultiplyTwoNumbers() {
		
		// scenario
		Calculator calculator = new Calculator();
		int num1 = 5, num2 = 5;
		
		// excecution
		int result = calculator.multiplication(num1, num2); 
		
		// verification
		Assertions.assertThat(result).isEqualTo(25);
	}
	
	@Test
	public void mustDivideTwoNumbers() {
		
		// scenario
		Calculator calculator = new Calculator();
		double num1 = 10, num2 = 5;
		
		// execution
		double result = calculator.division(num1, num2);
		
		// verification
		Assertions.assertThat(result).isEqualTo(2);
	}
	
	@Test(expected = RuntimeException.class)
	public void shouldntDivideNetagiveNumbers() {
		
		// scenario
		Calculator calculator = new Calculator();
		double num1 = 10, num2 = 0;
		
		// execution
		double result = calculator.division(num1, num2);
		
		// verification
	}

}

class Calculator {

	int sum(int num1, int num2) {

		if (num1 < 0 || num2 < 0) {
			throw new RuntimeException("The sum cannot contain negative numbers.");
		} else {

			return num1 + num2;
		}
	}
	
	int subtraction(int num1, int num2) {
		
		return num1 - num2;
	}
	
	int multiplication(int num1, int num2) {
		return num1 * num2;
	}
	
	double division(double num1, double num2) {
		
		if(num1 == 0 || num2 ==0) {
			throw new RuntimeException("Division cannot be done by zero.");
		} else {
			return num1 / num2;
		}
	}
	

}
