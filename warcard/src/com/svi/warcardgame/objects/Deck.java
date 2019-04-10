package com.svi.warcardgame.objects;

import com.svi.warcardgame.objects.Cards;
import com.svi.warcardgame.values.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.*;

public class Deck {
	// initial deck 
	public static ArrayList<Cards> inputStream() {
		//opening file
		Scanner scanner = null;
		String temporaryDeck = null;
		try {
			scanner = new Scanner(new File("input.txt"));
			//	StreamTokenizer streamTokenizer = new StreamTokenizer ();

			while (scanner.hasNextLine()) {
				temporaryDeck = scanner.nextLine();
			}
		} catch (Exception e) {
			System.out.println("There is no file in that name. Please input a valid file");
		} finally {
			scanner.close();
		}
		return null;
	}

	public static ArrayList <Cards> stringTokenizer() {
		
		ArrayList <Cards> initialDeck = new ArrayList <Cards>();
		String temporaryDeck = new String ();
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
		System.out.println("Initial Deck: ");
		System.out.println(initialDeck);

		return initialDeck;
	}
	
	// shuffling of deck
	public static ArrayList <Cards> perfectShuffle(int numberOfShuffle, ArrayList<Cards> initialDeck) {
		ArrayList<Cards> shuffledDeck = new ArrayList<>();
		for (int i = 0; i < numberOfShuffle; i++) {
			ArrayList<Cards> temporaryDeck = new ArrayList<>();
			if (shuffledDeck.isEmpty()) {
				temporaryDeck = initialDeck;
			} 
			else {
				temporaryDeck = shuffledDeck;
			}
			shuffledDeck = new ArrayList <Cards> ();
			for (int j = 0; j < 26; j++) {
				int k = j + 26;
				shuffledDeck.add(temporaryDeck.get(j));
				shuffledDeck.add(temporaryDeck.get(k));
			}
		}
		if (numberOfShuffle == 0) {
			shuffledDeck = initialDeck;
		}
		return shuffledDeck;
	}
	public static CardRank getRank(String CardRankName){
		for (CardRank rank : CardRank.values()){
			if (rank.getCardRankName().trim().equals(CardRankName)){
				return rank;
			}
		
	}
		return null;
	}
		public static Suits getSuit(String suitName){
			for (Suits suit : Suits.values()){
				if (suit.getsuitName().trim().equals(suitName)){
					return suit;
				}
			
		}
			return null;
	}
	// distribute cards to players
	public static void distributeCards(int numberOfPlayer, List<Player> listOfPlayers, ArrayList<Cards> deck) {	
		int numberOfDeck = 0;
		while (!deck.isEmpty())
			for (numberOfDeck = 0; numberOfDeck < numberOfPlayer; numberOfDeck++) {
				listOfPlayers.get(numberOfDeck).getPlayerCards().add(deck.get(0));
				deck.remove(0);
				if(deck.isEmpty()){
					break;
				}

			}
	}

}



