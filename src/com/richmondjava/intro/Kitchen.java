package com.richmondjava.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kitchen {

	private int KitchenSize;
	Table[] arrayOfTables;
	Cooker[] arrayOfCookers;
	List<Table> tableList; 
	List<Cooker> cookerList;

	public Kitchen(int numberOfTables, int numberOfCookers) {
		arrayOfTables = new Table[numberOfTables];
		for (int i = 0; i < numberOfTables; i++) {
			arrayOfTables[i] = new Table(); 
		}
		arrayOfCookers = new Cooker[numberOfCookers];
		for (int i = 0; i < arrayOfCookers.length; i++) {
			arrayOfCookers[i] = new Cooker();
		}

		tableList = new ArrayList<Table>(Arrays.asList(arrayOfTables));	
		cookerList = new ArrayList<Cooker>(Arrays.asList(arrayOfCookers));
	}

	public Kitchen(Table[] tables, Cooker[] cookers) {
		arrayOfTables = tables;	
		arrayOfCookers = cookers;
	}

	public int getKitchenSize() {
		return this.KitchenSize;
	}

	public void setKitchenSize(int kitchenSize) {
		this.KitchenSize = kitchenSize;
	}

	public int getNumberOfTablesInTheKitchen() {
		return arrayOfTables.length;	
	}

	public int getNumberOfKettlesOnATable(int positionOfRequestedTable) {
		Table table = arrayOfTables[positionOfRequestedTable];
		return table.getNumberOfKettlesOnATable();
	}

	public int getNumberOfSaucepansOnACooker(int positioneOfCooker) {
        Cooker cooker = arrayOfCookers[positioneOfCooker];
		return cooker.getNumberOfSaucepansOnACooker();
	}

	public void addCookerToTheKitchen(Cooker cookerToBeAdded) {
      cookerList.add(cookerToBeAdded);
	}

	public int getNumberOfCookersInTheKitchen() {
		return cookerList.size();
	}
}
