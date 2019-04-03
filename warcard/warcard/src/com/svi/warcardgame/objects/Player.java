package com.svi.warcardgame.objects;

import java.util.ArrayList;

public class Player {
	private String playerName;
	private ArrayList<Cards> playerCards;
	
	public Player (String name) {
		this.playerName = name;
		playerCards = new ArrayList<Cards>();
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public ArrayList<Cards> getPlayerCards() {
		return playerCards;
	}
}