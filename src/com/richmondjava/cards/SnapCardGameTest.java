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
    private DeckOfCards[] deckOfPlayingCards;
    private DeckOfCards[] gameTableForExtractedCards;
    private SnapCardGame snapCardGame;
    
    @Test
    public void shouldPlay26Times(){   	
    	deckOfPlayingCards = new DeckOfCards[52];
    	DeckOfCards.isShuffled(deckOfPlayingCards);
    	player1Cards = Arrays.copyOfRange(deckOfPlayingCards, 0, (deckOfPlayingCards.length/2)-1);
        player2Cards = Arrays.copyOfRange(deckOfPlayingCards, deckOfPlayingCards.length/2, deckOfPlayingCards.length);

        player1 = new Player("Richmond",player1Cards);
        player2 = new Player("Daniel",player2Cards);
        snapCardGame = new SnapCardGame(player1, player2);

        snapCardGame.playAllCardsWithEachPlayer();

        assertEquals(26, snapCardGame.getNumberOfCardsPlayed());
    }

}
