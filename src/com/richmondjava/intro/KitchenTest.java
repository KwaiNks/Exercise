package com.richmondjava.intro;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

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
	public void shouldReturnTheNumberOfKettlesOnAGivenTable() {
		kitchen = new Kitchen(Arrays.asList(new Table(2), new Table(0)));
		assertEquals(0, kitchen.getNumberOfKettlesOnATable(1));
	}

	@Test
	public void shouldReturnTheNumberOfSaucepansOnAGivenCooker() { 
		kitchen = new Kitchen();
		kitchen.addCookerToTheKitchen(new Cooker(3));
		assertEquals(3, kitchen.getNumberOfSaucepansOnACooker(0));
	}

	@Test
	public void shouldAddACookerToTheKitchen(){
		Kitchen kitchenTwo = new Kitchen();
		kitchenTwo.addCookerToTheKitchen(new Cooker());
		assertEquals(1, kitchenTwo.getNumberOfCookersInTheKitchen());  
	}

	@Test
	public void shouldMoveASaucepanFromOneCookerToAnother(){
		
		cookerOne = new Cooker(2);
		cookerTwo = new Cooker(0);
		Kitchen kitchen = new Kitchen();
		kitchen.addCookerToTheKitchen(cookerOne);
		kitchen.addCookerToTheKitchen(cookerTwo);

		kitchen.moveSaucepanFromOneCookerToAnother(0, 0, 1);
		assertEquals(1, kitchen.getNumberOfSaucepansOnACooker(1));
	}
}
