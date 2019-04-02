package com.svi.warcardgame.objects;

public class Cards {

	private int CardRankValue;
	public String CardRankName;
	public int suitValue;
	public String suitName;
	
	public Cards (int CardRankValue, String CardRankName, int suitValue, String suitName) {
		this.CardRankValue = CardRankValue;
		this.CardRankName = CardRankName;
		this.suitValue = suitValue;
		this.suitName = suitName;

	}
	public int getCardRankValue() {
		return CardRankValue;
	}

	public void setCardRankValue(int cardRankValue) {
		CardRankValue = cardRankValue;
	}

	public String getCardRankName() {
		return CardRankName;
	}

	public void setCardRankName(String cardRankName) {
		CardRankName = cardRankName;
	}

	public int getSuitValue() {
		return suitValue;
	}

	public void setSuitValue(int suitValue) {
		this.suitValue = suitValue;
	}

	public String getSuitName() {
		return suitName;
	}

	public void setSuitName(String suitName) {
		this.suitName = suitName;
	}
	@Override
	public String toString() {
		return (CardRankName + " of " + suitName);
	}
}