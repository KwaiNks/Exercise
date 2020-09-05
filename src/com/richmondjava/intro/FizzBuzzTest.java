package com.richmondjava.intro;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fizzBuzz;

	@Before
	public void setUp() throws Exception {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void shouldReturnFizzIfNumberIsDivisibleByThree() {
		assertTrue("Fizz".equals(fizzBuzz.fizzBuzz(1, 5)));
	}
}
