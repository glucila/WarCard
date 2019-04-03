package com.svi.warcardgame.values;

public enum Suits {

	DIAMOND (4, "Diamond"), 
	HEART (3, "Heart"), 
	SPADE (2, "Spade"), 
	CLUB (1, "Club");
	
	private final int suitValue;
	private final String suitName;
	
	private Suits (int suitValue, String suitName){
		this.suitValue = suitValue;
		this.suitName = suitName;
	}
	
	public int getsuitValue () {
		return suitValue;
	}
	
	public String getsuitName () {
		return suitName;
	}

}