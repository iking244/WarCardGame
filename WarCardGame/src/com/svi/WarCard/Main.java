package com.svi.WarCard;

public class Main {

	public static void main (String[] args){
//		Card c1,c2;
//
//
//		c1 = new Card(Rank.FIVE, Suit.HEARTS);
//		c2 = new Card(Rank.ACE, Suit.CLUBS);
//
//
//		Hand h1= new Hand();
//
//		h1.add(c1);
//		h1.add(c2);
//		System.out.println(h1.showHand());



		Deck d1= new Deck();

		d1.populate();
		System.out.println("Initial Deck: ");
		System.out.println(d1.showHand());
		d1.shuffle();
		System.out.println("\n"+ d1.showHand());
	
		
		
	}
}
