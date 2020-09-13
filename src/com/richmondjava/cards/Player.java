package com.richmondjava.cards;

public class Player {
	
	private String name;
	private Card cards;
	
	public Player(String name, Card cards) {
		this.name = name;
		this.cards = cards;
	}


	public String getName() {
		return this.name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Card getCards() {
		return this.cards;
	}

	public void setCards(Card cards) {
		this.cards = cards;
	}
}
