package ca.andre.springboottest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstTest {

	Calculator calculator;

	@BeforeEach
	public void buildCalculator() {
		calculator = new Calculator();
	}

	@Test
	@DisplayName("Must sum two numbers")
	public void mustSumTwoNumbers() {

		// scenario
		int num1 = 10, num2 = 5;

		// execution
		int result = calculator.sum(num1, num2);

		// verification
		Assertions.assertThat(result).isEqualTo(15);
	}

	@Test
	@DisplayName("shouldn't sum negative numbers")
	public void shouldntSumNetagiveNumbers() {

		// scenario
		int num1 = -10, num2 = 5;

		// execution
		org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> calculator.sum(num1, num2));

		// verification
	}

	@Test
	@DisplayName("Must subtract two numbers")
	public void mustSubtractTwoNumbers() {

		// scenario
		int num1 = 10, num2 = 5;

		// execution
		int result = calculator.subtraction(num1, num2);

		// verification
		Assertions.assertThat(result).isEqualTo(5);
	}

	@Test
	@DisplayName("Must multiply two numbers")
	public void mustMultiplyTwoNumbers() {

		// scenario
		int num1 = 5, num2 = 5;

		// excecution
		int result = calculator.multiplication(num1, num2);

		// verification
		Assertions.assertThat(result).isEqualTo(25);
	}

	@Test
	@DisplayName("Must divide two numbers")
	public void mustDivideTwoNumbers() {

		// scenario
		double num1 = 10, num2 = 5;

		// execution
		double result = calculator.division(num1, num2);

		// verification
		Assertions.assertThat(result).isEqualTo(2);
	}

	@Test
	@DisplayName("Shouldn't divide negative numbers")
	public void shouldntDivideNetagiveNumbers() {

		// scenario
		double num1 = 10, num2 = 0;

		// execution
		org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> calculator.division(num1, num2));

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

		if (num1 == 0 || num2 == 0) {
			throw new RuntimeException("Division cannot be done by zero.");
		} else {
			return num1 / num2;
		}
	}

}
