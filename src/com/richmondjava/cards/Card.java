package com.richmondjava.cards;

public class Card {

	private int suit;
	private String name;
	private int value;
	private boolean shuffled;

	public Card(int suit, String name, int value) {
		this.suit = suit;
		this.name = name;
		this.value = value;	
		shuffled = false;
	}

	public int getSuit() {
		return this.suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String toString() {
		String suitString = new String(); 
		switch (suit) {
		case 0:
			suitString = "Hearts"; 
			break;
		case 1:
			suitString = "Diamonds"; 
			break;
		case 2:
			suitString = "Clubs"; 
			break;
		case 3:
			suitString = "Spades"; 
			break;
		}
		return (name + " of " + suitString);
	}
}