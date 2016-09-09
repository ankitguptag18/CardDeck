package com.ankitgupta;

import java.security.PublicKey;
import java.util.Stack;

/**
 * Created by ankitgupta on 9/9/16.
 */
public class CardGame {
	private Player[] players;
	private int cardsPerPlayer;
	Stack<Card> stackOfCards = Deck.getShuffeledDeck();
	CardGame(Player[] players){
		this.players = players;
		this.cardsPerPlayer=0;
	}

	CardGame(Player[] players, int cardsPerPlayer){
		this.players = players;
		this.cardsPerPlayer = cardsPerPlayer;
	}

	public void dealCards(){
		int playerCount = players.length;
		if (playerCount>0){
			int cardsToDeal = cardsPerPlayer==0? stackOfCards.size() :cardsPerPlayer*playerCount;
			for (int i=0;i<cardsToDeal;i++){
				players[i%playerCount].addCard(stackOfCards.pop());
			}
		}
	}
	public Stack<Card> getStackOfCards(){
		return stackOfCards;
	}
}
