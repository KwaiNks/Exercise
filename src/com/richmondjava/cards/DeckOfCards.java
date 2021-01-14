package com.richmondjava.cards;
import java.util.Random;

public class DeckOfCards {

	private Card[] totalDeckOfPlayingCards;
	private Card[] totalExtractedCards;

	public DeckOfCards() {
		totalDeckOfPlayingCards = new Card[52];
		totalExtractedCards = new Card[52];
		int suit;
		String name = " ";
		int countValue = 0;
		int countSuit = 0;
		for (int i = 0; i < totalDeckOfPlayingCards.length; i++) {

			suit = countSuit;

			switch (countValue) {
			case 0:
				name = "Two";
				break;
			case 1:
				name = "Three";
				break;
			case 2:
				name = "Four";
				break;
			case 3:
				name = "Five";
				break;
			case 4:
				name = "Six";
				break;
			case 5:
				name = "Seven";
				break;
			case 6:
				name = "Eight";
				break;
			case 7:
				name = "Nine";
				break;
			case 8:
				name = "Ten";
				break;
			case 9:
				name = "Jack";
				break;
			case 10:
				name = "Queen";
				break;
			case 11:
				name = "King";
				break;
			case 12:
				name = "Ace";
				break;
			}

			totalDeckOfPlayingCards[i] = new Card(suit, name, countValue);

			if (countSuit >= 3) {
				countSuit = 0;
				countValue++;
			}else 
				countSuit++;
		}
	}

	public DeckOfCards(Card[] deckOfPlayingCards) {
		this.totalDeckOfPlayingCards = deckOfPlayingCards;
	}

	public Card[] getTotalDeckOfPlayingCards() {
		return totalDeckOfPlayingCards;
	}

	public Card[] getTotalExtractedCards() {
		return totalExtractedCards;
	}

	public Card extractCard(int cardToExtract) { 
		totalExtractedCards[cardToExtract - 1] = totalDeckOfPlayingCards[cardToExtract - 1]; 
		return totalDeckOfPlayingCards[cardToExtract - 1];
	}

	public void setExtractedCards(Card[] extractedCards) { 
		this.totalExtractedCards = extractedCards;
	}

	public void shuffleDeck() {
		Random shuffler = new Random();
		int position;
		int i = 0;
		Card[] shuffledDeck = new Card[52]; 
		while (i < shuffledDeck.length) {
			position = shuffler.nextInt(52);
			if (totalDeckOfPlayingCards[position].isShuffled() == false) {
				shuffledDeck[i] = totalDeckOfPlayingCards[position]; 
				i++; 
				totalDeckOfPlayingCards[position].setShuffled(true);
			} 
		}
		totalDeckOfPlayingCards = shuffledDeck;
	}
}
