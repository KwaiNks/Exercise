package com.richmondjava.intro;
import java.util.ArrayList;
import java.util.List;

public class Kitchen {

	private int KitchenSize;
	Table[] arrayOfTables;
	Cooker[] arrayOfCookers;
	List<Table> tableList; 
	List<Cooker> cookerList;

	public Kitchen(int numberOfTables, int numberOfCookers) {
		tableList = new ArrayList<Table>(numberOfTables);
		for (int i = 0; i < numberOfTables; i++) {
			tableList.add(new Table(2));
		}
		cookerList = new ArrayList<Cooker>(numberOfCookers);
		for (int i = 0; i < numberOfCookers; i++) {
			cookerList.add(new Cooker(4));
		}
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
		return tableList.size();
	}

	public int getNumberOfKettlesOnATable(int positionOfRequestedTable) {
		Table table = arrayOfTables[positionOfRequestedTable];
		return table.getNumberOfKettlesOnATable();
	}

	public int getNumberOfSaucepansOnACooker(int positioneOfCooker) {
        Cooker cooker = arrayOfCookers[positioneOfCooker];
		return cooker.getNumberOfSaucepans();
	}

	public void addCookerToTheKitchen(Cooker cookerToBeAdded) {
      cookerList.add(cookerToBeAdded);
	}

	public int getNumberOfCookersInTheKitchen() {
		return cookerList.size();
	}

	public void moveSaucepanFromOneCookerToAnother(int currentCookerWithSaucepan ,int saucepanToBeMoved, int cookerWhereSaucepanWillBeMovedTo) {
       Saucepan saucepan = cookerList.get(currentCookerWithSaucepan).getSaucepan(saucepanToBeMoved);
	   cookerList.get(currentCookerWithSaucepan).removeSaucepan(saucepanToBeMoved);
	   cookerList.get(cookerWhereSaucepanWillBeMovedTo).addSaucepan(saucepan);
	}
}
