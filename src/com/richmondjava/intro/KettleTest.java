package com.richmondjava.intro;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class KettleTest {

	Kettle kettle;

	@Before
	public void setUp() {
		kettle = new Kettle();
	}
	
	@Test
	public void shouldReturnTheSizeOfTheKettle() {
		kettle.setKettleSize(3);
		assertEquals(3, kettle.getKettleSize());
	}
}
