package com.ankitgupta;

import java.util.Stack;

/**
 * Created by ankitgupta on 9/9/16.
 */
public class Deal {

	public static void main(String[] args) {
		Stack<Card> cards = Deck.getShuffeledDeck();
		Deck.printDeck(cards);
	}
}
