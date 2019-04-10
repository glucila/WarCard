package com.svi.warcardgame.values;

public enum Suits {

	D (4, "Diamond"), 
	H (3, "Heart"), 
	S (2, "Spade"), 
	C (1, "Club");
	
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