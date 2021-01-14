package com.richmondjava.cards;

import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SnapCardGameTest {

	private Player player1;
	private Player player2;
	private Card[] player1Cards;
	private Card[] player2Cards;
	private SnapCardGame snapCardGame;

	@Before
	public void setUp() throws Exception {

		player1Cards = TestHelper.createPlayer1Cards();
		player2Cards = TestHelper.createPlayer2Cards();

		player1 = new Player("Richmond",player1Cards);
		player2 = new Player("Daniel",player2Cards);

		snapCardGame = new SnapCardGame(player1, player2);
	}

	@Test
	public void shouldPlay26Times(){   	
		snapCardGame.playCardGame();
		assertEquals(26, snapCardGame.getCountCardsPlayedByBothPlayers());
	}

    @Test
	public void shouldEndTheGameWhenTwoCardsHaveTheSameNumber(){
		
		player1Cards[0] = new Card(0, "Jack", 0);
		player2Cards[0] = new Card(2, "Jack", 0);
		player1 = new Player("Richmond", player1Cards);
		player2 = new Player("Daniel",player2Cards);

		snapCardGame = new SnapCardGame(player1, player2);
		snapCardGame.playCardGame();

		assertTrue("SNAP!", snapCardGame.isSnap());
	}
}