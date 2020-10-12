package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logic.model.Model;

class TestSum {

	@Test
	void testSum() {
		Model model = new Model();
		int input1= 2;
		int input2 = 3;
		int output = 5;
		String operator = "+";
		assertEquals(output, model.calculate(input1, input2, operator));
	}

}
