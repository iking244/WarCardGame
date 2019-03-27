package com.svi.WarCard;

import java.util.ArrayList;

public class Hand {
	
	public ArrayList<Card> cards;


	//constructor
	Hand() {
		cards = new ArrayList<Card>();

	}
	public void clear() {
		cards.clear();
	}
	public void add(Card card){
		cards.add(card);
	}

	public String showHand() {
		String str = "";
		for (Card c : cards){
			str += c.toString()+ ", ";

		}
		return str;
	}
	
	public boolean give (Card card, Hand otherHand){
		if(!cards.contains(card)){
			return false;

		}
		else {
			cards.remove(card);
			otherHand.add(card);
			return true;

		}
	}

}
