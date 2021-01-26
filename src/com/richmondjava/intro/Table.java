package com.richmondjava.intro;

public class Table {

	int size;
	Kettle[] kettles;

	public Table(int numberOfKettles) {
		kettles = new Kettle[numberOfKettles];
		for (int i = 0; i < numberOfKettles; i++) {
			kettles[i] = new Kettle();
		}
	}

	public Table() {
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNumberOfKettlesOnATable() {
		return kettles.length;
	}
}
