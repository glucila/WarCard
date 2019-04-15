package com.svi.warcardgame.main;

import com.svi.warcardgame.objects.Cards;
import com.svi.warcardgame.objects.Player;
import com.svi.warcardgame.objects.Deck;
import com.svi.warcardgame.objects.Pile;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numberOfPlayer = 0;
		int numberOfShuffle = 0;
		boolean insertInput = true;

		System.out.println("Start War Card\n\n");
		
		// input number of players
		do {
			try {
				System.out.println("Enter number of players:  ");
				numberOfPlayer = scanner.nextInt();
				if (numberOfPlayer >= 2 ) {
					System.out.println("The number of players are " + numberOfPlayer);
					insertInput = false;
				} else {
					System.out.println("error");
				}


			}
			catch (InputMismatchException e) {
				System.out.println("Please enter a valid number.");
				scanner.nextLine();
			}
		}
		while (insertInput);
			insertInput = true;
			System.out.println();
			
		// Input number of shuffle
		do {
			try {
				System.out.println("Enter the number of times to shuffle the deck: ");
				numberOfShuffle = scanner.nextInt();
				if (numberOfShuffle < 0) {
					System.out.println("Invalid number of times to shuffle");
					insertInput = true;
				} 
				else {
					System.out.println("The number of shuffles are " + numberOfShuffle);
					insertInput = false;
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Please enter a number.");
				scanner.nextLine();
			}
		} 
		while (insertInput);
		
		scanner.close();
		System.out.println();
		
		//call the initial deck
		ArrayList<Cards> initialDeck = Deck.stringTokenizer();

		// Shuffle the deck then display
		ArrayList<Cards> perfectShuffle = Deck.perfectShuffle(numberOfShuffle, initialDeck);
		System.out.println("Shuffled Deck:");
		for (Cards card : perfectShuffle) {
			System.out.print(card.getCardRankName() + " of " + card.getSuitName() + ",");
		}
		System.out.println("\n");
		
		// create new player
		List<Player> listOfPlayers = new ArrayList<>();
		for (int i = 0; i < numberOfPlayer; i++) {
			listOfPlayers.add(new Player("Player " + (i+1)));
		}
		
		// distribute cards
		Deck.distributeCards(numberOfPlayer, listOfPlayers, perfectShuffle);
		System.out.println("Player's cards:");
		listOfPlayers.forEach(player -> System.out.println(player.getPlayerName() + ": " + player.getPlayerCards()));

		// game
		int roundNumber = 1;
		while (listOfPlayers.size() > 1) {
			listOfPlayers.removeIf(player -> player.getPlayerCards().isEmpty());
			System.out.println("\n");
			System.out.println("Round #" + roundNumber);
			for(Player player : listOfPlayers){
				System.out.println(player.getPlayerName() + ": " + player.getPlayerCards());
			}
			List<Cards> topCardList = Pile.getTopCards(listOfPlayers);
			int winnerCardIndex = Pile.getwinnerCard(topCardList);
			Pile.giveCardsToRoundWinner(winnerCardIndex, listOfPlayers, topCardList);
			listOfPlayers.removeIf(player -> player.getPlayerCards().isEmpty());
			roundNumber++;
		}
		System.out.println("Game over. The winner is " + listOfPlayers.get(0).getPlayerName()+ " round: " + (roundNumber-1));
		for(Player player : listOfPlayers){
			System.out.println(player.getPlayerName() + " : " + player.getPlayerCards());
		}
	}
}
