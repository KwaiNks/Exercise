package com.richmondjava.cards;

public class SnapCardGame {

	private Player player1;
	private Player player2;
	private String game;
	private int countCardsPlayedByBothPlayers = 0;
	
	private final int NUMBER_OF_CARDS_FOR_PLAYERS = 26;
	

	public SnapCardGame(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}


	public void playCardGame(){
		for (int i = 0; i < NUMBER_OF_CARDS_FOR_PLAYERS; i++) {
			if (player1.getCards()[i].getValue() !=player2.getCards()[i].getValue()) {
				countCardsPlayedByBothPlayers++;
			}else {
				game = "SNAP";
			}
		}
	}

	public int getCountCardsPlayedByBothPlayers(){
		return countCardsPlayedByBothPlayers;
	}
}
