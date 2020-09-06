package com.richmondjava.intro;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fizzbuzz;

	@Before
	public void setUp() throws Exception {
		fizzbuzz = new FizzBuzz();
	}

	@Test
	public void shouldReturnFizzIfTheLastNumberIsDivisibleByThree() {
		assertTrue("fizz".equals(fizzbuzz.getFizzBuzz(1, 9)));
	}
}
