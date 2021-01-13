package com.richmondjava.cards;

public class TestHelper {
    
    public static Card[] createPlayer1Cards(){

        Card[] player1Cards = new Card[26];

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
        
        return player1Cards;
    }

    public static Card[] createPlayer2Cards(){

        Card[] player2Cards = new Card[26];

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
        
        return player2Cards;

    }
}
