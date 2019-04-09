package com.svi.warcardgame.objects;

import com.svi.warcardgame.objects.Cards;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.*;

public class Deck {
	// initial deck 
	public static ArrayList<Cards> inputStream() {
		//opening file
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("input.txt"));
			
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (Exception e) {
			System.out.println("There is no file in that name. Please input a valid file");
		} finally {
			scanner.close();
		}
		return null;
	}
	
//	public 
	
//		ArrayList<Cards> deck = new ArrayList<Cards>();
//		// file I/O
//		//C:\asmaravilla\Workspace\warcard
//	
//		FileReader fr = new FileReader ("C:\\asmaravilla\\Workspace\\warcard");
//			  
//			    int i; 
//			    while ((i=fr.read()) != -1) 
//			      System.out.print((char) i); 
//	}
//	ArrayList<Cards> deck = new ArrayList<Cards>();
//	for (Suits suit : Suits.values()) {
//		for (CardRank rank : CardRank.values()) {
//			Cards card = new Cards(rank.getCardRankValue(), rank.getCardRankName(), suit.getsuitValue(),
//					suit.getsuitName());
//			deck.add(card);

	

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



