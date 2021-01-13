package com.richmondjava.cards;

import org.junit.Before;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;
import org.junit.Assert;

public class SnapCardGameTest {

	private Player player1;
	private Player player2;
	private Card[] player1Cards = new Card[26];
	private Card[] player2Cards = new Card[26];;
	private String game;
	private final int NUMBER_OF_CARDS_FOR_PLAYERS = 26;
	private int countCardsPlayedByBothPlayers = 0;
	private SnapCardGame snapCardGame;

	@Before
	public void setUp() throws Exception {

		player1Cards[0] = new Card(0, "2",12);
		player1Cards[1] = new Card(1, "3",11);
		player1Cards[2] = new Card(2, "4",10);
		player1Cards[3] = new Card(3, "5",9);
		player1Cards[4] = new Card(0, "6",8);
		player1Cards[5] = new Card(1, "7",7);
		player1Cards[6] = new Card(2, "8",2);
		player1Cards[7] = new Card(3, "9",5);
		player1Cards[8] = new Card(0, "10",4);
		player1Cards[9] = new Card(1, "Ace",3);
		player1Cards[10] = new Card(0, "King",6);
		player1Cards[11] = new Card(3, "Queen",1);
		player1Cards[12] = new Card(0, "Jack",0);
		player1Cards[13] = new Card(1, "2",12);
		player1Cards[14] = new Card(2, "3",11);
		player1Cards[15] = new Card(3, "4",10);
		player1Cards[16] = new Card(0, "5",9);
		player1Cards[17] = new Card(1, "6",8);
		player1Cards[18] = new Card(2, "7",7);
		player1Cards[19] = new Card(3, "8",3);
		player1Cards[20] = new Card(3, "9",5);
		player1Cards[21] = new Card(1, "10",4);
		player1Cards[22] = new Card(1, "Ace",6);
		player1Cards[23] = new Card(3, "King",2);
		player1Cards[24] = new Card(1, "Queen",1);
		player1Cards[25] = new Card(1, "Jack",0);

		player2Cards[0] = new Card(2, "Jack",0);
		player2Cards[1] = new Card(1, "Queen",1);
		player2Cards[2] = new Card(2, "King",2);
		player2Cards[3] = new Card(0, "Ace",3);
		player2Cards[4] = new Card(1, "10",4);
		player2Cards[5] = new Card(3, "9",5);
		player2Cards[6] = new Card(3, "8",6);
		player2Cards[7] = new Card(2, "7",7);
		player2Cards[8] = new Card(1, "6",8);
		player2Cards[9] = new Card(2, "5",9);
		player2Cards[10] = new Card(2,"4",10);
		player2Cards[11] = new Card(0,"3",11);
		player2Cards[12] = new Card(1,"2",12);
		player2Cards[13] = new Card(2, "Jack",0);
		player2Cards[14] = new Card(3, "Queen",1);
		player2Cards[15] = new Card(2, "King",2);
		player2Cards[16] = new Card(3, "Ace",3);
		player2Cards[17] = new Card(2, "10",4);
		player2Cards[18] = new Card(1, "9",5);
		player2Cards[19] = new Card(0, "8",6);
		player2Cards[20] = new Card(0, "7",7);
		player2Cards[21] = new Card(3, "6",8);
		player2Cards[22] = new Card(0, "5",9);
		player2Cards[23] = new Card(0, "4",10);
		player2Cards[24] = new Card(0, "3",11);
		player2Cards[25] = new Card(3, "2",12);

		player1 = new Player("Richmond",player1Cards);
		player2 = new Player("Daniel",player2Cards);
	}

	@Test
	public void shouldPlay26Times(){   	
		for (int i = 0; i < NUMBER_OF_CARDS_FOR_PLAYERS; i++) {
			if (player1Cards[i].getValue() != player2Cards[i].getValue()) {
				countCardsPlayedByBothPlayers++;
			}else {
				game = "SNAP";
			}
		}
		assertEquals(26, countCardsPlayedByBothPlayers);
	}

//	@Test
//
//	public void shouldEndTheGameWhenTwoCardsHaveTheSameNumber(){
//		//create a card and add to the players card array
//		Card card1 = new Card(0, "HEARTS", 5);
//		player1Cards[arrayIndex] = card1;
//		Card card2 = new Card(1, "CLUBS", 5);
//		player2Cards[arrayIndex] = card2;
//		//create a player and get the value of the players card in the respective index
//		player1 = new Player("Richmond", player1Cards[arrayIndex].getValue());
//		player2 = new Player("Daniel",player2Cards[arrayIndex].getValue());
//
//		snapCardGame = new SnapCardGame(player1, player2);
//
//		assertEquals("SNAP", snapCardGame.playAllCards());
//	}
//
//	@Test
//	public void shouldContinueGameWhenTwoCardsDoNotHaveTheSameValueAndThereAreMoreCardsRemaining(){
//
//		for (int i = 0; i < NUMBER_OF_CARDS_FOR_PLAYERS; i++) {
//			if ((player1Cards[i].getValue() != player2Cards[i].getValue()) && (i < NUMBER_OF_CARDS_FOR_PLAYERS)) {
//				countCardsPlayedByBothPlayers++;
//			}else {
//				game = "END";
//			}
//		}
//		
//		assertEquals("END", snapCardGame.playAllCards());
//	}
////
////	@Test
//
//	public void shouldEndGameWhenNoMoreCardsLeftToPlay(){
//
//		player1Cards = new Card[0];
//		player2Cards = new Card[0];
//
//		player1 = new Player("Richmond",player1Cards);
//		player2 = new Player("Daniel",player2Cards);
//
//		assertEquals("END", snapCardGame.playAllCards());
//
//	}
}