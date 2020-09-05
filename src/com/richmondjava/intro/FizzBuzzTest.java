package com.richmondjava.intro;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	
		FizzBuzz fizzBuzz = new FizzBuzz();
	
	

	@Test
	public void shouldReturnFizz() {
		assertTrue("fizz", fizzBuzz.getFizzBuzz(1, 5));
	}
	
	@Test
	public void shouldReturnBuzz() {
		
	}
	
	@Test
	public void shouldReturnFizzBuzz() {
		
	}

}
