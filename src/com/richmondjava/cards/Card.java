package com.richmondjava.cards;

public class Card {
	
	private int suit;
	private int value;
	private boolean shuffled;
	
	public Card(int suit, int value) {
		this.suit = suit;
		this.value = value;
		
	}

	public int getSuit() {
		return this.suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public boolean isShuffled() {
		return shuffled;
	}
	
	public void setShuffled(boolean shuffled) {
		this.shuffled = shuffled;
	}
}
