package com.richmondjava.cards;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SnapCardGameTest {

    private Player player1;
    private Player player2;
    private SnapCardGame snapCardGame;
    private Card[] player1Cards;
    private Card[] player2Cards;

    @Test
    public void shouldPlay26Times(){

        // TODO Create a pack of cards (52 cards) and assign 26 to each player




        player1 = new Player(player1Cards);
        player2 = new Player(player2Cards);
        snapCardGame = new SnapCardGame(player1, player2);

        snapCardGame.playAllCardsWithEachPlayer();

        assertEquals(26, snapCardGame.getNumberOfCardsPlayed());
    }

    @Test
    public void shouldEndTheGameWhenTwoCardsHaveTheSameNumber(){
        Card card1 = new Card(5, "HEARTS");
        player1Cards.add(card1);
        Card card2 = new Card(5, "CLUBS");
        player2Cards.add(card2);
        player1 = new Player(player1Cards);
        player2 = new Player(player2Cards);
        snapCardGame = new SnapCardGame(player1, player2);

        assertEquals("SNAP", snapCardGame.playAllCardsWithEachPlayer());
    }

    @Test
    public void shouldContinueGameWhenTwoCardsDoNotHaveTheSameNumberAndThereAreMoreCardsRemaining(){
        Card card1 = new Card(4, "HEARTS");
        Card card2 = new Card(5, "CLUBS");
        player1Cards.add(card1);
        player1Cards.add(card2);

        Card card3 = new Card(8, "HEARTS");
        Card card4 = new Card(9, "CLUBS");
        player2Cards.add(card3);
        player2Cards.add(card4);

        player1 = new Player(player1Cards);
        player2 = new Player(player2Cards);

        assertEquals("END", snapCardGame.playAllCardsWithEachPlayer());
    }

    @Test
    public void shouldEndGameWhenNoMoreCardsLeftToPlay(){

        player1Cards = new Card[0];
        player2Cards = new Card[0];
        player1 = new Player(player1Cards);
        player2 = new Player(player2Cards);

        assertEquals("END", snapCardGame.playAllCardsWithEachPlayer());
    }

}
