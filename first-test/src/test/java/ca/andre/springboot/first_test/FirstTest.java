package ca.andre.springboot.first_test;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FirstTest {

	@Test
	public void mustSumTwoNumbers() {

		// scenario
		Calculator calculator1 = new Calculator();
		int number1 = 10, number2 = 5;

		// execution
		int result = calculator1.sum(number1, number2);

		// verification
		Assertions.assertThat(result).isEqualTo(15);
	}

	@Test(expected = RuntimeException.class)
	public void shouldntSumNetagiveNumbers() {

		// scenario
		Calculator calculator2 = new Calculator();
		int num1 = -10, num2 = 5;

		// execution
		int res = calculator2.sum(num1, num2);

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

}
