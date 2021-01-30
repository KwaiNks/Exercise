package com.richmondjava.intro;
import java.util.ArrayList;
import java.util.List;

public class Kitchen {

	private int KitchenSize;
	List<Table> tableList; 
	List<Cooker> cookerList;

	public Kitchen(int numberOfTables) {
		cookerList = new ArrayList<Cooker>();
		tableList = new ArrayList<Table>(numberOfTables);
		for (int i = 0; i < numberOfTables; i++) {
			tableList.add(new Table(2));
		}
	}

	public Kitchen(List<Table> tables){
		cookerList = new ArrayList<Cooker>();
		tableList = tables;
	}

	public Kitchen(){
		cookerList = new ArrayList<Cooker>();
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
		Table table = tableList.get(positionOfRequestedTable);
		return table.getNumberOfKettlesOnATable();
	}

	public int getNumberOfSaucepansOnACooker(int positioneOfCooker) {
        Cooker cooker = cookerList.get(positioneOfCooker);
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
