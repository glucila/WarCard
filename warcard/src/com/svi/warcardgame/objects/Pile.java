package com.svi.warcardgame.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pile {
	//start of game
	//get top cards
	
	 public static List<Cards> getTopCards(List<Player> listOfPlayers) {
	   	List<Cards> topCardList = new ArrayList<Cards>();
	   	listOfPlayers.forEach(player -> topCardList.add(player.getPlayerCards().remove(0)));		
    	System.out.println("\nlist of top Cards: "+topCardList);
		return topCardList;
	 }
	//compare top cards
	 public static boolean compareCards(Cards card1, Cards card2) {
			if (card1.getCardRankValue() == card2.getCardRankValue()) {
				return (card1.getSuitValue()<card2.getSuitValue());
			} 
			return (card1.getCardRankValue() < card2.getCardRankValue());
		}
	public static int findHighestCard(List<Cards> topCardList) {
		int highestCardIndex=0;
		for(int i = 1; i<topCardList.size(); i++) {
			if (compareCards(topCardList.get(highestCardIndex),topCardList.get(i))) {
				highestCardIndex=i;
			}
		}
		System.out.println("The highest card is "+topCardList.get(highestCardIndex));
		return highestCardIndex;
	}
	
	public static void giveCardsToRoundWinner(int highestCardIndex, List<Player> playerList, List<Cards> topCardList){
		Collections.rotate(topCardList, topCardList.size()-highestCardIndex);
		playerList.get(highestCardIndex).getPlayerCards().addAll(topCardList);
	}
}
