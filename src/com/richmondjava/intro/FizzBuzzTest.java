package com.richmondjava.intro;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	@Before
	public void setUp() throws Exception {
		FizzBuzz fizzbuzz = new FizzBuzz();
	}

	@Test
	public void shouldReturnBuzzIfNumberIsDivisibleByThree() {
		assertEquals("Fizz".equals(fizzbuzz.getFizzBuzz(0, 4)));
	}

}
