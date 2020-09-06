package com.richmondjava.intro;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fizzbuzz;

	@Before
	public void setUp() {
		fizzbuzz = new FizzBuzz();
	}

	@Test
	public void shouldReturnFizzIfTheLastNumberIsDivisibleByThree() {
		assertEquals("fizz", fizzbuzz.getFizzBuzz(9));
	}
	
	@Test
	public void shouldReturnBuzzIfTheLastNumberIsDivisibleByFive() {
		assertEquals("buzz", fizzbuzz.getFizzBuzz(5));
	}
	
	@Test
	public void shouldReturnFizzBuzzIfTheLastNumberIsDivisibleByThreeAndFive() {
		assertEquals("fizz-buzz", fizzbuzz.getFizzBuzz(15));
	}

	@Test
	public void shouldReturnCorrectFizzBuzzEntriesFromOneToTen(){
		assertEquals("12fizz4buzzfizz78fizzbuzz", fizzbuzz.getFizzBuzz(1, 10));
	}
}
