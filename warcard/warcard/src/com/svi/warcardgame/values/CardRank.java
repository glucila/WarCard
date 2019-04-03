package com.svi.warcardgame.values;

public enum CardRank {
	
	ACE (14, "Ace"),
	KING (13, "King"),
	QUEEN (12, "Queen"),
	JACK (11,"Jack"),
	TEN (10, "10"),
	NINE (9, "9"),
	EIGHT (8, "8"),
	SEVEN (7,"7"),
	SIX (6,"6"),
	FIVE (5, "5"),
	FOUR (4, "4"),
	THREE (3, "3"),
	TWO (2, "2");
	
	private final int CardRankValue;
	private final String CardRankName;
	
	private CardRank (int CardRankValue, String CardRankName){
		this.CardRankValue = CardRankValue;
		this.CardRankName = CardRankName;
	}
	
	public int getCardRankValue() {
		return CardRankValue;
	}
	
	public String getCardRankName() {
		return CardRankName;
	}

}