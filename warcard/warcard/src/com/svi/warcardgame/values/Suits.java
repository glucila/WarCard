package com.svi.warcardgame.values;

public enum Suits {

	DIAMOND (4, "D"), 
	HEART (3, "H"), 
	SPADE (2, "S"), 
	CLUB (1, "C");
	
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