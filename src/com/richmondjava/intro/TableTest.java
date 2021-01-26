package com.richmondjava.intro;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TableTest {

	Table table;

	@Before
	public void setUp() {
		table = new Table(2);
	}

	@Test
	public void shouldReturnTheTableSize() {
		table.setSize(10);
		assertEquals(10, table.getSize());
	}

	@Test
	public void shouldReturnTheNumberOfKettles() {
		assertEquals(2, table.getNumberOfKettlesOnATable());
	}
}
