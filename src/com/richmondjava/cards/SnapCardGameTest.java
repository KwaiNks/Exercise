package com.richmondjava.cards;

import org.junit.Before;
import java.util.Arrays;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class SnapCardGameTest {

	private Player player1;
	private Player player2;
	private Card[] player1Cards;
	private Card[] player2Cards;
	private Card[] deckOfPlayingCards;
	private SnapCardGame snapCardGame;
	private int arrayIndex = 0;

	@Test
	public void shouldPlay26Times(){   	
		DeckOfCards deckOfCards = new DeckOfCards();
		deckOfPlayingCards = new Card[52];
		deckOfCards.shuffleDeck();
		player1Cards = Arrays.copyOfRange(deckOfPlayingCards, 0, (deckOfPlayingCards.length/2)-1);
		player2Cards = Arrays.copyOfRange(deckOfPlayingCards, deckOfPlayingCards.length/2, deckOfPlayingCards.length);

		player1 = new Player("Richmond",player1Cards);
		player2 = new Player("Daniel",player2Cards);
		snapCardGame = new SnapCardGame(player1, player2);

		snapCardGame.playAllCardsWithEachPlayer();

		assertEquals(26, snapCardGame.getNumberOfCardsPlayed());
	}

	@Test

	public void shouldEndTheGameWhenTwoCardsHaveTheSameNumber(){
		//create a card and add to the players card array
		Card card1 = new Card(5, "HEARTS");
		player1Cards[arrayIndex] = (card1);
		Card card2 = new Card(5, "CLUBS");
		player2Cards[arrayIndex] = (card2);
		//create a player and get the value of the players card in the respective index
		player1 = new Player("Richmond",player1Cards[arrayIndex].getValue());
		player2 = new Player("Daniel",player2Cards[arrayIndex].getValue());

		snapCardGame = new SnapCardGame(player1, player2);

		assertEquals("SNAP", snapCardGame.playAllCards());
	}

	@Test

	public void shouldContinueGameWhenTwoCardsDoNotHaveTheSameNumberAndThereAreMoreCardsRemaining(){

		Card card1 = new Card(4, "HEARTS");
		Card card2 = new Card(5, "CLUBS");
		player1Cards[arrayIndex]= card1;
		player1Cards[arrayIndex + 1] = card2;

		Card card3 = new Card(8, "HEARTS");
		Card card4 = new Card(9, "CLUBS");
		player2Cards[arrayIndex] = card3;
		player2Cards[arrayIndex + 1] = card4;

		player1 = new Player("Richmond",player1Cards);
		player2 = new Player("Daniel",player2Cards);

		assertEquals("END", snapCardGame.playAllCards());
	}
		@Test

		public void shouldContinueGameWhenTwoCardsDoNotHaveTheSameNumberAndThereAreMoreCardsRemaining(){
			Card card1 = new Card(4, "HEARTS");
			Card card2 = new Card(5, "CLUBS");
			player1Cards[arrayIndex] = card1;
			player1Cards[arrayIndex + 1] = card2;

			Card card3 = new Card(8, "HEARTS");
			Card card4 = new Card(9, "CLUBS");
			player2Cards[arrayIndex] = card3;
			player2Cards[arrayIndex + 1] = card4;

			player1 = new Player(player1Cards);
			player2 = new Player(player2Cards);

			assertEquals("END", snapCardGame.playAllCards());
		}

		@Test

		public void shouldEndGameWhenNoMoreCardsLeftToPlay(){

			player1Cards = new Card[0];
			player2Cards = new Card[0];

			player1 = new Player("Richmond",player1Cards);
			player2 = new Player("Daniel",player2Cards);

			assertEquals("END", snapCardGame.playAllCards());

		}
	}