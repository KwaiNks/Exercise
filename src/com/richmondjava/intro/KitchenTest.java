package com.richmondjava.intro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class KitchenTest {

	Kitchen kitchen;
	Table[] arrayOfTables;

	@Before
	public void setUp() {
		kitchen = new Kitchen(2);
	}

	@Test
	public void shouldReturnSizeOfKitchen() {
		kitchen.setKitchenSize(25);
		assertEquals(25, kitchen.getKitchenSize());
	}

	@Test
	public void shouldReturnNumberOfTablesInTheKitchen() {
		assertEquals(2, kitchen.getNumberOfTablesInTheKitchen());
	}

	@Test
	public void shouldReturnATable() {
		assertNotNull(kitchen.getTable(1));
	}

	@Test
	public void shouldReturnTheNumberOfKettlesOnAGivenTable() {
		arrayOfTables = new Table[2];
		arrayOfTables[0] = new Table(2);
		arrayOfTables[1] = new Table(0);
		kitchen = new Kitchen(arrayOfTables);
		assertEquals(0, kitchen.getNumberOfKettlesOnATable(1));	
	}


	@Test
	public void shouldReturnTheNumberOfPansOnAGivenCooker(){


		assertEquals(1, kitchen.getNumberOfPansOnACooker(1));
	}
}
