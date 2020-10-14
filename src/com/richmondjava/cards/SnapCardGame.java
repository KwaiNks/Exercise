package com.richmondjava.cards;

import java.util.Arrays;

public class SnapCardGame {

	private Player player1;
	private Player player2;
	private Card[] player1Cards;
	private Card[] player2Cards;
	private Card[] playingCards = new Card[52];
	private Card[] extractedCards;
	private int count = 0;
	private int sum = 0;

	public SnapCardGame(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		player1Cards = Arrays.copyOfRange(playingCards, 0, (playingCards.length/2)-1);
		player2Cards = Arrays.copyOfRange(playingCards, playingCards.length/2, playingCards.length);
	}

	public int getNumberOfCardsPlayed() {
		for (int i = 0; i < extractedCards.length; i++) {
			count++;
			sum += count;
		}
		return sum;
	}
	
	public void playAllCardsWithEachPlayer() {
		
	}
}
