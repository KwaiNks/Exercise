package com.richmondjava.intro;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class KitchenTest {

	Kitchen kitchen;
	Table[] arrayOfTables;
	Cooker[] arrayOfCookers;
	Saucepan[] saucepan;

	@Before
	public void setUp() {
		kitchen = new Kitchen(2,1);
		saucepan = new Saucepan[1];
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
	public void shouldReturnTheNumberOfKettlesOnAGivenTable() {
		arrayOfTables = new Table[2];
		arrayOfTables[0] = new Table(2);
		arrayOfTables[1] = new Table(0);
		kitchen = new Kitchen(arrayOfTables,arrayOfCookers);
		assertEquals(0, kitchen.getNumberOfKettlesOnATable(1));
	}

	@Test
	public void shouldReturnTheNumberOfSaucepansOnAGivenCooker() { 
		arrayOfCookers = new Cooker[1];
		arrayOfCookers[0] = new Cooker(saucepan);
		kitchen = new Kitchen(arrayOfTables, arrayOfCookers);
		assertEquals(1, kitchen.getNumberOfSaucepansOnACooker(0));
	}
}
