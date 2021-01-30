package com.richmondjava.intro;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class KitchenTest {

	Kitchen kitchen;
	Table[] arrayOfTables;
	Cooker[] arrayOfCookers;
	Cooker cookerOne;
	Cooker cookerTwo;

	@Before
	public void setUp() {
		kitchen = new Kitchen(2,2);
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
		arrayOfCookers[0] = new Cooker(3);
		kitchen = new Kitchen(arrayOfTables, arrayOfCookers);
		assertEquals(3, kitchen.getNumberOfSaucepansOnACooker(0));
	}

	@Test
	public void shouldAddACookerToTheKitchen(){
		Kitchen kitchenTwo = new Kitchen(1,9);
		kitchenTwo.addCookerToTheKitchen(new Cooker());
		assertEquals(10, kitchenTwo.getNumberOfCookersInTheKitchen());  
	}

	@Test
	public void shouldMoveASaucepanFromOneCookerToAnother(){
		cookerOne = new Cooker(1);
		cookerTwo = new Cooker(2);
		kitchen.moveSaucepanFromOneCookerToAnother(1,0,0);
		assertEquals(1, cookerOne.getNumberOfSaucepans());
		assertEquals(2, cookerTwo.getNumberOfSaucepans());


	}
}
