package com.ankitgupta;

/**
 * Created by ankitgupta on 9/9/16.
 */
public class Card {

	CardShape shape;
	CardNumber number;

	Card(CardShape shape,CardNumber number){
		this.shape = shape;
		this.number = number;
	}

	public CardNumber getNumber() {
		return number;
	}

	public CardShape getShape() {
		return shape;
	}

	public String getName(){
		return number + " of " + shape;
	}
}
