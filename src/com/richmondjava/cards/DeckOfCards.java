package com.richmondjava.cards;
import java.util.Random;

public class DeckOfCards {

	private Card[] deckOfPlayingCards;
	private Card[] extractedCards;

	public DeckOfCards() {
		deckOfPlayingCards = new Card[52];
		extractedCards = new Card[52];
		int suit;
		int value = 0;
		int countValue = 0;
		int countSuit = 0;
		for (int i = 0; i < deckOfPlayingCards.length; i++) {

			suit = countSuit;

			switch (countValue) {
			case 0:
				value = 2;
				break;
			case 1:
				value = 3;
				break;
			case 2:
				value = 4;
				break;
			case 3:
				value = 5;
				break;
			case 4:
				value = 6;
				break;
			case 5:
				value = 7;
				break;
			case 6:
				value = 8;
				break;
			case 7:
				value = 9;
				break;
			case 8:
				value = 10;
				break;
			case 9:
				value = 11;
				break;
			case 10:
				value = 12;
				break;
			case 11:
				value = 13;
				break;
			case 12:
				value = 14;
				break;
			}

			deckOfPlayingCards[i] = new Card(suit, value);

			if (countSuit >= 3) {
				countSuit = 0;
				countValue++;
			}else {
				countSuit++;
			}
		}
	}

	public DeckOfCards(Card[] deckOfPlayingCards) {
		this.deckOfPlayingCards = deckOfPlayingCards;
	}

	public Card[] getDeckOfPlayingCards() {
		return deckOfPlayingCards;
	}

	public Card[] getGameTableForExtractedCards() {
		return extractedCards;
	}

	public Card drawCard(int cardToDraw) { 
		extractedCards[cardToDraw - 1] = deckOfPlayingCards[cardToDraw - 1]; 
		return deckOfPlayingCards[cardToDraw - 1];
	}

	public void setDrawnCards(Card[] gameTableForExtractedCards) { 
		this.extractedCards = gameTableForExtractedCards;
	}

	public void shuffleDeck() {
		Random shuffler = new Random();
		int position;
		int i = 0;
		Card[] shuffledDeck = new Card[52]; 
		while (i < shuffledDeck.length) {
			position = shuffler.nextInt(52);
			if (deckOfPlayingCards[position].isShuffled() == false) {
				shuffledDeck[i] = deckOfPlayingCards[position]; 
				i++; 
				deckOfPlayingCards[position].setShuffled(true);
			} 
		}
		deckOfPlayingCards = shuffledDeck;
	}
}
