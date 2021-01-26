package com.richmondjava.intro;

public class Kitchen {

	private int KitchenSize;
	Table[] arrayOfTables;

	public Kitchen(int numberOfTables) {
		arrayOfTables = new Table[numberOfTables];
		for (int i = 0; i < numberOfTables; i++) {
			arrayOfTables[i] = new Table(); 
		}
	}

	public Kitchen(Table[] tables) {
		arrayOfTables = tables;	
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
}
