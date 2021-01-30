package com.richmondjava.intro;

import java.util.ArrayList;
import java.util.List;

public class Cooker {

    private int size;
    List<Saucepan> saucepanList; 

    public  Cooker(int numberOfSaucepans) {
        saucepanList = new ArrayList<Saucepan>(numberOfSaucepans);
        for(int i = 0; i < numberOfSaucepans; i++)
        saucepanList.add(new Saucepan());
    }

    public Cooker() {
	}

	public int getCookerSize() {
        return size;
    }

    public void setCookerSize(int size) {
        this.size = size;
    }

	public int getNumberOfSaucepans() {
		return saucepanList.size();
	}

	public Saucepan getSaucepan(int positionOfSaucepan) {
		return saucepanList.get(positionOfSaucepan);
	}

	public void removeSaucepan(int saucepanToBeRemoved) {
        saucepanList.remove(saucepanToBeRemoved);
	}

	public void addSaucepan(Saucepan saucepanToBeAdded) {
        saucepanList.add(saucepanToBeAdded);
	}

}
