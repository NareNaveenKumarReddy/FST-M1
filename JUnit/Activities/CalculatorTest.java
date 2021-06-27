package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Calculator;

//@Disabled("We can disable all methods of a class")
public class CalculatorTest {
	
	@Test
	@DisplayName("Adding 2 Positive Numbers")
	public void addtest1() {
		Calculator calc = new Calculator();
		int sum = calc.add(10, 20);
		System.out.println("The sum is: "+sum);
	}
	
	@DisplayName("Adding 2 Negative Numbers")
	@Test
	@Disabled("Here we can mention why this method is disabled")
	public void addtest2() {
		Calculator calc = new Calculator();
		int sum = calc.add(-10, -10);
		System.out.println("The sum is: "+sum);
	}
	
	// private test methods cannot be executed using Junit
	@Test
	private void addtest3() {
		Calculator calc = new Calculator();
		int sum = calc.add(-10, -10);
		System.out.println("The sum is: "+sum);
	}


}
