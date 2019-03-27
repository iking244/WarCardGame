package com.svi.WarCard;

public enum Rank {
	ACE(13,"A"),KING(12,"K"),QUEEN(11,"Q"),JACK(10,"J"), TEN(9,"10"),NINE(8,"9"),EIGHT(7,"8"),SEVEN(6,"7"),
	SIX(5,"6"),FIVE(4,"5"),FOUR(3,"4"),THREE(2,"3"),DEUCE(1,"2");
	;
	
	//private Field
	private final int rankValue;
	private final String rankString;
	
	
	
	//Constructor
	private Rank (int rankValue, String rankString){
		this.rankValue = rankValue;
		this.rankString = rankString;	
	}
	
	//public Method
	public int getRank() {
		return rankValue;
	}
	public String printRank(){
		return rankString;
	}

}
