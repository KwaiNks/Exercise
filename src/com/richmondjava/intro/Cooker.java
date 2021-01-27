package com.richmondjava.intro;

public class Cooker {

    private int size;
    Saucepan[] saucepan;

    public  Cooker(Saucepan[] saucepan) {
        this.saucepan = saucepan;
        for(int i = 0; i < saucepan.length; i++){
            saucepan[i] = new Saucepan();
        }
    }

    public Cooker() {
	}

	public int getCookerSize() {
        return size;
    }

    public void setCookerSize(int size) {
        this.size = size;
    }

	public int getNumberOfSaucepansOnACooker() {
		return this.saucepan.length;
	}

}
