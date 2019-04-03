package com.svi.warcardgame.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pile {

	//get top cards
	 public static List<Cards> getTopCards(List<Player> listOfPlayers) {
	   	List<Cards> topCardList = new ArrayList<Cards>();
	   	listOfPlayers.forEach(player -> topCardList.add(player.getPlayerCards().remove(0)));		
    	System.out.println("List of top Cards: "+topCardList);
		return topCardList;
	 }
	 
	//compare top cards
	 public static boolean compareCards(Cards card1, Cards card2) {
			if (card1.getCardRankValue() == card2.getCardRankValue()) {
				return (card1.getSuitValue()<card2.getSuitValue());
			} 
			return (card1.getCardRankValue() < card2.getCardRankValue());
		}
	 
	 //get winner card
	public static int getwinnerCard(List<Cards> topCardList) {
		int winnerCardIndex=0;
		for(int i = 1; i<topCardList.size(); i++) {
			if (compareCards(topCardList.get(winnerCardIndex),topCardList.get(i))) {
				winnerCardIndex=i;
			}
		}
		System.out.println("The highest card is "+topCardList.get(winnerCardIndex));
		System.out.println();
		return winnerCardIndex;	
	}
	
	public static void giveCardsToRoundWinner(int winnerCardIndex, List<Player> playerList, List<Cards> topCardList){
		Collections.rotate(topCardList, topCardList.size()-winnerCardIndex);
		playerList.get(winnerCardIndex).getPlayerCards().addAll(topCardList);
	}
}
