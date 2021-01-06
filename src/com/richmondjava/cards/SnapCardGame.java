package com.richmondjava.cards;

import java.util.Arrays;

public class SnapCardGame {

	private Player player1;
	private Player player2;
	private Card[] player1Cards;
	private Card[] player2Cards;
	private DeckOfCards[] player1DeckOfCards;
	private DeckOfCards[] player2DeckOfCards;
	private Card[] playingCards = new Card[52];
	private Card[] totalExtractedCards;
	private int count = 0;
	private int sum = 0;
	final int MAX_NUMBER_OF_EACH_PLAYERS_CARDS = 26;

	public SnapCardGame(Player player1, Card[] player1Cards, 
			Player player2, Card[] player2Cards) {
		this.player1 = player1;
		this.player2 = player2;
		player1Cards = Arrays.copyOfRange(playingCards, 0, (playingCards.length/2)-1);
		player2Cards = Arrays.copyOfRange(playingCards, playingCards.length/2, playingCards.length);

	}

	public int getNumberOfCardsPlayed() {
		for (int i = 0; i < totalExtractedCards.length; i++) {
			count++;
			sum += count;
		}
		return sum;

	}
}
