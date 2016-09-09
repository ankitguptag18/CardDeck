package com.ankitgupta;

import java.util.Stack;

/**
 * Created by ankitgupta on 9/9/16.
 */
public class Deal {

	public static void main(String[] args) {

		Player player1 = new Player("Player1");
		Player player2 = new Player("Player2");
		Player player3 = new Player("Player3");
		Player player4 = new Player("Player4");

		Player[] players = {player1,player2,player3,player4};
		CardGame game = new CardGame(players);
		game.dealCards();

		System.out.println("Player 1 Cards : ");
		Deck.printDeck(player1.getCards());

		System.out.println("Player 2 Cards : ");
		Deck.printDeck(player2.getCards());

		System.out.println("Player 3 Cards : ");
		Deck.printDeck(player3.getCards());

		System.out.println("Player 4 Cards : ");
		Deck.printDeck(player4.getCards());

		System.out.println("Remaining Cards : ");
		Deck.printDeck(game.getStackOfCards());

	}
}
