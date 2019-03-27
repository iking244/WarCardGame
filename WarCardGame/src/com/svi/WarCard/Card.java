package com.svi.WarCard;

public class Card {

	/**WarCard Game
	 * 
	 * 
	 */

	//Private Fields
	private Suit suit;
	private Rank rank;
	private boolean isFaceUp;


	//Constructor
	public Card(Rank rank, Suit suit){
		this.rank = rank;
		this.suit = suit;
		isFaceUp = true;
		

	}

	//public method
	public String getSuit(){
		return suit.printSuit();
	}
		
	public int getRank() {
		return rank.getRank();
	}
	

	public String toString() {
		String str = "";
		
		if (isFaceUp){
			str += suit.printSuit() + "-" + rank.printRank();
		}
		else {
			str = "Card faced down.";
					
		}
		return str;
		
	}
				
	}





