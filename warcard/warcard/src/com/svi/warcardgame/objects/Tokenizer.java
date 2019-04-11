package com.svi.warcardgame.objects;

import java.util.ArrayList;
import java.util.StringTokenizer;

import com.svi.warcardgame.values.CardRank;
import com.svi.warcardgame.values.Suits;

public class Tokenizer {
	//temporaryDeck.
	
	ArrayList <Cards> initialDeck = new ArrayList <Cards>();
//	String temporaryDeck = new String ();
	StringTokenizer tokenizer = new StringTokenizer (temporaryDeck, ",");
	while (tokenizer.hasMoreTokens()) {
		String tempToken = tokenizer.nextToken();
		String[] tempStrArray = tempToken.split("-");
		CardRank rank = getRank(tempStrArray[1]); 
		Suits suit = getSuit(tempStrArray[0]); 
		if (rank != null && suit != null) {
			Cards card = new Cards(rank.getCardRankValue(),rank.getCardRankName(),suit.getsuitValue(),suit.getsuitName());
			initialDeck.add(card);
		}
	}
	
//	for (Cards card : initialDeck) {
	System.out.println("Initial Deck: ");
	System.out.println(initialDeck);
//}
	return initialDeck;
}
