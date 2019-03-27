package com.svi.WarCard;

public enum Suit {
	DIAMONDS(4,"D"), HEARTS(3,"H"), SPADES(2,"S"), CLUBS(1,"C");

	private final String suitText;
	private final int suitRank;

	// Constructor
	private Suit(int suitRank, String suitText){
		this.suitText = suitText;
		this.suitRank = suitRank;

	}

	// Method

	public String printSuit() {
		return suitText;
	}

	public int getRank(){
		return suitRank;

	}


}




