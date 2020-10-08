package com.richmondjava.cards;

import java.util.Arrays;

public class SnapCardGame {

	private Player player1;
	private Player player2;
	private DeckOfCards[] player1Cards;
	private DeckOfCards[] player2Cards;
	private DeckOfCards[] playingCards = new DeckOfCards[52];
	private DeckOfCards[] extractedCards;
	private int count = 0;
	private int sum = 0;

	public SnapCardGame(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		player1Cards = Arrays.copyOfRange(playingCards, 0, (playingCards.length/2)-1);
		player2Cards = Arrays.copyOfRange(playingCards, playingCards.length/2, playingCards.length);

	}

	public int getNumberOfCardsPlayed() {
		for (int i = 0; i < player1Cards.length; i++) {
			count++;
			sum += count;
		}
		return sum;
	}
	
	
}
