package com.svi.warcardgame.objects;

import com.svi.warcardgame.objects.Cards;
import java.util.ArrayList;
import java.util.List;

public class Deck {


	// shuffling of deck
		public static ArrayList <Cards> perfectShuffle(int numberOfShuffle, ArrayList<Cards> deck) {
			ArrayList<Cards> shuffledDeck = new ArrayList<>();
			for (int i = 0; i < numberOfShuffle; i++) {
				ArrayList<Cards> temporaryDeck = new ArrayList<>();
				if (shuffledDeck.isEmpty()) {
					temporaryDeck = deck;
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
				shuffledDeck = deck;
			}
			return shuffledDeck;
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


